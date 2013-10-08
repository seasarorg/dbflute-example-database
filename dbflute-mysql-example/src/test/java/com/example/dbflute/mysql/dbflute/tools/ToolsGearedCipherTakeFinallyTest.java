package com.example.dbflute.mysql.dbflute.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.name.ColumnSqlName;
import org.seasar.dbflute.infra.dfprop.DfPropFile;
import org.seasar.dbflute.infra.manage.refresh.DfRefreshResourceRequest;
import org.seasar.dbflute.util.DfResourceUtil;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.nogen.ExtendedDBFluteInitializer;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class ToolsGearedCipherTakeFinallyTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                        Build Clause
    //                                                                        ============
    public void test_buildClause() throws Exception {
        String path = deriveInitializerPath();
        List<String> clauseList = new ArrayList<String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String secrectKey = null;
            DBMeta currentDBMeta = null;
            ColumnInfo currentColumnInfo = null;
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("String secretKey = ")) {
                    secrectKey = Srl.extractScopeFirst(line, "\"", "\"").getContent();
                    continue;
                }
                String columnKeyword = "Dbm.getInstance().column";
                if (line.contains(columnKeyword)) {
                    String tablePropertyName = Srl.extractScopeFirst(line, "=", columnKeyword).getContent().trim();
                    String columnPropertyName = Srl.extractScopeFirst(line, columnKeyword, "()").getContent().trim();
                    currentDBMeta = DBMetaInstanceHandler.findDBMeta(tablePropertyName);
                    currentColumnInfo = currentDBMeta.findColumnInfo(columnPropertyName);
                    continue;
                }
                if (currentColumnInfo != null && Srl.containsAny(line, "aes_encrypt", "sha1")) {
                    String exp = Srl.extractScopeFirst(line, "\"", "\"").getContent();
                    String clause = buildUpdateClause(secrectKey, currentDBMeta, currentColumnInfo, exp);
                    clauseList.add(clause);
                    currentColumnInfo = null;
                    continue;
                }
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
        writeClause(clauseList);
        refreshResource();
    }

    protected String deriveInitializerPath() throws IOException {
        File buildDir = DfResourceUtil.getBuildDir(getClass());
        File javaDir = new File(buildDir.getCanonicalPath() + "/../../src/main/java");
        String simpleName = ExtendedDBFluteInitializer.class.getSimpleName();
        String fullName = ExtendedDBFluteInitializer.class.getName();
        String middlePath = Srl.replace(Srl.substringLastFront(fullName, "."), ".", "/");
        return javaDir.getCanonicalPath() + "/" + middlePath + "/" + simpleName + ".java";
    }

    protected String buildUpdateClause(String secrectKey, DBMeta currentDBMeta, ColumnInfo currentColumnInfo, String exp) {
        StringBuilder sb = new StringBuilder();
        sb.append("update ").append(currentDBMeta.getTableSqlName());
        ColumnSqlName columnSqlName = currentColumnInfo.getColumnSqlName();
        sb.append(" set ").append(columnSqlName).append(" = ");
        sb.append(String.format(exp, columnSqlName, secrectKey));
        return sb.toString();
    }

    // ===================================================================================
    //                                                                        Write Clause
    //                                                                        ============
    protected void writeClause(List<String> clauseList) throws IOException, UnsupportedEncodingException,
            FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        for (String clause : clauseList) {
            sb.append(clause).append(";").append("\n");
        }
        String clauseContents = sb.toString();
        String takeFinallyPath = deriveTakeFinallyPath();
        log("...Writing clauses to " + takeFinallyPath + ":\n" + clauseContents);
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(takeFinallyPath), "UTF-8"));
            bw.write(clauseContents);
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    protected String deriveTakeFinallyPath() throws IOException {
        File buildDir = DfResourceUtil.getBuildDir(getClass());
        String buildPath = buildDir.getCanonicalPath();
        File takeFinallyFIle = new File(buildPath + "/../../dbflute_exampledb/playsql/take-finally-70-cipher.sql");
        return takeFinallyFIle.getCanonicalPath();
    }

    // ===================================================================================
    //                                                                    Refresh Resource
    //                                                                    ================
    protected void refreshResource() throws IOException {
        DfPropFile dfpropFile = new DfPropFile();
        Map<String, String> refreshMap = dfpropFile.readMapAsStringValue(deriveRefreshDfpropPath(), null);
        String projectName = refreshMap.get("projectName");
        String requestUrl = refreshMap.get("requestUrl");
        List<String> projectNameList = Srl.splitList(projectName, "/");
        new DfRefreshResourceRequest(projectNameList, requestUrl).refreshResources();
    }

    protected String deriveRefreshDfpropPath() throws IOException {
        File buildDir = DfResourceUtil.getBuildDir(getClass());
        String buildPath = buildDir.getCanonicalPath();
        File takeFinallyFIle = new File(buildPath + "/../../dbflute_exampledb/dfprop/refreshDefinitionMap.dfprop");
        return takeFinallyFIle.getCanonicalPath();
    }
}

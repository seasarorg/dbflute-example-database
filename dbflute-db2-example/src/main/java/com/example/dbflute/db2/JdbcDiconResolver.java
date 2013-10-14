package com.example.dbflute.db2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.seasar.dbflute.util.DfResourceUtil;

/**
 * @author jflute
 */
public class JdbcDiconResolver {

    public static String resolveUrl(String defaultValue) {
        return doResolveValue("url", defaultValue);
    }

    public static String resolveUser(String defaultValue) {
        return doResolveValue("user", defaultValue);
    }

    public static String resolvePassword() {
        return doResolveValue("password", null);
    }

    public static String resolvePassword(String defaultValue) {
        return doResolveValue("password", defaultValue);
    }

    protected static String doResolveValue(String property, String defaultValue) {
        final File buildDir = DfResourceUtil.getBuildDir(JdbcDiconResolver.class);
        final String dispatchPath;
        try {
            final String dfpropDir = "../../dbflute_exampledb/dfprop";
            dispatchPath = buildDir.getCanonicalPath() + "/" + dfpropDir + "/local-" + property + ".txt";
        } catch (IOException e) {
            String msg = "Failed to get canonical path from the dir: " + buildDir;
            throw new IllegalStateException(msg, e);
        }
        final File dispatchFile = new File(dispatchPath);
        if (dispatchFile.exists()) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(dispatchFile), "UTF-8"));
                final String firstLine = br.readLine();
                return firstLine;
            } catch (IOException e) {
                String msg = "Failed to read " + property + " from the file: " + dispatchPath;
                throw new IllegalStateException(msg, e);
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException ignored) {
                    }
                }
            }
        } else {
            if (defaultValue == null) {
                String msg = "Not found the dispatch file for '" + property + "': " + dispatchPath;
                throw new IllegalStateException(msg);
            }
            return defaultValue;
        }
    }
}

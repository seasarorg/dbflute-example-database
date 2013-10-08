package com.example.dbflute.mysql.dbflute.whitebox;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.util.DfResourceUtil;

import com.example.dbflute.mysql.dbflute.cbean.WhiteBinaryCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteBinaryBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteBinary;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.8.2 (2011/04/04 Monday)
 */
public class WxBinaryTypeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteBinaryBhv whiteBinaryBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_select_update_binary() {
        // ## Arrange ##
        WhiteBinaryCB cb = new WhiteBinaryCB();
        cb.query().addOrderBy_BinaryId_Asc();
        cb.fetchFirst(2);

        // ## Act ##
        ListResultBean<WhiteBinary> binaryList = whiteBinaryBhv.selectList(cb);

        // ## Assert ##
        WhiteBinary first = binaryList.get(0);
        WhiteBinary second = binaryList.get(1);
        byte[] firstBlob = first.getBlobData();
        byte[] secondBlob = second.getBlobData();
        assertNotSame(firstBlob.length, secondBlob.length);
        log("firstBlob=" + firstBlob.length);
        log("secondBlob=" + secondBlob.length);

        // switch
        first.setBlobData(secondBlob);
        second.setBlobData(firstBlob);
        whiteBinaryBhv.update(first);
        whiteBinaryBhv.update(second);

        ListResultBean<WhiteBinary> afterList = whiteBinaryBhv.selectList(cb);

        byte[] afterFirstBlob = afterList.get(0).getBlobData();
        byte[] afterSecondBlob = afterList.get(1).getBlobData();

        log("afterFirstBlob=" + afterFirstBlob.length);
        log("afterSecondBlob=" + afterSecondBlob.length);

        // switched
        assertEquals(secondBlob.length, afterFirstBlob.length);
        assertEquals(firstBlob.length, afterSecondBlob.length);
    }

    public void test_loading_binary() {
        // ## Arrange ##
        WhiteBinaryCB cb = new WhiteBinaryCB();
        cb.query().addOrderBy_BinaryId_Asc();
        cb.fetchFirst(1);

        // ## Act ##
        WhiteBinary binary = whiteBinaryBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] blobData = binary.getBlobData();
        assertNotNull(blobData);
        FileOutputStream fos = null;
        try {
            final File buildDir = DfResourceUtil.getBuildDir(getClass());
            final String path = buildDir.getAbsolutePath() + "/../loaded.jpg";
            final File outputFile = new File(path);
            if (outputFile.exists()) {
                outputFile.delete();
            }
            log("outputFile=" + outputFile);
            fos = new FileOutputStream(outputFile);
            fos.write(blobData);
            // and after that, check it by your eyes
        } catch (IOException e) {
            throw new IllegalStateException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ignored) {
                }
            }
        }
    }
}

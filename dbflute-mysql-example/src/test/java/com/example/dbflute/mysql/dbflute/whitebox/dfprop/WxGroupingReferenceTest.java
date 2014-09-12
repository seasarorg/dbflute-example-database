package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.Arrays;
import java.util.List;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.allcommon.CDef.GroupingReference;
import com.example.dbflute.mysql.dbflute.exentity.WhiteGroupingReference;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.4A (2013/03/27 Wednesday)
 */
public class WxGroupingReferenceTest extends UnitContainerTestCase {

    public void test_dfprop_GroupingReference_basic() throws Exception {
        {
            List<GroupingReference> ls = CDef.GroupingReference.listOfServiceAvailable();
            assertEquals(Arrays.asList(CDef.GroupingReference.LAND_NAME, CDef.GroupingReference.SEA_NAME), ls);
        }
        {
            List<GroupingReference> ls = CDef.GroupingReference.listOfServicePlus();
            assertEquals(Arrays.asList(CDef.GroupingReference.LAND_NAME, CDef.GroupingReference.SEA_NAME,
                    CDef.GroupingReference.IKSPIARY_NAME), ls);
        }
        {
            List<GroupingReference> ls = CDef.GroupingReference.listOfNestedPlus();
            assertEquals(Arrays.asList(CDef.GroupingReference.AMPHI_NAME, CDef.GroupingReference.LAND_NAME,
                    CDef.GroupingReference.SEA_NAME, CDef.GroupingReference.IKSPIARY_NAME), ls);
        }
        {
            List<GroupingReference> ls = CDef.GroupingReference.listOfOneDef();
            assertEquals(Arrays.asList(CDef.GroupingReference.IKSPIARY_NAME), ls);
        }
        // document only
        //{
        //    List<GroupingReference> ls = CDef.GroupingReference.listOfTwoRef();
        //    assertEquals(Arrays.asList(CDef.GroupingReference.LAND_NAME, CDef.GroupingReference.SEA_NAME,
        //            CDef.GroupingReference.IKSPIARY_NAME), ls);
        //}
        assertTrue(CDef.GroupingReference.groupOf("twoRef").isEmpty());
        {
            List<GroupingReference> ls = CDef.GroupingReference.listOfDupRef();
            assertEquals(Arrays.asList(CDef.GroupingReference.LAND_NAME, CDef.GroupingReference.SEA_NAME,
                    CDef.GroupingReference.IKSPIARY_NAME), ls);
        }
        WhiteGroupingReference reference = new WhiteGroupingReference();
        reference.setGroupingReferenceCode_LAND_NAME();
        assertTrue(reference.isGroupingReferenceCode_ServicePlus());
    }
}

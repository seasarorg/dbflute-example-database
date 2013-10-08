package com.example.dbflute.mysql.dbflute.lightening;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public abstract class LighteningTestCase extends UnitContainerTestCase {

    protected static interface VariousCallback {
        Object getVarious(Member member);
    }

    protected void showMemberList(List<Member> memberList) {
        showMemberList(memberList, null);
    }

    protected void showMemberList(List<Member> memberList, VariousCallback callback) {
        StringBuilder sb = new StringBuilder();
        sb.append(ln()).append("   |---------------------------------------------------------------|");
        sb.append(ln()).append("   | MEMBER_ID | MEMBER_NAME | BIRTHDATE  | STATUS | VARIOUS_VALUE |");
        sb.append(ln()).append("   |-----------|-------------|------------|--------|---------------|");
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            String memberIdRear = buildRear("MEMBER_ID", memberId);

            String memberName = member.getMemberName();
            String memberNameRear = buildRear("MEMBER_NAME", memberName);

            String birthdate = format_yyyyMMdd(member.getBirthdate());
            String birthdateRear = buildRear("BIRTHDATE ", birthdate);

            String memberStatus = member.getMemberStatusCode();
            String memberStatusRear = buildRear("STATUS", memberStatus);

            String various = null;
            if (callback != null) {
                various = formatIfNeeds(callback.getVarious(member));
            }
            String variousRear = buildRear("VARIOUS_VALUE", various);

            sb.append(ln()).append("  ");
            sb.append(" | ").append(memberId).append(memberIdRear);
            sb.append(" | ").append(memberName).append(memberNameRear);
            sb.append(" | ").append(birthdate).append(birthdateRear);
            sb.append(" | ").append(memberStatus).append(memberStatusRear);
            sb.append(" | ").append(various).append(variousRear);
            sb.append(" | ");
        }
        sb.append(ln()).append("   |-----------|-------------|------------|--------|---------------|");
        log(sb);
    }

    protected String formatIfNeeds(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Date) {
            return DfTypeUtil.toString((Date) obj, "yyyy/MM/dd");
        }
        return obj.toString();
    }

    protected String format_yyyyMMdd(Date date) {
        return DfTypeUtil.toString(date, "yyyy/MM/dd");
    }

    protected String buildRear(String pointString, Object actualValue) {
        final String encoding = "UTF-8";
        final int pointLength;
        final int valueLength;
        try {
            pointLength = pointString.getBytes(encoding).length;
            valueLength = (actualValue != null ? actualValue : "null").toString().getBytes(encoding).length;
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
        int length = (pointLength - valueLength);
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sb.append(" ");
        }
        if (actualValue != null && valueLength > actualValue.toString().length()) {
            sb.append("  ");
        }
        return sb.toString();
    }
}

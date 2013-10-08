package com.example.dbflute.mysql.dbflute.nogen.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.example.dbflute.mysql.dbflute.exentity.MemberSecurity;

/**
 * @author jflute
 * @since 0.9.9.1B (2011/11/13 Thursday)
 */
public class CachedMemberSecurity {

    protected static final Map<Integer, MemberSecurity> _memberSecurityMap = new ConcurrentHashMap<Integer, MemberSecurity>();

    public static MemberSecurity get(Integer memberId) {
        return _memberSecurityMap.get(memberId);
    }

    public static void put(MemberSecurity security) {
        _memberSecurityMap.put(security.getMemberId(), security);
    }

    public static void clear() {
        _memberSecurityMap.clear();
    }
}

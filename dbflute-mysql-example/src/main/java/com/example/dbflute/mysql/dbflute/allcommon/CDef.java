/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.allcommon;

import java.util.*;

import org.seasar.dbflute.jdbc.Classification;
import org.seasar.dbflute.jdbc.ClassificationCodeType;
import org.seasar.dbflute.jdbc.ClassificationMeta;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface CDef extends Classification {

    /** The empty array for no sisters. */
    String[] EMPTY_SISTERS = new String[]{};

    /** The empty map for no sub-items. */
    @SuppressWarnings("unchecked")
    Map<String, Object> EMPTY_SUB_ITEM_MAP = (Map<String, Object>)Collections.EMPTY_MAP;

    /**
     * 会員が受けられるサービスのランクを示す
     */
    public enum ServiceRank implements CDef {
        /** PLATINUM: platinum rank */
        Platinum("PLT", "PLATINUM", EMPTY_SISTERS)
        ,
        /** GOLD: gold rank */
        Gold("GLD", "GOLD", EMPTY_SISTERS)
        ,
        /** SILVER: silver rank */
        Silver("SIL", "SILVER", EMPTY_SISTERS)
        ,
        /** BRONZE: bronze rank */
        Bronze("BRZ", "BRONZE", EMPTY_SISTERS)
        ,
        /** PLASTIC: plastic rank (deprecated: テーブル区分値の非推奨要素指定のテストのため) */
        @Deprecated
        Plastic("PLS", "PLASTIC", EMPTY_SISTERS)
        ;
        private static final Map<String, ServiceRank> _codeValueMap = new HashMap<String, ServiceRank>();
        static {
            for (ServiceRank value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private ServiceRank(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.ServiceRank; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ServiceRank codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof ServiceRank) { return (ServiceRank)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static ServiceRank nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<ServiceRank> listAll() {
            return new ArrayList<ServiceRank>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<ServiceRank> groupOf(String groupName) {
            return new ArrayList<ServiceRank>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * mainly region of member address
     */
    public enum Region implements CDef {
        /** アメリカ */
        アメリカ("1", "アメリカ", EMPTY_SISTERS)
        ,
        /** カナダ */
        カナダ("2", "カナダ", EMPTY_SISTERS)
        ,
        /** 中国 */
        中国("3", "中国", EMPTY_SISTERS)
        ,
        /** 千葉 */
        千葉("4", "千葉", EMPTY_SISTERS)
        ;
        private static final Map<String, Region> _codeValueMap = new HashMap<String, Region>();
        static {
            for (Region value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private Region(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.Region; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Region codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof Region) { return (Region)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static Region nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<Region> listAll() {
            return new ArrayList<Region>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<Region> groupOf(String groupName) {
            return new ArrayList<Region>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * The test of relation reference
     */
    public enum SelfReference implements CDef {
        /** foo801 */
        Foo801("801", "foo801", EMPTY_SISTERS)
        ,
        /** foo811 */
        Foo811("811", "foo811", EMPTY_SISTERS)
        ,
        /** bar802: of foo801 */
        Bar802("802", "bar802", EMPTY_SISTERS)
        ,
        /** baz803: of foo801 */
        Baz803("803", "baz803", EMPTY_SISTERS)
        ,
        /** bar812: of foo811 */
        Bar812("812", "bar812", EMPTY_SISTERS)
        ,
        /** baz813: of foo811 */
        Baz813("813", "baz813", EMPTY_SISTERS)
        ;
        private static final Map<String, SelfReference> _codeValueMap = new HashMap<String, SelfReference>();
        static {
            for (SelfReference value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private SelfReference(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.SelfReference; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static SelfReference codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof SelfReference) { return (SelfReference)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static SelfReference nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<SelfReference> listAll() {
            return new ArrayList<SelfReference>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<SelfReference> groupOf(String groupName) {
            return new ArrayList<SelfReference>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * The test of top only
     */
    public enum TopCommentOnly implements CDef {
        ;
        private static final Map<String, TopCommentOnly> _codeValueMap = new HashMap<String, TopCommentOnly>();
        static {
            for (TopCommentOnly value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private TopCommentOnly(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.TopCommentOnly; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static TopCommentOnly codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof TopCommentOnly) { return (TopCommentOnly)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static TopCommentOnly nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<TopCommentOnly> listAll() {
            return new ArrayList<TopCommentOnly>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<TopCommentOnly> groupOf(String groupName) {
            return new ArrayList<TopCommentOnly>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * the test of sub-item map for implicit classification
     */
    public enum SubItemImplicit implements CDef {
        /** Aaa: means foo */
        Foo("FOO", "Aaa", EMPTY_SISTERS)
        ,
        /** Bbb: means bar */
        Bar("BAR", "Bbb", EMPTY_SISTERS)
        ;
        private static final Map<String, SubItemImplicit> _codeValueMap = new HashMap<String, SubItemImplicit>();
        static {
            for (SubItemImplicit value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("regularStringItem", "value1<tag>");
                subItemMap.put("regularNumberItem", "123");
                subItemMap.put("regularVariousItem", "list:{\n    ; reg\n    ; var\n    ; ite\n}");
                subItemMap.put("listItem", "list:{\n    ; aa\n    ; bb\n    ; cc\n}");
                _subItemMapMap.put(Foo.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("regularStringItem", "value2<teg>");
                subItemMap.put("regularNumberItem", "456");
                subItemMap.put("regularVariousItem", "map:{\n    ; reg = var\n    ; ous = ite\n}");
                subItemMap.put("mapItem", "map:{\n    ; key11 = value11\n}");
                _subItemMapMap.put(Bar.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private SubItemImplicit(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return CDef.DefMeta.SubItemImplicit; }

        public String regularStringItem() {
            return (String)subItemMap().get("regularStringItem");
        }

        public String regularNumberItem() {
            return (String)subItemMap().get("regularNumberItem");
        }

        public Object regularVariousItem() {
            return subItemMap().get("regularVariousItem");
        }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static SubItemImplicit codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof SubItemImplicit) { return (SubItemImplicit)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static SubItemImplicit nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<SubItemImplicit> listAll() {
            return new ArrayList<SubItemImplicit>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<SubItemImplicit> groupOf(String groupName) {
            return new ArrayList<SubItemImplicit>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * the test of sub-item map for table classification
     */
    public enum SubItemTable implements CDef {
        /** 正式会員: 正式な会員としてサイトサービスが利用可能 */
        正式会員("FML", "正式会員", EMPTY_SISTERS)
        ,
        /** 退会会員: 退会が確定した会員でサイトサービスはダメ */
        退会会員("WDL", "退会会員", EMPTY_SISTERS)
        ,
        /** 仮会員: 入会直後のステータスで一部のサイトサービスが利用可能 */
        仮会員("PRV", "仮会員", EMPTY_SISTERS)
        ;
        private static final Map<String, SubItemTable> _codeValueMap = new HashMap<String, SubItemTable>();
        static {
            for (SubItemTable value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "1");
                subItemMap.put("key2", "正式会員");
                subItemMap.put("key3", null);
                _subItemMapMap.put(正式会員.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "2");
                subItemMap.put("key2", "退会会員");
                subItemMap.put("key3", null);
                _subItemMapMap.put(退会会員.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "3");
                subItemMap.put("key2", "仮会員");
                subItemMap.put("key3", null);
                _subItemMapMap.put(仮会員.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private SubItemTable(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return CDef.DefMeta.SubItemTable; }

        public String key1() {
            return (String)subItemMap().get("key1");
        }

        public String key2() {
            return (String)subItemMap().get("key2");
        }

        public String key3() {
            return (String)subItemMap().get("key3");
        }

        /**
         * Is the classification in the group? <br />
         * サービスが利用できる会員 <br />
         * The group elements:[正式会員, 仮会員]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return 正式会員.equals(this) || 仮会員.equals(this);
        }

        /**
         * Is the classification in the group? <br />
         * The group elements:[退会会員]
         * @return The determination, true or false.
         */
        public boolean isLastestStatus() {
            return 退会会員.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return isServiceAvailable(); }
            if ("lastestStatus".equals(groupName)) { return isLastestStatus(); }
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static SubItemTable codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof SubItemTable) { return (SubItemTable)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static SubItemTable nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<SubItemTable> listAll() {
            return new ArrayList<SubItemTable>(Arrays.asList(values()));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br />
         * サービスが利用できる会員 <br />
         * The group elements:[正式会員, 仮会員]
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<SubItemTable> listOfServiceAvailable() {
            return new ArrayList<SubItemTable>(Arrays.asList(正式会員, 仮会員));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br />
         * The group elements:[退会会員]
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<SubItemTable> listOfLastestStatus() {
            return new ArrayList<SubItemTable>(Arrays.asList(退会会員));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<SubItemTable> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("lastestStatus".equals(groupName)) { return listOfLastestStatus(); }
            return new ArrayList<SubItemTable>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * boolean classification for boolean column
     */
    public enum BooleanFlg implements CDef {
        /** Checked: means yes */
        True("true", "Checked", EMPTY_SISTERS)
        ,
        /** Unchecked: means no */
        False("false", "Unchecked", EMPTY_SISTERS)
        ;
        private static final Map<String, BooleanFlg> _codeValueMap = new HashMap<String, BooleanFlg>();
        static {
            for (BooleanFlg value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private BooleanFlg(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.BooleanFlg; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static BooleanFlg codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof BooleanFlg) { return (BooleanFlg)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static BooleanFlg nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<BooleanFlg> listAll() {
            return new ArrayList<BooleanFlg>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<BooleanFlg> groupOf(String groupName) {
            return new ArrayList<BooleanFlg>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * master type of variant relation (biz-many-to-one)
     */
    public enum VariantRelationMasterType implements CDef {
        /** FooCls */
        FooCls("FOO", "FooCls", EMPTY_SISTERS)
        ,
        /** BarCls */
        BarCls("BAR", "BarCls", EMPTY_SISTERS)
        ,
        /** QuxCls */
        QuxCls("QUX", "QuxCls", EMPTY_SISTERS)
        ,
        /** CorgeCls */
        CorgeCls("CORGE", "CorgeCls", EMPTY_SISTERS)
        ;
        private static final Map<String, VariantRelationMasterType> _codeValueMap = new HashMap<String, VariantRelationMasterType>();
        static {
            for (VariantRelationMasterType value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private VariantRelationMasterType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.VariantRelationMasterType; }

        /**
         * Is the classification in the group? <br />
         * Foo or Bar or Qux <br />
         * The group elements:[FooCls, BarCls, QuxCls]
         * @return The determination, true or false.
         */
        public boolean isFooBarQux() {
            return FooCls.equals(this) || BarCls.equals(this) || QuxCls.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("fooBarQux".equals(groupName)) { return isFooBarQux(); }
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationMasterType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof VariantRelationMasterType) { return (VariantRelationMasterType)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationMasterType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<VariantRelationMasterType> listAll() {
            return new ArrayList<VariantRelationMasterType>(Arrays.asList(values()));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br />
         * Foo or Bar or Qux <br />
         * The group elements:[FooCls, BarCls, QuxCls]
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<VariantRelationMasterType> listOfFooBarQux() {
            return new ArrayList<VariantRelationMasterType>(Arrays.asList(FooCls, BarCls, QuxCls));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<VariantRelationMasterType> groupOf(String groupName) {
            if ("fooBarQux".equals(groupName)) { return listOfFooBarQux(); }
            return new ArrayList<VariantRelationMasterType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * qux type of variant relation (biz-many-to-one)
     */
    public enum VariantRelationQuxType implements CDef {
        /** Qua */
        Qua("Qua", "Qua", EMPTY_SISTERS)
        ,
        /** Que */
        Que("Que", "Que", EMPTY_SISTERS)
        ,
        /** Quo */
        Quo("Quo", "Quo", EMPTY_SISTERS)
        ;
        private static final Map<String, VariantRelationQuxType> _codeValueMap = new HashMap<String, VariantRelationQuxType>();
        static {
            for (VariantRelationQuxType value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private VariantRelationQuxType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.VariantRelationQuxType; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationQuxType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof VariantRelationQuxType) { return (VariantRelationQuxType)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationQuxType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<VariantRelationQuxType> listAll() {
            return new ArrayList<VariantRelationQuxType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<VariantRelationQuxType> groupOf(String groupName) {
            return new ArrayList<VariantRelationQuxType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * merged
     */
    public enum QuxCls implements CDef {
        /** Merged: merged qux element */
        Merged("MRG", "Merged", EMPTY_SISTERS)
        ,
        /** QuxOne: QuxOne */
        QuxOne("Q01", "QuxOne", EMPTY_SISTERS)
        ,
        /** QuxTwo: QuxTwo */
        QuxTwo("Q02", "QuxTwo", EMPTY_SISTERS)
        ,
        /** QuxThree: QuxThree */
        QuxThree("Q03", "QuxThree", EMPTY_SISTERS)
        ;
        private static final Map<String, QuxCls> _codeValueMap = new HashMap<String, QuxCls>();
        static {
            for (QuxCls value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private QuxCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.QuxCls; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static QuxCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof QuxCls) { return (QuxCls)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static QuxCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<QuxCls> listAll() {
            return new ArrayList<QuxCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<QuxCls> groupOf(String groupName) {
            return new ArrayList<QuxCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * delimiter; & endBrace} & path\foo\bar
     */
    public enum EscapedDfpropCls implements CDef {
        /** First: delimiter & rear escape char */
        First(";@\\", "First", EMPTY_SISTERS)
        ,
        /** Second: escape char & endBrace & delimiter */
        Second("\\};", "Second", EMPTY_SISTERS)
        ,
        /** Third: startBrace & equal & endBrace */
        Third("{=}", "Third", EMPTY_SISTERS)
        ;
        private static final Map<String, EscapedDfpropCls> _codeValueMap = new HashMap<String, EscapedDfpropCls>();
        static {
            for (EscapedDfpropCls value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private EscapedDfpropCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.EscapedDfpropCls; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static EscapedDfpropCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof EscapedDfpropCls) { return (EscapedDfpropCls)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static EscapedDfpropCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<EscapedDfpropCls> listAll() {
            return new ArrayList<EscapedDfpropCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<EscapedDfpropCls> groupOf(String groupName) {
            return new ArrayList<EscapedDfpropCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * /*IF pmb.yourTop&#42;/&gt;&lt;&
     */
    public enum EscapedJavaDocCls implements CDef {
        /** First: /*IF pmb.yourFooComment&#42;/&gt;&lt;& */
        First("FOO", "First", EMPTY_SISTERS)
        ,
        /** Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;& */
        Second("BAR", "Second", EMPTY_SISTERS)
        ;
        private static final Map<String, EscapedJavaDocCls> _codeValueMap = new HashMap<String, EscapedJavaDocCls>();
        static {
            for (EscapedJavaDocCls value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private EscapedJavaDocCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.EscapedJavaDocCls; }

        /**
         * Is the classification in the group? <br />
         * /*IF pmb.yourGroup&#42;/&gt;&lt;& <br />
         * The group elements:[First, Second]
         * @return The determination, true or false.
         */
        public boolean isLineGroup() {
            return First.equals(this) || Second.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("lineGroup".equals(groupName)) { return isLineGroup(); }
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static EscapedJavaDocCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof EscapedJavaDocCls) { return (EscapedJavaDocCls)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static EscapedJavaDocCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<EscapedJavaDocCls> listAll() {
            return new ArrayList<EscapedJavaDocCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br />
         * /*IF pmb.yourGroup&#42;/&gt;&lt;& <br />
         * The group elements:[First, Second]
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<EscapedJavaDocCls> listOfLineGroup() {
            return new ArrayList<EscapedJavaDocCls>(Arrays.asList(First, Second));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<EscapedJavaDocCls> groupOf(String groupName) {
            if ("lineGroup".equals(groupName)) { return listOfLineGroup(); }
            return new ArrayList<EscapedJavaDocCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * top first line            top second line            top third line
     */
    public enum LineSepCommentCls implements CDef {
        /** First: foo first line            foo second line */
        First("FOO", "First", EMPTY_SISTERS)
        ,
        /** Second: bar first line                        bar second line */
        Second("BAR", "Second", EMPTY_SISTERS)
        ;
        private static final Map<String, LineSepCommentCls> _codeValueMap = new HashMap<String, LineSepCommentCls>();
        static {
            for (LineSepCommentCls value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private LineSepCommentCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.LineSepCommentCls; }

        /**
         * Is the classification in the group? <br />
         * group first line                    group second line <br />
         * The group elements:[First, Second]
         * @return The determination, true or false.
         */
        public boolean isLineGroup() {
            return First.equals(this) || Second.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("lineGroup".equals(groupName)) { return isLineGroup(); }
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static LineSepCommentCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof LineSepCommentCls) { return (LineSepCommentCls)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static LineSepCommentCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<LineSepCommentCls> listAll() {
            return new ArrayList<LineSepCommentCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br />
         * group first line                    group second line <br />
         * The group elements:[First, Second]
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<LineSepCommentCls> listOfLineGroup() {
            return new ArrayList<LineSepCommentCls>(Arrays.asList(First, Second));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<LineSepCommentCls> groupOf(String groupName) {
            if ("lineGroup".equals(groupName)) { return listOfLineGroup(); }
            return new ArrayList<LineSepCommentCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * has deprecated element
     */
    public enum DeprecatedMapBasicType implements CDef {
        /** FooName */
        FooName("FOO", "FooName", EMPTY_SISTERS)
        ,
        /** BarName: (deprecated: test of deprecated) */
        @Deprecated
        BarName("BAR", "BarName", EMPTY_SISTERS)
        ,
        /** QuxName */
        QuxName("QUX", "QuxName", EMPTY_SISTERS)
        ;
        private static final Map<String, DeprecatedMapBasicType> _codeValueMap = new HashMap<String, DeprecatedMapBasicType>();
        static {
            for (DeprecatedMapBasicType value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private DeprecatedMapBasicType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.DeprecatedMapBasicType; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapBasicType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof DeprecatedMapBasicType) { return (DeprecatedMapBasicType)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapBasicType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<DeprecatedMapBasicType> listAll() {
            return new ArrayList<DeprecatedMapBasicType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<DeprecatedMapBasicType> groupOf(String groupName) {
            return new ArrayList<DeprecatedMapBasicType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * has deprecated element
     */
    public enum DeprecatedMapCollaborationType implements CDef {
        /** FooName */
        FooName("FOO", "FooName", EMPTY_SISTERS)
        ,
        /** BarName: here here (deprecated: test of deprecated) */
        @Deprecated
        BarName("BAR", "BarName", EMPTY_SISTERS)
        ,
        /** QuxName: (deprecated: no original comment) */
        @Deprecated
        QuxName("QUX", "QuxName", EMPTY_SISTERS)
        ;
        private static final Map<String, DeprecatedMapCollaborationType> _codeValueMap = new HashMap<String, DeprecatedMapCollaborationType>();
        static {
            for (DeprecatedMapCollaborationType value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private DeprecatedMapCollaborationType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.DeprecatedMapCollaborationType; }

        /**
         * Is the classification in the group? <br />
         * contains deprecated element here <br />
         * The group elements:[FooName, BarName]
         * @return The determination, true or false.
         */
        public boolean isContainsDeprecated() {
            return FooName.equals(this) || BarName.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("containsDeprecated".equals(groupName)) { return isContainsDeprecated(); }
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapCollaborationType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof DeprecatedMapCollaborationType) { return (DeprecatedMapCollaborationType)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapCollaborationType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<DeprecatedMapCollaborationType> listAll() {
            return new ArrayList<DeprecatedMapCollaborationType>(Arrays.asList(values()));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br />
         * contains deprecated element here <br />
         * The group elements:[FooName, BarName]
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<DeprecatedMapCollaborationType> listOfContainsDeprecated() {
            return new ArrayList<DeprecatedMapCollaborationType>(Arrays.asList(FooName, BarName));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<DeprecatedMapCollaborationType> groupOf(String groupName) {
            if ("containsDeprecated".equals(groupName)) { return listOfContainsDeprecated(); }
            return new ArrayList<DeprecatedMapCollaborationType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * Classification of Bar
     */
    public enum BarCls implements CDef {
        /** BarOne: BarOne */
        BarOne("B01", "BarOne", EMPTY_SISTERS)
        ,
        /** BarTwo: BarTwo */
        BarTwo("B02", "BarTwo", EMPTY_SISTERS)
        ,
        /** BarThree: BarThree */
        BarThree("B03", "BarThree", EMPTY_SISTERS)
        ,
        /** BarFour: BarFour */
        BarFour("B04", "BarFour", EMPTY_SISTERS)
        ,
        /** BarFive: BarFive */
        BarFive("B05", "BarFive", EMPTY_SISTERS)
        ;
        private static final Map<String, BarCls> _codeValueMap = new HashMap<String, BarCls>();
        static {
            for (BarCls value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private BarCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.BarCls; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static BarCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof BarCls) { return (BarCls)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static BarCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<BarCls> listAll() {
            return new ArrayList<BarCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<BarCls> groupOf(String groupName) {
            return new ArrayList<BarCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * Classification of Foo
     */
    public enum FooCls implements CDef {
        /** FooOne: FooOne */
        FooOne("F01", "FooOne", EMPTY_SISTERS)
        ,
        /** FooTwo: FooTwo */
        FooTwo("F02", "FooTwo", EMPTY_SISTERS)
        ,
        /** FooThree: FooThree */
        FooThree("F03", "FooThree", EMPTY_SISTERS)
        ,
        /** FooFour: FooFour */
        FooFour("F04", "FooFour", EMPTY_SISTERS)
        ;
        private static final Map<String, FooCls> _codeValueMap = new HashMap<String, FooCls>();
        static {
            for (FooCls value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private FooCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.FooCls; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static FooCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof FooCls) { return (FooCls)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static FooCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<FooCls> listAll() {
            return new ArrayList<FooCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<FooCls> groupOf(String groupName) {
            return new ArrayList<FooCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * フラグを示す
     */
    public enum Flg implements CDef {
        /** はい: 有効を示す */
        True("1", "はい", EMPTY_SISTERS)
        ,
        /** いいえ: 無効を示す */
        False("0", "いいえ", EMPTY_SISTERS)
        ;
        private static final Map<String, Flg> _codeValueMap = new HashMap<String, Flg>();
        static {
            for (Flg value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private Flg(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.Flg; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Flg codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof Flg) { return (Flg)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static Flg nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<Flg> listAll() {
            return new ArrayList<Flg>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<Flg> groupOf(String groupName) {
            return new ArrayList<Flg>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * 会員ステータス: 会員の状態を示す
     */
    public enum MemberStatus implements CDef {
        /** 正式会員: 正式な会員を示す */
        Formalized("FML", "正式会員", EMPTY_SISTERS)
        ,
        /** 仮会員: 仮の会員を示す */
        Provisional("PRV", "仮会員", EMPTY_SISTERS)
        ,
        /** 退会会員: 退会した会員を示す */
        Withdrawal("WDL", "退会会員", EMPTY_SISTERS)
        ;
        private static final Map<String, MemberStatus> _codeValueMap = new HashMap<String, MemberStatus>();
        static {
            for (MemberStatus value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private MemberStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.MemberStatus; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof MemberStatus) { return (MemberStatus)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<MemberStatus> listAll() {
            return new ArrayList<MemberStatus>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<MemberStatus> groupOf(String groupName) {
            return new ArrayList<MemberStatus>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * 商品ステータス: 商品の状態を示す
     */
    public enum ProductStatus implements CDef {
        /** 生産販売可能 */
        OnSale("ONS", "生産販売可能", EMPTY_SISTERS)
        ,
        /** 生産中止 */
        ProductStop("PST", "生産中止", EMPTY_SISTERS)
        ,
        /** 販売中止 */
        SaleStop("SST", "販売中止", EMPTY_SISTERS)
        ;
        private static final Map<String, ProductStatus> _codeValueMap = new HashMap<String, ProductStatus>();
        static {
            for (ProductStatus value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private ProductStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.ProductStatus; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ProductStatus codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof ProductStatus) { return (ProductStatus)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static ProductStatus nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<ProductStatus> listAll() {
            return new ArrayList<ProductStatus>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<ProductStatus> groupOf(String groupName) {
            return new ArrayList<ProductStatus>(4);
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** 会員が受けられるサービスのランクを示す */
        ServiceRank
        ,
        /** mainly region of member address */
        Region
        ,
        /** The test of relation reference */
        SelfReference
        ,
        /** The test of top only */
        TopCommentOnly
        ,
        /** the test of sub-item map for implicit classification */
        SubItemImplicit
        ,
        /** the test of sub-item map for table classification */
        SubItemTable
        ,
        /** boolean classification for boolean column */
        BooleanFlg
        ,
        /** master type of variant relation (biz-many-to-one) */
        VariantRelationMasterType
        ,
        /** qux type of variant relation (biz-many-to-one) */
        VariantRelationQuxType
        ,
        /** merged */
        QuxCls
        ,
        /** delimiter; & endBrace} & path\foo\bar */
        EscapedDfpropCls
        ,
        /** /*IF pmb.yourTop&#42;/&gt;&lt;& */
        EscapedJavaDocCls
        ,
        /** top first line            top second line            top third line */
        LineSepCommentCls
        ,
        /** has deprecated element */
        DeprecatedMapBasicType
        ,
        /** has deprecated element */
        DeprecatedMapCollaborationType
        ,
        /** Classification of Bar */
        BarCls
        ,
        /** Classification of Foo */
        FooCls
        ,
        /** フラグを示す */
        Flg
        ,
        /** 会員ステータス: 会員の状態を示す */
        MemberStatus
        ,
        /** 商品ステータス: 商品の状態を示す */
        ProductStatus
        ;
        public Classification codeOf(Object code) {
            if ("ServiceRank".equals(name())) { return CDef.ServiceRank.codeOf(code); }
            if ("Region".equals(name())) { return CDef.Region.codeOf(code); }
            if ("SelfReference".equals(name())) { return CDef.SelfReference.codeOf(code); }
            if ("TopCommentOnly".equals(name())) { return CDef.TopCommentOnly.codeOf(code); }
            if ("SubItemImplicit".equals(name())) { return CDef.SubItemImplicit.codeOf(code); }
            if ("SubItemTable".equals(name())) { return CDef.SubItemTable.codeOf(code); }
            if ("BooleanFlg".equals(name())) { return CDef.BooleanFlg.codeOf(code); }
            if ("VariantRelationMasterType".equals(name())) { return CDef.VariantRelationMasterType.codeOf(code); }
            if ("VariantRelationQuxType".equals(name())) { return CDef.VariantRelationQuxType.codeOf(code); }
            if ("QuxCls".equals(name())) { return CDef.QuxCls.codeOf(code); }
            if ("EscapedDfpropCls".equals(name())) { return CDef.EscapedDfpropCls.codeOf(code); }
            if ("EscapedJavaDocCls".equals(name())) { return CDef.EscapedJavaDocCls.codeOf(code); }
            if ("LineSepCommentCls".equals(name())) { return CDef.LineSepCommentCls.codeOf(code); }
            if ("DeprecatedMapBasicType".equals(name())) { return CDef.DeprecatedMapBasicType.codeOf(code); }
            if ("DeprecatedMapCollaborationType".equals(name())) { return CDef.DeprecatedMapCollaborationType.codeOf(code); }
            if ("BarCls".equals(name())) { return CDef.BarCls.codeOf(code); }
            if ("FooCls".equals(name())) { return CDef.FooCls.codeOf(code); }
            if ("Flg".equals(name())) { return CDef.Flg.codeOf(code); }
            if ("MemberStatus".equals(name())) { return CDef.MemberStatus.codeOf(code); }
            if ("ProductStatus".equals(name())) { return CDef.ProductStatus.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public Classification nameOf(String name) {
            if ("ServiceRank".equals(name())) { return CDef.ServiceRank.valueOf(name); }
            if ("Region".equals(name())) { return CDef.Region.valueOf(name); }
            if ("SelfReference".equals(name())) { return CDef.SelfReference.valueOf(name); }
            if ("TopCommentOnly".equals(name())) { return CDef.TopCommentOnly.valueOf(name); }
            if ("SubItemImplicit".equals(name())) { return CDef.SubItemImplicit.valueOf(name); }
            if ("SubItemTable".equals(name())) { return CDef.SubItemTable.valueOf(name); }
            if ("BooleanFlg".equals(name())) { return CDef.BooleanFlg.valueOf(name); }
            if ("VariantRelationMasterType".equals(name())) { return CDef.VariantRelationMasterType.valueOf(name); }
            if ("VariantRelationQuxType".equals(name())) { return CDef.VariantRelationQuxType.valueOf(name); }
            if ("QuxCls".equals(name())) { return CDef.QuxCls.valueOf(name); }
            if ("EscapedDfpropCls".equals(name())) { return CDef.EscapedDfpropCls.valueOf(name); }
            if ("EscapedJavaDocCls".equals(name())) { return CDef.EscapedJavaDocCls.valueOf(name); }
            if ("LineSepCommentCls".equals(name())) { return CDef.LineSepCommentCls.valueOf(name); }
            if ("DeprecatedMapBasicType".equals(name())) { return CDef.DeprecatedMapBasicType.valueOf(name); }
            if ("DeprecatedMapCollaborationType".equals(name())) { return CDef.DeprecatedMapCollaborationType.valueOf(name); }
            if ("BarCls".equals(name())) { return CDef.BarCls.valueOf(name); }
            if ("FooCls".equals(name())) { return CDef.FooCls.valueOf(name); }
            if ("Flg".equals(name())) { return CDef.Flg.valueOf(name); }
            if ("MemberStatus".equals(name())) { return CDef.MemberStatus.valueOf(name); }
            if ("ProductStatus".equals(name())) { return CDef.ProductStatus.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listAll() {
            if ("ServiceRank".equals(name())) { return toClassificationList(CDef.ServiceRank.listAll()); }
            if ("Region".equals(name())) { return toClassificationList(CDef.Region.listAll()); }
            if ("SelfReference".equals(name())) { return toClassificationList(CDef.SelfReference.listAll()); }
            if ("TopCommentOnly".equals(name())) { return toClassificationList(CDef.TopCommentOnly.listAll()); }
            if ("SubItemImplicit".equals(name())) { return toClassificationList(CDef.SubItemImplicit.listAll()); }
            if ("SubItemTable".equals(name())) { return toClassificationList(CDef.SubItemTable.listAll()); }
            if ("BooleanFlg".equals(name())) { return toClassificationList(CDef.BooleanFlg.listAll()); }
            if ("VariantRelationMasterType".equals(name())) { return toClassificationList(CDef.VariantRelationMasterType.listAll()); }
            if ("VariantRelationQuxType".equals(name())) { return toClassificationList(CDef.VariantRelationQuxType.listAll()); }
            if ("QuxCls".equals(name())) { return toClassificationList(CDef.QuxCls.listAll()); }
            if ("EscapedDfpropCls".equals(name())) { return toClassificationList(CDef.EscapedDfpropCls.listAll()); }
            if ("EscapedJavaDocCls".equals(name())) { return toClassificationList(CDef.EscapedJavaDocCls.listAll()); }
            if ("LineSepCommentCls".equals(name())) { return toClassificationList(CDef.LineSepCommentCls.listAll()); }
            if ("DeprecatedMapBasicType".equals(name())) { return toClassificationList(CDef.DeprecatedMapBasicType.listAll()); }
            if ("DeprecatedMapCollaborationType".equals(name())) { return toClassificationList(CDef.DeprecatedMapCollaborationType.listAll()); }
            if ("BarCls".equals(name())) { return toClassificationList(CDef.BarCls.listAll()); }
            if ("FooCls".equals(name())) { return toClassificationList(CDef.FooCls.listAll()); }
            if ("Flg".equals(name())) { return toClassificationList(CDef.Flg.listAll()); }
            if ("MemberStatus".equals(name())) { return toClassificationList(CDef.MemberStatus.listAll()); }
            if ("ProductStatus".equals(name())) { return toClassificationList(CDef.ProductStatus.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> groupOf(String groupName) {
            if ("ServiceRank".equals(name())) { return toClassificationList(CDef.ServiceRank.groupOf(groupName)); }
            if ("Region".equals(name())) { return toClassificationList(CDef.Region.groupOf(groupName)); }
            if ("SelfReference".equals(name())) { return toClassificationList(CDef.SelfReference.groupOf(groupName)); }
            if ("TopCommentOnly".equals(name())) { return toClassificationList(CDef.TopCommentOnly.groupOf(groupName)); }
            if ("SubItemImplicit".equals(name())) { return toClassificationList(CDef.SubItemImplicit.groupOf(groupName)); }
            if ("SubItemTable".equals(name())) { return toClassificationList(CDef.SubItemTable.groupOf(groupName)); }
            if ("BooleanFlg".equals(name())) { return toClassificationList(CDef.BooleanFlg.groupOf(groupName)); }
            if ("VariantRelationMasterType".equals(name())) { return toClassificationList(CDef.VariantRelationMasterType.groupOf(groupName)); }
            if ("VariantRelationQuxType".equals(name())) { return toClassificationList(CDef.VariantRelationQuxType.groupOf(groupName)); }
            if ("QuxCls".equals(name())) { return toClassificationList(CDef.QuxCls.groupOf(groupName)); }
            if ("EscapedDfpropCls".equals(name())) { return toClassificationList(CDef.EscapedDfpropCls.groupOf(groupName)); }
            if ("EscapedJavaDocCls".equals(name())) { return toClassificationList(CDef.EscapedJavaDocCls.groupOf(groupName)); }
            if ("LineSepCommentCls".equals(name())) { return toClassificationList(CDef.LineSepCommentCls.groupOf(groupName)); }
            if ("DeprecatedMapBasicType".equals(name())) { return toClassificationList(CDef.DeprecatedMapBasicType.groupOf(groupName)); }
            if ("DeprecatedMapCollaborationType".equals(name())) { return toClassificationList(CDef.DeprecatedMapCollaborationType.groupOf(groupName)); }
            if ("BarCls".equals(name())) { return toClassificationList(CDef.BarCls.groupOf(groupName)); }
            if ("FooCls".equals(name())) { return toClassificationList(CDef.FooCls.groupOf(groupName)); }
            if ("Flg".equals(name())) { return toClassificationList(CDef.Flg.groupOf(groupName)); }
            if ("MemberStatus".equals(name())) { return toClassificationList(CDef.MemberStatus.groupOf(groupName)); }
            if ("ProductStatus".equals(name())) { return toClassificationList(CDef.ProductStatus.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<Classification> toClassificationList(List<?> clsList) {
            return (List<Classification>)clsList;
        }

        public ClassificationCodeType codeType() {
            if ("ServiceRank".equals(name())) { return ClassificationCodeType.String; }
            if ("Region".equals(name())) { return ClassificationCodeType.Number; }
            if ("SelfReference".equals(name())) { return ClassificationCodeType.Number; }
            if ("TopCommentOnly".equals(name())) { return ClassificationCodeType.String; }
            if ("SubItemImplicit".equals(name())) { return ClassificationCodeType.Number; }
            if ("SubItemTable".equals(name())) { return ClassificationCodeType.String; }
            if ("BooleanFlg".equals(name())) { return ClassificationCodeType.Boolean; }
            if ("VariantRelationMasterType".equals(name())) { return ClassificationCodeType.String; }
            if ("VariantRelationQuxType".equals(name())) { return ClassificationCodeType.String; }
            if ("QuxCls".equals(name())) { return ClassificationCodeType.String; }
            if ("EscapedDfpropCls".equals(name())) { return ClassificationCodeType.String; }
            if ("EscapedJavaDocCls".equals(name())) { return ClassificationCodeType.String; }
            if ("LineSepCommentCls".equals(name())) { return ClassificationCodeType.String; }
            if ("DeprecatedMapBasicType".equals(name())) { return ClassificationCodeType.String; }
            if ("DeprecatedMapCollaborationType".equals(name())) { return ClassificationCodeType.String; }
            if ("BarCls".equals(name())) { return ClassificationCodeType.String; }
            if ("FooCls".equals(name())) { return ClassificationCodeType.String; }
            if ("Flg".equals(name())) { return ClassificationCodeType.Number; }
            if ("MemberStatus".equals(name())) { return ClassificationCodeType.String; }
            if ("ProductStatus".equals(name())) { return ClassificationCodeType.String; }
            return ClassificationCodeType.String; // as default
        }
    }
}

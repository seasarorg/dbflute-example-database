
comment on table MEMBER is '会員: 会員登録時にInsertされる。
物理削除されることはない';
comment on column MEMBER.MEMBER_ID is '会員ID: 連番';
comment on column MEMBER.MEMBER_NAME is '会員名称: 会員検索の条件となる。';
comment on column MEMBER.MEMBER_ACCOUNT is '会員アカウント: ログインに利用。
完全にユニークである';
comment on column MEMBER.MEMBER_STATUS_CODE is '会員ステータスコード: ';
comment on column MEMBER.FORMALIZED_DATETIME is '正式会員日時: 正式会員になったら値が格納される';
comment on column MEMBER.BIRTHDATE is '生年月日: わからない場合はnull';
comment on column MEMBER.REGISTER_DATETIME is '登録日時:';
comment on column MEMBER.REGISTER_USER is '登録ユーザ:';
comment on column MEMBER.REGISTER_PROCESS is '登録プロセス:';
comment on column MEMBER.UPDATE_DATETIME is '更新日時:';
comment on column MEMBER.UPDATE_USER is '更新ユーザ:';
comment on column MEMBER.UPDATE_PROCESS is '更新プロセス:';
comment on column MEMBER.VERSION_NO is 'バージョンNO: 排他制御に利用される';

comment on table MEMBER_STATUS is '会員ステータス: 固定の区分値';
comment on table MEMBER_LOGIN is '会員ログイン: ログインの度にInsertされる';
comment on table MEMBER_WITHDRAWAL is '退会するとInsertされる';
comment on table PURCHASE is '購入: 購入の度ににInsertされる';
comment on table PRODUCT is '商品: ';
comment on table PRODUCT_STATUS is ': 商品ステータス';
comment on table SUMMARY_PRODUCT is '商品のさまりびゅー: VIEWのコメントもtableでやるんだって';

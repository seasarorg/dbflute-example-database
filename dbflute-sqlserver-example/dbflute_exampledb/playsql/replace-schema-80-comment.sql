
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'会員: 会員登録時にInsertされる。
物理削除されることはない'
  , @level0type=N'schema', @level0name=N'dbo'
  , @level1type=N'table' , @level1name=N'MEMBER'
;
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'会員ID: 連番'
  , @level0type=N'schema', @level0name=N'dbo'
  , @level1type=N'table' , @level1name=N'MEMBER'
  , @level2type=N'column' , @level2name=N'MEMBER_ID'
;
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'会員名称: 会員検索の条件となる。'
  , @level0type=N'schema', @level0name=N'dbo'
  , @level1type=N'table' , @level1name=N'MEMBER'
  , @level2type=N'column' , @level2name=N'MEMBER_NAME'
;

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'会員ステータス:'
  , @level0type=N'schema', @level0name=N'dbo'
  , @level1type=N'table' , @level1name=N'MEMBER_STATUS'
;
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'会員ステータスコード:'
  , @level0type=N'schema', @level0name=N'dbo'
  , @level1type=N'table' , @level1name=N'MEMBER_STATUS'
  , @level2type=N'column' , @level2name=N'MEMBER_STATUS_CODE'
;
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'会員ステータス名称:'
  , @level0type=N'schema', @level0name=N'dbo'
  , @level1type=N'table' , @level1name=N'MEMBER_STATUS'
  , @level2type=N'column' , @level2name=N'MEMBER_STATUS_NAME'
;
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'表示順:'
  , @level0type=N'schema', @level0name=N'dbo'
  , @level1type=N'table' , @level1name=N'MEMBER_STATUS'
  , @level2type=N'column' , @level2name=N'DISPLAY_ORDER'
;

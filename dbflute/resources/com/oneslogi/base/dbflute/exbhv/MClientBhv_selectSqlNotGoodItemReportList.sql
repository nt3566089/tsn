/*
 [df:title]
 拠点マスタを単一検索し、不適品過不足報告書項目を取得する。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String PRODUCT_CD##
-- ##String PRODUCT_NM##
-- ##String CGGDID##
-- ##String CGGDID_NM##
-- ##BigDecimal DIFF_QTY##

-- !df:pmb!
-- !!Long centerId!!
-- !!AutoDetect!!

SELECT
    MC.CENTER_CD,                            		 	 -- ①拠点CD
    MC.CENTER_ABBR AS CENTER_NM,            		 	 -- 拠点名称
    /*pmb.invDate*/'20240101' AS INVDATE,  		 	 -- 棚卸実施日
    NULL AS PRODUCT_CD,                      			 -- 銘柄CD
    NULL AS PRODUCT_NM,                      			 -- 銘柄名称
    '99' AS INADEQUACYAREA,                  			 -- 過不足発生場所
    NULL AS DIFFQTY,                        			 -- 過不足数
    NULL AS CGGDID,                         			 -- たばこ・商品区分
    BU.USER_CD,                             			 -- ②ユーザCD
    BU.USER_NM,                              			 -- ②ユーザ名
    NULL AS CGGDID_NM,                          			 -- たばこ・商品区分名称
    BD.DICT_NM AS INOUTKBN_NM,                			 -- 内外区分名称
    /*pmb.printCount*/11111111111 AS PRINTCOUNT,         -- 印刷対象件数
    /*pmb.emptyFlag*/'4444444444444444444' AS EMTPYFLAG   -- 対象データ無フラグ
FROM
    M_CENTER MC--①拠点マスタ
    INNER JOIN B_USER BU--②ユーザマスタ
    ON BU.USER_CD = /*pmb.userCd*/'4444444444444444444'
    AND BU.DEL_FLG = '0'
    INNER JOIN B_CLASS BC--③区分値マスタ
    ON BC.CLASS_CD = 'FCFLG'
    AND BC.DEL_FLG = '0'
    INNER JOIN B_CLASS_DTL BCD--④区分値明細マスタ
    ON BCD.CLASS_ID = BC.CLASS_ID
    AND BCD.CLASS_DTL_CD = /*pmb.inoutkbn*/'inoutkbn'
    AND BCD.DEL_FLG = '0'
    INNER JOIN B_DICT BD--⑤辞書マスタ
    ON BD.DICT_ID = BCD.DICT_ID
    AND BD.DEL_FLG = '0'
WHERE
    MC.CENTER_ID = /*pmb.centerId*/11111111111
AND
    MC.DEL_FLG = '0'
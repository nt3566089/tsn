 /*
 [df:title]
 (ii) 変数.対象データ無フラグ == '1'(印刷対象なし) の場合

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
-- !!AutoDetect!!
SELECT
    MC.CENTER_CD,                                		 -- 拠点CD
    MC.CENTER_ABBR AS CENTER_ABBR,			 		 	 -- 拠点名称
    /*pmb.invDate*/'20240101' AS INVDATE,	      		 -- 棚卸実施日
    NULL AS PRODUCT_CD,                           		 -- 銘柄CD
    NULL AS PRODUCT_NM,                           		 -- 銘柄名称
    '0' AS DAMAGE_REFUND_KBN,                     		 -- かし品・国税還付品区分
    '99' AS DIFFOCCAREA,                          		 -- 過不足発生場所
    NULL AS CGGDID,                               		 -- たばこ・商品区分
    0 AS DIFF_QTY,                                		 -- 過不足数
    BU.USER_CD,                                   		 -- USERCD
    BU.USER_NM,                                     	 -- USERNM
    NULL AS CGGDID_NM,                             		 -- たばこ・商品区分名称
    BD.DICT_NM AS INOUTKBN_NM,                     		 -- 内外区分名称
    /*pmb.printCount*/11111111111 AS PRINTCOUNT,   		 -- 印刷対象件数						
    /*pmb.emptyFlag*/'4444444444444444444' AS EMTPYFLAG  --対象データ無フラグ
FROM
    M_CENTER MC
    INNER JOIN B_USER BU
    ON BU.USER_CD = /*pmb.userCd*/'4444444444444444444'
    AND BU.DEL_FLG = '0'
    INNER JOIN B_CLASS BC
    ON BC.CLASS_CD = 'FCFLG'
    AND BC.DEL_FLG = '0'
    INNER JOIN B_CLASS_DTL BCD
    ON BCD.CLASS_ID = BC.CLASS_ID
    AND BCD.CLASS_DTL_CD = /*pmb.inoutkbn*/'4444444444444444444'
    AND BCD.DEL_FLG = '0'
    INNER JOIN B_DICT BD
    ON BD.DICT_ID = BCD.DICT_ID
    AND BD.DEL_FLG = '0'
WHERE
    MC.CENTER_ID = /*pmb.centerId*/11111111111
AND
    MC.DEL_FLG = '0'
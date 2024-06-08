/*
 [df:title]
 コントロールNo.で在庫過不足履歴を検索し、適品過不足報告書項目を取得する。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String PRODUCT_CD##
-- ##String PRODUCT_NM##
-- ##String CGGDID##
-- ##String CGGDID_NM##

-- !df:pmb!
-- !!AutoDetect!!
SELECT
       MC.CENTER_CD,                                      		-- 拠点CD
       MC.CENTER_ABBR,											-- 拠点名称
       /*pmb.invDate*/'20240101' AS INVDATE,	  				-- 棚卸実施日
       TTS.PRODUCT_CD,											-- 銘柄CD
       MP.PRODUCT_ABBR,											-- 銘柄名称
       TTS.DAMAGE_REFUND_KBN,									-- かし品・国税還付品区分
       TTS.DIFFOCC_AREA,										-- 過不足発生場所
       TTS.DIFF_QTY,											-- 過不足数
       MP.CGGDID,												-- たばこ・商品区分
       BU.USER_CD,												-- USERCD
       BU.USER_NM,												-- USERNM
       BD_0.DICT_NM AS CGGDID_NM,									-- たばこ・商品区分名称
       BD_1.DICT_NM AS INOUTKBN_NM,								-- 内外区分名称
   	   /*pmb.printCount*/11111111111 AS PRINTCOUNT,										--
       /*pmb.emptyFlag*/'4444444444444444444' AS EMTPYFLAG									-- 
   FROM    
      (
           SELECT
               TT.CENTER_ID,
               TT.CLIENT_ID,
               TT.INOUT_KBN,
               TT.DAMAGE_REFUND_KBN,
               TT.PRODUCT_CD,
               TT.DIFFOCC_AREA,
               SUM(ISNULL(TT.DIFF_QTY,0)) AS DIFF_QTY,
               MAX(TT.UPD_USER) AS UPD_USER
           FROM
               T_TRSTOCKDIFFHISTORY TT
           WHERE
               TT.CONTROL_NO = /*pmb.controlNo*/11111111111
           AND
               TT.DEL_FLG= '0'
           GROUP BY
               TT.CENTER_ID,
               TT.CLIENT_ID,
               TT.INOUT_KBN,
               TT.DAMAGE_REFUND_KBN,
               TT.PRODUCT_CD,
               TT.DIFFOCC_AREA
       ) TTS
       INNER JOIN M_CENTER MC 
					 ON MC.CENTER_ID = TTS.CENTER_ID
					 AND MC.DEL_FLG = '0'
       INNER JOIN M_PRODUCT MP
           ON  MP.CLIENT_ID = TTS.CLIENT_ID  
           AND MP.PRODUCT_CD = TTS.PRODUCT_CD  
           AND MP.DEL_FLG = '0'
       INNER JOIN B_USER BU
           ON  TTS.UPD_USER = BU.USER_CD
           AND BU.DEL_FLG = '0'
       INNER JOIN B_CLASS BC_0
           ON BC_0.CLASS_CD = 'CGGDID'
           AND BC_0.DEL_FLG = '0'
       INNER JOIN B_CLASS_DTL BCD
           ON BCD.CLASS_ID = BC_0.CLASS_ID
           AND BCD.CLASS_DTL_CD = MP.CGGDID
           AND BCD.DEL_FLG = '0'
       INNER JOIN B_DICT BD_0
           ON BD_0.DICT_ID = BCD.DICT_ID
           AND BD_0.DEL_FLG = '0'
       INNER JOIN B_CLASS BC_1
           ON BC_1.CLASS_CD = 'FCFLG'
           AND BC_1.DEL_FLG = '0'
       INNER JOIN  B_CLASS_DTL BCD_1
           ON BCD_1.CLASS_ID = BC_1.CLASS_ID
           AND BCD_1.CLASS_DTL_CD = TTS.INOUT_KBN
           AND BCD_1.DEL_FLG = '0'
       INNER JOIN B_DICT BD_1
           ON BD_1.DICT_ID = BCD_1.DICT_ID
           AND BD_1.DEL_FLG = '0'
   WHERE
       TTS.DIFF_QTY != 0
   ORDER BY
       MP.CGGDID ASC,
       TTS.INOUT_KBN ASC,
       MP.USERNUM3 ASC,
       TTS.PRODUCT_CD ASC
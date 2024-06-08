/*
 [df:title]
  販売物流在庫情報をリスト検索

 [df:description]
  SQL Description here.
*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!String systemDt!!
-- !!String inoutKbn!!
-- !!String yearMoth01!!
SELECT
    TT.PRODUCT_CD PCD,               -- 銘柄CD
    SUM(STORY.DIFF_QTY) TOTAL        -- 数量
FROM
	T_TRHANBAIINV TT -- 販売物流在庫情報
	INNER JOIN T_TRSTOCKDIFFHISTORY STORY -- 在庫過不足履歴
            ON STORY.CLIENT_ID  = /*pmb.clientId*/1
           AND STORY.CENTER_ID  = /*pmb.centerId*/1
           AND STORY.GOOD_ITEM_KBN = '9' -- 不適品
           AND STORY.DIFFOCC_AREA  = '9' -- 返品場
           AND STORY.DIFFADD_DATE  BETWEEN /*pmb.yearMoth01*/20241101 AND /*pmb.systemDt*/20241111
           AND STORY.PRODUCT_CD = TT.PRODUCT_CD
           AND STORY.DEL_FLG    = '0'
WHERE  TT.CENTER_ID = /*pmb.centerId*/1
   AND TT.CLIENT_ID = /*pmb.clientId*/1
   AND CONVERT(VARCHAR(8), TT.STOCKDATETIME, 112) = /*pmb.systemDt*/20241111
   AND TT.GOODITEMKBN = '9'    -- 不適品
   /*IF pmb.inoutKbn != null*/
   AND TT.INOUTKBN    = /*pmb.inoutKbn*/'0001'
   /*END*/
   AND TT.DEL_FLG= '0'
GROUP BY TT.PRODUCT_CD
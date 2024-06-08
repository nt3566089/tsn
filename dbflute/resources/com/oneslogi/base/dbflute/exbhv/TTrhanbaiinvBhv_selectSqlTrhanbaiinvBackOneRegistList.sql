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
SELECT
    TT.PRODUCT_CD PCD,                    -- 銘柄CD
    SUM(DETAIL.RECEIVEDQTY1) TOTAL        -- 数量
FROM
	T_TRHANBAIINV TT -- 販売物流在庫情報
	INNER JOIN T_TRSREPLANDETAIL DETAIL -- 返品入庫予定明細
            ON DETAIL.CLIENT_ID  = /*pmb.clientId*/1
           AND DETAIL.CENTER_ID  = /*pmb.centerId*/1
           AND DETAIL.IFITEMCD   = TT.PRODUCT_CD
           AND DETAIL.DEL_FLG = '0'
    INNER JOIN T_TRSREPLAN PLA -- 返品入庫予定
            ON PLA.CLIENT_ID = /*pmb.clientId*/1
           AND PLA.CENTER_ID = /*pmb.centerId*/1
           AND PLA.PARTFLG = '1' -- 不適品一括登録機能で登録
           AND PLA.SUFFER_USAGE_FLG = '1' -- 登録済
           AND PLA.TRSREPLAN_ID = DETAIL.TRSREPLAN_ID
           AND PLA.DEL_FLG = '0'
WHERE  TT.CENTER_ID = /*pmb.centerId*/1
   AND TT.CLIENT_ID = /*pmb.clientId*/1
   AND CONVERT(VARCHAR(8), TT.STOCKDATETIME, 112) = /*pmb.systemDt*/20241111
   AND TT.GOODITEMKBN = '9'    -- 不適品
   /*IF pmb.inoutKbn != null*/
   AND TT.INOUTKBN    = /*pmb.inoutKbn*/'0001'
   /*END*/
   AND TT.DEL_FLG= '0'
GROUP BY TT.PRODUCT_CD
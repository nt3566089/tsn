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
    MP.PRODUCT_ID PID,             -- 商品ID
    TT.PRODUCT_CD PCD,             -- 集約用銘柄CD
    TT.STOCKQTY TOTAL,             -- 在庫数量
    TT.REFUNDITEMQTY TAXTOTA,     -- 国税還付品数量
    TT.INOUTKBN                    -- 内外区分
FROM
	T_TRHANBAIINV TT -- 販売物流在庫情報
	INNER JOIN M_PRODUCT MP -- 銘柄マスタ
            ON MP.PRODUCT_CD = TT.PRODUCT_CD
           AND MP.CLIENT_ID  = TT.CLIENT_ID
           AND MP.DEL_FLG    = '0'
WHERE  TT.CENTER_ID = /*pmb.centerId*/1
   AND TT.CLIENT_ID = /*pmb.clientId*/1
   AND CONVERT(VARCHAR(8), TT.STOCKDATETIME, 112) = /*pmb.systemDt*/'20240417'
   AND TT.GOODITEMKBN = '9'    -- 不適品
   /*IF pmb.inoutKbn != null*/
   AND TT.INOUTKBN    = /*pmb.inoutKbn*/'0001'
   /*END*/
   AND TT.DEL_FLG= '0'
ORDER BY PCD
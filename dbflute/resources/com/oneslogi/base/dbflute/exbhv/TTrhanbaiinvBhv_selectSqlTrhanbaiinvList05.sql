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
SELECT
    MP.PRODUCT_ID PID,            -- 商品ID
    TT.PRODUCT_CD PCD,            -- 銘柄CD
    TT.DAMAGEITEMQTY TOTAL        -- かし品数量
FROM
	T_TRHANBAIINV TT        -- 販売物流在庫情報
	INNER JOIN M_PRODUCT MP -- 銘柄マスタ
            ON MP.PRODUCT_CD = TT.PRODUCT_CD
           AND MP.DEL_FLG    = '0'
WHERE  TT.CENTER_ID = /*pmb.centerId*/1
   AND TT.CLIENT_ID = /*pmb.clientId*/1
   AND CONVERT(VARCHAR(8), TT.STOCKDATETIME, 112) = /*pmb.systemDt*/'20240417'
   AND TT.GOODITEMKBN = '0'
   AND TT.INOUTKBN    = '0001' -- 輸入
   AND TT.DEL_FLG= '0'
   /*IF pmb.productCd != null*/
   AND TT.PRODUCT_CD LIKE /*pmb.productCd*/'1%'
   /*END*/
ORDER BY PCD
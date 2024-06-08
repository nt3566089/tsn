/*
 [df:title]
 ロケーションマスタ受信一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
SELECT STOCK.LOCATION_ID LID, STOCK.PRODUCT_ID PID, PRODUCT.PRODUCT_CD PCD,
       SUM(STOCK.CHARGE_NUM) SUMCHARGE, SUM(STOCK.ALLOC_NUM) SUMALLOC
FROM   T_STOCK STOCK -- 在庫
INNER  JOIN M_PRODUCT PRODUCT
ON     PRODUCT.PRODUCT_ID = STOCK.PRODUCT_ID
AND    PRODUCT.DEL_FLG			                   = '0'
INNER  JOIN M_LOCATION LOC
ON     LOC.LOCATION_ID = STOCK.LOCATION_ID
AND    LOC.DEL_FLG			                       = '0'
AND    LOC.LocGroup                                = '02' -- (保管場)
AND    LOC.LOCATION_TYPE NOT IN ('XX', 'YY')
INNER  JOIN M_WAREHOUSE WAREHOUSE
ON     WAREHOUSE.WAREHOUSE_ID = STOCK.WAREHOUSE_ID
AND    WAREHOUSE.DEL_FLG			               = '0'
AND    WAREHOUSE.CENTER_ID                         = /*pmb.centerId*/1
WHERE  STOCK.CLIENT_ID                             = /*pmb.clientId*/1
/*IF pmb.locationCd != null*/
AND    LOC.LOCATION_CD                          LIKE /*pmb.locationCd*/'1%'
/*END*/
AND    LOC.LOCATION_CD BETWEEN /*pmb.fromLocationCd*/'1' AND /*pmb.toLocationCd*/'2'
AND    STOCK.DEL_FLG			                       = '0'
GROUP  BY STOCK.LOCATION_ID, STOCK.PRODUCT_ID, PRODUCT.PRODUCT_CD

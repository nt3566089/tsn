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
SELECT STOCK.LOCATION_ID LID,               -- ロケーションID
	   STOCK.PRODUCT_ID PID,                -- 商品ID
	   PRODUCT.PRODUCT_CD PCD,              -- 商品CD
       SUM(STOCK.CHARGE_NUM) SUMCHARGE,     -- 引当可能数
       SUM(STOCK.ALLOC_NUM) SUMALLOC        -- 引当済数
FROM   T_STOCK STOCK -- 在庫
INNER  JOIN M_PRODUCT PRODUCT
ON     PRODUCT.PRODUCT_ID = STOCK.PRODUCT_ID
AND    PRODUCT.DEL_FLG			                   = '0'
INNER  JOIN M_LOCATION LOC
ON     LOC.LOCATION_ID = STOCK.LOCATION_ID
AND    LOC.DEL_FLG			                       = '0'
AND    LOC.LOCGROUP                                = '06' -- (仕分場)
AND    LOC.LOCATION_TYPE <> 'ZZ'                          -- (持ち戻りロケーション)
AND    LOC.LOCID IN ('0', '1')                            -- '0'(固定ロケ)  1'(不定ロケ(使用中))
INNER  JOIN M_WAREHOUSE WAREHOUSE
ON     WAREHOUSE.WAREHOUSE_ID = STOCK.WAREHOUSE_ID
AND    WAREHOUSE.DEL_FLG			               = '0'
AND    WAREHOUSE.CENTER_ID                         = /*pmb.centerId*/1
WHERE  STOCK.CLIENT_ID                             = /*pmb.clientId*/1
/*IF pmb.lineBlock != null*/
AND    LOC.LOCATION_CD                          LIKE /*pmb.lineBlock*/'1%'
/*END*/
/*IF pmb.locationCd != null*/
AND    LOC.LOCATION_CD                          LIKE /*pmb.locationCd*/'1%'
/*END*/
AND    LOC.LOCATION_CD BETWEEN /*pmb.fromLocationCd*/'1' AND /*pmb.toLocationCd*/'2'
AND    STOCK.DEL_FLG			                       = '0'
GROUP  BY STOCK.LOCATION_ID, STOCK.PRODUCT_ID, PRODUCT.PRODUCT_CD

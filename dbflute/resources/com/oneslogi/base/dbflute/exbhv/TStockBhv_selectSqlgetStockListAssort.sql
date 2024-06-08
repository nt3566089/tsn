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
-- !!String systemDt!!
SELECT ISNULL(PRODUCT.LOTATRB1TITLE, PRODUCT.PRODUCT_CD) PCD,           -- 集約用銘柄CD
       SUM(STOCK.CHARGE_NUM + STOCK.ALLOC_NUM + STOCK.MOVE_NUM) TOTAL   -- 在庫数
FROM   T_STOCK STOCK -- 在庫
INNER  JOIN M_PRODUCT PRODUCT -- 銘柄マスタ
ON     PRODUCT.PRODUCT_ID = STOCK.PRODUCT_ID
AND    PRODUCT.DEL_FLG			                   = '0'
INNER  JOIN M_LOCATION LOC -- ロケーションマスタ
ON     LOC.LOCATION_ID = STOCK.LOCATION_ID
AND    LOC.DEL_FLG			                       = '0'
AND    LOC.LOCGROUP                                = '06' -- (仕分場)
AND    LOC.LOCATION_TYPE <> 'ZZ'                          -- (持ち戻りロケーション)
AND    LOC.LOCID IN ('0', '1')                            -- 0'(固定ロケ)  1'(不定ロケ(使用中))
INNER  JOIN T_TRHANBAIINV INV -- 販売物流在庫情報
ON     INV.CENTER_ID                               = /*pmb.centerId*/1
AND    INV.CLIENT_ID                               = /*pmb.clientId*/1
AND    INV.PRODUCT_CD = PRODUCT.PRODUCT_CD
AND    INV.GOODITEMKBN                             = '0'  -- (適品)
AND    CONVERT(VARCHAR(8), INV.STOCKDATETIME, 112) = /*pmb.systemDt*/20241111
AND    INV.DEL_FLG			                       = '0'
INNER  JOIN M_WAREHOUSE WAREHOUSE -- 倉庫マスタ
ON     WAREHOUSE.WAREHOUSE_ID = STOCK.WAREHOUSE_ID
AND    WAREHOUSE.DEL_FLG			               = '0'
AND    WAREHOUSE.CENTER_ID                         = /*pmb.centerId*/1
WHERE  STOCK.CLIENT_ID                             = /*pmb.clientId*/1
AND    STOCK.DEL_FLG			                       = '0'
GROUP  BY ISNULL(PRODUCT.LOTATRB1TITLE, PRODUCT.PRODUCT_CD)
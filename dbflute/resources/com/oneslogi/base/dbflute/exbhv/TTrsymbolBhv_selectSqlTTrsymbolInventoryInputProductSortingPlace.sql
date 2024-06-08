/*
 [df:title]
 段ボール情報取得

 [df:description]
 段ボール情報を検索、段ボール情報項目を取得する。
*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!String sotedUnit!!
-- !!String assortedUnit!!
-- !!Long caseCd!!
/*IF pmb.isPaging()*/
SELECT
    TOP(1) 
  -- 段ボール情報ID
  tTrsymbol.TRSYMBOL_ID 
  -- ケースCD
  , tTrsymbol.CASECD 
  -- 製造年月日
  , tTrsymbol.LOT4 
  -- 銘柄CD
  , tTrsymbol.PRODUCT_CD 
  -- 入庫実績数量(個装)
  , tTrsymbol.RECEIVEDQTY 
  -- デザイン区分
  , tTrsymbol.LOT3 
  -- ケース補充先
  , tTrcaseStock.SOTEDUNIT 
  -- 仕分ロケ
  , tTrcaseStock.ASSORTEDUNIT 
  -- ELSE SELECT COUNT(*)
/*END*/
FROM
  -- 段ボール情報
  T_TRSYMBOL tTrsymbol 
  -- 拠点シンボル
  INNER JOIN T_CENTER_SYMBOL tCenterSymbol 
  -- 段ボール情報ID
    ON tCenterSymbol.TRSYMBOL_ID = tTrsymbol.TRSYMBOL_ID 
    -- 削除フラグ
    AND tCenterSymbol.DEL_FLG = '0' 
    -- ケース補充情報
  INNER JOIN T_TRCASESTOCK tTrcaseStock 
  -- 拠点シンボルID
    ON tTrcaseStock.CENTER_SYMBOL_ID = tCenterSymbol.CENTER_SYMBOL_ID 
    -- 削除フラグ
    AND tTrcaseStock.DEL_FLG = '0' 
WHERE
  -- 拠点ID
  tTrcaseStock.CENTER_ID = /*pmb.centerId*/2 
  -- 荷主ID
  AND tTrcaseStock.CLIENT_ID = /*pmb.clientId*/1 
  -- ケース補充先
  AND tTrcaseStock.SOTEDUNIT = /*pmb.sotedUnit*/'L1' 
  -- 仕分ロケ
  AND tTrcaseStock.ASSORTEDUNIT = /*pmb.assortedUnit*/'0101A'
  -- 削除フラグ
  AND tTrsymbol.DEL_FLG = '0' 
/*IF pmb.caseCd != null*/
  AND tTrsymbol.CASECD = /*pmb.caseCd*/1 
/*END*/
ORDER BY
  -- 仕分補充順序
  ASSORTEDINDEX DESC

/*
 [df:title]
 ケース明細情報取得

 [df:description]
 ケース明細情報を検索、仕分済ケース実績数量(SUM(操作数量))を取得する。
*/
-- #df:entity#
-- !df:pmb!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!Long assortedIndex!!
-- !!String sotedUnit!!
-- !!String assortedUnit!!
-- !!Long inventoryBId!!
-- !!String locationCd!!
SELECT
    -- ケースCD
  ISNULL(SUM(tTrcasedetail.OPERATIONNUM), 0) sortedCasesQty 
FROM
  -- ケース明細情報
  T_TRCASEDETAIL tTrcasedetail 
  -- 段ボール情報
  INNER JOIN T_TRSYMBOL tTrsymbol 
  -- 段ボール情報ID
    ON tTrsymbol.TRSYMBOL_ID = tTrcasedetail.TRSYMBOL_ID 
    -- 削除フラグ
    AND tTrsymbol.DEL_FLG = '0' 
WHERE
  -- 拠点ID
  tTrsymbol.CENTER_ID = /*pmb.centerId*/1 
  -- 荷主ID
  AND tTrsymbol.CLIENT_ID = /*pmb.clientId*/1 
  -- 操作数量
  AND tTrcasedetail.OPERATIONNUM IS NOT NULL 
  -- ケースCD / ケースCD
  AND tTrsymbol.CASECD = ( 
    SELECT
        -- ケースCD
      tTrsymbol.CASECD 
    FROM
      -- ケース補充情報
      T_TRCASESTOCK tTrcaseStock 
      -- 拠点シンボル
      INNER JOIN T_CENTER_SYMBOL tCenterSymbol 
      -- 拠点シンボルID
        ON tCenterSymbol.CENTER_SYMBOL_ID = tTrcaseStock.CENTER_SYMBOL_ID 
        -- 削除フラグ
        AND tCenterSymbol.DEL_FLG = '0' 
        -- 段ボール情報
      INNER JOIN T_TRSYMBOL tTrsymbol 
      -- 段ボール情報ID
        ON tTrsymbol.TRSYMBOL_ID = tCenterSymbol.TRSYMBOL_ID 
        -- 削除フラグ
        AND tTrsymbol.DEL_FLG = '0' 
    WHERE
      -- 拠点ID
      tTrcaseStock.CENTER_ID = /*pmb.centerId*/2 
      -- 荷主ID
      AND tTrcaseStock.CLIENT_ID = /*pmb.clientId*/1 
      -- 仕分補充順序
      AND tTrcaseStock.ASSORTEDINDEX < /*pmb.assortedIndex*/1 
      -- ケース補充先
      AND tTrcaseStock.SOTEDUNIT = /*pmb.sotedUnit*/'L1' 
      -- 仕分ロケ
      AND tTrcaseStock.ASSORTEDUNIT = /*pmb.assortedUnit*/'0101A' 
      -- 出庫区分 '0'(補充済)
      AND tTrcaseStock.PULLTYPE = '0' 
      -- 削除フラグ
      AND tTrsymbol.DEL_FLG = '0'
  ) 
  -- ケースCD / 挿入ダミーケースCD
  AND tTrsymbol.CASECD != ( 
    SELECT
        -- 挿入ダミーケースCD
      ISNULL(tTrinvcorrect.PUTDMYCASECD, 0) 
    FROM
      -- 棚卸ボディ
      T_INVENTORY_B tInventoryB 
      -- ロケーションマスタ
      INNER JOIN M_LOCATION mLocation 
      -- ロケーションID
        ON mLocation.LOCATION_ID = tInventoryB.LOCATION_ID 
        -- 削除フラグ
        AND mLocation.DEL_FLG = '0' 
        -- ケース在庫調査情報
      INNER JOIN T_TRCASEINVENTORY tTrcaseinventory 
      -- 棚卸ボディID
        ON tTrcaseinventory.INVENTORY_B_ID = tInventoryB.INVENTORY_B_ID 
        -- 削除フラグ
        AND tTrcaseinventory.DEL_FLG = '0' 
        -- 在庫調査補正情報
      INNER JOIN T_TRINVCORRECT tTrinvcorrect 
      -- ケース在庫調査番号
        ON tTrinvcorrect.CASEINVENTORYNO = tTrcaseinventory.CASEINVENTORYNO 
        -- 削除フラグ
        AND tTrinvcorrect.DEL_FLG = '0' 
    WHERE
      -- 拠点ID
      tTrcaseinventory.CENTER_ID = /*pmb.centerId*/2 
      -- 荷主ID
      AND tTrcaseinventory.CLIENT_ID = /*pmb.clientId*/1 
      -- 棚卸ボディID
      AND tInventoryB.INVENTORY_B_ID = /*pmb.inventoryBId*/1 
      -- ロケーションCD
      AND mLocation.LOCATION_CD = /*pmb.locationCd*/'L1-0101A' 
      -- 削除フラグ
      AND tInventoryB.DEL_FLG = '0'
  ) 
  -- ケースCD / 挿入ダミー分割ケースCD
  AND tTrsymbol.CASECD != ( 
    SELECT
        -- 挿入ダミー分割ケースCD
      ISNULL(tTrinvcorrect.PUTDMYCUTCASECD, 0) 
    FROM
      -- 棚卸ボディ
      T_INVENTORY_B tInventoryB 
      -- ロケーションマスタ
      INNER JOIN M_LOCATION mLocation 
      -- ロケーションID
        ON mLocation.LOCATION_ID = tInventoryB.LOCATION_ID 
        -- 削除フラグ
        AND mLocation.DEL_FLG = '0' 
        -- ケース在庫調査情報
      INNER JOIN T_TRCASEINVENTORY tTrcaseinventory 
      -- 棚卸ボディID
        ON tTrcaseinventory.INVENTORY_B_ID = tInventoryB.INVENTORY_B_ID 
        -- 削除フラグ
        AND tTrcaseinventory.DEL_FLG = '0' 
        -- 在庫調査補正情報
      INNER JOIN T_TRINVCORRECT tTrinvcorrect 
      -- ケース在庫調査番号
        ON tTrinvcorrect.CASEINVENTORYNO = tTrcaseinventory.CASEINVENTORYNO 
        -- 削除フラグ
        AND tTrinvcorrect.DEL_FLG = '0' 
    WHERE
      -- 拠点ID
      tTrcaseinventory.CENTER_ID = /*pmb.centerId*/2 
      -- 荷主ID
      AND tTrcaseinventory.CLIENT_ID = /*pmb.clientId*/1 
      -- 棚卸ボディID
      AND tInventoryB.INVENTORY_B_ID = /*pmb.inventoryBId*/1 
      -- ロケーションCD
      AND mLocation.LOCATION_CD = /*pmb.locationCd*/'L1-0101A' 
      -- 削除フラグ
      AND tInventoryB.DEL_FLG = '0'
  ) 
  -- ケース明細番号 / 挿入ダミーケース明細番号
  AND tTrcasedetail.CASEDETAILNO != ( 
    SELECT
        -- 挿入ダミーケース明細番号
      ISNULL(tTrinvcorrect.PUTDMYCASEDETAILNO, 0) 
    FROM
      -- 棚卸ボディ
      T_INVENTORY_B tInventoryB 
      -- ロケーションマスタ
      INNER JOIN M_LOCATION mLocation 
      -- ロケーションID
        ON mLocation.LOCATION_ID = tInventoryB.LOCATION_ID 
        -- 削除フラグ
        AND mLocation.DEL_FLG = '0' 
        -- ケース在庫調査情報
      INNER JOIN T_TRCASEINVENTORY tTrcaseinventory 
      -- 棚卸ボディID
        ON tTrcaseinventory.INVENTORY_B_ID = tInventoryB.INVENTORY_B_ID 
        -- 削除フラグ
        AND tTrcaseinventory.DEL_FLG = '0' 
        -- 在庫調査補正情報
      INNER JOIN T_TRINVCORRECT tTrinvcorrect 
      -- ケース在庫調査番号
        ON tTrinvcorrect.CASEINVENTORYNO = tTrcaseinventory.CASEINVENTORYNO 
        -- 削除フラグ
        AND tTrinvcorrect.DEL_FLG = '0' 
    WHERE
      -- 拠点ID
      tTrcaseinventory.CENTER_ID = /*pmb.centerId*/2 
      -- 荷主ID
      AND tTrcaseinventory.CLIENT_ID = /*pmb.clientId*/1 
      -- 棚卸ボディID
      AND tInventoryB.INVENTORY_B_ID = /*pmb.inventoryBId*/1 
      -- ロケーションCD
      AND mLocation.LOCATION_CD = /*pmb.locationCd*/'L1-0101A' 
      -- 削除フラグ
      AND tInventoryB.DEL_FLG = '0'
  ) 
  AND tTrcasedetail.DEL_FLG = '0'
;

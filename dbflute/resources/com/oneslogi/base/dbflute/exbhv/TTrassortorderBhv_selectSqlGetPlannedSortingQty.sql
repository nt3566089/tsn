/*
 [df:title]
追跡情報(棚卸)取得

 [df:description]
 追跡情報(棚卸)を検索、仕分予定数量を取得する。
*/
-- #df:entity#
-- !df:pmb!
-- !!String warehouseCd!!
-- !!String sotedUnit!!
-- !!String sotedLoc!!
-- !!String itemCd!!
-- !!Long shiporder!!
-- !!Long inventoryBId!!
-- !!String locationCd!!
SELECT
    -- さしず数量
  ISNULL(SUM(tTrcasedetail.DIRECTIONNUM), 0) plannedSortingQty 
FROM
  -- 追跡情報(棚卸)
  T_TRASSORTORDER tTrassortorder 
  -- ケース明細情報
  INNER JOIN T_TRCASEDETAIL tTrcasedetail 
  -- 処理日 / 受信日
    ON tTrcasedetail.DT_EXTDATA1 = tTrassortorder.RCVDATE 
    -- 削除フラグ
    AND tTrcasedetail.DEL_FLG = '0' 
WHERE
  -- 拠点CD
  tTrassortorder.WAREHOUSECD = /*pmb.warehouseCd*/'8735' 
  -- 補充先
  AND tTrassortorder.SOTEDUNIT = /*pmb.sotedUnit*/'L1' 
  -- 仕分ロケ
  AND tTrassortorder.SOTEDLOC = /*pmb.sotedLoc*/'0101A' 
  -- 銘柄CD
  AND tTrassortorder.ITEMCD = /*pmb.itemCd*/'1028' 
  -- 仕分ラインCD
  AND tTrassortorder.LINECD LIKE 'L%' 
  -- 削除フラグ
  AND tTrassortorder.DEL_FLG = '0' 
/*IF pmb.shiporder != null*/
  -- 出荷順
  AND tTrassortorder.SHIPORDER <= /*pmb.shiporder*/1 
/*END*/
  -- 挿入ダミーさしず番号 / さしず実績枝番号
  AND CONVERT(varchar, tTrassortorder.DIRECTIONORDERKEY) + ',' + CONVERT(varchar, tTrassortorder.DIRECTIONORDERGNO)
   NOT IN ( 
    SELECT
        -- 挿入ダミーさしず番号 / さしず実績枝番号
      CONVERT( 
        varchar
        , ISNULL(tTrinvcorrect.PUTDMYDIRECTIONNO, 0)
      ) + ',' + CONVERT( 
        varchar
        , ISNULL(tTrassortorder.DIRECTIONORDERGNO, 0)
      ) 
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
        -- 追跡情報(棚卸)
      INNER JOIN T_TRASSORTORDER tTrassortorder 
      -- さしず実績順序キー / 挿入ダミーさしず番号
        ON tTrassortorder.DIRECTIONORDERKEY = tTrinvcorrect.PUTDMYDIRECTIONNO 
        -- さしず実績枝番号 / 挿入ダミーさしず実績枝番号
        AND tTrassortorder.DIRECTIONORDERGNO = tTrinvcorrect.PUTDMYDIRECTIONORDERGNO 
        -- 削除フラグ
        AND tTrassortorder.DEL_FLG = '0' 
    WHERE
      -- 棚卸ボディID
      tInventoryB.INVENTORY_B_ID = /*pmb.inventoryBId*/1 
      -- ロケーションCD
      AND mLocation.LOCATION_CD = /*pmb.locationCd*/'L1-0101A' 
      -- 削除フラグ
      AND tInventoryB.DEL_FLG = '0'
  ) 
;

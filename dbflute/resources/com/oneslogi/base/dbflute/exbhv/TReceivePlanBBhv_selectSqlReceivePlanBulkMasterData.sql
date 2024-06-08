/*
 [df:title]
  入荷予定マスタデータ取得

 [df:description]
  入荷予定データ毎に各マスタからデータ取得

*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/

-- ELSE select count(*)
/*END*/
SELECT TRPH_0.RECEIVE_PLAN_H_ID
  ,TRPB_0.RECEIVE_PLAN_B_ID
  ,MP_0.PRODUCT_ID
  ,ML_0.LOCATION_ID
  ,MLZW_0.WAREHOUSE_ID AS LOC_ZONE_WAREHOUSE_ID
  ,MW_0.WAREHOUSE_ID AS MW_WAREHOUSE_ID
  ,MC_0.CUSTOMER_ID AS SUPPLY_CUSTOMER_ID
  ,MC_0.VENDOR_FLG AS SUPPLY_VENDOR_FLG
  ,MC_1.CUSTOMER_ID AS DEPOSIT_CUSTOMER_ID
  ,MC_1.DEPOSIT_FLG  -- // cls(DepositFlg)
-- [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
  ,MS_0.DECIMAL_EXIST_FLG  -- // cls(DecimalExistFlg)
-- [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add End
FROM T_RECEIVE_PLAN_B TRPB_0
  INNER JOIN T_RECEIVE_PLAN_H TRPH_0
    ON TRPB_0.RECEIVE_PLAN_H_ID = TRPH_0.RECEIVE_PLAN_H_ID
  LEFT JOIN M_PRODUCT MP_0                                            -- 商品マスタ
    ON TRPH_0.CLIENT_ID = MP_0.CLIENT_ID
    AND TRPB_0.PRODUCT_CD = MP_0.PRODUCT_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MP_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
-- [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
  LEFT JOIN M_SHAPE_GRP MS_0                                          -- 商品 → 荷姿グループ
    ON MP_0.SHAPE_GRP_ID = MS_0.SHAPE_GRP_ID
    AND MS_0.DEL_FLG = '0'
-- [#3904][Ver3.0] 伝票別入荷一覧 - エラーチェック処理不正 2018.03.05 honma Add End
  LEFT JOIN M_LOCATION ML_0                                           -- ロケーションマスタ
    ON TRPH_0.CENTER_ID = ML_0.CENTER_ID
    AND TRPB_0.PLAN_LOCATION_CD = ML_0.LOCATION_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND ML_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_ZONE MZ_0                                              -- ロケーション → ゾーン
    ON ML_0.ZONE_ID = MZ_0.ZONE_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MZ_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_WAREHOUSE MLZW_0                                        -- ロケーション → ゾーン → 倉庫
    ON MZ_0.WAREHOUSE_ID = MLZW_0.WAREHOUSE_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MLZW_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_WAREHOUSE MW_0                                          -- 倉庫マスタ
    ON TRPH_0.CENTER_ID = MW_0.CENTER_ID
    AND TRPB_0.PLAN_WAREHOUSE_CD = MW_0.WAREHOUSE_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MW_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CUSTOMER MC_0                                           -- 取引先マスタ(仕入先）
    ON TRPH_0.CLIENT_ID = MC_0.CLIENT_ID
    AND TRPH_0.PLAN_SUPPLIER_CD = MC_0.CUSTOMER_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MC_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CUSTOMER MC_1                                           -- 取引先マスタ(預託)
    ON TRPH_0.CLIENT_ID = MC_1.CLIENT_ID
    AND TRPH_0.PLAN_DEPOSIT_CD = MC_1.CUSTOMER_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MC_1.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
WHERE TRPH_0.CONTROL_NO =  /*pmb.controlNo*/11111111111
/*IF pmb.isPaging()*/
ORDER BY TRPH_0.RECEIVE_PLAN_H_ID,TRPB_0.RECEIVE_PLAN_B_ID ASC
/*END*/

/*
 [df:title]
  出荷指示マスタデータ取得

 [df:description]
  出荷指示データ毎に各マスタからデータ取得

*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/

-- ELSE select count(*)
/*END*/
SELECT TSIH_0.SHIPPING_INST_H_ID                                    -- 出荷指示ヘッダID
  ,TSIB_0.SHIPPING_INST_B_ID                                        -- 出荷指示ボディID
  ,MC_0.CUSTOMER_ID AS SUPPLY_CUSTOMER_ID                           -- 納品先ID
  ,MC_0.CUSTOMER_CD AS SUPPLY_CUSTOMER_CD                           -- 納品先CD
  ,MC_0.CUSTOMER_NM AS SUPPLY_CUSTOMER_NM                           -- 納品先名称
  ,MC_0.DELIVERY_FLG AS SUPPLY_DELIVERY_FLG                         -- 納品先フラグ
  ,MC_1.CUSTOMER_ID AS DELIVERY_CUSTOMER_ID                         -- 届き先ID
  ,MC_1.CUSTOMER_CD AS DELIVERY_CUSTOMER_CD                         -- 届き先CD
  ,MC_1.CUSTOMER_NM AS DELIVERY_CUSTOMER_NM                         -- 届き先ND
  ,MC_1.ZIP_CD AS DELIVERY_ZIP_CD                                   -- 届先郵便番号
  ,MC_1.TEL_NO AS DELIVERY_TEL_NO                                   -- 届先電話番号
  ,MC_1.ADDRESS1 AS DELIVERY_ADDRESS1                               -- 届先住所1
  ,MC_1.ADDRESS2 AS DELIVERY_ADDRESS2                               -- 届先住所2 --
  ,MC_1.ADDRESS3 AS DELIVERY_ADDRESS3                               -- 届先住所3
  ,MC_1.DELIVERY_FLG AS DELIVERY_DELIVERY_FLG                       -- 納品先フラグ
  ,MC_1.ONETIME_FLG AS DELIVERY_ONETIME_FLG
  ,MCC_0.CLIENT_CENTER_ID                                           -- 荷主センタマスタ.荷主センタID
  ,MCC_0.CENTER_ID AS MCLIENT_CENTER_CENTER_ID
  ,MCC_0.CLIENT_ID AS MCLIENT_CENTER_CLIENT_ID
  ,MCC_0.CUSTOMER_ID AS MCLIENT_CENTER_CUSTOMER_ID
  ,MCENTER_0.CENTER_ID AS MCENTER_CENTER_ID
  ,MC_CC_0.CUSTOMER_ID AS MCUSTOMER_CC_CUSTOMER_ID
  ,MZ_0.ZIP_ID AS MZIP_ZIP_ID
  ,MDC_0.DELIVERY_COURSE_ID
  ,MDC_0.DELIVERY_COURSE_CD
  ,MDC_0.DELIVERY_COURSE_NM
  ,MDC_0.CARRIER_ID AS MDELIV_COURSE_CARRIER_ID
  ,MCARRIER_0.CARRIER_CD AS MCARRIER_CARRIER_CD                     -- 運送業者マスタ.運送業者CD
  ,MCARRIER_0.DEL_FLG AS MCARRIER_DEL_FLG                           -- 運送業者マスタ.削除フラグ
  ,MC_3.CUSTOMER_ID AS DEPOSIT_CUSTOMER_ID
  ,MC_3.CUSTOMER_CD AS DEPOSIT_CUSTOMER_CD
  ,MC_3.CUSTOMER_NM AS DEPOSIT_CUSTOMER_NM
  ,MC_3.DEPOSIT_FLG AS DEPOSIT_DEPOSIT_FLG
  ,MST_0.STOCK_TYPE_ID
  ,MST_0.STOCK_TYPE_CD
  ,MP_0.PRODUCT_ID AS MPRODUCT_PRODUCT_ID
  ,MP_0.PRODUCT_CD AS MPRODUCT_PRODUCT_CD
  ,MP_0.PRODUCT_NM AS MPRODUCT_PRODUCT_NM
-- [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
  ,MS_0.DECIMAL_EXIST_FLG AS MS_DECIMAL_EXIST_FLG
-- [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add End
  ,MW_0.WAREHOUSE_ID AS MW_WAREHOUSE_ID
  ,MW_0.WAREHOUSE_CD AS MW_WAREHOUSE_CD
  ,MW_0.WAREHOUSE_NM AS MW_WAREHOUSE_NM
  ,ML_0.LOCATION_ID AS ML_LOCATION_ID
  ,ML_0.LOCATION_CD AS ML_LOCATION_CD
  ,ML_0.LOCATION_NM ML_LOCATION_NM
  ,MW_1.WAREHOUSE_ID AS MZ_MW_WAREHOUSE_ID
  ,MW_1.WAREHOUSE_CD AS MZ_MW_WAREHOUSE_CD
  ,MCCU_0.CENTER_CUSTOMER_ID
  ,MCCU_0.DELIVERY_COURSE_ID AS DELIV_COURSE_ID_BY_CUSTOMER
  ,MCCU_0.CENTER_ID
  ,MDC_1.DELIVERY_COURSE_CD AS DELIV_COURSE_CD_BY_CUSTOMER
FROM T_SHIPPING_INST_B TSIB_0
  INNER JOIN T_SHIPPING_INST_H TSIH_0
    ON TSIB_0.SHIPPING_INST_H_ID = TSIH_0.SHIPPING_INST_H_ID
  LEFT JOIN M_CUSTOMER MC_0
    ON TSIH_0.CLIENT_ID = MC_0.CLIENT_ID
    AND TSIH_0.SUPPLY_CUSTOMER_CD = MC_0.customer_cd
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MC_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CUSTOMER MC_1
    ON TSIH_0.CLIENT_ID = MC_1.CLIENT_ID
    AND TSIH_0.DELIV_CUSTOMER_CD = MC_1.CUSTOMER_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MC_1.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CLIENT_CENTER MCC_0
    ON TSIH_0.CLIENT_ID = MCC_0.CLIENT_ID
    AND MC_0.CUSTOMER_ID = MCC_0.CUSTOMER_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MCC_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CLIENT_CENTER MCC_1
    ON TSIH_0.CLIENT_ID = MCC_1.CLIENT_ID
    AND TSIH_0.CENTER_ID = MCC_1.CENTER_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MCC_1.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CUSTOMER MC_CC_0
    ON MCC_1.CUSTOMER_ID = MC_CC_0.CUSTOMER_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MC_CC_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CENTER MCENTER_0                                   -- センタマスタ(荷主センタマスタ→センタマスタ）
    ON MCC_0.CENTER_ID = MCENTER_0.CENTER_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MCENTER_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_ZIP MZ_0
    ON TSIH_0.DELIV_ZIP_CD = MZ_0.ZIP_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MZ_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_DELIVERY_COURSE MDC_0                              -- 配送コースマスタ(出荷指示ヘッダ→配送コースマスタ)
    ON TSIH_0.CENTER_ID = MDC_0.CENTER_ID
    AND TSIH_0.DELIVERY_COURSE_CD = MDC_0.DELIVERY_COURSE_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MDC_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CARRIER MCARRIER_0                                 -- 運送業者マスタ（配送コースマスタ→運送業者マスタ）
    ON MDC_0.CARRIER_ID = MCARRIER_0.CARRIER_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MCARRIER_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CUSTOMER MC_3
    ON TSIH_0.CLIENT_ID = MC_3.CLIENT_ID
    AND TSIB_0.DEPOSIT_CD = MC_3.CUSTOMER_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MC_3.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_STOCK_TYPE MST_0
    ON TSIB_0.STOCK_TYPE_CD = MST_0.STOCK_TYPE_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MST_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_PRODUCT MP_0
    ON TSIH_0.CLIENT_ID = MP_0.CLIENT_ID
    AND TSIB_0.PRODUCT_CD = MP_0.PRODUCT_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MP_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
-- [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add Start
  LEFT JOIN M_SHAPE_GRP MS_0                                     -- 商品 → 荷姿グループ
    ON MP_0.SHAPE_GRP_ID = MS_0.SHAPE_GRP_ID
    AND MS_0.DEL_FLG = '0'
-- [#3905][Ver3.0] 出庫指示一覧 - エラーチェック処理不正 2018.03.05 honma Add End
  LEFT JOIN M_WAREHOUSE MW_0
    ON TSIH_0.CENTER_ID = MW_0.CENTER_ID
    AND TSIB_0.WAREHOUSE_CD = MW_0.WAREHOUSE_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MW_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_LOCATION ML_0
    ON TSIH_0.CENTER_ID = ML_0.CENTER_ID
    AND TSIB_0.LOCATION_CD = ML_0.LOCATION_CD
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND ML_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_ZONE MZONE_0
    ON ML_0.ZONE_ID = MZONE_0.ZONE_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MZONE_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_WAREHOUSE MW_1
    ON MZONE_0.WAREHOUSE_ID = MW_1.WAREHOUSE_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MW_1.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_CENTER_CUSTOMER MCCU_0
    ON MC_1.CUSTOMER_ID = MCCU_0.CUSTOMER_ID
    AND MCCU_0.CENTER_ID = TSIH_0.CENTER_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MCCU_0.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
  LEFT JOIN M_DELIVERY_COURSE MDC_1
    ON MCCU_0.DELIVERY_COURSE_ID = MDC_1.DELIVERY_COURSE_ID
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana Start
    AND MDC_1.DEL_FLG = '0'
-- [#1000] エラーチェック時の削除フラグ=0の条件抜けを修正 2017.02.13 kawana End
 WHERE TSIH_0.CONTROL_NO = /*pmb.controlNo*/11111111111
/*IF pmb.isPaging()*/
 ORDER BY TSIH_0.SHIPPING_INST_H_ID,TSIB_0.SHIPPING_INST_B_ID ASC
/*END*/

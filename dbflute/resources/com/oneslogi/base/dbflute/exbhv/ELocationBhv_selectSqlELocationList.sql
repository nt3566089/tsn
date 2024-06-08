/*
 [df:title]
 ロケーションマスタ受信一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!Long cultureId!!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT
    EL_0.LOCATION_ID,
    -- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.01 honma start
    EL_0.RECEIVE_CD,
    -- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.01 honma end
    EL_0.RECEIVE_ROW_ID,
    EL_0.IMPORT_FLG,
    EL_0.ERROR_FLG,
    EL_0.ERROR_MESSAGE_CD,
    EL_0.CENTER_CD,
    EL_0.LOCATION_CD,
    EL_0.LOCATION_NM,
    EL_0.WAREHOUSE_CD,
    EL_0.ZONE_CD,
    EL_0.LOCATION_TYPE,
    EL_0.PICKING_LOCATION_FLG,
    EL_0.ALLOC_NG_FLG,
    EL_0.PICKING_ORDER,
    EL_0.ALLOC_ORDER,
    EL_0.CLIENT_CD,
    EL_0.REPLENISH_PRODUCT_CD,
    EL_0.REPLENISH_STOCK_TYPE_CD,
    EL_0.REPLENISH_DEPOSIT_CD,
    MC_D_1.CUSTOMER_NM AS REPLENISH_DEPOSIT_NM,
    EL_0.REPLENISH_P_NUM,
    EL_0.REPLENISH_P_PRODUCT_SHAPE_CD,
    EL_0.MAX_STORE_NUM,
    EL_0.MAX_STORE_PRODUCT_SHAPE_CD,
    EL_0.DEL_FLG,
    EL_0.VERSION_NO,
    EL_0.CONTROL_NO,
    EL_0.ADD_DT,
    EL_0.ADD_USER,
    EL_0.ADD_PROCESS,
    EL_0.UPD_DT,
    EL_0.UPD_USER,
    EL_0.UPD_PROCESS,
-- [#6732][v3.1] 行数が増えて表示されてしまう問題を修正 (STOCK_IDの取得を削除) 2019.10.04 kawana Delete
    MZ_0.ZONE_ID,
    MZ_0.ZONE_NM,
    MZ_MW_0.WAREHOUSE_NM,
    MZ_MW_0.WAREHOUSE_ID,
    MP_0.PRODUCT_ID,
    MP_MPS_1.PRODUCT_SHAPE_ID AS REPLENISH_PRODUCT_SHAPE_ID,
    MP_MPS_1.DICT_NM AS REPLENISH_PRODUCT_SHAPE_NM,
    MP_MPS_3.PRODUCT_SHAPE_ID AS MAX_STORE_PRODUCT_SHAPE_ID,
    MP_MPS_3.DICT_NM AS MAX_STORE_PRODUCT_SHAPE_NM,
    BM_0.MESSAGE_NM,
    ML_0.LOCATION_ID AS MLOCATION_ID,
    ML_0.VERSION_NO AS MVERSION_NO
-- ELSE SELECT COUNT(*)
/*END*/
FROM
    E_LOCATION EL_0
-- [#6732][v3.1] 行数が増えて表示されてしまう問題を修正 (T_STOCKとの結合を削除) 2019.10.04 kawana Delete
    LEFT JOIN/* 倉庫CD */
        M_WAREHOUSE MZ_MW_0
    ON EL_0.WAREHOUSE_CD = MZ_MW_0.WAREHOUSE_CD
    -- [ON推-1.1.4-CT-077]CT指摘の修正対応 2016.06.17 chou Add Start
    AND MZ_MW_0.CENTER_ID = /*pmb.centerId*/12345678901
    -- [ON推-1.1.4-CT-077]CT指摘の修正対応 2016.06.17 chou Add End
    LEFT JOIN/* ゾーンCD */
        (
            SELECT
                MW_1.WAREHOUSE_CD,
                MZ_1.ZONE_NM,
                MZ_1.ZONE_CD,
                MZ_1.ZONE_ID
            FROM
                M_WAREHOUSE MW_1
                INNER JOIN
                    M_ZONE MZ_1
                ON  MW_1.WAREHOUSE_ID = MZ_1.WAREHOUSE_ID
                AND MW_1.CENTER_ID = /*pmb.centerId*/12345678901
        ) MZ_0
    ON  EL_0.ZONE_CD = MZ_0.ZONE_CD
    AND EL_0.WAREHOUSE_CD = MZ_0.WAREHOUSE_CD
    LEFT JOIN/* 補充商品CD */
        M_PRODUCT MP_0
    ON  EL_0.REPLENISH_PRODUCT_CD = MP_0.PRODUCT_CD
    AND MP_0.CLIENT_ID = /*pmb.clientId*/12345678901



   LEFT JOIN/* 補充点商品荷姿は商品荷姿マスタに存在チェック */
       (
           SELECT
               MPS_10.PRODUCT_SHAPE_ID,
               -- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
               VD_1.DICT_NM,
               -- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
               MS_10.SHAPE_CD,
               MP_10.PRODUCT_ID,
               MP_10.PRODUCT_CD
           FROM
               M_PRODUCT_SHAPE MPS_10
               -- [Ver3.0] unit of measure対応 2017.11.30 駱 Start
               INNER JOIN
			       M_SHAPE_GRP_DTL SHP_GRP_10
               ON  SHP_GRP_10.SHAPE_GRP_DTL_ID = MPS_10.SHAPE_GRP_DTL_ID
               -- [Ver3.0] unit of measure対応 2017.11.30 駱 End
			   INNER JOIN
                    M_SHAPE MS_10
                ON  MS_10.SHAPE_ID = SHP_GRP_10.SHAPE_ID
               INNER JOIN
                   M_PRODUCT MP_10
               ON  MP_10.PRODUCT_ID = MPS_10.PRODUCT_ID
               -- [Ver3.0] unit of measure対応 2017.11.30 駱 Start
               AND MP_10.CLIENT_ID = /*pmb.clientId*/12345678901
               -- [Ver3.0] unit of measure対応 2017.11.30 駱 End
               -- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
               LEFT JOIN V_DICT VD_1
                 ON VD_1.DICT_ID = MS_10.SHAPE_DICT_ID
                 AND (VD_1.CULTURE_ID = /*pmb.cultureId*/11111111111 OR VD_1.CULTURE_ID IS NULL)
               -- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
           WHERE MP_10.PRODUCT_CD IN (
                   SELECT
                       EL_1.REPLENISH_PRODUCT_CD
                   FROM
                       E_LOCATION EL_1
                   WHERE EL_1.RECEIVE_CD = /*pmb.receiveCd*/'E12345678901'
                   /*IF pmb.errorFlg != null*/
                       AND EL_1.ERROR_FLG = /*pmb.errorFlg*/'0'
                   /*END*/
                   /*IF pmb.importFlg != null*/
                       AND EL_1.IMPORT_FLG = /*pmb.importFlg*/'0'
                   /*END*/
                 )
       ) MP_MPS_1
   ON  CONCAT(EL_0.REPLENISH_P_PRODUCT_SHAPE_CD,EL_0.REPLENISH_PRODUCT_CD) = CONCAT(MP_MPS_1.SHAPE_CD,MP_MPS_1.PRODUCT_CD)

   LEFT JOIN/* 最大格納数商品荷姿は商品荷姿マスタに存在チェック */
       (
           SELECT
               MPS_3.PRODUCT_SHAPE_ID,
               -- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
               VD_1.DICT_NM,
               -- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
               MS_3.SHAPE_CD,
               MP_3.PRODUCT_ID,
               MP_3.PRODUCT_CD
           FROM
               M_PRODUCT_SHAPE MPS_3
               -- [Ver3.0] unit of measure対応 2017.11.30 駱 Start
			   INNER JOIN
			       M_SHAPE_GRP_DTL SHP_GRP_3
               ON  SHP_GRP_3.SHAPE_GRP_DTL_ID = MPS_3.SHAPE_GRP_DTL_ID
               -- [Ver3.0] unit of measure対応 2017.11.30 駱 End
               INNER JOIN
                   M_SHAPE MS_3
               ON  MS_3.SHAPE_ID = SHP_GRP_3.SHAPE_ID
               INNER JOIN
                   M_PRODUCT MP_3
               ON  MP_3.PRODUCT_ID = MPS_3.PRODUCT_ID
               AND MP_3.CLIENT_ID = /*pmb.clientId*/12345678901
               -- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
               LEFT JOIN V_DICT VD_1
                 ON VD_1.DICT_ID = MS_3.SHAPE_DICT_ID
                 AND (VD_1.CULTURE_ID = /*pmb.cultureId*/11111111111 OR VD_1.CULTURE_ID IS NULL)
               -- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
           WHERE MP_3.PRODUCT_CD IN (
                   SELECT
                       EL_1.REPLENISH_PRODUCT_CD
                   FROM
                       E_LOCATION EL_1
                   WHERE EL_1.RECEIVE_CD = /*pmb.receiveCd*/'E12345678901'
                   /*IF pmb.errorFlg != null*/
                       AND EL_1.ERROR_FLG = /*pmb.errorFlg*/'0'
                   /*END*/
                   /*IF pmb.importFlg != null*/
                       AND EL_1.IMPORT_FLG = /*pmb.importFlg*/'0'
                   /*END*/
                 )
       ) MP_MPS_3
   ON  CONCAT(EL_0.MAX_STORE_PRODUCT_SHAPE_CD,EL_0.REPLENISH_PRODUCT_CD) = CONCAT(MP_MPS_3.SHAPE_CD,MP_MPS_3.PRODUCT_CD)


    LEFT JOIN/* メッセージ */
        B_MESSAGE BM_0
    ON  EL_0.ERROR_MESSAGE_CD = BM_0.MESSAGE_CD
    /*IF pmb.cultureId != null*/
        AND BM_0.CULTURE_ID = /*pmb.cultureId*/12345678901
    /*END*/
    LEFT JOIN
        M_LOCATION ML_0
    ON  EL_0.LOCATION_CD = ML_0.LOCATION_CD
    AND ML_0.CENTER_ID = /*pmb.centerId*/12345678901
    LEFT JOIN M_CUSTOMER MC_D_1
			ON EL_0.REPLENISH_DEPOSIT_CD = MC_D_1.CUSTOMER_CD
			AND MC_D_1.CLIENT_ID = /*pmb.clientId*/12345678901
			AND MC_D_1.DEPOSIT_FLG = '1'
			AND MC_D_1.DEL_FLG = '0'
WHERE
    1 = 1
-- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.01 honma start
AND EL_0.RECEIVE_CD = /*pmb.receiveCd*/'E12345678901'
-- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.01 honma end
/*IF pmb.errorFlg != null*/
    AND EL_0.ERROR_FLG = /*pmb.errorFlg*/'0'
/*END*/
/*IF pmb.importFlg != null*/
    AND EL_0.IMPORT_FLG = /*pmb.importFlg*/'0'
/*END*/
/*IF pmb.isPaging()*/
ORDER BY
    EL_0.LOCATION_ID ASC,
    -- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.01 honma start
    EL_0.RECEIVE_CD ASC,
    -- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.01 honma end
    EL_0.RECEIVE_ROW_ID ASC
/*END*/

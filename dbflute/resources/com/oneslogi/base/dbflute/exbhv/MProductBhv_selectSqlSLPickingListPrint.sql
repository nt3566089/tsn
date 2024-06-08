/*
 [df:title]
  種蒔きピッキングリスト発行。出庫ヘッダ1レコード毎です。

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##Long PICKING_H_ID##
-- [Ver3.0] unit of measure対応 2017.11.23 REN Start
-- *M_PRODUCT.PRODUCT_ID*
-- [Ver3.0] unit of measure対応 2017.11.23 REN End
-- !df:pmb extends Paging!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT
  MC.CLIENT_CD
  , MAX(MC.CLIENT_ABBR) AS CLIENT_NM
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
  -- [ON推-品向-469] 種蒔きNoをシステム採番からセンタ採番に変更するためセンタIDを追加 2015.01.09 kawana Start
  , TPH.CENTER_ID
  -- [ON推-品向-469] 種蒔きNoをシステム採番からセンタ採番に変更するためセンタIDを追加 2015.01.09 kawana End
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
  , MCR.CENTER_CD
  , MAX(MCR.CENTER_ABBR) AS CENTER_NM
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
  , TPH.PICKING_GROUP_NO AS PICKING_GROUP_NO
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
  , T1.WORK_DT
  , T1.SUPPLY_CUSTOMER_CD
  , MAX(T1.SUPPLY_CUSTOMER_NM) AS SUPPLY_CUSTOMER_NM
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
  -- 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動 2016.01.28 kawana Start
  , MAX(TPAH.SEEDING_NO) AS SEEDING_NO
  -- 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動 2016.01.28 kawana End
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
  , MAX(TPH.PICKING_H_ID) AS PICKING_H_ID
  , MST.STOCK_TYPE_CD
  , MAX(BD.DICT_NM) AS STOCK_TYPE_NM
  , TPB.TEMP_NO
  -- [Ver3.0] unit of measure対応 2017.11.23 REN Start
  , MP.PRODUCT_ID
  -- [Ver3.0] unit of measure対応 2017.11.23 REN End
  , MP.PRODUCT_CD
  , MAX(MP.PRODUCT_ABBR) AS PRODUCT_NM
  ,	ML.LOCATION_CD
  , MAX(ML.LOCATION_NM) AS LOCATION_NM
  -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
  , MAX(MP.JAN_CD) AS JANCD
  -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
  , TSN.STORE_LABEL_NO
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
  , TSN.STORE_DT
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
  , MAX(TL.LIMIT_DT) AS LIMIT_DT
  -- [新ｿﾘ-016] 指示ロットではなく、引当ロットを表示 2014.12.09 yokosuka Start
  -- , MAX(TAIB.LOT) AS LOT
  , MAX(TL.LOT) AS LOT
  -- [新ｿﾘ-016] 指示ロットではなく、引当ロットを表示 2014.12.09 yokosuka End
  -- [Ver3.0] unit of measure対応 2017.11.24 REN Del
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.04 sja Start
--   , SUM(TPB.PICKING_NUM) AS SUM_PICKING_NUM
  , SUM(TPAB.PACKING_NUM) AS SUM_PICKING_NUM
-- [Ver3.0] unit of measure対応 2017.11.24 REN Del
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.04 sja End
  --, SUBSTR(COALESCE(MAX(TPH.PICKING_WORK_NO), ''), 1, 6) AS PICKING_WORK_NO1
  --, SUBSTR(COALESCE(MAX(TPH.PICKING_WORK_NO), ''), 7, 5) AS PICKING_WORK_NO2
  , SUBSTRING(COALESCE(MAX(TPH.PICKING_WORK_NO), ''), 1, 6) AS PICKING_WORK_NO1
  , SUBSTRING(COALESCE(MAX(TPH.PICKING_WORK_NO), ''), 7, 5) AS PICKING_WORK_NO2
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja Start
-- [ON推-品向-1127] 届先ごとに分かれず1行になってしまう問題を修正 2016.04.19 kawana Start
-- [ON推-品質問題点指摘（新ｿﾘV2-041）]修正対応 2016.08.02 chou Mod Start
  --, SUBSTR(COALESCE(TPAH.SHIPPING_PACKING_NO, ''), 1, 6) AS SHIPPING_PACKING_NO1
  --, SUBSTR(COALESCE(TPAH.SHIPPING_PACKING_NO, ''), 7, 5) AS SHIPPING_PACKING_NO2
  , SUBSTRING(COALESCE(TPAH.SHIPPING_PACKING_NO, ''), 1, 6) AS SHIPPING_PACKING_NO1
  , SUBSTRING(COALESCE(TPAH.SHIPPING_PACKING_NO, ''), 7, 5) AS SHIPPING_PACKING_NO2
-- [ON推-品質問題点指摘（新ｿﾘV2-041）]修正対応 2016.08.02 chou Mod End
-- [ON推-品向-1127] 届先ごとに分かれず1行になってしまう問題を修正 2016.04.19 kawana End
  , MAX(MPA.PACKING_CAL_CLS) AS PACKING_CAL_CLS
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja End
-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
  ,MAX(TPR.SL_OUT_FLG) AS SL_OUT_FLG
-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
FROM
  T_PICKING_H TPH
  INNER JOIN T_PICKING_B TPB
    ON TPH.PICKING_H_ID = TPB.PICKING_H_ID
    AND TPB.DEL_FLG = '0'
  LEFT JOIN M_CLIENT MC
    ON TPH.CLIENT_ID = MC.CLIENT_ID
    AND MC.DEL_FLG = '0'
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.04 sja Start
 INNER JOIN T_PACKING_B TPAB
    ON TPAB.PICKING_B_ID = TPB.PICKING_B_ID
   AND TPAB.DEL_FLG = '0'
 INNER JOIN T_PACKING_H  TPAH
    ON TPAH.PACKING_H_ID = TPAB.PACKING_H_ID
   AND TPAH.MIXED_FLG = '1'
   AND TPAH.DEL_FLG = '0'
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.04 sja End
  INNER JOIN T_ALLOC_INST_H TAIH
    ON TPH.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
    AND TAIH.DEL_FLG = '0'
  INNER JOIN T_ALLOC_INST_B TAIB
    ON TPB.ALLOC_INST_B_ID = TAIB.ALLOC_INST_B_ID
    AND TAIB.DEL_FLG = '0'
  LEFT JOIN M_CENTER MCR
    ON TPH.CENTER_ID = MCR.CENTER_ID
    AND MCR.DEL_FLG = '0'
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
  INNER JOIN T_STOCK TS
    ON TPB.STOCK_ID = TS.STOCK_ID
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
    AND TS.DEL_FLG = '0'
  INNER JOIN T_STORE_NO TSN
    ON TS.STORE_NO_ID = TSN.STORE_NO_ID
   	AND TSN.DEL_FLG = '0'
  LEFT JOIN M_WAREHOUSE MW
    ON TS.WAREHOUSE_ID = MW.WAREHOUSE_ID
    AND MW.DEL_FLG = '0'
  INNER JOIN T_SHIPPING_INST_B TSIB
    ON TPB.SHIPPING_INST_B_ID = TSIB.SHIPPING_INST_B_ID
    AND TSIB.DEL_FLG = '0'
  INNER JOIN T_SHIPPING_INST_H TSIH
    ON TSIB.SHIPPING_INST_H_ID = TSIH.SHIPPING_INST_H_ID
    AND TSIH.DEL_FLG = '0'
  LEFT JOIN M_STOCK_TYPE MST
    ON TS.STOCK_TYPE_ID = MST.STOCK_TYPE_ID
    AND MST.DEL_FLG = '0'
  LEFT JOIN V_DICT BD
    ON MST.DICT_ID = BD.DICT_ID
    -- [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana Start
    AND (BD.CULTURE_ID = /*pmb.cultureId*/11111111111 OR BD.CULTURE_ID IS NULL)
    -- [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana End
  LEFT JOIN M_PRODUCT MP
    ON TAIB.PRODUCT_ID = MP.PRODUCT_ID
    AND MP.DEL_FLG = '0'
 -- [エンハンス PH2.0] ケース荷姿の入数取得を変更 2015.12.11 sja Start
--  LEFT JOIN M_PRODUCT_SHAPE MPS
--    ON MP.PRODUCT_ID = MPS.PRODUCT_ID
--    AND MPS.DEL_FLG = '0'
 INNER JOIN M_CLIENT_CENTER MCC
    ON MCC.CLIENT_ID = TPH.CLIENT_ID
   AND MCC.CENTER_ID = TPH.CENTER_ID
   AND MCC.DEL_FLG = '0'
 INNER JOIN M_PARAM MPA
    ON MPA.CLIENT_CENTER_ID = MCC.CLIENT_CENTER_ID
   AND MPA.DEL_FLG = '0'
 -- [Ver3.0] unit of measure対応 2017.11.24 REN Del
 -- [エンハンス PH2.0] ケース荷姿の入数取得を変更 2015.12.11 sja End
   LEFT JOIN M_LOCATION ML
    ON TS.LOCATION_ID = ML.LOCATION_ID
    AND ML.DEL_FLG = '0'
  INNER JOIN T_PICKING_R TPR
    ON TPH.PICKING_H_ID = TPR.PICKING_H_ID
    AND TPR.DEL_FLG = '0'
  LEFT JOIN T_LOT TL
    ON TS.LOT_ID = TL.LOT_ID
    AND TL.DEL_FLG = '0'
  LEFT JOIN (
    SELECT
      MC.CLIENT_CD
      , MCR.CENTER_CD
      , MW.WAREHOUSE_CD
      , TPH.PICKING_WORK_NO
      -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示(出庫指示バッチNo.集計max削除) 2018.08.23 kawana Delete
      , MAX(TAIH.WORK_DT) AS WORK_DT
      , MAX(TAIH.SUPPLY_CUSTOMER_CD) AS SUPPLY_CUSTOMER_CD
      , MAX(MMCR.CUSTOMER_ABBR) AS SUPPLY_CUSTOMER_NM
    FROM
      T_PICKING_H TPH
      INNER JOIN T_PICKING_B TPB
        ON TPH.PICKING_H_ID = TPB.PICKING_H_ID
        AND TPB.DEL_FLG = '0'
      LEFT JOIN M_CLIENT MC
        ON TPH.CLIENT_ID = MC.CLIENT_ID
        AND MC.DEL_FLG = '0'
      INNER JOIN T_ALLOC_INST_H TAIH
        ON TPH.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
        AND TAIH.DEL_FLG = '0'
      INNER JOIN T_ALLOC_INST_B TAIB
        ON TPB.ALLOC_INST_B_ID = TAIB.ALLOC_INST_B_ID
        AND TAIB.DEL_FLG = '0'
      LEFT JOIN M_CENTER MCR
        ON TPH.CENTER_ID = MCR.CENTER_ID
        AND MCR.DEL_FLG = '0'
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
      INNER JOIN T_STOCK TS
        ON TPB.STOCK_ID = TS.STOCK_ID
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
        AND TS.DEL_FLG = '0'
      LEFT JOIN M_WAREHOUSE MW
        ON TS.WAREHOUSE_ID = MW.WAREHOUSE_ID
        AND MW.DEL_FLG = '0'
      INNER JOIN T_SHIPPING_INST_B TSIB
        ON TPB.SHIPPING_INST_B_ID = TSIB.SHIPPING_INST_B_ID
        AND TSIB.DEL_FLG = '0'
      INNER JOIN T_SHIPPING_INST_H TSIH
        ON TSIB.SHIPPING_INST_H_ID = TSIH.SHIPPING_INST_H_ID
        AND TSIH.DEL_FLG = '0'
      INNER JOIN T_PICKING_R TPR
        ON TPH.PICKING_H_ID = TPR.PICKING_H_ID
        AND TPR.DEL_FLG = '0'
      LEFT JOIN M_CUSTOMER MMCR
        ON TAIH.SUPPLY_CUSTOMER_ID = MMCR.CUSTOMER_ID
        AND MMCR.DEL_FLG = '0'
    WHERE
      /*IF pmb.controlNo != null*/
       TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
      /*END*/
    GROUP BY
      MC.CLIENT_CD
      , MCR.CENTER_CD
      , MW.WAREHOUSE_CD
      , TPH.PICKING_WORK_NO
  ) T1
    ON MC.CLIENT_CD = T1.CLIENT_CD
    AND MCR.CENTER_CD = T1.CENTER_CD
    AND MW.WAREHOUSE_CD = T1.WAREHOUSE_CD
    AND TPH.PICKING_WORK_NO = T1.PICKING_WORK_NO
WHERE
  /*IF pmb.controlNo != null*/
  TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
  /*END*/
GROUP BY
    TPH.CLIENT_ID
  , TPH.CENTER_ID
  , MC.CLIENT_CD
  , MCR.CENTER_CD
  , T1.WORK_DT
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
  , TPH.PICKING_GROUP_NO
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
  , MST.STOCK_TYPE_CD
    -- 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動(GROUP BYから削除) 2016.01.28 kawana
  , TPB.TEMP_NO
  , ML.LOCATION_CD
  , MP.PRODUCT_CD
  -- [Ver3.0] unit of measure対応 2017.11.23 REN Start
  , MP.PRODUCT_ID
  -- [Ver3.0] unit of measure対応 2017.11.23 REN End
  , T1.SUPPLY_CUSTOMER_CD
  , TSN.STORE_LABEL_NO
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
  , TSN.STORE_DT
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
-- [ON推-品向-1127] 届先ごとに分かれず1行になってしまう問題を修正 2016.04.19 kawana Start
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja Start
  , TPAH.SHIPPING_PACKING_NO
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja End
-- [ON推-品向-1127] 届先ごとに分かれず1行になってしまう問題を修正 2016.04.19 kawana End
ORDER BY
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  -- [EC-CT1-171] 再発行はリストの最後に出力(ソート順変更) 2015.04.01 kawana Start
   SL_OUT_FLG
  -- [EC-CT1-171] 再発行はリストの最後に出力(ソート順変更) 2015.04.01 kawana End
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  , MC.CLIENT_CD
  , MCR.CENTER_CD
  , T1.WORK_DT
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
  , TPH.PICKING_GROUP_NO
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
  , MST.STOCK_TYPE_CD
  , TPB.TEMP_NO
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  -- 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動 2016.01.28 kawana Start
  , SEEDING_NO
  -- 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動 2016.01.28 kawana End
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  , MP.PRODUCT_CD
  , T1.SUPPLY_CUSTOMER_CD
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  , MAX(T1.PICKING_WORK_NO)
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
-- [ON推-品向-1127] 届先ごとに分かれず1行になってしまう問題を修正 2016.04.19 kawana Start
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja Start
  , TPAH.SHIPPING_PACKING_NO
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja End
-- [ON推-品向-1127] 届先ごとに分かれず1行になってしまう問題を修正 2016.04.19 kawana End
/*END*/


  /*
   [df:title]
    トータルピッキングリスト発行。出庫ヘッダ1レコード毎です。

   [df:description]
    SQL Description here.

  */

 -- #df:entity#
 -- ##Long PICKING_ORDER##
 -- ##Long PICKING_H_ID##
 -- [Ver3.0] unit of measure対応 2017.11.24 REN Start
 -- *M_PRODUCT.PRODUCT_ID*
 -- [Ver3.0] unit of measure対応 2017.11.24 REN End
 -- !df:pmb extends Paging!
 -- !!AutoDetect!!
/*IF pmb.isPaging()*/
-- [検査-131] SQLを修正しました。 2014.12.01 wangzs Start
SELECT MC.CLIENT_CD,
       MAX(MC.CLIENT_ABBR) AS CLIENT_NM,
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
       -- [ON推-品向-469] 種蒔きNoをシステム採番からセンタ採番に変更するためセンタIDを追加 2015.01.09 kawana Start
       TPH.CENTER_ID,
       -- [ON推-品向-469] 種蒔きNoをシステム採番からセンタ採番に変更するためセンタIDを追加 2015.01.09 kawana End
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
       MCR.CENTER_CD,
       MAX(MCR.CENTER_ABBR) AS CENTER_NM,
       MW.WAREHOUSE_CD,
       -- [#5703][v3.1] 倉庫名称から倉庫略称略称に修正 2018.11.26 kawana Start
       MAX(MW.WAREHOUSE_ABBR) AS WAREHOUSE_NM,
       -- [#5703][v3.1] 倉庫名称から倉庫略称略称に修正 2018.11.26 kawana End
       -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示(PICKING_BATCH_NO削除) 2018.08.23 kawana Delete
       TAIH.WORK_DT,
       -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
       TPH.PICKING_GROUP_NO AS PICKING_GROUP_NO,
       -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
       MST.STOCK_TYPE_CD,
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
       MAX(BD.DICT_NM) AS STOCK_TYPE_NM,
       MAX(MZ.PICKING_ORDER) AS PICKING_ORDER,
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
       MZ.ZONE_CD,
       MAX(MZ.ZONE_NM) AS ZONE_NM,
       MP.PRODUCT_CD,
       -- [Ver3.0] unit of measure対応 2017.11.24 REN Start
       MP.PRODUCT_ID,
       -- [Ver3.0] unit of measure対応 2017.11.24 REN End
       MAX(TPH.PICKING_H_ID) AS PICKING_H_ID,
       MAX(MP.PRODUCT_ABBR) AS PRODUCT_NM,
       -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
       MAX(MP.JAN_CD) AS JANCD,
       -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
       -- [Ver3.0] unit of measure対応 2017.11.24 REN Del
-- [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.30 sja Start
       -- SUM(TPB.PICKING_NUM) AS SUM_PICKING_NUM,
       SUM(TPAB.PACKING_NUM) AS SUM_PICKING_NUM,
-- [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.30 sja End
       TSN.STORE_LABEL_NO,
       -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
       TSN.STORE_DT,
       -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
       MAX(TL.LOT) AS LOT,
       MAX(TL.LIMIT_DT) AS LIMT_DT,
       MAX(TPB.TEMP_NO) AS TEMP_NO,
       -- [SK2-002] 引当可能数が伝票数倍された値で印字されている。 2014.12.08 KI Start
       MAX(TS.CHARGE_NUM) AS CHARGE_NUM,
       -- [SK2-002] 引当可能数が伝票数倍された値で印字されている。 2014.12.08 KI End
    -- [検査-139] ピッキンググループNo採番ルール変更 DEL 2014.11.28 KI
       MAX(ML.LOCATION_CD) AS LOCATION_CD,
       MAX(ML.LOCATION_NM) AS LOCATION_NM,
-- [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.30 sja Start
-- [Ver3.0] unit of measure対応 2017.11.24 REN Del
-- [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.30 sja End
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
       MAX(TPR.TPL_OUT_FLG) AS TPL_OUT_FLG
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
FROM T_PICKING_H TPH
  LEFT OUTER JOIN M_CLIENT MC
    ON TPH.CLIENT_ID = MC.CLIENT_ID
   AND MC.DEL_FLG = '0'
 INNER JOIN T_PICKING_B TPB
    ON TPB.PICKING_H_ID = TPH.PICKING_H_ID
   AND TPB.DEL_FLG = '0'
-- [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.30 sja Start
 INNER JOIN T_PACKING_B TPAB
    ON TPAB.PICKING_B_ID = TPB.PICKING_B_ID
   AND TPAB.DEL_FLG = '0'
 INNER JOIN T_PACKING_H  TPAH
    ON TPAH.PACKING_H_ID = TPAB.PACKING_H_ID
   AND TPAH.MIXED_FLG = '1'
   AND TPAH.DEL_FLG = '0'
-- [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.30 sja End
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
 INNER JOIN T_STOCK TS
    ON TPB.STOCK_ID = TS.STOCK_ID
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
   AND TS.DEL_FLG = '0'
 INNER JOIN T_LOT TL
    ON TS.LOT_ID = TL.LOT_ID
   AND TL.DEL_FLG = '0'
 INNER JOIN T_STORE_NO TSN
    ON TS.STORE_NO_ID = TSN.STORE_NO_ID
   AND TSN.DEL_FLG = '0'
  LEFT JOIN M_WAREHOUSE MW
    ON TS.WAREHOUSE_ID = MW.WAREHOUSE_ID
   AND MW.DEL_FLG = '0'
  LEFT JOIN M_STOCK_TYPE MST
    ON TS.STOCK_TYPE_ID = MST.STOCK_TYPE_ID
   AND MST.DEL_FLG = '0'
  LEFT JOIN V_DICT BD
    ON MST.DICT_ID = BD.DICT_ID
    -- [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana Start
    AND (BD.CULTURE_ID = /*pmb.cultureId*/11111111111 OR BD.CULTURE_ID IS NULL)
    -- [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana End
  LEFT JOIN M_LOCATION ML
    ON TS.LOCATION_ID = ML.LOCATION_ID
   AND ML.DEL_FLG = '0'
  LEFT JOIN M_ZONE MZ
    ON ML.ZONE_ID = MZ.ZONE_ID
   AND MZ.DEL_FLG = '0'
 INNER JOIN T_ALLOC_INST_B TAIB
    ON TPB.ALLOC_INST_B_ID = TAIB.ALLOC_INST_B_ID
   AND TAIB.DEL_FLG = '0'
 INNER JOIN T_ALLOC_INST_H TAIH
    ON TAIB.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
   AND TAIH.DEL_FLG = '0'
  LEFT JOIN M_PRODUCT MP
    ON TAIB.PRODUCT_ID = MP.PRODUCT_ID
   AND MP.DEL_FLG = '0'
 -- [エンハンス PH2.0] ケース荷姿の入数取得を変更 2015.11.23 sja Start
--  LEFT JOIN M_PRODUCT_SHAPE MPS
--    ON MP.PRODUCT_ID = MPS.PRODUCT_ID
--   AND MPS.DEL_FLG = '0'

-- [Ver3.0] unit of measure対応 2017.11.24 REN Del

 -- [エンハンス PH2.0] ケース荷姿の入数取得を変更 2015.11.23 sja End
 INNER JOIN T_SHIPPING_INST_B TSIB
    ON TPB.SHIPPING_INST_B_ID = TSIB.SHIPPING_INST_B_ID
   AND TSIB.DEL_FLG = '0'
 INNER JOIN T_SHIPPING_INST_H TSIH
    ON TSIB.SHIPPING_INST_H_ID = TSIH.SHIPPING_INST_H_ID
   AND TPB.DEL_FLG = '0'
  LEFT JOIN M_CENTER MCR
    ON TPH.CENTER_ID = MCR.CENTER_ID
   AND MCR.DEL_FLG = '0'
 INNER JOIN T_PICKING_R TPR
    ON TPH.PICKING_H_ID = TPR.PICKING_H_ID
   AND TPR.DEL_FLG = '0'
 WHERE TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
GROUP BY
     TPH.CLIENT_ID
   , TPH.CENTER_ID
   , MC.CLIENT_CD
   , MCR.CENTER_CD
   /*IF pmb.delFlg == '1'*/
   , TPH.PICKING_H_ID
   /*END*/
   , MW.WAREHOUSE_CD
   , MZ.ZONE_CD
   , TAIH.WORK_DT
   -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
   , TPH.PICKING_GROUP_NO
   -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
   , MST.STOCK_TYPE_CD
   , ML.PICKING_ORDER
   /*IF pmb.delFlg == '0'*/
   -- [Ver3.0] unit of measure対応 2017.11.24 REN Start
   , MP.PRODUCT_ID
   -- [Ver3.0] unit of measure対応 2017.11.24 REN End
   , MP.PRODUCT_CD
   , TSN.STORE_LABEL_NO
   -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
   , TSN.STORE_DT
   -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
   , TPB.TEMP_NO
   /*END*/

ORDER BY
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  -- [EC-CT1-171] 再発行はリストの最後に出力(ソート順変更) 2015.04.01 kawana Start
    TPL_OUT_FLG
  -- [EC-CT1-171] 再発行はリストの最後に出力(ソート順変更) 2015.04.01 kawana End
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  , MC.CLIENT_CD
  , MCR.CENTER_CD
  , MW.WAREHOUSE_CD
  , TAIH.WORK_DT
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
  , TPH.PICKING_GROUP_NO
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  , PICKING_ORDER
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  , MZ.ZONE_CD
  , ML.PICKING_ORDER
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  , LOCATION_CD
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  , MP.PRODUCT_CD
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  , LIMT_DT
  , LOT
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  , TSN.STORE_LABEL_NO
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
  , TSN.STORE_DT
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
  , TPB.TEMP_NO
/*END*/

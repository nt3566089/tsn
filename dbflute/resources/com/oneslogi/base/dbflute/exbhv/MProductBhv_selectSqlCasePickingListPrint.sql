
  /*
   [df:title]
    ケースピッキングリスト発行。出庫ヘッダ1レコード毎です。

   [df:description]
    SQL Description here.

  */

 -- #df:entity#
 -- ##BigDecimal CASE_CNT##
 -- ##Long PICKING_ORDER##
 -- ##Long SHAPE_SORT##
 -- ##Long SHAPE_ID##
 -- [Ver3.0] unit of measure対応 2017.11.24 REN Start
 -- *M_PRODUCT.PRODUCT_ID*
 -- [Ver3.0] unit of measure対応 2017.11.24 REN End
  -- !df:pmb extends Paging!
  -- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT MC.CLIENT_CD,
       MAX(MC.CLIENT_ABBR) AS CLIENT_NM,
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
       MCR.CENTER_ID,
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
       MCR.CENTER_CD,
       MAX(MCR.CENTER_ABBR) AS CENTER_NM,
       MW.WAREHOUSE_CD,
       -- [Ver1.1.4][ON推-不具合修正] 2016.02.10 chou Start
       MAX(MW.WAREHOUSE_ABBR) AS WAREHOUSE_NM,
       -- [Ver1.1.4][ON推-不具合修正] 2016.02.10 chou End
       --  [Ver3.1][#5130]ピッキングリストから出荷指示バッチNo.削除 2018.09.21 matsumoto Del
       TAIH.WORK_DT,
       TPH.PICKING_WORK_NO,
       -- [Ver1.1.4][ON推-仕様変更] 2016.02.10 chou 追加 Start
       -- TPH.PICKING_GROUP_NO,-- ピッキンググループNo.
       -- [Ver1.1.4][ON推-仕様変更] 2016.02.10 chou 追加 End
       TPAB.CASE_PICKING_NO,
       MST.STOCK_TYPE_CD,
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
       MAX(BD.DICT_NM) AS STOCK_TYPE_NM,
       MAX(MZ.PICKING_ORDER) AS PICKING_ORDER,
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
       MZ.ZONE_CD,
       MAX(MZ.ZONE_NM) AS ZONE_NM,
       MP.PRODUCT_CD,
       MAX(MP.PRODUCT_ABBR) AS PRODUCT_NM,
       -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
       MAX(MP.JAN_CD) AS JANCD,
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
       -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
       SUM(TPAB.PACKING_NUM) AS SUM_PICKING_NUM,
       TSN.STORE_LABEL_NO,
       -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
       TSN.STORE_DT,
       -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
       MAX(TL.LOT) AS LOT,
       MAX(TL.LIMIT_DT) AS LIMT_DT,
       -- [Ver1.1.4][ON推-仕様変更] 2016.02.10 chou 削除 Start
       -- MAX(TS.CHARGE_NUM) AS CHARGE_NUM,
       -- [Ver1.1.4][ON推-仕様変更] 2016.02.10 chou 削除 End
       MAX(ML.LOCATION_CD) AS LOCATION_CD,
       MAX(ML.LOCATION_NM) AS LOCATION_NM,
       -- [Ver3.0] unit of measure対応 2017.11.24 REN Start
       MP.PRODUCT_ID,
       MAX(CASE_SHAPE.SHAPE_SORT) AS SHAPE_SORT,
       MAX(CASE_SHAPE.SHAPE_ID) AS SHAPE_ID ,
       -- [Ver3.0] unit of measure対応 2017.11.24 REN End
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
       MAX(TPR.CASE_OUT_FLG) AS CASE_OUT_FLG,
       -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
       -- [#3110] 帳票レイアウト変更 2018.01.25 fujiwara Start
       MIN(TPAH.SHIPPING_PACKING_NO) AS FROM_SHIPPING_PACKING_NO,
       MAX(TPAH.SHIPPING_PACKING_NO) AS TO_SHIPPING_PACKING_NO
	   -- [#3110] 帳票レイアウト変更 2018.01.25 fujiwara End
FROM T_PICKING_H TPH
  LEFT OUTER JOIN M_CLIENT MC
    ON TPH.CLIENT_ID = MC.CLIENT_ID
   AND MC.DEL_FLG = '0'
 INNER JOIN T_PICKING_B TPB
    ON TPB.PICKING_H_ID = TPH.PICKING_H_ID
   AND TPB.DEL_FLG = '0'
 INNER JOIN T_PACKING_B TPAB
    ON TPAB.PICKING_B_ID = TPB.PICKING_B_ID
   AND TPAB.DEL_FLG = '0'
 INNER JOIN T_PACKING_H  TPAH
    ON TPAH.PACKING_H_ID = TPAB.PACKING_H_ID
   AND TPAH.MIXED_FLG = '0'
   AND TPAH.DEL_FLG = '0'
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
    AND (BD.CULTURE_ID = /*pmb.cultureId*/11111111111 OR BD.CULTURE_ID IS NULL)
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
 INNER JOIN M_CLIENT_CENTER MCC
    ON MCC.CLIENT_ID = TPH.CLIENT_ID
   AND MCC.CENTER_ID = TPH.CENTER_ID
   AND MCC.DEL_FLG = '0'
-- [Ver3.0] unit of measure対応 2017.11.24 REN Start
  LEFT OUTER JOIN
  ( -- ソート順を取得
    SELECT
      PRODUCT_SHAPE.PRODUCT_ID,
      SHAPE_GRP_DTL.SHAPE_SORT,
      SHAPE_GRP_DTL.SHAPE_ID
    FROM M_PRODUCT_SHAPE  PRODUCT_SHAPE
      JOIN M_SHAPE_GRP_DTL  SHAPE_GRP_DTL
        ON PRODUCT_SHAPE.SHAPE_GRP_DTL_ID = SHAPE_GRP_DTL.SHAPE_GRP_DTL_ID
    WHERE
      SHAPE_GRP_DTL.CASE_PICK_FLG = '1'
  )  CASE_SHAPE
  ON CASE_SHAPE.PRODUCT_ID = MP.PRODUCT_ID
  -- [Ver3.0] unit of measure対応 2017.11.24 REN End
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
     MC.CLIENT_CD
   , MCR.CENTER_ID
   , MCR.CENTER_CD
   , MW.WAREHOUSE_CD
   , TAIH.WORK_DT
   --  [Ver3.1][#5130]ピッキングリストから出荷指示バッチNo.削除 2018.09.21 matsumoto Del
   , TPH.PICKING_WORK_NO
   , MST.STOCK_TYPE_CD
   , MZ.ZONE_CD
   , ML.PICKING_ORDER
   , MP.PRODUCT_CD
   , TSN.STORE_LABEL_NO
   -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
   , TSN.STORE_DT
   -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
   -- [Ver1.1.4][ON推-仕様変更] 2016.02.10 chou 追加 Start
   -- ,TPH.PICKING_GROUP_NO -- ピッキンググループNo.
   -- [Ver1.1.4][ON推-仕様変更] 2016.02.10 chou 追加 End
   -- [Ver3.0] unit of measure対応 2017.11.24 REN Start
   , MP.PRODUCT_ID
   -- [Ver3.0] unit of measure対応 2017.11.24 REN End
   , TPAB.CASE_PICKING_NO
ORDER BY
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
    CASE_OUT_FLG
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  , MC.CLIENT_CD
  , MCR.CENTER_CD
  , MW.WAREHOUSE_CD
  , TAIH.WORK_DT
  --  [Ver3.1][#5130]ピッキングリストから出荷指示バッチNo.削除 2018.09.21 matsumoto Del
  -- [ON推-1.1.4-CT-116]CT指摘の修正対応 2016.06.21 chou Del
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  , PICKING_ORDER
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  -- [ON推-1.1.4-CT-116]CT指摘の修正対応 2016.06.22 chou Del
  , MZ.ZONE_CD
  , TPAB.CASE_PICKING_NO
  , ML.PICKING_ORDER
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  , LOCATION_CD
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  -- [ON推-1.1.4-CT-116]CT指摘の修正対応 2016.06.21 chou Add Start
  , MP.PRODUCT_CD
  -- [ON推-1.1.4-CT-116]CT指摘の修正対応 2016.06.21 chou Add End
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  , LIMT_DT
  , LOT
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  , TSN.STORE_LABEL_NO
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
  , TSN.STORE_DT
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
  , TPH.PICKING_WORK_NO

/*END*/

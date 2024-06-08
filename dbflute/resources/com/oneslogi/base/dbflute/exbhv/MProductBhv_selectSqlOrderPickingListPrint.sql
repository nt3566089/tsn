
  /*
   [df:title]
    オーダーピッキングリスト発行。出庫ヘッダ1レコード毎です。

   [df:description]
    SQL Description here.

  */

  -- #df:entity#
  -- ##Long SHIPPING_SLIP_NO##
  -- ##Long PICKING_WORK_MESSAGE_COUNT##
  -- [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe Start --
  -- *M_PRODUCT.PRODUCT_ID*
  -- [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe End --
  -- !df:pmb extends Paging!
  -- !!AutoDetect!!

/*IF pmb.isPaging()*/
  -- [SK2-047] ソート順がおかしくなっている。 2014.12.12 KI Start
  SELECT subB.WMS_SHIPPING_SLIP_NO AS WMS_SHIPPING_SLIP_NO,
  -- [SK2-047] ソート順がおかしくなっている。 2014.12.12 KI End
         subB.SHIPPING_SLIP_NO,
         -- [ON推-品向-590] 顧客出荷指示No.を表示 2015.05.26 kawana Start
         subB.CLIENT_SHIPPING_NO,
         -- [ON推-品向-590] 顧客出荷指示No.を表示 2015.05.26 kawana End
         subA.CLIENT_CD,
         subA.CLIENT_NM,
         subA.CLIENT_ABBR,
         subA.CENTER_CD,
         subA.CENTER_NM,
         subA.CENTER_ABBR,
         subA.WAREHOUSE_CD,
         subA.WAREHOUSE_NM,
         subA.WAREHOUSE_ABBR,
         subA.WORK_DT,
         subA.DELIV_DT,
         --  [Ver3.1][#5130]ピッキングリストから出荷指示バッチNo.削除 2018.09.21 matsumoto Del
         subA.CARRIER_CD,
         subA.CARRIER_NM,
         subA.DELIVERY_COURSE_CD,
         subA.DELIVERY_COURSE_NM,
         subA.SUPPLY_CUSTOMER_CD,
         subA.SUPPLY_CUSTOMER_NM,
         subA.PICKING_WORK_NO,
         subA.DELIV_UNIT_NO,
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja Start
         subA.SHIPPING_PACKING_NO,
         MB.BOX_CD,
         MB.BOX_NM,
         MPA.PACKING_CAL_CLS,  -- // cls(PackingCalCls)
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja End
         subB.PICKING_WORK_MESSAGE,
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start         
         subB.PICKING_WORK_MESSAGE_COUNT,
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End
         subA.LOCATION_CD,
         subA.LOCATION_NM,
         -- [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe Start --
         subA.PRODUCT_ID,
         -- [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe End --
         MP.PRODUCT_CD,
         MP.PRODUCT_ABBR AS PRODUCT_NM,
         TPR.OPL_OUT_FLG,  -- // cls(ListOutFlg)
         -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
         MP.JAN_CD,
         -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
         subA.STORE_LABEL_NO,
         -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
         subA.STORE_DT,
         -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
         subA.LOT,
         subA.LIMIT_DT,
       -- [Ver3.0] unit of measure対応 2017.11.24 REN Del
         subA.PICKING_NUM,
         subA.CHARGE_NUM,
         -- [検査-123] 最小の伝票番号設定します 2014.12.01 zhouj Start
         subA.TEMP_NO
         -- [検査-123] 最小の伝票番号設定します 2014.12.01 zhouj end

    FROM (SELECT
                 TPH.PICKING_WORK_NO   AS  PICKING_WORK_NO
                ,TPH.DELIV_UNIT_NO  AS DELIV_UNIT_NO
                -- [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe Start --
                ,MPT.PRODUCT_ID AS PRODUCT_ID
                -- [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe End --
                ,MPT.PRODUCT_CD AS PRODUCT_CD
                -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
                ,MAX(ML.LOCATION_CD) AS LOCATION_CD
                ,MAX(ML.LOCATION_NM) AS LOCATION_NM
                -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
                ,MZE.ZONE_CD  AS ZONE_CD
                ,TST.STOCK_TYPE_CD AS STOCK_TYPE_CD
                ,MAX(MCR.CARRIER_CD) AS CARRIER_CD
                ,MAX(MCR.CARRIER_ABBR) AS CARRIER_NM
                ,MAX(MDC.DELIVERY_COURSE_CD) AS  DELIVERY_COURSE_CD
                ,MAX(MDC.DELIVERY_COURSE_NM) AS DELIVERY_COURSE_NM
                ,MAX(TAIH.DELIV_DT) AS DELIV_DT
                ,MAX(TAIH.WORK_DT) AS  WORK_DT
                ,MAX(TAIH.SUPPLY_CUSTOMER_CD) AS SUPPLY_CUSTOMER_CD
                ,MAX(MMCR.CUSTOMER_ABBR)  AS  SUPPLY_CUSTOMER_NM
                ,MAX(TPH.PICKING_STATUS) AS PICKING_STATUS
                ,MAX(TPH.CLIENT_ID) AS CLIENT_ID
                ,MAX(TPH.CENTER_ID) AS CENTER_ID
                ,MAX(MW.WAREHOUSE_ID) AS  WAREHOUSE_ID
                ,MAX(TPH.PICKING_H_ID) AS PICKING_H_ID
                ,MAX(MCT.CLIENT_CD) AS CLIENT_CD
                ,MAX(MCT.CLIENT_NM) AS CLIENT_NM
                ,MAX(MCT.CLIENT_ABBR) AS CLIENT_ABBR
                ,MAX(MW.WAREHOUSE_CD) AS WAREHOUSE_CD
                ,MAX(MW.WAREHOUSE_NM) AS WAREHOUSE_NM
                ,MAX(MW.WAREHOUSE_ABBR) AS WAREHOUSE_ABBR
                ,TSN.STORE_LABEL_NO AS STORE_LABEL_NO
                -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
                ,TSN.STORE_DT AS STORE_DT
                -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
                -- [検査-123] 最小の伝票番号設定します 2014.12.01 zhouj Start
                ,MAX(TPB.TEMP_NO) AS TEMP_NO
                -- [検査-123] 最小の伝票番号設定します 2014.12.01 zhouj end
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja Start
                -- ,SUM(TPB.PICKING_NUM) AS PICKING_NUM
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja Start
                ,MAX(MC.CENTER_CD)  AS CENTER_CD
                ,MAX(MC.CENTER_NM)  AS CENTER_NM
                ,MAX(MC.CENTER_ABBR)  AS CENTER_ABBR
                -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
                ,MAX(TPH.PICKING_GROUP_NO) AS PICKING_GROUP_NO
                -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
                ,MIN(HSH.SHIPPING_SLIP_NO) AS SHIPPING_SLIP_NO
                ,MAX(MZE.PICKING_ORDER)  AS  MZE_PICKING_ORDER
                ,MAX(ML.PICKING_ORDER) AS ML_PICKING_ORDER
                ,MAX(TL.LOT) AS LOT
                ,MAX(TL.LIMIT_DT)  AS LIMIT_DT
                ,MAX(TS.CHARGE_NUM) AS CHARGE_NUM
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja Start
                ,TPAH.SHIPPING_PACKING_NO AS SHIPPING_PACKING_NO
                ,MAX(TPAH.BOX_ID) AS BOX_ID
                ,SUM(TPAB.PACKING_NUM) PICKING_NUM
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja End
            FROM  T_PICKING_H  TPH
              INNER JOIN T_PICKING_B TPB
                 ON TPH.PICKING_H_ID = TPB.PICKING_H_ID
                AND TPB.DEL_FLG = '0'
               LEFT OUTER JOIN M_CLIENT MCT
                 ON TPH.CLIENT_ID = MCT.CLIENT_ID
                AND MCT.DEL_FLG = '0'
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja Start
              INNER JOIN T_PACKING_B TPAB
                 ON TPAB.PICKING_B_ID = TPB.PICKING_B_ID
                AND TPAB.DEL_FLG = '0'
              INNER JOIN T_PACKING_H  TPAH
                 ON TPAH.PACKING_H_ID = TPAB.PACKING_H_ID
                AND TPAH.MIXED_FLG = '1'
                AND TPAH.DEL_FLG = '0'
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja End
              INNER JOIN T_ALLOC_INST_H TAIH
                 ON TAIH.ALLOC_INST_H_ID = TPH.ALLOC_INST_H_ID
                AND TAIH.DEL_FLG = '0'
              INNER JOIN T_ALLOC_INST_B TAIB
                 ON TAIB.ALLOC_INST_B_ID = TPB.ALLOC_INST_B_ID
                AND TAIB.DEL_FLG = '0'
              INNER JOIN T_SHIPPING_INST_B THSB
                 ON THSB.SHIPPING_INST_B_ID = TPB.SHIPPING_INST_B_ID
                AND THSB.DEL_FLG = '0'
              INNER JOIN  T_SHIPPING_INST_H HSH
                 ON HSH.SHIPPING_INST_H_ID = THSB.SHIPPING_INST_H_ID
                AND HSH.DEL_FLG = '0'
               LEFT OUTER JOIN  M_PRODUCT  MPT
                 ON MPT.PRODUCT_ID = TAIB.PRODUCT_ID
                AND MCT.DEL_FLG = '0'
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
              INNER  JOIN   T_STOCK TS
                 ON TS.STOCK_ID = TPB.STOCK_ID
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
                AND TS.DEL_FLG = '0'
              INNER  JOIN T_STORE_NO TSN
                 ON TS.STORE_NO_ID = TSN.STORE_NO_ID
                AND TSN.DEL_FLG = '0'
              LEFT OUTER JOIN M_LOCATION   ML
                 ON ML.LOCATION_ID = TS.LOCATION_ID
                AND ML.DEL_FLG = '0'
               LEFT OUTER JOIN M_STOCK_TYPE TST
                 ON TST.STOCK_TYPE_ID = TS.STOCK_TYPE_ID
                AND TST.DEL_FLG = '0'
               LEFT OUTER JOIN M_WAREHOUSE MW
                 ON MW.WAREHOUSE_ID = TS.WAREHOUSE_ID
                AND MW.DEL_FLG = '0'
               LEFT OUTER JOIN  M_CENTER MC
                 ON MC.CENTER_ID = TPH.CENTER_ID
                AND MW.DEL_FLG = '0'
              INNER  JOIN   T_LOT TL
                 ON TL.LOT_ID = TS.LOT_ID
                AND TL.DEL_FLG = '0'
              INNER  JOIN  M_ZONE MZE
                 ON MZE.ZONE_ID = ML.ZONE_ID
                AND MZE.DEL_FLG = '0'
              INNER  JOIN  T_PICKING_R TPR
                 ON TPR.PICKING_H_ID = TPH.PICKING_H_ID
                AND TPR.DEL_FLG = '0'
               LEFT OUTER JOIN M_DELIVERY_COURSE MDC
                 ON MDC.DELIVERY_COURSE_ID = HSH.DELIVERY_COURSE_ID
                AND MDC.DEL_FLG = '0'
               LEFT OUTER JOIN  M_CARRIER MCR
                 ON MCR.CARRIER_ID = MDC.CARRIER_ID
                AND MCR.DEL_FLG = '0'
			  LEFT OUTER JOIN  M_CUSTOMER MMCR
                 ON TAIH.SUPPLY_CUSTOMER_ID = MMCR.CUSTOMER_ID
                AND MMCR.DEL_FLG = '0'
              WHERE TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
                AND TPH.DEL_FLG = '0'
              GROUP BY TPH.CLIENT_ID
                      ,TPH.CENTER_ID
                      ,TPH.PICKING_WORK_NO
                      ,TPH.DELIV_UNIT_NO
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja Start
                      ,TPAH.SHIPPING_PACKING_NO
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja End
                      -- [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe Start --
                      ,MPT.PRODUCT_ID
                      -- [Ver3.0][#2379] 複数荷姿対応 2017.11.10 miyabe End --
                      ,MPT.PRODUCT_CD
                      ,MZE.ZONE_CD
                      ,ML.LOCATION_CD
                      ,TST.STOCK_TYPE_CD
                      ,TSN.STORE_LABEL_NO
                      -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
                      ,TSN.STORE_DT
                      -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
                      )subA
     LEFT OUTER JOIN M_PRODUCT MP
       ON MP.PRODUCT_CD = subA.PRODUCT_CD
      AND MP.CLIENT_ID =  subA.CLIENT_ID
      AND MP.DEL_FLG = '0'
    -- [エンハンス PH2.0] ケース荷姿の入数取得を変更 2015.11.23 sja Start
--     LEFT OUTER JOIN M_PRODUCT_SHAPE MPS
--       ON MPS.PRODUCT_ID = MP.PRODUCT_ID
--      AND MPS.DEL_FLG = '0'
    INNER JOIN M_CLIENT_CENTER MCC
       ON MCC.CLIENT_ID = subA.CLIENT_ID
      AND MCC.CENTER_ID = subA.CENTER_ID
	  AND MCC.DEL_FLG = '0'
    INNER JOIN M_PARAM MPA
	   ON MPA.CLIENT_CENTER_ID = MCC.CLIENT_CENTER_ID
	  AND MPA.DEL_FLG = '0'
    -- [Ver3.0] unit of measure対応 2017.11.24 REN Del
    -- [エンハンス PH2.0] ケース荷姿の入数取得を変更 2015.11.23 sja End
-- [エンハンス PH2.0] 荷材を追加 2015.11.25 sja Start
     LEFT OUTER JOIN M_BOX MB -- 荷材マスタ
       ON MB.BOX_ID = subA.BOX_ID
      AND MB.DEL_FLG = '0'
-- [エンハンス PH2.0] 荷材を追加 2015.11.25 sja End
    INNER  JOIN T_PICKING_R TPR
       ON TPR.PICKING_H_ID = subA.PICKING_H_ID
      AND TPR.DEL_FLG = '0'
     LEFT OUTER JOIN (SELECT TPH.CLIENT_ID AS CLIENT_ID ,
                             TPH.CENTER_ID AS CENTER_ID,
                             TPH.PICKING_WORK_NO AS PICKING_WORK_NO,
                             TPH.DELIV_UNIT_NO AS DELIV_UNIT_NO,
                             MAX(TSIH.PICKING_WORK_MESSAGE) AS PICKING_WORK_MESSAGE,
                             -- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start
                             COUNT(TSIH.PICKING_WORK_MESSAGE) AS PICKING_WORK_MESSAGE_COUNT,
                             -- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End
                             COUNT(DISTINCT TSIH.SHIPPING_SLIP_NO) AS SHIPPING_SLIP_NO
                             -- [SK2-047] ソート順がおかしくなっている。 2014.12.12 KI Start
                             ,MIN(TSIH.SHIPPING_SLIP_NO) AS WMS_SHIPPING_SLIP_NO
                             -- [SK2-047] ソート順がおかしくなっている。 2014.12.12 KI End
                             -- [ON推-品向-590] 顧客出荷指示No.を表示 2015.05.26 kawana Start
                             ,MAX(CLIENT_SHIPPING_NO) AS CLIENT_SHIPPING_NO
                             -- [ON推-品向-590] 顧客出荷指示No.を表示 2015.05.26 kawana End
                        FROM T_SHIPPING_INST_H TSIH
                          INNER  JOIN  T_ALLOC_INST_H TAIH
                             ON TAIH.ALLOC_INST_H_ID = TSIH.ALLOC_INST_H_ID
                            AND TAIH.DEL_FLG = '0'
                          INNER  JOIN  T_PICKING_H TPH
                             ON TPH.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
                            AND TPH.DEL_FLG = '0'
                          INNER  JOIN T_PICKING_R TPR
                             ON TPR.PICKING_H_ID = TPH.PICKING_H_ID
                            AND TPR.DEL_FLG = '0'
                          WHERE TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
                            AND TSIH.DEL_FLG = '0'
                       GROUP BY TPH.CLIENT_ID,
                                TPH.CENTER_ID,
                                TPH.PICKING_WORK_NO,
                                TPH.DELIV_UNIT_NO) subB
       ON  subB.CLIENT_ID = subA.CLIENT_ID
      AND  subB.CENTER_ID = subA.CENTER_ID
      AND  subB.PICKING_WORK_NO = subA.PICKING_WORK_NO
      AND  subB.DELIV_UNIT_NO = subA.DELIV_UNIT_NO
    WHERE TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
    -- [EC-CT1-171] 再発行はリストの最後に出力(ソート順変更) 2015.04.02 kawana Start
    ORDER BY
             TPR.OPL_OUT_FLG
            ,subA.CLIENT_CD
    -- [EC-CT1-171] 再発行はリストの最後に出力(ソート順変更) 2015.04.02 kawana End
            ,subA.CENTER_CD
            ,subA.WORK_DT
            -- [ON推-品向-590] 顧客出荷指示No.を表示 2015.05.26 kawana Start
            ,subA.PICKING_GROUP_NO
            -- [ON推-品向-590] 顧客出荷指示No.を表示 2015.05.26 kawana End
            ,subA.DELIVERY_COURSE_CD
            ,subA.PICKING_WORK_NO
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja Start
            ,subA.SHIPPING_PACKING_NO
-- [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.11.25 sja End
            -- [検査-123] 最小の伝票番号設定します 2014.12.01 zhouj Start
            -- [SK2-006] 出荷実績訂正後、新規行の仮置きNoが最大値なので、WMS出荷伝票No.と仮置きNoの出力順交換を変更 2014.12.08 許 Start
            ,WMS_SHIPPING_SLIP_NO
            -- [SK2-047] 仮置きNoは要らない DEL 2014.12.15 KI
            -- [SK2-006] 出荷実績訂正後、新規行の仮置きNoが最大値なので、WMS出荷伝票No.と仮置きNoの出力順交換を変更 2014.12.08 許 End
            -- [検査-123] 最小の伝票番号設定します 2014.12.01 zhouj end
            ,subA.MZE_PICKING_ORDER
            ,subA.ML_PICKING_ORDER
            ,subA.ZONE_CD
            ,subA.LOCATION_CD
            ,subA.PRODUCT_CD
            ,subA.LIMIT_DT
            ,subA.LOT
            ,subA.STORE_LABEL_NO
            -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
            ,subA.STORE_DT
            -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

/*END*/
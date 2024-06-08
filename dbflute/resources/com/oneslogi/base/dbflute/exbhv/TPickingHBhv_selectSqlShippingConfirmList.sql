/*
 [df:title]
 出荷確定一覧

 [df:description]
  出庫ヘッダ毎に出力します。

*/

-- #df:entity#
-- ##String PICKING_STATUS_NM##
-- ##String INVOICE_CREATE_FLG_NM##
-- ##String FORCE_FIXED_FLG_NM##
-- ##String SHIPPING_STOP_FLG_NM##
-- ##String STOP_FLG_NM##
-- ##Long PICKING_H_ID##
-- ##Long PICKING##
-- ##Long SHIPPING_SLIP_NO##
-- ##Long SHIPPING_H_COUNT##
-- ##Long PACKING_H_ID##

-- !df:pmb extends Paging!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT AIH.ALLOC_INST_H_ID                                                     -- 引当指示ヘッダID
      ,AIH.PICKING_H_ID                                                        -- 出庫ヘッダID
      ,AIH.UPD_DT                                                              -- 出庫ヘッダ更新日時
      ,1 AS PICKING                                                            -- 出庫ヘッダ件数
      ,AIH.CLIENT_ID                                                           -- 荷主ID
      ,AIH.CLIENT_CD                                                           -- 荷主CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,AIH.CLIENT_NM                                         				   -- 荷主名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,AIH.CENTER_ID                                                           -- センタID
      ,AIH.CENTER_CD                                                           -- センタCD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,AIH.CENTER_NM                                         				   -- センタ名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,AIH.EMERGENCY_FLG                                                       -- 緊急フラグ
      ,AIH.STOCK_OUT_FLG                                                       -- 欠品フラグ
      ,AIH.WORK_DT                                                             -- 作業日
      ,AIH.SHIPPING_DT                                                         -- 出荷日
      ,AIH.MAX_UPD_DT AS SHIPPING_H_UPD_DT                                     -- 更新日時
      ,AIH.PICKING_TIME                                                        -- 出庫開始時刻
      ,AIH.STOWAGE_TIME                                                        -- 積込予定時刻
      ,AIH.SHIPPING_TIME                                                       -- 出荷予定時刻
      ,AIH.DELIVERY_COURSE_CD                                                  -- 配送コースCD
      ,AIH.DELIVERY_COURSE_NM                                                  -- 配送コース名称
      ,AIH.CARRIER_CD                                                          -- 運送業者CD
      ,AIH.CARRIER_NM                                                          -- 運送業者名称
      ,AIH.SUPPLY_CUSTOMER_CD                                                  -- 納品先CD
      ,AIH.SUPPLY_CUSTOMER_NM                                                  -- 納品先名称
      ,AIH.DELIV_CUSTOMER_CD                                                   -- 届先CD
      ,AIH.DELIV_CUSTOMER_NM                                                   -- 届先名称
      ,AIH.PICKING_BATCH_NO                                                    -- 出庫指示バッチNo.
      ,AIH.PICKING_WORK_NO                                                     -- 出庫作業No.
      ,AIH.PICKING_STATUS                                                      -- // cls(ShippingStatus) 出荷ステータス
      ,NULL AS PICKING_STATUS_NM                                               -- 出荷ステータス名
      -- 米国出荷ドキュメント追加対応 2018.01.05 PYM Start
      ,AIH.BOL_NO AS BOL_NO                                                    -- Bill of lading No
      -- 米国出荷ドキュメント追加対応 2018.01.05 PYM End
      ,AIH.SHIPPING_SLIP_NO                                                    -- 伝票数
      ,AIH.SHIPPING_INST_H_ID_COUNT AS SHIPPING_H_COUNT                        -- 出荷指示ヘッダ件数
      ,AIH.INST_NUM                                                            -- 指示数
      ,AIH.ALLOC_NUM                                                           -- 引当済数
      ,PAH.PACKING_CNT AS PACKING_H_ID                                         -- 個口数
      ,PAH.GROSS_WEIGHT                                                        -- 重量(グロス)(g)
      ,PAH.TOTAL_VOLUME                                                        -- 容積(mm3)
      ,AIH.INVOICE_CREATE_FLG                                                  -- 送り状データ作成フラグ
      ,NULL AS INVOICE_CREATE_FLG_NM                                           -- 送り状データ作成フラグ名称
      ,AIH.FORCE_FIXED_FLG                                                     -- // cls(ForceFixedFlg) 強制確定フラグ
      ,NULL AS FORCE_FIXED_FLG_NM                                              -- 強制確定フラグ名称
      ,AIH.SHIPPING_STOP_FLG                                                   -- 納品先出荷停止フラグ
      ,NULL AS SHIPPING_STOP_FLG_NM                                            -- 納品先出荷停止名称
      ,AIH.STOP_FLG AS STOP_FLG                                                -- 商品出荷停止フラグ
      ,NULL AS STOP_FLG_NM                                                     -- 商品出荷停止名称
      ,AIH.CENTER_TRANSIT_FLG                                                  -- // cls(CenterTransitFlg) センタ間移動フラグ
-- ELSE SELECT COUNT(*)
/*END*/
  FROM (
  SELECT AIH.ALLOC_INST_H_ID                                                     -- 引当指示ヘッダID
-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
        ,MAX(PIH.PICKING_H_ID) AS PICKING_H_ID                                   -- 出庫ヘッダID
-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
        ,AIH.CLIENT_ID                                                           -- 荷主ID
        ,MCL.CLIENT_CD                                                           -- 荷主CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
        ,MAX(MCL.CLIENT_NM) AS CLIENT_NM                                         -- 荷主名称
-- 荷主センタ変更対応 2017.03.28 hdis End
        ,AIH.CENTER_ID                                                           -- センタID
        ,MCT.CENTER_CD                                                           -- センタCD
-- 荷主センタ変更対応 2017.03.28 hdis Start
        ,MAX(MCT.CENTER_NM) AS CENTER_NM                                         -- センタ名称
-- 荷主センタ変更対応 2017.03.28 hdis End
        ,MAX(SIH.EMERGENCY_FLG) AS EMERGENCY_FLG                                 -- 緊急フラグ
        ,MAX(SIH.STOCK_OUT_FLG) AS STOCK_OUT_FLG                                 -- 欠品フラグ
        ,AIH.WORK_DT                                                             -- 作業日
        ,AIH.SHIPPING_DT                                                         -- 出荷日
        ,MAX(SIH.UPD_DT) AS MAX_UPD_DT                                           -- 更新日時
        ,MAX(MDC.PICKING_TIME) AS PICKING_TIME                                   -- 出庫開始時刻
        ,MAX(MDC.STOWAGE_TIME) AS STOWAGE_TIME                                   -- 積込予定時刻
        ,MAX(MDC.SHIPPING_TIME) AS SHIPPING_TIME                                 -- 出荷予定時刻
        ,MDC.DELIVERY_COURSE_CD                                                  -- 配送コースCD
        ,MDC.DELIVERY_COURSE_NM                                                  -- 配送コース名称
        ,MCR.CARRIER_CD                                                          -- 運送業者CD
        ,MCR.CARRIER_NM                                                          -- 運送業者名称
        ,SIH.PICKING_BATCH_NO                                                    -- 出庫指示バッチNo.
        ,PIH.PICKING_WORK_NO                                                     -- 出庫作業№
        ,MIN(PIH.PICKING_STATUS) AS PICKING_STATUS                               -- 出荷ステータス
-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
        -- 米国出荷ドキュメント追加対応 2018.01.05 PYM Start
        ,MAX(PIH.BOL_NO) AS BOL_NO                                               -- Bill of lading No
-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
         -- 米国出荷ドキュメント追加対応 2018.01.05 PYM End
        ,MAX(SIH.SLIP_CNT) AS SHIPPING_SLIP_NO                                   -- 伝票数
        ,MAX(SIH.LINE_CNT) AS LINE_NO                                            -- 行数
        ,COUNT(DISTINCT AIB.PRODUCT_ID) AS PRODUCT_ID                            -- アイテム数
        ,SUM(AIB.INST_NUM) AS INST_NUM                                           -- 指示数
        ,SUM(AIB.ALLOC_NUM) AS ALLOC_NUM                                         -- 引当済数
        ,MIN(CASE WHEN PIR.INVOICE_CREATE_FLG = '1' THEN '1' ELSE '0' END)
           AS INVOICE_CREATE_FLG                                                 -- 送り状データ作成フラグ
        -- [ON推-品質問題点指摘票(新ｿﾘV2-070)] 修正対応 2016.08.29 chou Mod Start
        ,MIN(PIH.FORCE_FIXED_FLG)
        -- [ON推-品質問題点指摘票(新ｿﾘV2-070)] 修正対応 2016.08.29 chou Mod End
           AS FORCE_FIXED_FLG                                                    -- 強制確定フラグ
        ,MAX(SIH.SHIPPING_INST_H_ID_COUNT) AS SHIPPING_INST_H_ID_COUNT           -- 出荷指示ヘッダ件数
        ,CASE WHEN MAX(MCD.SHIPPING_STOP_FLG) = '0' THEN
           MAX(MCS.SHIPPING_STOP_FLG)
           ELSE MAX(MCD.SHIPPING_STOP_FLG)
           END AS SHIPPING_STOP_FLG                                              -- 納品先出荷停止フラグ
        ,MAX(MPR.SHIPPING_STOP_FLG) AS STOP_FLG                                  -- 商品出荷停止フラグ
        ,MAX(PIH.CENTER_TRANSIT_FLG) AS CENTER_TRANSIT_FLG                       -- センタ間移動フラグ
        ,MAX(PIH.UPD_DT) AS UPD_DT                                               -- 出庫ヘッダ更新日時
        ,AIH.SUPPLY_CUSTOMER_CD                                                  -- 納品先CD
        -- 個人情報暗号化対応 2016.09.01 kawana Start
        --,f_decrypt(AIH.SUPPLY_CUSTOMER_NM) AS SUPPLY_CUSTOMER_NM                 -- 納品先名称
        ,AIH.SUPPLY_CUSTOMER_NM AS SUPPLY_CUSTOMER_NM                 -- 納品先名称
        -- 個人情報暗号化対応 2016.09.01 kawana End
        ,AIH.DELIV_CUSTOMER_CD                                                   -- 届先CD
        -- 個人情報暗号化対応 2016.09.01 kawana Start
        --,f_decrypt(AIH.DELIV_CUSTOMER_NM) AS DELIV_CUSTOMER_NM                   -- 届先名称
        ,AIH.DELIV_CUSTOMER_NM AS DELIV_CUSTOMER_NM                   -- 届先名称
        -- 個人情報暗号化対応 2016.09.01 kawana End
    FROM T_ALLOC_INST_H AIH  -- 引当指示ヘッダ
    INNER JOIN T_ALLOC_INST_B AIB  -- 引当指示ボディ
      ON AIH.ALLOC_INST_H_ID = AIB.ALLOC_INST_H_ID
      AND AIB.DEL_FLG = '0'
    INNER JOIN M_CLIENT MCL  -- 荷主マスタ
      ON AIH.CLIENT_ID = MCL.CLIENT_ID
      AND MCL.DEL_FLG = '0'
    INNER JOIN M_CENTER MCT  -- センタマスタ
      ON AIH.CENTER_ID = MCT.CENTER_ID
      AND MCT.DEL_FLG = '0'
    INNER JOIN T_PICKING_H PIH  -- 出庫ヘッダ
      ON AIH.ALLOC_INST_H_ID = PIH.ALLOC_INST_H_ID
      AND PIH.DEL_FLG = '0'
    INNER JOIN T_PICKING_R PIR  -- 出庫帳票
      ON PIH.PICKING_H_ID = PIR.PICKING_H_ID
      AND PIR.DEL_FLG = '0'
    INNER JOIN M_DELIVERY_COURSE MDC  -- 配送コースマスタ
      ON AIH.DELIVERY_COURSE_ID = MDC.DELIVERY_COURSE_ID
      AND MDC.DEL_FLG = '0'
    INNER JOIN M_CARRIER MCR  -- 運送業者マスタ
      ON MDC.CARRIER_ID = MCR.CARRIER_ID
      AND MCR.DEL_FLG = '0'
    INNER JOIN (SELECT SIH.ALLOC_INST_H_ID
                      ,MAX(SIH.PICKING_BATCH_NO) AS PICKING_BATCH_NO  -- 出庫指示バッチ№
                      ,MIN(SIH.SHIPPING_SLIP_NO) AS MIN_SHIPPING_SLIP_NO  -- 最小WMS伝票№
                      ,MAX(SIH.SHIPPING_SLIP_NO) AS MAX_SHIPPING_SLIP_NO  -- 最大WMS伝票№
                      ,MIN(SIH.CLIENT_SHIPPING_NO) AS MIN_CLIENT_SHIPPING_NO  -- 最小顧客出荷指示№
                      ,MAX(SIH.CLIENT_SHIPPING_NO) AS MAX_CLIENT_SHIPPING_NO  -- 最大顧客出荷指示№
                      ,COUNT(DISTINCT SIH.SHIPPING_INST_H_ID) AS SLIP_CNT  -- 伝票数
                      ,COUNT(DISTINCT SIB.SHIPPING_INST_B_ID) AS LINE_CNT  -- 行数
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
                      ,MAX(SIH.STOCK_OUT_FLG) AS STOCK_OUT_FLG  -- 欠品フラグ
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
                      ,MAX(SIH.EMERGENCY_FLG) AS EMERGENCY_FLG  -- 緊急フラグ
                      ,MAX(SIH.UPD_DT) AS UPD_DT  -- 更新日時
                      ,MAX(SIH.VERSION_NO) AS VERSION_NO  -- バージョン№
                      ,MAX(SIH.CONTROL_NO) AS CONTROL_NO  -- コントロール№
                      ,COUNT(DISTINCT SIH.SHIPPING_INST_H_ID) AS SHIPPING_INST_H_ID_COUNT
                  FROM T_SHIPPING_INST_H SIH  -- 出荷指示ヘッダ
                  INNER JOIN T_SHIPPING_INST_B SIB  -- 出荷指示ボディ
                    ON SIH.SHIPPING_INST_H_ID = SIB.SHIPPING_INST_H_ID
                    AND SIB.DEL_FLG = '0'
                  WHERE SIH.DEL_FLG = '0'
                    AND SIH.SHIPPING_STATUS NOT IN ('10','15','90','99') -- 左記以外 10:未出荷 15:出庫指示中 90:キャンセル 99:エラー
                    /*IF pmb.Flg != '0'*/
                    AND SIH.SHIPPING_STATUS <> '55'
                    /*END*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start
                    /*IF pmb.shippingStatus != null*/
                    AND SIH.SHIPPING_STATUS = /*pmb.shippingStatus*/'10'
                    /*END*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana End
                    /*IF pmb.centerId != null*/
                    AND SIH.CENTER_ID = /*pmb.centerId*/11111111111
                    /*END*/
                    /*IF pmb.clientId != null*/
                    AND SIH.CLIENT_ID = /*pmb.clientId*/11111111111
                    /*END*/
                    /*IF pmb.deliveryCourseCd != null*/
                    AND SIH.DELIVERY_COURSE_CD Like /*pmb.deliveryCourseCd*/'a123%'
                    /*END*/
                    /*IF pmb.shippingDtFrom != null*/
                    AND SIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
                    /*END*/
                    /*IF pmb.shippingDtTo != null*/
                    AND SIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
                    /*END*/
                    /*IF pmb.supplyCustomerCd != null*/
                    AND SIH.SUPPLY_CUSTOMER_CD like /*pmb.supplyCustomerCd*/'a123%'
                    /*END*/
                  GROUP BY SIH.ALLOC_INST_H_ID
                  HAVING 1=1
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
                   /*IF pmb.stockOutFlg != null*/
                   AND MAX(SIH.STOCK_OUT_FLG) = /*pmb.stockOutFlg*/'0'
                   /*END*/
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
               ) SIH
      ON SIH.ALLOC_INST_H_ID = AIH.ALLOC_INST_H_ID
    LEFT JOIN M_CUSTOMER MCS  -- 取引先マスタ(納品先)
      ON AIH.SUPPLY_CUSTOMER_ID = MCS.CUSTOMER_ID
      AND MCS.DEL_FLG = '0'
    LEFT JOIN M_CUSTOMER MCD  -- 取引先マスタ(届先)
      ON AIH.DELIV_CUSTOMER_ID = MCD.CUSTOMER_ID
      AND MCD.DEL_FLG = '0'
    LEFT JOIN M_PRODUCT MPR  -- 商品マスタ
      ON AIB.PRODUCT_ID = MPR.PRODUCT_ID
      AND MPR.DEL_FLG = '0'
    WHERE AIH.DEL_FLG = '0'
      /*IF pmb.carrierCd != null*/
      AND MCR.CARRIER_CD = /*pmb.carrierCd*/'a123'
      /*END*/
      /*IF pmb.Flg != '0'*/
      AND PIH.PICKING_STATUS <> '55'
      /*END*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start
      /*IF pmb.shippingStatus != null*/
      AND PIH.PICKING_STATUS = /*pmb.shippingStatus*/'10'
      /*END*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana End
      /*IF pmb.pickingWorkNo != null*/
      AND PIH.PICKING_WORK_NO like /*pmb.pickingWorkNo*/'%a123'
      /*END*/
  GROUP BY
       AIH.ALLOC_INST_H_ID
      ,AIH.CLIENT_ID
      ,MCL.CLIENT_CD
      ,AIH.CENTER_ID
      ,MCT.CENTER_CD
      ,AIH.WORK_DT
      ,AIH.SHIPPING_DT
      ,SIH.PICKING_BATCH_NO
      ,AIH.SUPPLY_CUSTOMER_CD
      ,AIH.SUPPLY_CUSTOMER_NM
      ,AIH.DELIV_CUSTOMER_CD
      ,AIH.DELIV_CUSTOMER_NM
      ,PIH.PICKING_STATUS
      ,MDC.DELIVERY_COURSE_CD
      ,MDC.DELIVERY_COURSE_NM
      ,MCR.CARRIER_CD
      ,MCR.CARRIER_NM
      ,PIH.PICKING_WORK_NO
      ,PIH.DELIV_UNIT_NO
      ,AIH.DELIV_PLAN_DT
      ,AIH.DELIV_DT
      ,AIH.DELIV_TZ
      ,AIH.SUPPLY_CUSTOMER_CD
      ,AIH.SUPPLY_CUSTOMER_NM
      ,AIH.DELIV_CUSTOMER_CD
      ,AIH.DELIV_CUSTOMER_NM
     ) AIH
    LEFT JOIN (SELECT PAH.ALLOC_INST_H_ID
                     ,COUNT(DISTINCT PAH.SHIPPING_PACKING_NO) AS PACKING_CNT  -- 梱包数
                     ,SUM(CASE WHEN PAH.MIXED_FLG = '0' THEN 1 ELSE 0 END) AS PACKING_CASE_CNT  -- 単品梱包数
                     ,SUM(CASE WHEN PAH.MIXED_FLG = '1' THEN 1 ELSE 0 END) AS PACKING_MIXED_CNT  -- 混載梱包数
                     ,SUM(PAH.GROSS_WEIGHT) AS GROSS_WEIGHT  -- グロス重量計
                     ,SUM(PAH.TOTAL_VOLUME) AS TOTAL_VOLUME  -- 容積計
                     ,MIN(PAR.STW_OUT_FLG) AS STW_OUT_FLG  -- 積込リスト出力フラグ
                     ,MIN(PAB.PICKING_FLG) AS PICKING_FLG  -- 出庫フラグ
                     ,SUM(PAB.PICKING_NUM) AS PICKING_NUM  -- 出庫済数
                     ,MIN(PAB.INSPECTION_FLG) AS INSPECTION_FLG  -- 検品フラグ
                     ,SUM(PAB.INSPECTION_NUM) AS INSPECTION_NUM  -- 検品済数
                 FROM T_ALLOC_INST_H AIH
                 INNER JOIN T_PACKING_H PAH
                   ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
                   AND PAH.DEL_FLG = '0'
                 INNER JOIN T_PACKING_R PAR
                   ON PAH.PACKING_H_ID = PAR.PACKING_H_ID
                   AND PAR.DEL_FLG = '0'
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start
                 /*IF pmb.pickingWorkNo != null || pmb.shippingStatus != null || pmb.Flg != '0'*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana End
                 INNER JOIN T_PICKING_H PIH  -- 出庫ヘッダ
                   ON AIH.ALLOC_INST_H_ID = PIH.ALLOC_INST_H_ID
                   AND PIH.DEL_FLG = '0'
                 /*END*/
                 INNER JOIN (SELECT PAB.PACKING_H_ID
                                   ,MIN(PAB.PICKING_FLG) AS PICKING_FLG
                                   ,SUM(CASE WHEN PAB.PICKING_FLG = '1' THEN PAB.PACKING_NUM ELSE 0 END) AS PICKING_NUM
                                   ,MIN(PAB.INSPECTION_FLG) AS INSPECTION_FLG
                                   ,SUM(CASE WHEN PAB.INSPECTION_FLG = '1' THEN PAB.PACKING_NUM ELSE 0 END) AS INSPECTION_NUM
                               FROM T_ALLOC_INST_H AIH
                               INNER JOIN T_PACKING_H PAH
                                 ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
                                 AND PAH.DEL_FLG = '0'
                               INNER JOIN T_PACKING_B PAB
                                 ON PAH.PACKING_H_ID = PAB.PACKING_H_ID
                                 AND PAB.DEL_FLG = '0'
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start
                               /*IF pmb.pickingWorkNo != null || pmb.shippingStatus != null || pmb.Flg != '0'*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana End
                               INNER JOIN T_PICKING_H PIH  -- 出庫ヘッダ
                                 ON AIH.ALLOC_INST_H_ID = PIH.ALLOC_INST_H_ID
                                 AND PIH.DEL_FLG = '0'
                               /*END*/
                              WHERE AIH.DEL_FLG = '0'
                                /*IF pmb.centerId != null*/
                                AND AIH.CENTER_ID = /*pmb.centerId*/11111111111
                                /*END*/
                                /*IF pmb.clientId != null*/
                                AND AIH.CLIENT_ID = /*pmb.clientId*/11111111111
                                /*END*/
                                /*IF pmb.Flg != '0'*/
                                AND PIH.PICKING_STATUS <> '55'
                                /*END*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start
                                /*IF pmb.shippingStatus != null*/
                                AND PIH.PICKING_STATUS = /*pmb.shippingStatus*/'10'
                                /*END*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana End
                                /*IF pmb.shippingDtFrom != null*/
                                AND AIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
                                /*END*/
                                /*IF pmb.shippingDtTo != null*/
                                AND AIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
                                /*END*/
                                /*IF pmb.supplyCustomerCd != null*/
                                AND AIH.SUPPLY_CUSTOMER_CD like /*pmb.supplyCustomerCd*/'a123%'
                                /*END*/
                                /*IF pmb.pickingWorkNo != null*/
                                AND PIH.PICKING_WORK_NO like /*pmb.pickingWorkNo*/'%a123'
                                /*END*/
                              GROUP BY PAB.PACKING_H_ID
                            ) PAB
                   ON PAH.PACKING_H_ID = PAB.PACKING_H_ID
                 WHERE AIH.DEL_FLG = '0'
                   /*IF pmb.centerId != null*/
                   AND AIH.CENTER_ID = /*pmb.centerId*/11111111111
                   /*END*/
                   /*IF pmb.clientId != null*/
                   AND AIH.CLIENT_ID = /*pmb.clientId*/11111111111
                   /*END*/
                   /*IF pmb.Flg != '0'*/
                   AND PIH.PICKING_STATUS <> '55'
                   /*END*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start
                   /*IF pmb.shippingStatus != null*/
                   AND PIH.PICKING_STATUS = /*pmb.shippingStatus*/'10'
                   /*END*/
-- [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana End
                   /*IF pmb.shippingDtFrom != null*/
                   AND AIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
                   /*END*/
                   /*IF pmb.shippingDtTo != null*/
                   AND AIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
                   /*END*/
                   /*IF pmb.pickingWorkNo != null*/
                   AND PIH.PICKING_WORK_NO like /*pmb.pickingWorkNo*/'%a123'
                   /*END*/
                 GROUP BY PAH.ALLOC_INST_H_ID
              ) PAH
      ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
/*IF pmb.isPaging()*/
  ORDER BY
    CLIENT_CD
   ,CENTER_CD
   ,WORK_DT
   ,SHIPPING_DT
   ,PICKING_BATCH_NO
   ,DELIVERY_COURSE_CD
   ,CARRIER_CD
   ,PICKING_WORK_NO
/*END*/

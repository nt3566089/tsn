/*
 [df:title]
 出庫指示一覧データを取得します。出荷指示ヘッダ1レコード毎です。

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##String SHIPPING_STATUS_NM##
-- ##String OPL_OUT_NM##
-- ##String MLT_OUT_NM##
-- ##String TPL_OUT_NM##
-- ##String PL_OUT_NM##
-- ##String SL_OUT_NM##
-- ##String SPL_OUT_NM##
-- ##String PL1_OUT_NM##
-- ##String PL2_OUT_NM##
-- ##String CASE_OUT_NM##
-- ##String PACKING_OUT_NM##
-- ##String INVOICE_CREATE_NM##
-- ##String INSPECTION_OUT_NM##
-- ##String STW_OUT_NM##
-- ##String PICKING_WORK_NO##
-- ##String DELIV_UNIT_NO##
-- ##String DELIV_TZ_NM##
-- ##String SHIPPING_STOP_CS_NM##
-- ##String SHIPPING_STOP_PD_NM##
-- ##String FORCE_FIXED_FLG##
-- ##String FORCE_FIXED_FLG_NM##
-- ##String BOL_OUT_FLG##
-- ##String BOL_OUT_NM##
-- ##Long SHIPPING_INST_H_ID##
-- ##Long SLIP_NO##
-- ##Long LINE_NO##
-- ##Long PRODUCT_ID##
-- ##Long PICKING_WORK_MESSAGE_COUNT##
-- ##Long PICKING_WORK_NO_CNT##
-- ##Long NUM##
-- ##Long VERSION_NO##
-- ##Long CONTROL_NO##

-- !df:pmb extends Paging!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
-- ELSE SELECT COUNT(*) FROM (
/*END*/
/*IF pmb.pickingWorkNo == null*/
SELECT SIH.SHIPPING_INST_H_ID                                                  -- 出荷指示ヘッダID
      ,SIH.CLIENT_ID                                                           -- 荷主ID
      ,MCL.CLIENT_CD                                                           -- 荷主CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,MCL.CLIENT_NM                                                           -- 荷主名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,SIH.CENTER_ID                                                           -- センタID
      ,MCT.CENTER_CD                                                           -- センタCD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,MCT.CENTER_NM                                                           -- センタ名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,SIH.WORK_DT                                                             -- 作業日
      ,SIH.SHIPPING_DT                                                         -- 出荷日
      ,SIH.PICKING_BATCH_NO                                                    -- 出庫指示バッチNo.
      ,SIH.SUPPLY_CUSTOMER_CD                                                  -- 納品先CD
      -- 個人情報暗号化対応 2016.09.01 kawana Start
      --,f_decrypt(SIH.SUPPLY_CUSTOMER_NM) AS SUPPLY_CUSTOMER_NM                 -- 納品先名称
      ,SIH.SUPPLY_CUSTOMER_NM AS SUPPLY_CUSTOMER_NM                 -- 納品先名称
      -- 個人情報暗号化対応 2016.09.01 kawana End
      ,SIH.DELIV_CUSTOMER_CD                                                   -- 届先CD
      -- 個人情報暗号化対応 2016.09.01 kawana Start
      --,f_decrypt(SIH.DELIV_CUSTOMER_NM) AS DELIV_CUSTOMER_NM                   -- 届先名称
      ,SIH.DELIV_CUSTOMER_NM AS DELIV_CUSTOMER_NM                   -- 届先名称
      -- 個人情報暗号化対応 2016.09.01 kawana End
      -- 米国出荷ドキュメント追加対応 2018.01.01 PYM Start
      ,NULL AS BOL_NO                                                          -- Bill of Lading No.
      ,NULL AS BOL_OUT_FLG                                                     -- Bill of Lading出力フラグ
      ,NULL AS BOL_OUT_NM                                                      -- Bill of Lading発行フラグ名称
      -- 米国出荷ドキュメント追加対応 2018.01.01 PYM End
      ,SIH.SHIPPING_SLIP_NO                                                    -- WMS出荷伝票No.
      ,SIH.CLIENT_SHIPPING_NO                                                  -- 顧客出荷指示No.
      ,SIH.SHIPPING_STATUS                                                     -- 出荷ステータス
      ,NULL AS SHIPPING_STATUS_NM                                              -- 出荷ステータス名
      ,SIH.DELIVERY_COURSE_CD                                                  -- 配送コースCD
      ,MDC.DELIVERY_COURSE_NM                                                  -- 配送コース名称
      ,MCR.CARRIER_CD                                                          -- 運送業者CD
      ,MCR.CARRIER_NM                                                          -- 運送業者名称
      ,1 AS SLIP_NO                                                            -- 伝票数
      ,COUNT(SIB.SHIPPING_INST_B_ID) AS LINE_NO                                -- 行数
      ,COUNT(DISTINCT SIB.PRODUCT_ID) AS PRODUCT_ID                            -- アイテム数
      ,SUM(COALESCE(SIB.INST_NUM,0)) AS INST_NUM                               -- 指示数
      ,SUM(COALESCE(SIB.ALLOC_NUM,0)) AS ALLOC_NUM                             -- 引当済数
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
      ,MAX(COALESCE(SIH.STOCK_OUT_FLG,'0')) AS STOCK_OUT_FLG                        -- 欠品フラグ
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
      ,'0' AS OPL_OUT_FLG                                                      -- オーダーピッキングリスト出力フラグ
      ,'0' AS MLT_OUT_FLG                                                      -- マルチピッキングリスト出力フラグ
      ,'0' AS TPL_OUT_FLG                                                      -- トータルピッキングリスト出力フラグ
      ,'0' AS PL_OUT_FLG                                                       -- 摘み取りリスト出力フラグ
      -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add Start
      ,'0' AS SPL_OUT_FLG                                                      -- 単行ピッキングリスト出力フラグ
      ,'0' AS PL1_OUT_FLG                                                      -- 1次ピッキングリスト出力フラグ
      ,'0' AS PL2_OUT_FLG                                                      -- 2次ピッキングリスト出力フラグ
      ,'0' AS CASE_OUT_FLG                                                     -- ケースピッキングリスト出力フラグ
      -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add End
      -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
      ,'0' AS INSPECTION_OUT_FLG                                               -- SD検品ラベル出力フラグ
      -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End
      ,'0' AS SL_OUT_FLG                                                       -- 種まきリスト出力フラグ
      ,'0' AS PACKING_OUT_FLG                                                  -- 納品明細書リスト出力フラグ
      ,'0' AS INVOICE_CREATE_FLG                                               -- 送り状データ作成フラグ
      ,'0' AS STW_OUT_FLG                                                      -- 積込リスト出力フラグ
      ,NULL AS OPL_OUT_NM                                                      -- オーダーピッキングリスト出力名称
      ,NULL AS MLT_OUT_NM                                                      -- マルチピッキングリスト出力名称
      ,NULL AS TPL_OUT_NM                                                      -- トータルピッキングリスト出力名称
      ,NULL AS PL_OUT_NM                                                       -- 摘み取りリスト出力名称
      -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add Start
      ,NULL AS SPL_OUT_NM                                                      -- 単行ピッキングリスト出力名称
      ,NULL AS PL1_OUT_NM                                                      -- 1次ピッキングリスト出力名称
      ,NULL AS PL2_OUT_NM                                                      -- 2次ピッキングリスト出力名称
      ,NULL AS CASE_OUT_NM                                                     -- ケースピッキングリスト出力名称
      -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add End
      -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
      ,NULL AS INSPECTION_OUT_NM                                               -- SD検品ラベル出力名称
      -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End
      ,NULL AS SL_OUT_NM                                                       -- 種まきリスト出力名称
      ,NULL AS PACKING_OUT_NM                                                  -- 納品明細書リスト出力名称
      ,NULL AS INVOICE_CREATE_NM                                               -- 送り状データ作成名称
      ,NULL AS STW_OUT_NM                                                      -- 積込リスト出力名称
      ,0 AS PICKING_NUM                                                        -- 出庫(％)
      ,0 AS INSPECTION_NUM                                                     -- 検品(％)
      ,0 AS LOADING_STATUS                                                     -- 積込検品(％)
      ,NULL AS PICKING_WORK_NO                                                 -- 出庫作業No.
      ,NULL AS DELIV_UNIT_NO                                                   -- 届先単位No.
      ,SIH.DELIV_PLAN_DT                                                       -- 納品予定日
      ,SIH.DELIV_DT                                                            -- 納品指定日
      ,SIH.DELIV_TZ                                                            -- 納品時間帯
      ,NULL AS DELIV_TZ_NM                                                     -- 納品時間帯名称
      ,BM.MESSAGE_NM                                                           -- エラー内容
      ,SIH.PICKING_WORK_MESSAGE                                                -- 出庫作業メッセージ
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start
      ,COUNT(SIH.PICKING_WORK_MESSAGE) AS PICKING_WORK_MESSAGE_COUNT           -- 出庫作業メッセージ数
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End
      ,SIH.EMERGENCY_FLG                                                       -- 緊急フラグ
      ,SIH.UPD_DT                                                              -- 更新日時
      ,0 AS PICKING_WORK_NO_CNT                                                -- 行数(出庫作業No.)
      ,SIH.UPD_DT AS UPD_DT_H                                                  -- 更新日時(出荷指示ヘッダ - 出庫作業No単位)
      ,CASE WHEN MAX(MCD.SHIPPING_STOP_FLG) = '0' THEN
         MAX(MCS.SHIPPING_STOP_FLG)
         ELSE MAX(MCD.SHIPPING_STOP_FLG)
         END AS SHIPPING_STOP_CS                                              -- 納品先出荷停止フラグ
      ,NULL AS SHIPPING_STOP_CS_NM                                            -- 納品先出荷停止名称
      ,MAX(MPR.SHIPPING_STOP_FLG) AS SHIPPING_STOP_PD                         -- 商品出荷停止フラグ
      ,NULL AS SHIPPING_STOP_PD_NM                                            -- 商品出荷停止名称
      ,NULL AS FORCE_FIXED_FLG                                                -- 強制確定フラグ
      ,NULL AS FORCE_FIXED_FLG_NM                                             -- 強制確定名称
      ,1 AS NUM                                                               -- 行数
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      ,MAX(SIH.VERSION_NO) AS VERSION_NO                                      -- バージョンNo.
      ,MAX(SIH.CONTROL_NO) AS CONTROL_NO                                      -- コントロールNo.
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
  FROM T_SHIPPING_INST_H SIH  -- 出荷指示ヘッダ
  INNER JOIN T_SHIPPING_INST_B SIB  -- 出荷指示ボディ
    ON SIH.SHIPPING_INST_H_ID = SIB.SHIPPING_INST_H_ID
    AND SIB.DEL_FLG = '0'
  INNER JOIN M_CLIENT MCL  -- 荷主マスタ
    ON SIH.CLIENT_ID = MCL.CLIENT_ID
    AND MCL.DEL_FLG = '0'
  INNER JOIN M_CENTER MCT  -- センタマスタ
    ON SIH.CENTER_ID = MCT.CENTER_ID
    AND MCT.DEL_FLG = '0'
  LEFT JOIN M_DELIVERY_COURSE MDC  -- 配送コースマスタ
    ON SIH.DELIVERY_COURSE_ID = MDC.DELIVERY_COURSE_ID
    AND MDC.DEL_FLG = '0'
  LEFT JOIN M_CARRIER MCR  -- 運送業者マスタ
    ON MDC.CARRIER_ID = MCR.CARRIER_ID
    AND MCR.DEL_FLG = '0'
  LEFT JOIN B_MESSAGE BM  -- メッセージマスタ
    ON SIH.ERROR_MESSAGE_CD = BM.MESSAGE_CD
   AND BM.CULTURE_ID = /*pmb.cultureId*/11111111111
   AND BM.DEL_FLG = '0'
  LEFT JOIN M_CUSTOMER MCS  -- 取引先マスタ(納品先)
    ON SIH.SUPPLY_CUSTOMER_ID = MCS.CUSTOMER_ID
    AND MCS.DEL_FLG = '0'
  LEFT JOIN M_CUSTOMER MCD  -- 取引先マスタ(届先)
    ON SIH.DELIV_CUSTOMER_ID = MCD.CUSTOMER_ID
    AND MCD.DEL_FLG = '0'
  LEFT JOIN M_PRODUCT MPR  -- 商品マスタ
    ON SIB.PRODUCT_ID = MPR.PRODUCT_ID
    AND MPR.DEL_FLG = '0'
  WHERE SIH.DEL_FLG = '0'
    AND SIH.SHIPPING_STATUS IN ('10','15','90','99') -- 10:未出荷 15:出庫指示中 90:キャンセル 99:エラー
    /*IF pmb.centerId != null*/
    AND SIH.CENTER_ID = /*pmb.centerId*/11111111111
    /*END*/
    /*IF pmb.clientId != null*/
    AND SIH.CLIENT_ID = /*pmb.clientId*/11111111111
    /*END*/
    /*IF pmb.supplyCustomerCd != null*/
    AND SIH.SUPPLY_CUSTOMER_CD Like /*pmb.supplyCustomerCd*/'a123%'
    /*END*/
    /*IF pmb.pickingBatchNo != null*/
    AND SIH.PICKING_BATCH_NO = /*pmb.pickingBatchNo*/'0125'
    /*END*/
    /*IF pmb.shippingStatus != null*/
    AND SIH.SHIPPING_STATUS = /*pmb.shippingStatus*/'10'
    /*END*/
    /*IF pmb.clientShippingNo != null*/
    AND SIH.CLIENT_SHIPPING_NO Like /*pmb.clientShippingNo*/'0125%'
    /*END*/
    /*IF pmb.shippingSlipNo != null*/
    AND SIH.SHIPPING_SLIP_NO Like /*pmb.shippingSlipNo*/'0125%'
    /*END*/
    /*IF pmb.emergencyFlg != null && pmb.emergencyFlg == '1'*/
    AND SIH.EMERGENCY_FLG = /*pmb.emergencyFlg*/'1'
    /*END*/
    /*IF pmb.deliveryCourseCd != null*/
    AND SIH.DELIVERY_COURSE_CD Like /*pmb.deliveryCourseCd*/'a123%'
    /*END*/
    /*IF pmb.carrierCd != null*/
    AND MCR.CARRIER_CD = /*pmb.carrierCd*/'a123'
    /*END*/
    /*IF pmb.noAllcDisplayFlg == 1*/
    AND ((SIH.SHIPPING_STATUS IN ('10','99')
      /*IF pmb.shippingDtTo != null && pmb.takingShippingFlg == '1'*/
      AND SIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
      /*END*/
      /*IF pmb.workDtTo != null && pmb.takingShippingFlg == '0'*/
      AND SIH.WORK_DT <= /*pmb.workDtTo*/'20140430'
      /*END*/
      ) OR (SIH.SHIPPING_STATUS NOT IN ('10','99')
      /*IF pmb.shippingDtFrom != null && pmb.takingShippingFlg == '1'*/
      AND SIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
      /*END*/
      /*IF pmb.shippingDtTo != null && pmb.takingShippingFlg == '1'*/
      AND SIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
      /*END*/
      /*IF pmb.workDtFrom != null && pmb.takingShippingFlg == '0'*/
      AND SIH.WORK_DT >= /*pmb.workDtFrom*/'20140401'
      /*END*/
      /*IF pmb.workDtTo != null && pmb.takingShippingFlg == '0'*/
      AND SIH.WORK_DT <= /*pmb.workDtTo*/'20140430'
      /*END*/
    ))
    /*END*/
    /*IF pmb.noAllcDisplayFlg == 0*/
      /*IF pmb.shippingDtFrom != null && pmb.takingShippingFlg == '1'*/
      AND SIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
      /*END*/
      /*IF pmb.shippingDtTo != null && pmb.takingShippingFlg == '1'*/
      AND SIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
      /*END*/
      /*IF pmb.workDtFrom != null && pmb.takingShippingFlg == '0'*/
      AND SIH.WORK_DT >= /*pmb.workDtFrom*/'20140401'
      /*END*/
      /*IF pmb.workDtTo != null && pmb.takingShippingFlg == '0'*/
      AND SIH.WORK_DT <= /*pmb.workDtTo*/'20140430'
      /*END*/
    /*END*/
    /*IF pmb.pickingWorkMessageFlg == '1'*/
    AND SIH.PICKING_WORK_MESSAGE IS NOT NULL
    /*END*/
    /*IF pmb.pickingWorkMessageFlg == '0'*/
    AND SIH.PICKING_WORK_MESSAGE IS NULL
    /*END*/
    /*IF pmb.pickingWorkMessage != null*/
    AND SIH.PICKING_WORK_MESSAGE Like /*pmb.pickingWorkMessage*/'%a123%'
    /*END*/
    /*IF pmb.cancelDisplay == '0'*/
    AND SIH.SHIPPING_STATUS <> '90'
    /*END*/
  GROUP BY
     SIH.SHIPPING_INST_H_ID
    ,SIH.CLIENT_ID
    ,MCL.CLIENT_CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
    ,MCL.CLIENT_NM
-- 荷主センタ変更対応 2017.03.28 hdis End
    ,SIH.CENTER_ID
    ,MCT.CENTER_CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
    ,MCT.CENTER_NM
-- 荷主センタ変更対応 2017.03.28 hdis End
    ,SIH.WORK_DT
    ,SIH.SHIPPING_DT
    ,SIH.PICKING_BATCH_NO
    ,SIH.SUPPLY_CUSTOMER_CD
    ,SIH.SUPPLY_CUSTOMER_NM
    ,SIH.DELIV_CUSTOMER_CD
    ,SIH.DELIV_CUSTOMER_NM
    ,SIH.SHIPPING_SLIP_NO
    ,SIH.CLIENT_SHIPPING_NO
    ,SIH.SHIPPING_STATUS
    ,SIH.DELIVERY_COURSE_CD
    ,MDC.DELIVERY_COURSE_NM
    ,MCR.CARRIER_CD
    ,MCR.CARRIER_NM
    ,SIH.DELIV_PLAN_DT
    ,SIH.DELIV_DT
    ,SIH.DELIV_TZ
    ,BM.MESSAGE_NM
    ,SIH.PICKING_WORK_MESSAGE
    ,SIH.EMERGENCY_FLG
    ,SIH.UPD_DT
  HAVING 1 = 1
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
    /*IF pmb.noStockOutFlg == '1'*/
    AND MAX(SIH.STOCK_OUT_FLG) = /*pmb.noStockOutFlg*/'1'
    /*END*/
    /*IF pmb.noStockOutFlg == '0'*/
    AND (MAX(SIH.STOCK_OUT_FLG) IS NULL OR MAX(SIH.STOCK_OUT_FLG) = /*pmb.noStockOutFlg*/'0')
    /*END*/
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
UNION ALL
/*END*/
SELECT NULL AS SHIPPING_INST_H_ID                                                   -- 出荷指示ヘッダID
      ,AIH.CLIENT_ID                                                                -- 荷主ID
      ,AIH.CLIENT_CD                                                                -- 荷主CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,AIH.CLIENT_NM                                                                -- 荷主名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,AIH.CENTER_ID                                                                -- センタID
      ,AIH.CENTER_CD                                                                -- センタCD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,AIH.CENTER_NM                                                                -- センタ名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,AIH.WORK_DT                                                                  -- 作業日
      ,AIH.SHIPPING_DT                                                              -- 出荷日
      ,AIH.PICKING_BATCH_NO                                                         -- 出庫指示バッチNo.
      ,AIH.SUPPLY_CUSTOMER_CD                                                       -- 納品先CD
      ,AIH.SUPPLY_CUSTOMER_NM                                                       -- 納品先名称
      ,AIH.DELIV_CUSTOMER_CD                                                        -- 届先CD
      ,AIH.DELIV_CUSTOMER_NM                                                        -- 届先名称
      -- 米国出荷ドキュメント追加対応 2018.01.01 PYM Start
      ,AIH.BOL_NO                                                                   -- Bill of Lading No.
      ,AIH.BOL_OUT_FLG                                                              -- Bill of Lading出力フラグ
      ,NULL AS BOL_OUT_NM                                                           -- Bill of Lading発行フラグ名称
      -- 米国出荷ドキュメント追加対応 2018.01.01 PYM End
      ,NULL AS SHIPPING_SLIP_NO                                                     -- WMS出荷伝票No.
      ,NULL AS CLIENT_SHIPPING_NO                                                   -- 顧客出荷指示No.
      ,AIH.SHIPPING_STATUS                                                          -- 出荷ステータス
      ,NULL AS SHIPPING_STATUS_NM                                                   -- 出荷ステータス名
      ,AIH.DELIVERY_COURSE_CD                                                       -- 配送コースCD
      ,AIH.DELIVERY_COURSE_NM                                                       -- 配送コース名称
      ,AIH.CARRIER_CD                                                               -- 運送業者CD
      ,AIH.CARRIER_NM                                                               -- 運送業者名称
      ,AIH.SLIP_NO                                                                  -- 伝票数
      ,AIH.LINE_NO                                                                  -- 行数
      ,AIH.PRODUCT_ID                                                               -- アイテム数
      ,AIH.INST_NUM                                                                 -- 指示数
      ,AIH.ALLOC_NUM                                                                -- 引当済数
      ,AIH.STOCK_OUT_FLG                                                            -- 欠品フラグ
      ,AIH.OPL_OUT_FLG                                                              -- オーダーピッキングリスト出力フラグ
      ,AIH.MLT_OUT_FLG                                                              -- マルチピッキングリスト出力フラグ
      ,AIH.TPL_OUT_FLG                                                              -- トータルピッキングリスト出力フラグ
      ,AIH.PL_OUT_FLG                                                               -- 摘み取りリスト出力フラグ
      -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add Start
      ,AIH.SPL_OUT_FLG                                                              -- 単行ピッキングリスト出力フラグ
      ,AIH.PL1_OUT_FLG                                                              -- 1次ピッキングリスト出力フラグ
      ,AIH.PL2_OUT_FLG                                                              -- 2次ピッキングリスト出力フラグ
      ,AIH.CASE_OUT_FLG                                                             -- ケースピッキングリスト出力フラグ
      -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add End
      -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
      ,PAH.INSPECTION_OUT_FLG                                                       -- SD検品ラベル出力フラグ
      -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End
      ,AIH.SL_OUT_FLG                                                               -- 種まきリスト出力フラグ
      ,AIH.PACKING_OUT_FLG                                                          -- 納品明細書リスト出力フラグ
      ,AIH.INVOICE_CREATE_FLG                                                       -- 送り状データ作成フラグ
      ,PAH.STW_OUT_FLG                                                              -- 積込リスト出力フラグ
      ,NULL AS OPL_OUT_NM                                                           -- オーダーピッキングリスト出力名称
      ,NULL AS MLT_OUT_NM                                                           -- マルチピッキングリスト出力名称
      ,NULL AS TPL_OUT_NM                                                           -- トータルピッキングリスト出力名称
      ,NULL AS PL_OUT_NM                                                            -- 摘み取りリスト出力名称
      -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add Start
      ,NULL AS SPL_OUT_NM                                                           -- 単行ピッキングリスト出力名称
      ,NULL AS PL1_OUT_NM                                                           -- 1次ピッキングリスト出力名称
      ,NULL AS PL2_OUT_NM                                                           -- 2次ピッキングリスト出力名称
      ,NULL AS CASE_OUT_NM                                                          -- ケースピッキングリスト出力名称
      -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add End

      -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
      ,NULL AS INSPECTION_OUT_NM                                                    -- SD検品ラベル出力名称
      -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End
      ,NULL AS SL_OUT_NM                                                            -- 種まきリスト出力名称
      ,NULL AS PACKING_OUT_NM                                                       -- 納品明細書リスト出力名称
      ,NULL AS INVOICE_CREATE_NM                                                    -- 送り状データ作成名称
      ,NULL AS STW_OUT_NM                                                           -- 積込リスト出力名称
      ,FLOOR(COALESCE(
         COALESCE(PAH.PICKING_NUM,0)
         /
         COALESCE(AIH.ALLOC_NUM,0)
         * 100,0))
         AS PICKING_NUM                                                             -- 出庫(％) 数量ベースでの進捗
      ,FLOOR(COALESCE(
         COALESCE(PAH.INSPECTION_NUM,0)
         /
         COALESCE(AIH.ALLOC_NUM,0)
         * 100,0))
         AS INSPECTION_NUM                                                         -- 検品(％) 数量ベースでの進捗
      ,FLOOR(COALESCE(
         PAH.LOADING_NUM
         / PAH.PACKING_CNT * 100,0))
         AS LOADING_STATUS                                                         -- 積込検品(％)
      ,AIH.PICKING_WORK_NO                                                         -- 出庫作業No.
      ,AIH.DELIV_UNIT_NO                                                           -- 届先単位No.
      ,AIH.DELIV_PLAN_DT                                                           -- 納品予定日
      ,AIH.DELIV_DT                                                                -- 納品指定日
      ,AIH.DELIV_TZ                                                                -- 納品時間帯
      ,NULL AS DELIV_TZ_NM                                                         -- 納品時間帯名称
      ,AIH.MESSAGE_NM                                                              -- エラー内容
      ,AIH.PICKING_WORK_MESSAGE                                                    -- 出庫作業メッセージ
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start
      ,AIH.PICKING_WORK_MESSAGE_COUNT                                              -- 出庫作業メッセージ数
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End
      ,AIH.EMERGENCY_FLG                                                           -- 緊急フラグ
      ,AIH.UPD_DT                                                                  -- 更新日時
      ,AIH.PICKING_WORK_NO_CNT                                                     -- 行数(出庫作業No.)
      ,AIH.UPD_DT_H                                                                -- 更新日時(出荷指示ヘッダ - 出庫作業No単位)
      ,AIH.SHIPPING_STOP_CS                                                        -- 納品先出荷停止フラグ
      ,NULL AS SHIPPING_STOP_CS_NM                                                 -- 納品先出荷停止名称
      ,AIH.SHIPPING_STOP_PD                                                        -- 商品出荷停止フラグ
      ,NULL AS SHIPPING_STOP_PD_NM                                                 -- 商品出荷停止名称
      ,AIH.FORCE_FIXED_FLG                                                         -- 強制確定フラグ
      ,NULL AS FORCE_FIXED_NM                                                      -- 強制確定名称
      ,AIH.NUM                                                                     -- 行数
      ,AIH.VERSION_NO                                                              -- バージョンNo.
      ,AIH.CONTROL_NO                                                              -- コントロールNo.
  FROM (
  SELECT AIH.ALLOC_INST_H_ID                                                   -- 引当指示ヘッダID
        ,AIH.CLIENT_ID                                                         -- 荷主ID
        ,MCL.CLIENT_CD                                                         -- 荷主CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
        ,MCL.CLIENT_NM                                                         -- 荷主名称
-- 荷主センタ変更対応 2017.03.28 hdis End
        ,AIH.CENTER_ID                                                         -- センタID
        ,MCT.CENTER_CD                                                         -- センタCD
-- 荷主センタ変更対応 2017.03.28 hdis Start
        ,MCT.CENTER_NM                                                         -- センタ名称
-- 荷主センタ変更対応 2017.03.28 hdis End
        ,AIH.WORK_DT                                                           -- 作業日
        ,AIH.SHIPPING_DT                                                       -- 出荷日
        ,SIH.PICKING_BATCH_NO                                                  -- 出庫指示バッチNo.
        ,AIH.SUPPLY_CUSTOMER_CD                                                -- 納品先CD
        -- 個人情報暗号化対応 2016.09.01 kawana Start
        --,f_decrypt(AIH.SUPPLY_CUSTOMER_NM) AS SUPPLY_CUSTOMER_NM               -- 納品先名称
        ,AIH.SUPPLY_CUSTOMER_NM AS SUPPLY_CUSTOMER_NM               -- 納品先名称
        -- 個人情報暗号化対応 2016.09.01 kawana End
        ,AIH.DELIV_CUSTOMER_CD                                                 -- 届先CD
        -- 個人情報暗号化対応 2016.09.01 kawana Start
        --,f_decrypt(AIH.DELIV_CUSTOMER_NM) AS DELIV_CUSTOMER_NM                 -- 届先名称
        ,AIH.DELIV_CUSTOMER_NM AS DELIV_CUSTOMER_NM                 -- 届先名称
        -- 個人情報暗号化対応 2016.09.01 kawana End
        -- 米国出荷ドキュメント追加対応 2018.01.01 PYM Start
        -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
        ,MAX(PIH.BOL_NO) AS BOL_NO                                             -- Bill of Lading No.
        -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
        ,MIN(COALESCE(PIR.BOL_OUT_FLG,'0')) AS BOL_OUT_FLG                     -- Bill of Lading出力フラグ
        -- 米国出荷ドキュメント追加対応 2018.01.01 PYM End
        ,PIH.PICKING_STATUS AS SHIPPING_STATUS                                 -- 出荷ステータス
        ,MDC.DELIVERY_COURSE_CD                                                -- 配送コースCD
        ,MDC.DELIVERY_COURSE_NM                                                -- 配送コース名称
        ,MCR.CARRIER_CD                                                        -- 運送業者CD
        ,MCR.CARRIER_NM                                                        -- 運送業者名称
        ,MAX(SIH.SLIP_CNT) AS SLIP_NO                                          -- 伝票数
        ,MAX(SIH.LINE_CNT) AS LINE_NO                                          -- 行数
        ,COUNT(DISTINCT AIB.PRODUCT_ID) AS PRODUCT_ID                          -- アイテム数
        ,SUM(AIB.INST_NUM) AS INST_NUM                                         -- 指示数
        ,SUM(AIB.ALLOC_NUM) AS ALLOC_NUM                                       -- 引当済数
        ,MAX(SIH.STOCK_OUT_FLG) AS STOCK_OUT_FLG                               -- 欠品フラグ
        ,MIN(COALESCE(PIR.OPL_OUT_FLG,'0')) AS OPL_OUT_FLG                     -- オーダーピッキングリスト出力フラグ
        ,MIN(COALESCE(PIR.MLT_OUT_FLG,'0')) AS MLT_OUT_FLG                     -- マルチピッキングリスト出力フラグ
        ,MIN(COALESCE(PIR.TPL_OUT_FLG,'0')) AS TPL_OUT_FLG                     -- トータルピッキングリスト出力フラグ
        ,MIN(COALESCE(PIR.PL_OUT_FLG,'0')) AS PL_OUT_FLG                       -- 摘み取りリスト出力フラグ
        ,MIN(COALESCE(PIR.SL_OUT_FLG,'0')) AS SL_OUT_FLG                       -- 種まきリスト出力フラグ
        ,MIN(COALESCE(PIR.PACKING_OUT_FLG,'0')) AS PACKING_OUT_FLG             -- 納品明細書リスト出力フラグ
        ,MIN(COALESCE(PIR.INVOICE_CREATE_FLG,'0')) AS INVOICE_CREATE_FLG       -- 送り状データ作成フラグ
        -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add Start
        ,MIN(COALESCE(PIR.SPL_OUT_FLG,'0')) AS SPL_OUT_FLG                     -- 単行ピッキングリスト出力フラグ
        ,MIN(COALESCE(PIR.PL1_OUT_FLG,'0')) AS PL1_OUT_FLG                     -- 1次ピッキングリスト出力フラグ
        ,MIN(COALESCE(PIR.PL2_OUT_FLG,'0')) AS PL2_OUT_FLG                     -- 2次ピッキングリスト出力フラグ
        ,MIN(COALESCE(PIR.CASE_OUT_FLG,'0')) AS CASE_OUT_FLG                   -- ケースピッキングリスト出力フラグ
        -- [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add End
        ,PIH.PICKING_WORK_NO                                                  -- 出庫作業No.
        ,PIH.DELIV_UNIT_NO                                                    -- 届先単位No.
        ,AIH.DELIV_PLAN_DT                                                    -- 納品予定日
        ,AIH.DELIV_DT                                                         -- 納品指定日
        ,AIH.DELIV_TZ                                                         -- 納品時間帯
        ,MAX(SIH.MESSAGE_NM) AS MESSAGE_NM                                    -- エラー内容
        ,MAX(SIH.PICKING_WORK_MESSAGE) AS PICKING_WORK_MESSAGE                -- 出庫作業メッセージ
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start
        ,MAX(SIH.PICKING_WORK_MESSAGE_COUNT) AS PICKING_WORK_MESSAGE_COUNT    -- 出庫作業メッセージ数
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End
        ,MAX(SIH.EMERGENCY_FLG) AS EMERGENCY_FLG                              -- 緊急フラグ
        ,MAX(SIH.UPD_DT) AS UPD_DT                                            -- 更新日時
        ,MAX(SIH.SLIP_CNT) AS PICKING_WORK_NO_CNT                             -- 行数(出庫作業No.)
        ,MAX(SIH.UPD_DT) AS UPD_DT_H                                          -- 更新日時(出荷指示ヘッダ - 出庫作業No単位)
        -- [#5445] 引当指示ヘッドがnullで更新された際に何も取得しない不具合を修正 2018.12.07 tanaka Start
        ,CASE WHEN MAX(MCD.SHIPPING_STOP_FLG) = '0' OR MAX(MCD.SHIPPING_STOP_FLG) IS NULL THEN
        -- [#5445] 引当指示ヘッドがnullで更新された際に何も取得しない不具合を修正 2018.12.07 tanaka End
           MAX(MCS.SHIPPING_STOP_FLG)
           ELSE MAX(MCD.SHIPPING_STOP_FLG)
           END AS SHIPPING_STOP_CS                                            -- 納品先出荷停止フラグ
        ,MAX(MPR.SHIPPING_STOP_FLG) AS SHIPPING_STOP_PD                       -- 商品出荷停止フラグ
        ,MAX(PIH.FORCE_FIXED_FLG) AS FORCE_FIXED_FLG                          -- 強制確定フラグ
        ,MAX(SIH.SLIP_CNT) AS NUM                                             -- 行数
        ,MAX(SIH.VERSION_NO) AS VERSION_NO                                    -- バージョンNo.
        ,MAX(SIH.CONTROL_NO) AS CONTROL_NO                                    -- コントロールNo.
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
                      ,MAX(SIH.PICKING_WORK_MESSAGE) AS PICKING_WORK_MESSAGE  -- 出庫作業メッセージ
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana Start
                      ,COUNT(SIH.PICKING_WORK_MESSAGE) AS PICKING_WORK_MESSAGE_COUNT -- 出庫作業メッセージ数
-- [#5772][v3.1] 出庫作業メッセージが複数ある場合も全て表示する 2018.12.14 kawana End
                      ,MAX(SIH.EMERGENCY_FLG) AS EMERGENCY_FLG  -- 緊急フラグ
                      ,MAX(SIH.UPD_DT) AS UPD_DT  -- 更新日時
                      ,MAX(SIH.VERSION_NO) AS VERSION_NO  -- バージョン№
                      ,MAX(SIH.CONTROL_NO) AS CONTROL_NO  -- コントロール№
                      ,MAX(BM.MESSAGE_NM) AS MESSAGE_NM  -- エラーメッセージ
                  FROM T_SHIPPING_INST_H SIH  -- 出荷指示ヘッダ
                  INNER JOIN T_SHIPPING_INST_B SIB  -- 出荷指示ボディ
                    ON SIH.SHIPPING_INST_H_ID = SIB.SHIPPING_INST_H_ID
                    AND SIB.DEL_FLG = '0'
                  LEFT JOIN B_MESSAGE BM  -- メッセージマスタ
                    ON SIH.ERROR_MESSAGE_CD = BM.MESSAGE_CD
                   AND BM.CULTURE_ID = /*pmb.cultureId*/11111111111
                   AND BM.DEL_FLG = '0'
                  WHERE SIH.DEL_FLG = '0'
                    AND SIH.SHIPPING_STATUS NOT IN ('10','15','90','99') -- 左記以外 10:未出荷 15:出庫指示中 90:キャンセル 99:エラー
                    /*IF pmb.centerId != null*/
                    AND SIH.CENTER_ID = /*pmb.centerId*/11111111111
                    /*END*/
                    /*IF pmb.clientId != null*/
                    AND SIH.CLIENT_ID = /*pmb.clientId*/11111111111
                    /*END*/
                    /*IF pmb.supplyCustomerCd != null*/
                    AND SIH.SUPPLY_CUSTOMER_CD Like /*pmb.supplyCustomerCd*/'a123%'
                    /*END*/
                    /*IF pmb.pickingBatchNo != null*/
                    AND SIH.PICKING_BATCH_NO = /*pmb.pickingBatchNo*/'0125'
                    /*END*/
                    /*IF pmb.shippingStatus != null*/
                    AND SIH.SHIPPING_STATUS = /*pmb.shippingStatus*/'10'
                    /*END*/
                    /*IF pmb.clientShippingNo != null*/
                    AND SIH.CLIENT_SHIPPING_NO Like /*pmb.clientShippingNo*/'0125%'
                    /*END*/
                    /*IF pmb.shippingSlipNo != null*/
                    AND SIH.SHIPPING_SLIP_NO Like /*pmb.shippingSlipNo*/'0125%'
                    /*END*/
                    /*IF pmb.emergencyFlg != null && pmb.emergencyFlg == '1'*/
                    AND SIH.EMERGENCY_FLG = /*pmb.emergencyFlg*/'1'
                    /*END*/
                    /*IF pmb.deliveryCourseCd != null*/
                    AND SIH.DELIVERY_COURSE_CD Like /*pmb.deliveryCourseCd*/'a123%'
                    /*END*/
                    /*IF pmb.shippingDtFrom != null && pmb.takingShippingFlg == '1'*/
                    AND SIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
                    /*END*/
                    /*IF pmb.shippingDtTo != null && pmb.takingShippingFlg == '1'*/
                    AND SIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
                    /*END*/
                    /*IF pmb.workDtFrom != null && pmb.takingShippingFlg == '0'*/
                    AND SIH.WORK_DT >= /*pmb.workDtFrom*/'20140401'
                    /*END*/
                    /*IF pmb.workDtTo != null && pmb.takingShippingFlg == '0'*/
                    AND SIH.WORK_DT <= /*pmb.workDtTo*/'20140430'
                    /*END*/
                    /*IF pmb.pickingWorkMessageFlg == '1'*/
                    AND SIH.PICKING_WORK_MESSAGE IS NOT NULL
                    /*END*/
                    /*IF pmb.pickingWorkMessageFlg == '0'*/
                    AND SIH.PICKING_WORK_MESSAGE IS NULL
                    /*END*/
                    /*IF pmb.pickingWorkMessage != null*/
                    AND SIH.PICKING_WORK_MESSAGE Like /*pmb.pickingWorkMessage*/'%a123%'
                    /*END*/
                  GROUP BY SIH.ALLOC_INST_H_ID
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
      /*IF pmb.pickingWorkNo != null*/
      AND PIH.PICKING_WORK_NO like /*pmb.pickingWorkNo*/'%a123'
      /*END*/
    GROUP BY
       AIH.ALLOC_INST_H_ID
      ,AIH.CLIENT_ID
      ,MCL.CLIENT_CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,MCL.CLIENT_NM
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,AIH.CENTER_ID
      ,MCT.CENTER_CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,MCT.CENTER_NM
-- 荷主センタ変更対応 2017.03.28 hdis End
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
    HAVING 1 = 1
      /*IF pmb.noStockOutFlg == '1'*/
      AND MAX(SIH.STOCK_OUT_FLG) = /*pmb.noStockOutFlg*/'1'
      /*END*/
      /*IF pmb.noStockOutFlg == '0'*/
      AND (MAX(SIH.STOCK_OUT_FLG) IS NULL OR MAX(SIH.STOCK_OUT_FLG) = /*pmb.noStockOutFlg*/'0')
      /*END*/
     ) AIH
    LEFT JOIN (SELECT PAH.ALLOC_INST_H_ID
                     ,COUNT(DISTINCT PAH.SHIPPING_PACKING_NO) AS PACKING_CNT  -- 梱包数
                     ,SUM(CASE WHEN PAH.MIXED_FLG = '0' THEN 1 ELSE 0 END) AS PACKING_CASE_CNT  -- 単品梱包数
                     ,SUM(CASE WHEN PAH.MIXED_FLG = '1' THEN 1 ELSE 0 END) AS PACKING_MIXED_CNT  -- 混載梱包数
                     ,SUM(PAH.GROSS_WEIGHT) AS GROSS_WEIGHT  -- グロス重量計
                     -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
                     ,MIN(PAR.INSPECTION_OUT_FLG) AS INSPECTION_OUT_FLG  -- SD検品ラベル出力フラグ
                     -- [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End
                     ,MIN(PAR.STW_OUT_FLG) AS STW_OUT_FLG  -- 積込リスト出力フラグ
                     ,MIN(PAB.PICKING_FLG) AS PICKING_FLG  -- 出庫フラグ
                     ,SUM(PAB.PICKING_NUM) AS PICKING_NUM  -- 出庫済数
                     ,MIN(PAB.INSPECTION_FLG) AS INSPECTION_FLG  -- 検品フラグ
                     ,SUM(PAB.INSPECTION_NUM) AS INSPECTION_NUM  -- 検品済数
                     ,MIN(PAH.LOADING_FLG) AS LOADING_FLG     -- 積込フラグ
                     ,SUM(CASE WHEN PAH.LOADING_FLG = '1' THEN 1 ELSE 0 END) AS LOADING_NUM  -- 積込検品済数
                 FROM T_ALLOC_INST_H AIH
                 INNER JOIN T_PACKING_H PAH
                   ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
                   AND PAH.DEL_FLG = '0'
                 INNER JOIN T_PACKING_R PAR
                   ON PAH.PACKING_H_ID = PAR.PACKING_H_ID
                   AND PAR.DEL_FLG = '0'
                 INNER JOIN (SELECT PAB.PACKING_H_ID
                                   ,MIN(PAB.PICKING_FLG) AS PICKING_FLG
                                   ,SUM(CASE WHEN PAB.PICKING_FLG = '1' THEN PAB.PACKING_NUM ELSE 0 END) AS PICKING_NUM
                                   ,MIN(PAB.INSPECTION_FLG) AS INSPECTION_FLG
                                   ,SUM(CASE WHEN PAB.INSPECTION_FLG = '1' THEN PAB.PACKING_NUM ELSE 0 END) AS INSPECTION_NUM
                                   ,MIN(PAH.LOADING_FLG) AS LOADING_FLG
                               FROM T_ALLOC_INST_H AIH
                               INNER JOIN T_PACKING_H PAH
                                 ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
                                 AND PAH.DEL_FLG = '0'
                               INNER JOIN T_PACKING_B PAB
                                 ON PAH.PACKING_H_ID = PAB.PACKING_H_ID
                                 AND PAB.DEL_FLG = '0'
                              WHERE AIH.DEL_FLG = '0'
                                /*IF pmb.centerId != null*/
                                AND AIH.CENTER_ID = /*pmb.centerId*/11111111111
                                /*END*/
                                /*IF pmb.clientId != null*/
                                AND AIH.CLIENT_ID = /*pmb.clientId*/11111111111
                                /*END*/
                                /*IF pmb.shippingDtFrom != null && pmb.takingShippingFlg == '1'*/
                                AND AIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
                                /*END*/
                                /*IF pmb.shippingDtTo != null && pmb.takingShippingFlg == '1'*/
                                AND AIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
                                /*END*/
                                /*IF pmb.workDtFrom != null && pmb.takingShippingFlg == '0'*/
                                AND AIH.WORK_DT >= /*pmb.workDtFrom*/'20140401'
                                /*END*/
                                /*IF pmb.workDtTo != null && pmb.takingShippingFlg == '0'*/
                                AND AIH.WORK_DT <= /*pmb.workDtTo*/'20140430'
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
                   /*IF pmb.shippingDtFrom != null && pmb.takingShippingFlg == '1'*/
                   AND AIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
                   /*END*/
                   /*IF pmb.shippingDtTo != null && pmb.takingShippingFlg == '1'*/
                   AND AIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
                   /*END*/
                   /*IF pmb.workDtFrom != null && pmb.takingShippingFlg == '0'*/
                   AND AIH.WORK_DT >= /*pmb.workDtFrom*/'20140401'
                   /*END*/
                   /*IF pmb.workDtTo != null && pmb.takingShippingFlg == '0'*/
                   AND AIH.WORK_DT <= /*pmb.workDtTo*/'20140430'
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
   ,SUPPLY_CUSTOMER_CD
   ,SHIPPING_SLIP_NO
   ,PICKING_WORK_NO
-- ELSE ) CNT
/*END*/

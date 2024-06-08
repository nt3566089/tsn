/*
 [df:title]
 配送コース別出荷進捗データを取得します。出荷指示ヘッダを作業日、配送コース、出荷バッチ№、エラーフラグ、キャンセルフラグ単位に表示します。

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##String SHIPPING_STATUS_NM##
-- ##Long TSIH_NUM##
-- ##Long COUNT_SUPPLY_CUSTOMER_CD##

-- !df:pmb extends Paging!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
-- ELSE SELECT COUNT(*) FROM (
/*END*/
/*IF pmb.pickingWorkNo == null*/
SELECT SIH.CLIENT_ID                                                           -- 荷主ID
      ,MCL.CLIENT_CD                                                           -- 荷主CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
	  ,MAX(MCL.CLIENT_NM) AS CLIENT_NM                                         -- 荷主名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,SIH.CENTER_ID                                                           -- センタID
      ,MCT.CENTER_CD                                                           -- センタCD
-- 荷主センタ変更対応 2017.03.28 hdis Start
	  ,MAX(MCT.CENTER_NM) AS CENTER_NM                                         -- センタ名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,MAX(SIH.EMERGENCY_FLG) AS EMERGENCY_FLG                                 -- 緊急フラグ
      ,SIH.ERROR_FLG                                                           -- エラーフラグ
      ,CASE WHEN SIH.SHIPPING_STATUS = '90'
         THEN '1' ELSE '0' END
         AS CANCEL_FLG                                                         -- キャンセルフラグ
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
      ,MAX(COALESCE(SIH.STOCK_OUT_FLG,'0')) AS STOCK_OUT_FLG                        -- 欠品フラグ
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
      ,SIH.WORK_DT                                                             -- 作業日
      ,SIH.SHIPPING_DT                                                         -- 出荷日
      ,MAX(SIH.UPD_DT) AS MAX_UPD_DT                                           -- 更新日時
      ,MAX(MDC.PICKING_TIME) AS PICKING_TIME                                   -- 出庫開始時刻
      ,MAX(MDC.STOWAGE_TIME) AS STOWAGE_TIME                                   -- 積込予定時刻
      ,MAX(MDC.SHIPPING_TIME) AS SHIPPING_TIME                                 -- 出荷予定時刻
      ,SIH.DELIVERY_COURSE_CD                                                  -- 配送コースCD
      ,MDC.DELIVERY_COURSE_NM                                                  -- 配送コース名称
      ,MCR.CARRIER_CD                                                          -- 運送業者CD
      ,MCR.CARRIER_NM                                                          -- 運送業者名称
      ,COUNT(DISTINCT SIH.DELIV_CUSTOMER_CD) AS COUNT_SUPPLY_CUSTOMER_CD       -- 納品先件数
      ,SIH.PICKING_BATCH_NO                                                    -- 出庫指示バッチNo.
      -- 荷主センタ変更対応 2017.06.15 miyabe Start
      ,MIN(SIH.SHIPPING_STATUS) AS SHIPPING_STATUS                             -- // cls(ShippingStatus) 出荷ステータス
      ,MAX(SIH.SHIPPING_STATUS) AS SHIPPING_STATUS_MAX                         -- // cls(ShippingStatus) 出荷ステータス最大値
      -- 荷主センタ変更対応 2017.06.15 miyabe End
      ,NULL AS SHIPPING_STATUS_NM                                              -- 出荷ステータス名
      ,COUNT(DISTINCT SIH.SHIPPING_SLIP_NO) AS SHIPPING_SLIP_NO                -- 伝票数
      ,COUNT(SIB.SHIPPING_INST_B_ID) AS NUM                                    -- 行数
      ,COUNT(DISTINCT SIH.SHIPPING_INST_H_ID) AS TSIH_NUM                      -- 出荷指示ヘッダ件数
      ,COUNT(DISTINCT SIB.PRODUCT_ID) AS COUNT_PRODUCT_CD                      -- アイテム数
      ,SUM(COALESCE(SIB.INST_NUM,0)) AS INST_NUM                               -- 指示数
      ,SUM(COALESCE(SIB.ALLOC_NUM,0)) AS ALLOC_NUM                             -- 引当済数
      ,0 AS COUNT_SHIPPING_PACKING_NO                                          -- 個口数
      ,0 AS SUM_GROSS_WEIGHT                                                   -- 重量(グロス)(g)
      ,0 AS PIC_LIST_STATUS1                                                   -- 1次ピッキングリスト出力(%)
      ,0 AS PIC_LIST_STATUS2                                                   -- 2次ピッキングリスト出力(%)
      ,0 AS CHK_STATUS                                                         -- 検品(％)
      ,0 AS INVOICE_CREATE                                                     -- 送り状データ作成(%)
      ,0 AS PACKING_OUT                                                        -- 納品明細書発行(%)
      ,0 AS LOADING_STATUS                                                     -- 積込検品(％)
      ,0 AS SHIPPING_FIXED                                                     -- 出荷確定(%)
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
  WHERE SIH.DEL_FLG = '0'
    AND SIH.SHIPPING_STATUS IN ('10','15','90','99') -- 10:未出荷 15:出庫指示中 90:キャンセル 99:エラー
    /*IF pmb.centerId != null*/
    AND SIH.CENTER_ID = /*pmb.centerId*/11111111111
    /*END*/
    /*IF pmb.clientId != null*/
    AND SIH.CLIENT_ID = /*pmb.clientId*/11111111111
    /*END*/
    /*IF pmb.pickingBatchNo != null*/
    AND SIH.PICKING_BATCH_NO = /*pmb.pickingBatchNo*/'0125'
    /*END*/
    /*IF pmb.deliveryCourseCd != null*/
    AND SIH.DELIVERY_COURSE_CD Like /*pmb.deliveryCourseCd*/'a123%'
    /*END*/
    /*IF pmb.carrierId != null*/
    AND MCR.CARRIER_ID = /*pmb.carrierId*/11111111111
    /*END*/
    /*IF pmb.noAllcDisplayFlg == 1*/
    AND ((SIH.SHIPPING_STATUS IN ('10','99')
      /*IF pmb.shippingDtTo != null*/
      AND SIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
      /*END*/
      ) OR (SIH.SHIPPING_STATUS NOT IN ('10','99')
      /*IF pmb.shippingDtFrom != null*/
      AND SIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
      /*END*/
      /*IF pmb.shippingDtTo != null*/
      AND SIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
      /*END*/
    ))
    /*END*/
    /*IF pmb.noAllcDisplayFlg == 0*/
      /*IF pmb.shippingDtFrom != null*/
      AND SIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
      /*END*/
      /*IF pmb.shippingDtTo != null*/
      AND SIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
      /*END*/
    /*END*/
    /*IF pmb.cancelDisplay == '0'*/
    AND SIH.SHIPPING_STATUS <> '90'
    /*END*/
  GROUP BY
     SIH.CLIENT_ID
    ,MCL.CLIENT_CD
    ,SIH.CENTER_ID
    ,MCT.CENTER_CD
    ,SIH.WORK_DT
    ,SIH.SHIPPING_DT
    ,SIH.PICKING_BATCH_NO
    ,SIH.DELIVERY_COURSE_CD
    ,MDC.DELIVERY_COURSE_NM
    ,MCR.CARRIER_CD
    ,MCR.CARRIER_NM
    ,SIH.ERROR_FLG
    ,CASE WHEN SIH.SHIPPING_STATUS = '90' THEN '1' ELSE '0' END
  HAVING 1=1
    /*IF pmb.shippingStatus != null*/
    AND MIN(SIH.SHIPPING_STATUS) = /*pmb.shippingStatus*/'10'
    /*END*/
    /*IF pmb.emergencyFlg != null && pmb.emergencyFlg == '1'*/
    AND MAX(SIH.EMERGENCY_FLG) = /*pmb.emergencyFlg*/'1'
    /*END*/
UNION ALL
/*END*/
SELECT AIH.CLIENT_ID                                                           -- 荷主ID
      ,AIH.CLIENT_CD                                                           -- 荷主CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
	  ,MAX(AIH.CLIENT_NM) AS CLIENT_NM                                         -- 荷主名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,AIH.CENTER_ID                                                           -- センタID
      ,AIH.CENTER_CD                                                           -- センタCD
-- 荷主センタ変更対応 2017.03.28 hdis Start
	  ,MAX(AIH.CENTER_NM)  AS CENTER_NM                                        -- センタ名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,MAX(AIH.EMERGENCY_FLG) AS EMERGENCY_FLG                                 -- 緊急フラグ
      ,AIH.ERROR_FLG                                                           -- エラーフラグ
      ,AIH.CANCEL_FLG                                                          -- キャンセルフラグ
      ,MAX(AIH.STOCK_OUT_FLG) AS STOCK_OUT_FLG                                 -- 欠品フラグ
      ,AIH.WORK_DT                                                             -- 作業日
      ,AIH.SHIPPING_DT                                                         -- 出荷日
      ,MAX(AIH.MAX_UPD_DT) AS MAX_UPD_DT                                       -- 更新日時
      ,MAX(AIH.PICKING_TIME) AS PICKING_TIME                                   -- 出庫開始時刻
      ,MAX(AIH.STOWAGE_TIME) AS STOWAGE_TIME                                   -- 積込予定時刻
      ,MAX(AIH.SHIPPING_TIME) AS SHIPPING_TIME                                 -- 出荷予定時刻
      ,AIH.DELIVERY_COURSE_CD                                                  -- 配送コースCD
      ,AIH.DELIVERY_COURSE_NM                                                  -- 配送コース名称
      ,AIH.CARRIER_CD                                                          -- 運送業者CD
      ,AIH.CARRIER_NM                                                          -- 運送業者名称
      -- [#4664][v3.0] 件数不正を修正 2018.06.05 kawana Start
      ,COUNT(DISTINCT AIH.DELIV_CUSTOMER_CD) AS COUNT_SUPPLY_CUSTOMER_CD       -- 納品先件数
      -- [#4664][v3.0] 件数不正を修正 2018.06.05 kawana End
      ,AIH.PICKING_BATCH_NO                                                    -- 出庫指示バッチNo.
      -- 荷主センタ変更対応 2017.06.15 miyabe Start
      ,MIN(AIH.SHIPPING_STATUS) AS SHIPPING_STATUS                             -- // cls(ShippingStatus) 出荷ステータス
      ,MAX(AIH.SHIPPING_STATUS) AS SHIPPING_STATUS_MAX                         -- // cls(ShippingStatus) 出荷ステータス最大値
      -- 荷主センタ変更対応 2017.06.15 miyabe End
      ,NULL AS SHIPPING_STATUS_NM                                              -- 出荷ステータス名
      ,SUM(AIH.SHIPPING_SLIP_NO) AS SHIPPING_SLIP_NO                           -- 伝票数
      ,SUM(AIH.LINE_NO) AS NUM                                                 -- 行数
      ,SUM(AIH.SHIPPING_INST_H_ID_COUNT) AS TSIH_NUM                           -- 出荷指示ヘッダ件数
      ,SUM(AIH.PRODUCT_ID) AS COUNT_PRODUCT_CD                                 -- アイテム数
      ,SUM(AIH.INST_NUM) AS INST_NUM                                           -- 指示数
      ,SUM(AIH.ALLOC_NUM) AS ALLOC_NUM                                         -- 引当済数
      ,SUM(PAH.PACKING_CNT) AS COUNT_SHIPPING_PACKING_NO                       -- 個口数
      ,SUM(PAH.GROSS_WEIGHT) AS SUM_GROSS_WEIGHT                               -- 重量(グロス)(g)
      ,FLOOR(COALESCE(
-- [#5415][v3.1] ケースピッキングの進捗を1次ピッキングリスト出力(%)に含めるように修正 2018.10.09 kawana Start
         SUM(
           CASE WHEN PAH.PACKING_CASE_CNT > 0 THEN
             -- ケース梱包あり
             CASE WHEN PAH.PACKING_MIXED_CNT > 0 THEN
               -- ピース梱包あり
               CASE WHEN (AIH.PL1_LIST_FLG = '1' AND AIH.CASE_LIST_FLG = '1') THEN 1 ELSE 0 END
             ELSE
               -- ピース梱包なし
               CASE WHEN AIH.CASE_LIST_FLG = '1' THEN 1 ELSE 0 END
             END
           ELSE
             -- ケース梱包なし
             CASE WHEN PAH.PACKING_MIXED_CNT > 0 THEN
               -- ピース梱包あり
               CASE WHEN AIH.PL1_LIST_FLG = '1' THEN 1 ELSE 0 END
             ELSE
               -- ピース梱包なし
               1
             END
           END
         )
-- [#5415][v3.1] ケースピッキングの進捗を1次ピッキングリスト出力(%)に含めるように修正 2018.10.09 kawana End
         / COUNT(DISTINCT AIH.ALLOC_INST_H_ID) * 100,0))
         AS PIC_LIST_STATUS1                                                   -- 1次ピッキングリスト出力(%) 出庫作業№件数ベースでの進捗
      ,FLOOR(COALESCE(
         SUM(CASE WHEN AIH.PL2_LIST_FLG = '0' THEN 0 ELSE 1 END)
         / COUNT(DISTINCT AIH.ALLOC_INST_H_ID) * 100,0))
         AS PIC_LIST_STATUS2                                                   -- 2次ピッキングリスト出力(%) 出庫作業№件数ベースでの進捗
      ,FLOOR(COALESCE(
         SUM(CASE WHEN COALESCE(PAH.INSPECTION_FLG,'0') = '0' THEN 0 ELSE 1 END)
         /
         COUNT(DISTINCT AIH.ALLOC_INST_H_ID)
         * 100,0))
         AS CHK_STATUS                                                         -- 検品(％) 出庫作業№件数ベースでの進捗
      ,FLOOR(COALESCE(
         SUM(CASE WHEN AIH.INVOICE_CREATE_FLG = '0' THEN 0 ELSE 1 END)
         / COUNT(DISTINCT AIH.ALLOC_INST_H_ID) * 100,0))
         AS INVOICE_CREATE                                                     -- 送り状データ作成(%) 出庫作業№件数ベースでの進捗
      ,FLOOR(COALESCE(
         SUM(CASE WHEN AIH.PACKING_OUT_FLG = '0' THEN 0 ELSE 1 END)
         / COUNT(DISTINCT AIH.ALLOC_INST_H_ID) * 100,0))
         AS PACKING_OUT                                                        -- 納品明細書発行(%) 出庫作業№件数ベースでの進捗
      ,FLOOR(COALESCE(
         SUM(PAH.LOADING_NUM)
         / SUM(PAH.PACKING_CNT) * 100,0))
         AS LOADING_STATUS                                                     -- 積込検品(％) 出荷梱包No件数ベースでの進捗
      ,FLOOR(COALESCE(
         SUM(CASE WHEN AIH.SHIPPING_FIXED_FLG = '0' THEN 0 ELSE 1 END)
         / COUNT(DISTINCT AIH.ALLOC_INST_H_ID) * 100,0))
         AS SHIPPING_FIXED                                                     -- 出荷確定(%) 出庫作業№件数ベースでの進捗
  FROM (
  SELECT AIH.ALLOC_INST_H_ID                                                     -- 引当指示ヘッダID
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
        ,'0' AS ERROR_FLG                                                        -- エラーフラグ
        ,'0' AS CANCEL_FLG                                                       -- キャンセルフラグ
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
        -- [#4664][v3.0] 件数不正を修正 2018.06.05 kawana Start
        ,AIH.DELIV_CUSTOMER_CD                                                   -- 届先CD
        -- [#4664][v3.0] 件数不正を修正 2018.06.05 kawana End
        ,SIH.PICKING_BATCH_NO                                                    -- 出庫指示バッチNo.
        ,MIN(PIH.PICKING_STATUS) AS SHIPPING_STATUS                              -- 出荷ステータス
        ,MAX(SIH.SLIP_CNT) AS SHIPPING_SLIP_NO                                   -- 伝票数
        ,MAX(SIH.LINE_CNT) AS LINE_NO                                            -- 行数
        ,COUNT(DISTINCT AIB.PRODUCT_ID) AS PRODUCT_ID                            -- アイテム数
        ,SUM(AIB.INST_NUM) AS INST_NUM                                           -- 指示数
        ,SUM(AIB.ALLOC_NUM) AS ALLOC_NUM                                         -- 引当済数
-- [#5129][v3.1] 単行ピッキングリスト出力フラグ、1次ピッキングリスト出力フラグ、2次ピッキング出力フラグ、ケースピッキング出力日時を追加 2018.08.24 kawana Start
        ,MIN(PIR.PL1_OUT_FLG)
           AS PL1_LIST_FLG                                                       -- 1次ピッキングリスト出力フラグ
        ,MIN(PIR.PL2_OUT_FLG)
           AS PL2_LIST_FLG                                                       -- 2次ピッキングリスト出力フラグ
-- [#5129][v3.1] 単行ピッキングリスト出力フラグ、1次ピッキングリスト出力フラグ、2次ピッキング出力フラグ、ケースピッキング出力日時を追加 2018.08.24 kawana End
-- [#5415][v3.1] ケースピッキングの進捗を1次ピッキングリスト出力(%)に含めるように修正 2018.10.09 kawana Start
        ,MIN(PIR.CASE_OUT_FLG)
           AS CASE_LIST_FLG                                                      -- ケースピッキングリスト出力フラグ
-- [#5415][v3.1] ケースピッキングの進捗を1次ピッキングリスト出力(%)に含めるように修正 2018.10.09 kawana End
        ,MIN(CASE WHEN PIR.INVOICE_CREATE_FLG = '1' THEN '1' ELSE '0' END)
           AS INVOICE_CREATE_FLG                                                 -- 送り状データ作成
        ,MIN(CASE WHEN PIR.PACKING_OUT_FLG = '1' THEN '1' ELSE '0' END)
           AS PACKING_OUT_FLG                                                    -- 納品明細書発行
        ,MIN(CASE WHEN PIH.PICKING_STATUS = '55' THEN '1' ELSE '0' END)
           AS SHIPPING_FIXED_FLG                                                 -- 出荷確定
        ,MAX(SIH.SHIPPING_INST_H_ID_COUNT) AS SHIPPING_INST_H_ID_COUNT           -- 出荷指示ヘッダ件数
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
                    /*IF pmb.centerId != null*/
                    AND SIH.CENTER_ID = /*pmb.centerId*/11111111111
                    /*END*/
                    /*IF pmb.clientId != null*/
                    AND SIH.CLIENT_ID = /*pmb.clientId*/11111111111
                    /*END*/
                    /*IF pmb.pickingBatchNo != null*/
                    AND SIH.PICKING_BATCH_NO = /*pmb.pickingBatchNo*/'0125'
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
        /*IF pmb.carrierId != null*/
        AND MCR.CARRIER_ID = /*pmb.carrierId*/11111111111
        /*END*/
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
    HAVING 1 = 1
        /*IF pmb.shippingStatus != null*/
        AND MIN(PIH.PICKING_STATUS) = /*pmb.shippingStatus*/'10'
        /*END*/
     ) AIH
    LEFT JOIN (SELECT PAH.ALLOC_INST_H_ID
                     ,COUNT(DISTINCT PAH.SHIPPING_PACKING_NO) AS PACKING_CNT  -- 梱包数
                     ,SUM(CASE WHEN PAH.MIXED_FLG = '0' THEN 1 ELSE 0 END) AS PACKING_CASE_CNT  -- 単品梱包数
                     ,SUM(CASE WHEN PAH.MIXED_FLG = '1' THEN 1 ELSE 0 END) AS PACKING_MIXED_CNT  -- 混載梱包数
                     ,SUM(PAH.GROSS_WEIGHT) AS GROSS_WEIGHT  -- グロス重量計
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
                                /*IF pmb.shippingDtFrom != null*/
                                AND AIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
                                /*END*/
                                /*IF pmb.shippingDtTo != null*/
                                AND AIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
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
                   /*IF pmb.shippingDtFrom != null*/
                   AND AIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140401'
                   /*END*/
                   /*IF pmb.shippingDtTo != null*/
                   AND AIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20140430'
                   /*END*/
                 GROUP BY PAH.ALLOC_INST_H_ID
              ) PAH
      ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
  GROUP BY
     AIH.CLIENT_ID
    ,AIH.CLIENT_CD
    ,AIH.CENTER_ID
    ,AIH.CENTER_CD
    ,AIH.WORK_DT
    ,AIH.SHIPPING_DT
    ,AIH.PICKING_BATCH_NO
    ,AIH.DELIVERY_COURSE_CD
    ,AIH.DELIVERY_COURSE_NM
    ,AIH.CARRIER_CD
    ,AIH.CARRIER_NM
    ,AIH.ERROR_FLG
    ,AIH.CANCEL_FLG
  HAVING 1=1
    /*IF pmb.emergencyFlg != null && pmb.emergencyFlg == '1'*/
    AND MAX(AIH.EMERGENCY_FLG) = /*pmb.emergencyFlg*/'1'
    /*END*/
/*IF pmb.isPaging()*/
  ORDER BY
    CLIENT_CD
   ,CENTER_CD
   ,WORK_DT
   ,SHIPPING_DT
   ,PICKING_BATCH_NO
   ,DELIVERY_COURSE_CD
   ,CARRIER_CD
   ,EMERGENCY_FLG
   ,ERROR_FLG
   ,CANCEL_FLG
-- ELSE ) CNT
/*END*/

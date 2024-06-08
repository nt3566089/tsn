/*
 [df:title]
 ピッキングリスト発行画面　出庫作業№単位で1行です。

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##String OPL_OUT_NM##
-- ##String MLT_OUT_NM##
-- ##String TPL_OUT_NM##
-- ##String CASE_OUT_NM##
-- ##String PL_OUT_NM##
-- ##String SL_OUT_NM##
-- ##String SGL_ROW_PIC_NM##
-- ##String CASE_PIC_NM##
-- ##Long SLIP_NO##
-- ##Long LINE_NO##
-- ##Long PRODUCT_ID##
-- ##Long NUM##
-- ##Long PACKING_CNT##

-- !df:pmb extends Paging!
-- !!AutoDetect!!
/*IF pmb.isPaging() == false*/
/*SELECT COUNT(*) FROM (*/
/*END*/
SELECT AIH.CLIENT_ID                                                           -- 荷主ID
      ,AIH.CLIENT_CD                                                           -- 荷主CD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,AIH.CLIENT_NM					                                       -- 荷主名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,AIH.CENTER_ID                                                           -- センタID
      ,AIH.CENTER_CD                                                           -- センタCD
-- 荷主センタ変更対応 2017.03.28 hdis Start
      ,AIH.CENTER_NM                                                           -- センタ名称
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,AIH.WORK_DT                                                             -- 作業日
      ,AIH.SHIPPING_DT                                                         -- 出荷日
      ,AIH.PICKING_BATCH_NO                                                    -- 出庫指示バッチNo.
      ,AIH.PICKING_WORK_NO                                                     -- 出庫作業No.
      ,AIH.SUPPLY_CUSTOMER_CD                                                  -- 納品先CD
      ,AIH.SUPPLY_CUSTOMER_NM                                                  -- 納品先名称
      ,AIH.DELIVERY_COURSE_CD                                                  -- 配送コースCD
      ,AIH.DELIVERY_COURSE_NM                                                  -- 配送コース名称
      ,AIH.CARRIER_CD                                                          -- 運送業者CD
      ,AIH.CARRIER_NM                                                          -- 運送業者名称
      ,AIH.SLIP_NO                                                             -- 伝票数
      ,AIH.LINE_NO                                                             -- 行数
      ,AIH.PRODUCT_ID                                                          -- アイテム数
      ,AIH.INST_NUM                                                            -- 指示数
      ,AIH.ALLOC_NUM                                                           -- 引当済数
      ,AIH.STOCK_OUT_FLG                                                       -- 欠品フラグ
      ,AIH.OPL_OUT_FLG                                                         -- オーダーピッキングリスト出力フラグ
      ,NULL AS OPL_OUT_NM                                                      -- オーダーピッキングリスト出力名称
-- [#5129][v3.1] 単行ピッキングリスト出力フラグ、1次ピッキングリスト出力フラグ、2次ピッキング出力フラグ、ケースピッキング出力日時を追加 2018.08.24 kawana Start
      ,AIH.TPL_OUT_FLG                                                         -- トータルピッキングリスト出力フラグ
      ,NULL AS TPL_OUT_NM                                                      -- トータルピッキングリスト出力名称
      ,AIH.MLT_OUT_FLG                                                         -- マルチピッキングリスト出力フラグ
      ,NULL AS MLT_OUT_NM                                                      -- マルチピッキングリスト出力名称
      ,AIH.SPL_OUT_FLG                                                         -- 単行ピッキングリスト出力フラグ
      ,NULL AS SPL_OUT_NM                                                      -- 単行ピッキングリスト出力名称
      ,AIH.PL1_OUT_FLG                                                         -- 1次ピッキングリスト出力フラグ
      ,NULL AS PL1_OUT_NM                                                      -- 1次ピッキングリスト出力名称
      ,AIH.PL1_OUT_DT                                                          -- 1次ピッキングリスト出力日時
      ,AIH.PL_OUT_FLG                                                          -- 摘み取りリスト出力フラグ
      ,NULL AS PL_OUT_NM                                                       -- 摘み取りリスト出力名称
      ,AIH.SL_OUT_FLG                                                          -- 種まきリスト出力フラグ
      ,NULL AS SL_OUT_NM                                                       -- 種まきリスト出力名称
      ,AIH.PL2_OUT_FLG                                                         -- 2次ピッキングリスト出力フラグ
      ,NULL AS PL2_OUT_NM                                                      -- 2次ピッキングリスト出力名称
      ,AIH.PL2_OUT_DT                                                          -- 2次ピッキングリスト出力日時
      ,AIH.CASE_OUT_FLG                                                        -- ケースピッキングリスト出力フラグ
      ,NULL AS CASE_OUT_NM                                                     -- ケースピッキングリスト出力名称
      ,AIH.CASE_OUT_DT                                                         -- ケースピッキングリスト出力日時
-- [#5129][v3.1] 単行ピッキングリスト出力フラグ、1次ピッキングリスト出力フラグ、2次ピッキング出力フラグ、ケースピッキング出力日時を追加 2018.08.24 kawana End
      ,AIH.PICKING_GROUP_NO                                                    -- トータルピッキング№
      -- 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動(ピッキングリスト発行からは削除) 2016.01.28 kawana
      ,AIH.EMERGENCY_FLG                                                       -- 緊急フラグ
      ,AIH.UPD_DT_SIH AS UPD_DT                                                -- 更新日時
      ,AIH.NUM                                                                 -- 行数
      ,PAH.PACKING_CNT                                                         -- 梱包数
      ,PAH.PACKING_CASE_CNT                                                    -- ケース梱包数
      ,PAH.PACKING_MIXED_CNT                                                   -- 混載梱包数
      -- [ON推-品向-1104] マルチピック計算フラグを表示 2016.04.18 kawana Start
      ,PAH.MULTI_PIC_FLG                                                       -- // cls(MultiPicFlg) マルチピック計算フラグ
      ,NULL AS MULTI_PIC_FLG_NM                                                -- マルチピック計算フラグ名称
      -- [ON推-品向-1104] マルチピック計算フラグを表示 2016.04.18 kawana End
      -- [ON推-UT210N-009] 荷札出力日時と荷札発行(発行済/未発行)を表示  BY SJA 2016/09/19  Start
      ,AIH.TAG_OUT_FLG                                                         -- 荷札出力フラグ
      ,NULL AS TAG_OUT_FLG_NM                                                  -- 荷札出力フラグ名称
      ,AIH.TAG_OUT_DT                                                          -- 荷札出力日時
      -- [ON推-UT210N-009] 荷札出力日時と荷札発行(発行済/未発行)を表示  BY SJA 2016/09/19  End
      -- [#5133][v3.1] 単行ピックフラグ、ケースピックフラグ追加 2018.10.24 miyabe Start
      ,AIH.SGL_ROW_PIC_FLG                                                     -- // cls(SglRowPicFlg)
      ,NULL AS SGL_ROW_PIC_NM
      ,(CASE WHEN AIH.MIXED_FLG = '0' THEN '1' ELSE '0' END) AS CASE_PIC_FLG
      ,NULL AS CASE_PIC_NM
      -- [#5133][v3.1] 単行ピックフラグ、ケースピックフラグ追加 2018.10.24 miyabe End

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
        ,AIH.WORK_DT                                                             -- 作業日
        ,AIH.SHIPPING_DT                                                         -- 出荷日
        ,SIH.PICKING_BATCH_NO                                                    -- 出庫指示バッチNo.
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
        ,PIH.PICKING_STATUS AS SHIPPING_STATUS                                   -- 出荷ステータス
        ,MDC.DELIVERY_COURSE_CD                                                  -- 配送コースCD
        ,MDC.DELIVERY_COURSE_NM                                                  -- 配送コース名称
        ,MCR.CARRIER_CD                                                          -- 運送業者CD
        ,MCR.CARRIER_NM                                                          -- 運送業者名称
        ,MAX(SIH.SLIP_CNT) AS SLIP_NO                                            -- 伝票数
        ,MAX(SIH.LINE_CNT) AS LINE_NO                                            -- 行数
        ,COUNT(DISTINCT AIB.PRODUCT_ID) AS PRODUCT_ID                            -- アイテム数
        ,SUM(AIB.INST_NUM) AS INST_NUM                                           -- 指示数
        ,SUM(AIB.ALLOC_NUM) AS ALLOC_NUM                                         -- 引当済数
        ,MAX(SIH.STOCK_OUT_FLG) AS STOCK_OUT_FLG                                 -- 欠品フラグ
        ,MIN(COALESCE(PIR.OPL_OUT_FLG,'0')) AS OPL_OUT_FLG                       -- オーダーピッキングリスト出力フラグ
-- [#5129][v3.1] 単行ピッキングリスト出力フラグ、1次ピッキングリスト出力フラグ、2次ピッキング出力フラグ、ケースピッキング出力日時を追加 2018.08.24 kawana Start
        ,MIN(COALESCE(PIR.TPL_OUT_FLG,'0')) AS TPL_OUT_FLG                       -- トータルピッキングリスト出力フラグ
        ,MIN(COALESCE(PIR.MLT_OUT_FLG,'0')) AS MLT_OUT_FLG                       -- マルチピッキングリスト出力フラグ
        ,MIN(COALESCE(PIR.SPL_OUT_FLG,'0')) AS SPL_OUT_FLG                       -- 単行ピッキングリスト出力フラグ
        ,MIN(COALESCE(PIR.PL1_OUT_FLG,'0')) AS PL1_OUT_FLG                       -- 1次ピッキングリスト出力フラグ
        ,MAX(PIR.PL1_OUT_DT) AS PL1_OUT_DT                                       -- 1次ピッキングリスト出力日時
        ,MIN(COALESCE(PIR.PL_OUT_FLG,'0')) AS PL_OUT_FLG                         -- 摘み取りリスト出力フラグ
        ,MIN(COALESCE(PIR.SL_OUT_FLG,'0')) AS SL_OUT_FLG                         -- 種まきリスト出力フラグ
        ,MIN(COALESCE(PIR.PL2_OUT_FLG,'0')) AS PL2_OUT_FLG                       -- 2次ピッキングリスト出力フラグ
        ,MAX(PIR.PL2_OUT_DT) AS PL2_OUT_DT                                       -- 2次ピッキングリスト出力日時
        ,MIN(COALESCE(PIR.CASE_OUT_FLG,'0')) AS CASE_OUT_FLG                     -- ケースピッキングリスト出力フラグ
        ,MAX(PIR.CASE_OUT_DT) AS CASE_OUT_DT                                     -- ケースピッキングリスト出力日時
-- [#5129][v3.1] 単行ピッキングリスト出力フラグ、1次ピッキングリスト出力フラグ、2次ピッキング出力フラグ、ケースピッキング出力日時を追加 2018.08.24 kawana End
        ,MAX(PIH.PICKING_GROUP_NO) AS PICKING_GROUP_NO                           -- トータルピッキング№
        -- 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動(ピッキングリスト発行からは削除) 2016.01.28 kawana
        ,PIH.PICKING_WORK_NO                                                     -- 出庫作業No.
        ,PIH.DELIV_UNIT_NO                                                       -- 届先単位No.
        ,MAX(SIH.SLIP_CNT) AS NUM                                                -- 行数
        ,MAX(SIH.EMERGENCY_FLG) AS EMERGENCY_FLG                                 -- 緊急フラグ
        ,MAX(SIH.UPD_DT) AS UPD_DT_SIH                                           -- 出荷指示ヘッダ更新日時
        -- [ON推-UT210N-009] 荷札出力日時と荷札発行(発行済/未発行)を表示  BY SJA 2016/09/19  Start
	    ,MIN(COALESCE(PAH.TAG_OUT_FLG,'0')) AS TAG_OUT_FLG                       -- 荷札出力フラグ
        ,MAX(PAH.TAG_OUT_DT) AS TAG_OUT_DT                                       -- 荷札出力日時
        -- [ON推-UT210N-009] 荷札出力日時と荷札発行(発行済/未発行)を表示  BY SJA 2016/09/19  End
        -- [#5133][v3.1] 単行ピックフラグ、ケースピックフラグ追加 2018.09.20 miyabe Start
        ,MAX(PIH.SGL_ROW_PIC_FLG) AS SGL_ROW_PIC_FLG
        ,MAX(PAH.MIXED_FLG) AS MIXED_FLG
        -- [#5133][v3.1] 単行ピックフラグ、ケースピックフラグ追加 2018.09.20 miyabe End
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
                      ,MAX(SIH.PICKING_BATCH_NO) AS PICKING_BATCH_NO          -- 出庫指示バッチ№
                      ,MIN(SIH.SHIPPING_SLIP_NO) AS MIN_SHIPPING_SLIP_NO      -- 最小WMS伝票№
                      ,MAX(SIH.SHIPPING_SLIP_NO) AS MAX_SHIPPING_SLIP_NO      -- 最大WMS伝票№
                      ,MIN(SIH.CLIENT_SHIPPING_NO) AS MIN_CLIENT_SHIPPING_NO  -- 最小顧客出荷指示№
                      ,MAX(SIH.CLIENT_SHIPPING_NO) AS MAX_CLIENT_SHIPPING_NO  -- 最大顧客出荷指示№
                      ,COUNT(DISTINCT SIH.SHIPPING_INST_H_ID) AS SLIP_CNT     -- 伝票数
                      ,COUNT(DISTINCT SIB.SHIPPING_INST_B_ID) AS LINE_CNT     -- 行数
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
                      ,MAX(SIH.STOCK_OUT_FLG) AS STOCK_OUT_FLG                -- 欠品フラグ
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
                      ,MAX(SIH.PICKING_WORK_MESSAGE) AS PICKING_WORK_MESSAGE  -- 出庫作業メッセージ
                      ,MAX(SIH.EMERGENCY_FLG) AS EMERGENCY_FLG                -- 緊急フラグ
                      ,MAX(SIH.UPD_DT) AS UPD_DT                              -- 更新日時
                      ,MAX(SIH.VERSION_NO) AS VERSION_NO                      -- バージョン№
                      ,MAX(SIH.CONTROL_NO) AS CONTROL_NO                      -- コントロール№
                      ,MAX(BM.MESSAGE_NM) AS MESSAGE_NM                       -- エラーメッセージ
                  FROM T_SHIPPING_INST_H SIH  -- 出荷指示ヘッダ
                  INNER JOIN T_SHIPPING_INST_B SIB  -- 出荷指示ボディ
                    ON SIH.SHIPPING_INST_H_ID = SIB.SHIPPING_INST_H_ID
                    AND SIB.DEL_FLG = '0'
                  LEFT JOIN B_MESSAGE BM  -- メッセージマスタ
                    ON SIH.ERROR_MESSAGE_CD = BM.MESSAGE_CD
                   AND BM.CULTURE_ID = /*pmb.cultureId*/11111111111
                   AND BM.DEL_FLG = '0'
                  WHERE SIH.DEL_FLG = '0'
                    AND SIH.SHIPPING_STATUS IN ('25', '30', '35', '40', '45', '50')
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
                    /*IF pmb.deliveryCourseCd != null*/
                    AND SIH.DELIVERY_COURSE_CD Like /*pmb.deliveryCourseCd*/'a123%'
                    /*END*/
                    /*IF pmb.dtFrom != null && pmb.takingShippingFlg == '0'*/
                    AND SIH.WORK_DT >= /*pmb.dtFrom*/'20140805'
                    /*END*/
                    /*IF pmb.dtTo != null && pmb.takingShippingFlg == '0'*/
                    AND SIH.WORK_DT <= /*pmb.dtTo*/'20141105'
                    /*END*/
                    /*IF pmb.dtFrom != null && pmb.takingShippingFlg == '1'*/
                    AND SIH.SHIPPING_DT >= /*pmb.dtFrom*/'20140805'
                    /*END*/
                    /*IF pmb.dtTo != null && pmb.takingShippingFlg == '1'*/
                    AND SIH.SHIPPING_DT <= /*pmb.dtTo*/'20141105'
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
    -- [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
    LEFT JOIN (SELECT PAH.ALLOC_INST_H_ID
                     -- [#5442][v3.1] バラ荷札・ケース荷札の一方のみ出力した場合は「一部発行済」と表示 2018.10.24 kawana Start
                     -- [ON推-UT210N-009] 荷札出力日時と荷札発行(発行済/未発行)を表示  BY SJA 2016/09/19  Start
                     ,CASE WHEN MIN(COALESCE(PAR.TAG_OUT_FLG,'0')) != MAX(COALESCE(PAR.TAG_OUT_FLG,'0')) THEN '2'
                       ELSE MIN(COALESCE(PAR.TAG_OUT_FLG,'0')) END AS TAG_OUT_FLG -- 荷札出力フラグ
                     -- [ON推-UT210N-009] 荷札出力日時と荷札発行(発行済/未発行)を表示  BY SJA 2016/09/19  End
                     -- [#5442][v3.1] バラ荷札・ケース荷札の一方のみ出力した場合は「一部発行済」と表示 2018.10.24 kawana End
                     ,MAX(PAR.TAG_OUT_DT) AS TAG_OUT_DT -- 荷札出力日時
                     -- [#5133][v3.1] 単行ピックフラグ、ケースピックフラグ追加 2018.09.20 miyabe Start
                     ,MAX(PAH.MIXED_FLG) AS MIXED_FLG
                     -- [#5133][v3.1] 単行ピックフラグ、ケースピックフラグ追加 2018.09.20 miyabe End
                  FROM T_ALLOC_INST_H AIH
                 INNER JOIN T_PACKING_H PAH
                   ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
                   AND PAH.DEL_FLG = '0'
                 INNER JOIN T_PACKING_R PAR
                    ON PAH.PACKING_H_ID = PAR.PACKING_H_ID
                   AND PAR.DEL_FLG = '0'
                 WHERE AIH.DEL_FLG = '0'
                   /*IF pmb.centerId != null*/
                   AND AIH.CENTER_ID = /*pmb.centerId*/11111111111
                   /*END*/
                   /*IF pmb.clientId != null*/
                   AND AIH.CLIENT_ID = /*pmb.clientId*/11111111111
                   /*END*/
                   /*IF pmb.dtFrom != null && pmb.takingShippingFlg == '0'*/
                   AND AIH.WORK_DT >= /*pmb.dtFrom*/'20140805'
                   /*END*/
                   /*IF pmb.dtTo != null && pmb.takingShippingFlg == '0'*/
                   AND AIH.WORK_DT <= /*pmb.dtTo*/'20141105'
                   /*END*/
                   /*IF pmb.dtFrom != null && pmb.takingShippingFlg == '1'*/
                   AND AIH.SHIPPING_DT >= /*pmb.dtFrom*/'20140805'
                   /*END*/
                   /*IF pmb.dtTo != null && pmb.takingShippingFlg == '1'*/
                   AND AIH.SHIPPING_DT <= /*pmb.dtTo*/'20141105'
                   /*END*/
                 GROUP BY PAH.ALLOC_INST_H_ID
              ) PAH
      ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
    -- [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End
    WHERE AIH.DEL_FLG = '0'
      /*IF pmb.pickingWorkNo != null*/
      AND PIH.PICKING_WORK_NO like /*pmb.pickingWorkNo*/'%a123'
      /*END*/
-- [#5133][v3.1] 単行ピッキングリスト出力フラグ、1次ピッキングリスト出力フラグ、2次ピッキング出力フラグ、ケースピッキング出力日時を追加 2018.08.27 kawana Start
      /*IF pmb.picCls == '1' && pmb.listOutKbn == '0'*/
      AND PIR.PL1_OUT_FLG = '0'
      /*END*/
      /*IF pmb.picCls == '1' && pmb.listOutKbn == '1'*/
      AND PIR.PL1_OUT_FLG = '1'
      /*END*/
      /*IF pmb.picCls == '2' &&  pmb.listOutKbn == '0'*/
      AND PIR.PL2_OUT_FLG = '0'
      /*END*/
      /*IF pmb.picCls == '2' &&  pmb.listOutKbn == '1'*/
      AND PIR.PL2_OUT_FLG = '1'
      /*END*/
      /*IF pmb.picCls == '3' &&  pmb.listOutKbn == '0'*/
      AND PIR.CASE_OUT_FLG = '0'
      /*END*/
      /*IF pmb.picCls == '3' &&  pmb.listOutKbn == '1'*/
      AND PIR.CASE_OUT_FLG = '1'
      /*END*/
	  -- [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
      /*IF pmb.picCls == '4' &&  pmb.listOutKbn == '0'*/
      AND PIR.SLIP_OUT_DT IS NULL
      AND PAH.TAG_OUT_DT IS NULL
      /*END*/
      /*IF pmb.picCls == '4' &&  pmb.listOutKbn == '1'*/
      AND (PIR.SLIP_OUT_DT IS NOT NULL
       OR PAH.TAG_OUT_DT IS NOT NULL)
     /*END*/
	  -- [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End
-- [#5133][v3.1] 単行ピッキングリスト出力フラグ、1次ピッキングリスト出力フラグ、2次ピッキング出力フラグ、ケースピッキング出力日時を追加 2018.08.27 kawana End
      /*IF pmb.pickingGroupNo != null*/
      AND PIH.PICKING_GROUP_NO = /*pmb.pickingGroupNo*/'1'
      /*END*/
-- [#5133][v3.1] 単行ピックフラグ、ケースピックフラグ追加 2018.09.20 miyabe Start
      /*IF pmb.sglRowPicFlg != null*/
      AND PIH.SGL_ROW_PIC_FLG = /*pmb.sglRowPicFlg*/'1'
      /*END*/
      /*IF pmb.casePicFlg != null*/
      AND PAH.MIXED_FLG = /*pmb.casePicFlg*/'0'
      /*END*/
-- [#5133][v3.1] 単行ピックフラグ、ケースピックフラグ追加 2018.09.20 miyabe End
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
      /*IF pmb.noStockOutFlg == '1'*/
      AND MAX(SIH.STOCK_OUT_FLG) = /*pmb.noStockOutFlg*/'1'
      /*END*/
      /*IF pmb.noStockOutFlg == '0'*/
      AND (MAX(SIH.STOCK_OUT_FLG) IS NULL OR MAX(SIH.STOCK_OUT_FLG) = /*pmb.noStockOutFlg*/'0')
      /*END*/
      /*IF pmb.emergencyFlg != null && pmb.emergencyFlg == '1'*/
      AND MAX(SIH.EMERGENCY_FLG) = /*pmb.emergencyFlg*/'1'
      /*END*/
     ) AIH
    LEFT JOIN (SELECT PAH.ALLOC_INST_H_ID
                     ,COUNT(DISTINCT PAH.SHIPPING_PACKING_NO) AS PACKING_CNT  -- 梱包数
                     ,SUM(CASE WHEN PAH.MIXED_FLG = '0' THEN 1 ELSE 0 END) AS PACKING_CASE_CNT  -- 単品梱包数
                     ,SUM(CASE WHEN PAH.MIXED_FLG = '1' THEN 1 ELSE 0 END) AS PACKING_MIXED_CNT  -- 混載梱包数
                     ,SUM(PAH.GROSS_WEIGHT) AS GROSS_WEIGHT  -- グロス重量計
                     -- [ON推-品向-1104] マルチピック計算フラグを表示 2016.04.18 kawana Start
                     ,MAX(PAH.MULTI_PIC_FLG) AS MULTI_PIC_FLG -- マルチピック計算フラグ
                     -- [ON推-品向-1104] マルチピック計算フラグを表示 2016.04.18 kawana End
                 FROM T_ALLOC_INST_H AIH
                 INNER JOIN T_PACKING_H PAH
                   ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
                   AND PAH.DEL_FLG = '0'
                 WHERE AIH.DEL_FLG = '0'
                   /*IF pmb.centerId != null*/
                   AND AIH.CENTER_ID = /*pmb.centerId*/11111111111
                   /*END*/
                   /*IF pmb.clientId != null*/
                   AND AIH.CLIENT_ID = /*pmb.clientId*/11111111111
                   /*END*/
                   /*IF pmb.dtFrom != null && pmb.takingShippingFlg == '0'*/
                   AND AIH.WORK_DT >= /*pmb.dtFrom*/'20140805'
                   /*END*/
                   /*IF pmb.dtTo != null && pmb.takingShippingFlg == '0'*/
                   AND AIH.WORK_DT <= /*pmb.dtTo*/'20141105'
                   /*END*/
                   /*IF pmb.dtFrom != null && pmb.takingShippingFlg == '1'*/
                   AND AIH.SHIPPING_DT >= /*pmb.dtFrom*/'20140805'
                   /*END*/
                   /*IF pmb.dtTo != null && pmb.takingShippingFlg == '1'*/
                   AND AIH.SHIPPING_DT <= /*pmb.dtTo*/'20141105'
                   /*END*/
                 GROUP BY PAH.ALLOC_INST_H_ID
              ) PAH
      ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
-- [#5133][v3.1] 発行区分にケースピッキングを追加 2018.08.27 kawana Start
    WHERE 1=1
      /*IF pmb.picCls == '1' || pmb.picCls == '2' */
      AND 0 < PAH.PACKING_MIXED_CNT
      /*END*/
      /*IF pmb.picCls == '3' */
      AND 0 < PAH.PACKING_CASE_CNT
      /*END*/
-- [#5133][v3.1] 発行区分にケースピッキングを追加 2018.08.27 kawana End
/*IF pmb.isPaging()*/
  ORDER BY
    CLIENT_CD
   ,CENTER_CD
   ,WORK_DT
   ,SHIPPING_DT
   ,PICKING_BATCH_NO
   ,DELIVERY_COURSE_CD
   ,SUPPLY_CUSTOMER_CD
   ,PICKING_WORK_NO
-- ELSE ) CNT
/*END*/

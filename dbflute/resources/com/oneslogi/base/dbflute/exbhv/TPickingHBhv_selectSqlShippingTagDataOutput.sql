
  /*
   [df:title]
    送り状データ出力。出庫ヘッダ1レコード毎です。

   [df:description]
    SQL Description here.

  */

 -- #df:entity#
 -- ##Long ALLOC_INST_H_ID##
 -- ##Long SUM_PICKINGH_COUNT##

  -- !df:pmb extends Paging!
  -- !!AutoDetect!!
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto Start
/*IF pmb.isPaging()*/
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto End
SELECT
-- 荷主センタ変更対応 2017.03.28 hdis Start
TPH.CLIENT_ID,
MCL.CLIENT_CD AS CLIENT_CD,
MAX(MCL.CLIENT_NM) AS CLIENT_NM,
TPH.CENTER_ID,
TCC.CENTER_CD AS CENTER_CD,
MAX(TCC.CENTER_NM) AS CENTER_NM,
-- 荷主センタ変更対応 2017.03.28 hdis End
MAX(TAIH.ALLOC_INST_H_ID) AS ALLOC_INST_H_ID,
MAX(TAIH.SHIPPING_DT) AS SHIPPING_DT,
MAX(TAIH.WORK_DT) AS WORK_DT,
MAX(MDC.DELIVERY_COURSE_CD) AS DELIVERY_COURSE_CD,
MAX(MDC.DELIVERY_COURSE_NM) AS DELIVERY_COURSE_NM,
MAX(MCR.CARRIER_CD) AS CARRIER_CD,
MAX(MCR.CARRIER_NM) AS CARRIER_NM,
MAX(MCR.CARRIER_ABBR) AS CARRIER_ABBR,
MAX(TAIH.DELIV_CUSTOMER_CD) AS DELIV_CUSTOMER_CD,
-- 個人情報暗号化対応 2016.09.01 kawana Start
--MAX(f_decrypt(TAIH.DELIV_CUSTOMER_NM)) AS DELIV_CUSTOMER_NM,
--MAX(f_decrypt(TAIH.DELIV_ADDRESS1)) AS DELIV_ADDRESS1,
--MAX(f_decrypt(TAIH.DELIV_ADDRESS2)) AS DELIV_ADDRESS2,
--MAX(f_decrypt(TAIH.DELIV_ADDRESS3)) AS DELIV_ADDRESS3,
MAX(TAIH.DELIV_CUSTOMER_NM) AS DELIV_CUSTOMER_NM,
MAX(TAIH.DELIV_ADDRESS1) AS DELIV_ADDRESS1,
MAX(TAIH.DELIV_ADDRESS2) AS DELIV_ADDRESS2,
MAX(TAIH.DELIV_ADDRESS3) AS DELIV_ADDRESS3,
-- 個人情報暗号化対応 2016.09.01 kawana End
/*[検査-163]取得(MC)条件を修正 2014.12.01 衛 Start*/
MAX(TAIH.SUPPLY_CUSTOMER_CD) AS SUPPLY_CUSTOMER_CD,
-- 個人情報暗号化対応 2016.09.01 kawana Start
--MAX(f_decrypt(TAIH.SUPPLY_CUSTOMER_NM)) AS SUPPLY_CUSTOMER_NM,
MAX(TAIH.SUPPLY_CUSTOMER_NM) AS SUPPLY_CUSTOMER_NM,
-- 個人情報暗号化対応 2016.09.01 kawana End
MAX(MC.CUSTOMER_ABBR) AS SUPPLY_CUSTOMER_ABBR,
/*[検査-163]取得(MC)条件を修正 2014.12.01 衛 End*/
MAX(TPH.PICKING_WORK_NO) AS PICKING_WORK_NO,
MAX(TSIH.CLIENT_SHIPPING_NO) AS CLIENT_SHIPPING_NO,
COUNT(DISTINCT TPAH.PACKING_H_ID) AS SUM_PICKINGH_COUNT,
MIN(VD2.DICT_NM) AS EMERGENCY_FLG,
MAX(VD1.DICT_NM) AS INVOICE_CREATE_FLG,
MAX(TPR.INVOICE_CREATE_DT) AS INVOICE_CREATE_DT
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto Start
-- [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana Start
-- ELSE SELECT COUNT(*) FROM (SELECT COUNT(*)
/*END*/
-- [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana End
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto End
FROM T_PICKING_H TPH
LEFT JOIN T_PACKING_H TPAH
  ON TPH.PICKING_H_ID = TPAH.PICKING_H_ID
 AND TPAH.DEL_FLG = '0'
LEFT JOIN T_PICKING_R TPR
  ON TPH.PICKING_H_ID = TPR.PICKING_H_ID
 AND TPR.DEL_FLG = '0'
LEFT JOIN T_ALLOC_INST_H TAIH
  ON TPH.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
 AND TAIH.DEL_FLG = '0'
LEFT JOIN T_SHIPPING_INST_H TSIH
  ON TAIH.ALLOC_INST_H_ID = TSIH.ALLOC_INST_H_ID
 AND TSIH.DEL_FLG = '0'
LEFT JOIN M_DELIVERY_COURSE MDC
  ON TAIH.DELIVERY_COURSE_ID = MDC.DELIVERY_COURSE_ID
   AND MDC.DEL_FLG = '0'
    LEFT JOIN M_CUSTOMER MC
    ON TAIH.SUPPLY_CUSTOMER_ID = MC.CUSTOMER_ID
   AND MC.DEL_FLG = '0'
    LEFT JOIN M_CARRIER MCR
    ON MDC.CARRIER_ID = MCR.CARRIER_ID
   AND MCR.DEL_FLG = '0'
   LEFT JOIN M_CLIENT MCL
   ON TPH.CLIENT_ID = MCL.CLIENT_ID
   AND MCL.DEL_FLG = '0'
   LEFT JOIN M_CENTER TCC
 -- [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka Start
 --  ON TPH.CENTER_ID = TAIH.CENTER_ID
   ON TPH.CENTER_ID = TCC.CENTER_ID
 -- [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka End
   AND TCC.DEL_FLG = '0'
 -- [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka Start
 --  AND TPH.DEL_FLG = '0'
 -- [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka End
LEFT OUTER JOIN M_CENTER_CLASS BC1
  ON BC1.CLASS_CD = 'INVOICE_CREATE_FLG'
 AND BC1.CENTER_ID = /*pmb.centerClassCondition*/11111111111
LEFT OUTER JOIN M_CENTER_CLASS_DTL BCD1
  ON BC1.CENTER_CLASS_ID = BCD1.CENTER_CLASS_ID
 -- [ON推-品向-316] 送り状データ作成フラグを修正しました。 2014.12.02 wangzs Start
 /*[検査-165]結合条件を修正 2014.12.01 衛 Start*/
 AND TPR.INVOICE_CREATE_FLG = BCD1.CLASS_DTL_CD
 /*[検査-165]結合条件を修正 2014.12.01 衛 End*/
 -- [ON推-品向-316] 送り状データ作成フラグを修正しました。 2014.12.02 wangzs End
LEFT OUTER JOIN V_DICT VD1
  ON VD1.DICT_ID = BCD1.DICT_ID
    -- [ON推-品向-607] 辞書カルチャマスタデータを入れた後、カルチャIDを追加する 2015.04.09 kyo Start
 AND (VD1.CULTURE_ID IS NULL OR VD1.CULTURE_ID = /*pmb.cultureId*/11111111111)
  -- [ON推-品向-607] 辞書カルチャマスタデータを入れた後、カルチャIDを追加する 2015.04.09 kyo End
LEFT OUTER JOIN M_CENTER_CLASS BC2
  ON BC2.CLASS_CD = 'EMERGENCY_FLG'
 AND BC2.CENTER_ID = /*pmb.centerClassCondition*/11111111111
LEFT OUTER JOIN M_CENTER_CLASS_DTL BCD2
  ON BC2.CENTER_CLASS_ID = BCD2.CENTER_CLASS_ID
 -- [ON推-品向-316] 緊急フラグを修正しました。 2014.12.02 wangzs Start
 AND TSIH.EMERGENCY_FLG = BCD2.CLASS_DTL_CD
 -- [ON推-品向-316] 緊急フラグを修正しました。 2014.12.02 wangzs End
LEFT OUTER JOIN V_DICT VD2
  ON VD2.DICT_ID = BCD2.DICT_ID
  -- [ON推-品向-607] 辞書カルチャマスタデータを入れた後、カルチャIDを追加する 2015.04.09 kyo Start
 AND (VD2.CULTURE_ID IS NULL OR VD2.CULTURE_ID = /*pmb.cultureId*/11111111111)
  -- [ON推-品向-607] 辞書カルチャマスタデータを入れた後、カルチャIDを追加する 2015.04.09 kyo End
  WHERE TPH.CLIENT_ID  = /*pmb.clientId*/11111111111
        AND TPH.CENTER_ID  = /*pmb.centerId*/11111111111
        /*IF pmb.carrierCd != null*/
        AND MCR.CARRIER_CD = /*pmb.carrierCd*/'1'
        /*END*/
        /*IF pmb.customerCd != null*/
        AND MC.CUSTOMER_CD like /*pmb.customerCd*/'a123%'
        /*END*/
       -- [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana Start
        /*IF pmb.pickingWorkNo != null*/
        AND TPH.PICKING_WORK_NO like /*pmb.pickingWorkNo*/'%a123'
        /*END*/
       -- [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana End
        /*IF pmb.clientShippingNo != null*/
        AND TSIH.CLIENT_SHIPPING_NO like /*pmb.clientShippingNo*/'a123%'
        /*END*/
         /*IF pmb.shippingDtFrom != null*/
         AND TAIH.SHIPPING_DT >= /*pmb.shippingDtFrom*/'20140805'
        /*END*/
        /*IF pmb.shippingDtTo != null*/
         AND TAIH.SHIPPING_DT <= /*pmb.shippingDtTo*/'20141105'
        /*END*/
 	    /*IF pmb.workDtFrom != null*/
         AND TAIH.WORK_DT >= /*pmb.workDtFrom*/'20140805'
        /*END*/
        /*IF pmb.workDtTo != null*/
         AND TAIH.WORK_DT <= /*pmb.workDtTo*/'20141105'
        /*END*/
 	    /*IF pmb.deliveryCourseCd != null*/
         AND MDC.DELIVERY_COURSE_CD like /*pmb.deliveryCourseCd*/'a123%'
        /*END*/
 	    /*IF pmb.invoiceCreateFlg != null*/
         AND TPR.INVOICE_CREATE_FLG = /*pmb.invoiceCreateFlg*/'1'
        /*END*/
 	    /*IF pmb.emergencyFlg != null*/
         AND TSIH.EMERGENCY_FLG = /*pmb.emergencyFlg*/'1'
        /*END*/
-- [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana Start
         AND (
           MDC.CARRIER_SLIP_YMT_ID IS NOT NULL
           OR MDC.CARRIER_SLIP_SGW_ID IS NOT NULL
           OR MDC.CARRIER_SLIP_YUPK_ID IS NOT NULL
         )
-- [EC-CT1-124] EC送り状データ出力にあわせて変更 2015.03.18 kawana End

GROUP BY
 -- [検査-160] ソート順変更 2014.12.04 yokosuka Start
   TPH.CLIENT_ID
  ,TPH.CENTER_ID
  ,MCL.CLIENT_CD
  ,TCC.CENTER_CD
  ,TPH.PICKING_WORK_NO
-- ORDER BY
--   MCL.CLIENT_CD
--  ,TCC.CENTER_CD
--  ,TSIH.SHIPPING_DT
--  ,MDC.DELIVERY_COURSE_CD
--  ,TAIH.DELIV_CUSTOMER_CD
--  ,TPH.PICKING_WORK_NO
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto Start
/*IF pmb.isPaging()*/
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto End
ORDER BY
   MCL.CLIENT_CD
  ,TCC.CENTER_CD
  ,SHIPPING_DT
  ,DELIVERY_COURSE_CD
  ,DELIV_CUSTOMER_CD
  ,PICKING_WORK_NO
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto Start
/*END*/
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto End
 -- [検査-160] ソート順変更 2014.12.04 yokosuka End
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto Start
/*IF pmb.isPaging()*/
-- ELSE ) CNT
/*END*/
-- [ON推-品向-505] ページング機能追加対応 2015.01.07 ko-yamamoto End

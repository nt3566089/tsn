/*
 [df:title]
 Bill of Lading発行画面　出庫作業№単位で1行です。

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##String BOL_OUT_NM##

-- !df:pmb extends Paging!
-- !!AutoDetect!!
/*IF pmb.isPaging() == false*/
/*SELECT COUNT(*) FROM (*/
/*END*/
SELECT PIH.PICKING_H_ID                                                        -- 出庫ヘッダID
      ,PIH.BOL_NO                                                              -- Bill of Lading No
      ,PIH.PICKING_WORK_NO                                                     -- 出庫作業No.
      ,AIH.SHIPPING_DT                                                         -- 出荷日
      ,MCR.CARRIER_CD                                                          -- 運送業者CD
      ,MCR.CARRIER_NM                                                          -- 運送業者名称
      ,MDC.DELIVERY_COURSE_CD                                                  -- 配送コースCD
      ,MDC.DELIVERY_COURSE_NM                                                  -- 配送コース名称
      ,AIH.SUPPLY_CUSTOMER_CD                                                  -- 納品先CD
      ,AIH.SUPPLY_CUSTOMER_NM                                                  -- 納品先名称
      ,AIH.DELIV_CUSTOMER_CD                                                   -- 届先CD
      ,AIH.DELIV_CUSTOMER_NM                                                   -- 届先名称
      ,AIH.DELIV_ADDRESS1                                                      -- 届先住所１
      ,AIH.DELIV_ADDRESS2                                                      -- 届先住所２
      ,AIH.DELIV_ADDRESS3                                                      -- 届先住所３
      ,AIH.DELIV_ZIP_CD                                                        -- 届先郵便番号
      ,PAH.CARRIER_TRACE_NUM                                                   -- 貨物追跡番号
      ,PIR.BOL_OUT_FLG                                                         -- // cls(BolOutFlg) Bill of lading発行フラグ
      ,NULL AS BOL_OUT_NM                                                      -- Bill of lading発行フラグ名称
      ,PIR.BOL_OUT_DT                                                          -- Bill of lading発行時間
      ,BU.USER_NM                                                             -- Bill of lading発行者名称
  FROM T_ALLOC_INST_H AIH  -- 引当指示ヘッダ
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
   LEFT JOIN M_DELIVERY_COURSE MDC  -- 配送コースマスタ
    ON AIH.DELIVERY_COURSE_ID = MDC.DELIVERY_COURSE_ID
    AND MDC.DEL_FLG = '0'
   LEFT JOIN M_CARRIER MCR  -- 運送業者マスタ
    ON MDC.CARRIER_ID = MCR.CARRIER_ID
    AND MCR.DEL_FLG = '0'
   LEFT JOIN M_COMMON_CARRIER MCC  -- 共通運送業者マスタ
    ON MCR.COMMON_CARRIER_ID = MCC.COMMON_CARRIER_ID
    AND MCR.DEL_FLG = '0'
   LEFT JOIN (SELECT PAH.ALLOC_INST_H_ID
                   ,MAX(PAH.CARRIER_TRACE_NUM) AS CARRIER_TRACE_NUM -- 貨物追跡番号
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
                 /*IF pmb.dtFrom != null*/
                 AND AIH.SHIPPING_DT >= /*pmb.dtFrom*/'20140805'
                 /*END*/
                 /*IF pmb.dtTo != null*/
                 AND AIH.SHIPPING_DT <= /*pmb.dtTo*/'20141105'
                 /*END*/
                 /*IF pmb.supplyCustomerCd != null*/
                 AND AIH.SUPPLY_CUSTOMER_CD Like /*pmb.supplyCustomerCd*/'a123%'
                 /*END*/
               GROUP BY PAH.ALLOC_INST_H_ID
            ) PAH
    ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
  LEFT JOIN B_USER BU
    ON PIR.BOL_OUT_USER_ID = BU.USER_ID
   AND BU.DEL_FLG = '0'
  WHERE AIH.DEL_FLG = '0'
    AND PIH.PICKING_STATUS = '50'
    /*IF pmb.centerId != null*/
    AND AIH.CENTER_ID = /*pmb.centerId*/11111111111
    /*END*/
    /*IF pmb.clientId != null*/
    AND AIH.CLIENT_ID = /*pmb.clientId*/11111111111
    /*END*/
    /*IF pmb.dtFrom != null*/
    AND AIH.SHIPPING_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null*/
    AND AIH.SHIPPING_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.supplyCustomerCd != null*/
    AND AIH.SUPPLY_CUSTOMER_CD Like /*pmb.supplyCustomerCd*/'a123%'
    /*END*/
    /*IF pmb.pickingWorkNo != null*/
    AND PIH.PICKING_WORK_NO like /*pmb.pickingWorkNo*/'%a123'
    /*END*/
    /*IF pmb.bolNo != null*/
    AND PIH.BOL_NO Like /*pmb.bolNo*/'a123%'
    /*END*/
    /*IF pmb.bolOutputTargetFlg == '1'*/
    AND MCC.BOL_OUTPUT_TARGET_FLG = /*pmb.bolOutputTargetFlg*/'1'
    /*END*/
    /*IF pmb.bolOutputTargetFlg == '0'*/
    AND (MCC.BOL_OUTPUT_TARGET_FLG is null OR MCC.BOL_OUTPUT_TARGET_FLG = '0')
    /*END*/
    /*IF pmb.carrierCd != null*/
    AND MCR.CARRIER_CD = /*pmb.carrierCd*/'1'
    /*END*/
    /*IF pmb.deliveryCourseCd != null*/
    AND MDC.DELIVERY_COURSE_CD Like /*pmb.deliveryCourseCd*/'a123%'
    /*END*/
    /*IF pmb.bolOutFlg == '1'*/
    AND PIR.BOL_OUT_FLG = /*pmb.bolOutFlg*/'1'
    /*END*/
    /*IF pmb.bolOutFlg == '0'*/
    AND (PIR.BOL_OUT_FLG is null OR PIR.BOL_OUT_FLG = '0')
    /*END*/
/*IF pmb.isPaging()*/
  ORDER BY
   PIH.BOL_NO
   ,PIH.PICKING_WORK_NO
   ,AIH.SHIPPING_DT
   ,MCC.CARRIER_CD
   ,MDC.DELIVERY_COURSE_CD
   ,AIH.SUPPLY_CUSTOMER_CD
   ,AIH.DELIV_CUSTOMER_CD
   ,PIR.BOL_OUT_FLG
   ,PIR.BOL_OUT_DT
   ,PIR.BOL_OUT_USER_ID
-- ELSE ) CNT
/*END*/

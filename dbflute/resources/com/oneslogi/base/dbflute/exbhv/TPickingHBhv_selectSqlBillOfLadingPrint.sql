/*
 [df:title]
  Bill of Ladingを取得します。

 [df:description]
  SQL Description here.
*/

-- #df:entity#
-- ##Long PICKING_H_ID##
-- ##Long PKGS##

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
SELECT
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
       MAX(TPH.PICKING_H_ID) AS PICKING_H_ID
      ,MAX(TPH.PICKING_WORK_NO) AS PICKING_WORK_NO
      ,MAX(TAIH.SHIPPING_DT) AS SHIPPING_DT
      ,MAX(MC.CLIENT_NM) AS CLIENT_NM
      ,MAX(MCRMCC.ADDRESS1) AS ADDRESS1
      ,CONCAT(MAX(MZ.ADDRESS2), CONCAT(', ', CONCAT(MAX(MZ.ADDRESS1), CONCAT(' ', MAX(TAIH.DELIV_ZIP_CD))))) AS ZIP_CD_FROM
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
      ,TPH.BOL_NO AS BOL_NO
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      ,MAX(TAIH.DELIV_CUSTOMER_NM) AS DELIV_CUSTOMER_NM
      ,MAX(TAIH.DELIV_ADDRESS1) AS DELIV_ADDRESS1
      ,CONCAT(MAX(MZH.ADDRESS2), CONCAT(', ', CONCAT(MAX(MZH.ADDRESS1), CONCAT(' ', MAX(TAIH.DELIV_ZIP_CD))))) AS ZIP_CD_TO
      ,MAX(MCR.CARRIER_NM) AS CARRIER_NM
      ,MAX(MCR.CARRIER_CD) AS CARRIER_CD
      ,MAX(TPAH.CARRIER_TRACE_NUM) AS CARRIER_TRACE_NUM
      ,MAX(MDC.PAYMENT_TERM) AS PAYMENT_TERM
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
      ,TSIH.CLIENT_SHIPPING_NO AS CLIENT_SHIPPING_NO
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      ,MAX(TPAH.PKGS) AS PKGS
      ,MAX(TPAH.GROSS_WEIGHT) AS WEIGHT
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
     FROM
       T_PICKING_H TPH                                 -- 出庫ヘッダ
       LEFT JOIN T_ALLOC_INST_H TAIH                   -- 引当指示ヘッダ
         ON TPH.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
        AND TAIH.DEL_FLG = '0'
       LEFT JOIN M_CLIENT MC                           -- 荷主マスタ
         ON TPH.CLIENT_ID = MC.CLIENT_ID
        AND MC.DEL_FLG = '0'
       LEFT JOIN M_CENTER MR                           -- センタマスタ
         ON TPH.CENTER_ID = MR.CENTER_ID
        AND MR.DEL_FLG = '0'
       LEFT JOIN M_CLIENT_CENTER MCC                   -- 荷主センタマスタ
         ON MC.CLIENT_ID = MCC.CLIENT_ID
        AND MR.CENTER_ID = MCC.CENTER_ID
        AND MCC.DEL_FLG = '0'
       LEFT JOIN M_CUSTOMER MCRMCC                     -- 取引先マスタ
         ON MCC.CUSTOMER_ID = MCRMCC.CUSTOMER_ID
        AND MCRMCC.DEL_FLG = '0'
       LEFT JOIN M_ZIP MZ                              -- 郵便番号マスタ
         ON MCRMCC.ZIP_CD = MZ.ZIP_CD
        AND MZ.DEL_FLG = '0'
       LEFT JOIN M_ZIP MZH                             -- 郵便番号マスタ
         ON TAIH.DELIV_ZIP_CD = MZH.ZIP_CD
        AND MZH.DEL_FLG = '0'
       LEFT JOIN M_DELIVERY_COURSE MDC                 -- 配送コースマスタ
         ON TAIH.DELIVERY_COURSE_ID = MDC.DELIVERY_COURSE_ID
        AND MDC.DEL_FLG = '0'
       LEFT JOIN M_CARRIER MCR                         -- 運送業者マスタ
         ON MDC.CARRIER_ID = MCR.CARRIER_ID
        AND MCR.DEL_FLG = '0'
       LEFT JOIN M_COMMON_CARRIER MCCA                 -- 共通運送業者マスタ
         ON MCR.COMMON_CARRIER_ID = MCCA.COMMON_CARRIER_ID
        AND MCCA.DEL_FLG = '0'
       LEFT JOIN T_SHIPPING_INST_H TSIH                -- 出荷指示ヘッダ
         ON TAIH.ALLOC_INST_H_ID = TSIH.ALLOC_INST_H_ID
        AND TSIH.DEL_FLG = '0'
       LEFT JOIN (
                  SELECT PICKING_H_ID
                        ,ALLOC_INST_H_ID
                        ,MIN(CARRIER_TRACE_NUM) AS CARRIER_TRACE_NUM
                        ,COUNT(SHIPPING_PACKING_NO) AS PKGS
                        ,SUM(GROSS_WEIGHT) AS GROSS_WEIGHT
                    FROM T_PACKING_H
                   WHERE DEL_FLG = '0'
                   GROUP BY PICKING_H_ID,
                            ALLOC_INST_H_ID
                  )  TPAH                     -- 梱包ヘッダ
         ON TPH.PICKING_H_ID = TPAH.PICKING_H_ID
        AND TAIH.ALLOC_INST_H_ID = TPAH.ALLOC_INST_H_ID
       LEFT JOIN T_PICKING_R TPR                       -- 出庫帳票
         ON TPH.PICKING_H_ID = TPR.PICKING_H_ID
         AND TPR.DEL_FLG = '0'
       LEFT JOIN T_ALLOC_INST_B TAIB                   -- 引当指示ボディ
         ON TAIH.ALLOC_INST_H_ID = TAIB.ALLOC_INST_H_ID
         AND TAIB.DEL_FLG = '0'
       LEFT JOIN M_PRODUCT MP
         ON TAIB.PRODUCT_ID = MP.PRODUCT_ID
         AND MP.DEL_FLG = '0'
     WHERE
       TPH.DEL_FLG = '0'
       AND TPH.PICKING_STATUS = '50'
       /*IF pmb.controlNo != null*/
       AND TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
       /*END*/
     GROUP BY
         TPH.BOL_NO
       , TSIH.CLIENT_SHIPPING_NO
/*END*/
/*IF pmb.isPaging()*/
     ORDER BY
         TPH.BOL_NO ASC
       , TSIH.CLIENT_SHIPPING_NO ASC
       -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
       , MAX(MP.PRODUCT_CD) ASC
       -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
/*END*/

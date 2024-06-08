/*
 [df:title]
 ShipmentRequestHeaderデータを取得します。出庫作業No.単位でグルーピングする。

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##Long COMP_ID##
-- ##Long DELIVERY_COURSE_ID##

-- !df:pmb extends Paging!
-- !!AutoDetect!!


/*IF pmb.pickingWorkNo != null*/
SELECT PIH.CLIENT_ID                                                                      -- 荷主ID
      ,MIN(MCL.CLIENT_CD) AS  CLIENT_CD                                                   -- 荷主CD
      ,PIH.CENTER_ID                                                                      -- センタID
      ,MIN(MCT.CENTER_CD) AS  CENTER_CD                                                   -- センタCD
	  ,MIN(WAR.WAREHOUSE_CD) AS WAREHOUSE_ID                                              -- 指定倉庫ID
	  ,MIN(PAH.CLIENT_ID) AS  COMP_ID                                                     -- 荷主ID
      ,MIN(MCL.CLIENT_CD) AS  COMP_CD                                                     -- 荷主CD
      ,MIN(TAIH.DELIVERY_COURSE_ID) AS DELIVERY_COURSE_ID                                 -- 配送コードID
      ,MIN(MDC.DELIVERY_COURSE_CD) AS DELIVERY_COURSE_CD                                  -- 配送コードCD

      ,PIH.PICKING_WORK_NO                                                                -- 出庫作業No.
      ,MIN(TSIH.SHIPPING_SLIP_NO) SHIPPING_SLIP_NO                                        -- WMS出荷伝票No.
      ,MIN(TSIH.CLIENT_SHIPPING_NO) AS CLIENT_SHIPPING_NO                                 -- 顧客出荷指示No.
      ,MIN(TAIH.DELIV_CUSTOMER_CD) AS DELIV_CUMISTOMER_CD                                 -- 届先CD
      ,MIN(TAIH.DELIV_CUSTOMER_NM) AS DELIV_CUSTOMER_NM                                  -- 届先名称
      ,MIN(TAIH.DELIV_ADDRESS_SUPPLY) AS DELIV_ADDRESS_SUPPLY                            -- 届先住所補足
      ,MIN(TAIH.DELIV_ADDRESS1) AS DELIV_ADDRESS1                                         -- 届先住所1
      ,MIN(TAIH.DELIV_ADDRESS2) AS DELIV_ADDRESS2                                         -- 届先住所2
      ,MIN(TAIH.DELIV_ADDRESS3) AS DELIV_ADDRESS3                                         -- 届先住所3
      ,MIN(ZIP.ADDRESS2) AS SHP_TO_CITY                                                   -- 市区町村
      ,MIN(ZIP.ADDRESS1) AS SHP_TO_STATE                                                  -- 都道府県
      ,MIN(TAIH.DELIV_ZIP_CD) AS DELIV_ZIP_CD                                             -- 届先郵便番号
      ,MIN(ZIP.PUBLIC_CD) AS PUBLIC_CD                                                    -- 全国地方公共団体コード
      ,MIN(TAIH.DELIV_TEL_NO) AS DELIV_TEL_NO                                             -- 届先電話番号
      ,MIN(MDC.PAYMENT_TERM) AS PAYMENT_TERM                                              -- Payment Term（支払条件）
      ,MIN(CES.COLLECT_ACCOUNT_NO_BILL_TO) AS COLLECT_ACCOUNT_NO_BILL_TO                  -- Collect Account# (Bill To)
      ,MIN(CES.COLLECT_ZIP_CD_BILL_TO) AS COLLECT_ZIP_CD_BILL_TO                          -- Collect Zip Code (Bill To)
      ,MIN(CES.COLLECT_COUNTRY_CD_BILL_TO) AS COLLECT_COUNTRY_CD_BILL_TO                  -- Collect Country Code (Bill To)
      ,MIN(CES.PAYMENT_TERM_CD_TAXES_TO) AS PAYMENT_TERM_CD_TAXES_TO                      -- Payment Term Code (Taxes To)
      ,MIN(CES.COLLECT_ACCOUNT_NO_TAXES_TO) AS COLLECT_ACCOUNT_NO_TAXES_TO                -- Collect Account# (Taxes To)
      ,MIN(CES.COLLECT_ZIP_CD_TAXES_TO) AS COLLECT_ZIP_CD_TAXES_TO                        -- Collect Zip Code (Taxes To)
      ,MIN(CES.COLLECT_COUNTRY_CD_TAXES_TO) AS COLLECT_COUNTRY_CD_TAXES_TO                -- Collect Country Code (Taxes To)
      ,MIN(CES.COD_PAYMENT_TERM_CD) AS COD_PAYMENT_TERM_CD                                -- COD Payment Term Code
      ,SUM(TSIH.TOTAL_PRICE) AS COD_AMOUNT                                                -- COD Amount
      ,MIN(CES.COD_FEE_PAYER) AS COD_FEE_PAYER                                            -- COD Fee Payer
      ,MIN(CES.TERMS_OF_SALES) AS TERMS_OF_SALES                                          -- Terms of Sales
      ,MIN(CES.BROKER_NAME) AS BROKER_NAME                                                -- Broker Name
      ,MIN(CES.BROKER_PHONE_NO) AS BROKER_PHONE_NO                                        -- Broker Phone#
      ,MIN(CES.BROKER_FAX_NO) AS BROKER_FAX_NO                                            -- Broker Fax#
      ,MIN(CES.SAT_DELIVERY_FLG) AS SAT_DELIVERY_FLG                                      -- Saturday Delivery Flag
      ,MIN(CES.RESIDENTIAL_DELIVERY_FLG) AS RESIDENTIAL_DELIVERY_FLG                      -- Residential Delivery Flag
      ,MIN(CES.COD_FLG) AS COD_FLG                                                        -- Collect On Delivery Flag
      ,MIN(CES.SIGNATURE_REQUIRED_FLG) AS SIGNATURE_REQUIRED_FLG                          -- Signature Required Flag
      ,MIN(CES.SIGNATURE_RELEASE_FLG) AS SIGNATURE_RELEASE_FLG                            -- Signature Release Flag
      ,MIN(CES.CALL_BEFORE_DELIVERY_FLG) AS CALL_BEFORE_DELIVERY_FLG                      -- Call Before Delivery Flag
      ,MIN(CES.FREEZABLE_PROTECTION_FLG) AS FREEZABLE_PROTECTION_FLG                      -- Freezable Protection Flag
      ,MIN(CES.GUARANTEED_PLUS_FLG) AS GUARANTEED_PLUS_FLG                                -- Guaranteed Plus Flag
      ,MIN(CES.RESIDENTIAL_PICKUP_FLG) AS RESIDENTIAL_PICKUP_FLG                          -- Residential Pickup Flag
      ,MIN(CES.DO_NOT_STACK_STACK_FLG) AS DO_NOT_STACK_STACK_FLG                          -- Do Not Stack Pallets Flag
      ,MIN(CES.LIMITED_ACCESS_DELIVERY_FLG) AS LIMITED_ACCESS_DELIVERY_FLG                -- Limited Access Delivery Flag
      ,MIN(CES.LIMITED_ACCESS_PICKUP_FLG) AS LIMITED_ACCESS_PICKUP_FLG                    -- Limited Access Pickup Flag
      ,MIN(CES.OVER_SIZED_FLG) AS OVER_SIZED_FLG                                          -- Over-Sized/Extreme Length Flag
      ,MIN(CES.POISON_FLG) AS POISON_FLG                                                  -- Poison Flag
      ,MIN(CES.FOOG_FLG) AS FOOG_FLG                                                      -- Food Flag
      ,MIN(CES.LIFTGATE_DELIVERY_PREPAID_FLG) AS LIFTGATE_DELIVERY_PREPAID_FLG            -- Liftgate at delivery Flag (Prepaid)
      ,MIN(CES.LIFTGATE_DELIVERY_COLLECT_FLG) AS LIFTGATE_DELIVERY_COLLECT_FLG            -- Liftgate at delivery Flag (Collect)
      ,MIN(CES.LIFTGATE_PICKUP_PREPAID_FLG) AS LIFTGATE_PICKUP_PREPAID_FLG                -- Liftgate at pickup Flag (Prepaid)
      ,MIN(CES.LIFTGATE_PICKUP_COLLECT_FLG) AS LIFTGATE_PICKUP_COLLECT_FLG                -- Liftgate at pickup Flag (Collect)
      ,MIN(CES.INSIDE_DELIVERY_PREPAID_FLG) AS INSIDE_DELIVERY_PREPAID_FLG                -- Inside Delivery Flag (Prepaid)
      ,MIN(CES.INSIDE_DELIVERY_COLLECT_FLG) AS INSIDE_DELIVERY_COLLECT_FLG                -- Inside Delivery Flag (Collect)
      ,MIN(CES.INSIDE_PICKUP_PREPAID_FLG) AS INSIDE_PICKUP_PREPAID_FLG                    -- Inside Pickup Flag (Prepaid)
      ,MIN(CES.INSIDE_PICKUP_COLLECT_FLG) AS INSIDE_PICKUP_COLLECT_FLG                    -- Inside Pickup Flag (Collect)
  FROM T_PICKING_H PIH  -- 出庫ヘッダ
  INNER JOIN T_PACKING_H PAH  -- 梱包ヘッダ
    ON PIH.PICKING_H_ID = PAH.PICKING_H_ID
    AND PIH.CLIENT_ID = PAH.CLIENT_ID
    AND PIH.CENTER_ID = PAH.CENTER_ID
    AND PAH.DEL_FLG = '0'
  INNER JOIN M_CLIENT MCL  -- 荷主マスタ
    ON PIH.CLIENT_ID = MCL.CLIENT_ID
    AND MCL.DEL_FLG = '0'
  INNER JOIN M_CENTER MCT  -- センタマスタ
    ON PIH.CENTER_ID = MCT.CENTER_ID
    AND MCT.DEL_FLG = '0'
  INNER JOIN T_ALLOC_INST_H TAIH  -- 引当指示ヘッダ
    ON PIH.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
    AND TAIH.DEL_FLG = '0'
  INNER JOIN T_ALLOC_INST_B TAIB  -- 引当指示ボディ
    ON TAIH.ALLOC_INST_H_ID = TAIB.ALLOC_INST_H_ID
    AND TAIB.DEL_FLG = '0'
  INNER JOIN T_SHIPPING_INST_H TSIH  -- 出荷指示ヘッダ
    ON TAIH.ALLOC_INST_H_ID = TSIH.ALLOC_INST_H_ID
    AND TSIH.DEL_FLG = '0'
  LEFT JOIN M_DELIVERY_COURSE MDC  -- 配送コースマスタ
    ON TAIH.DELIVERY_COURSE_ID = MDC.DELIVERY_COURSE_ID
    AND MDC.DEL_FLG = '0'
  LEFT JOIN M_ZIP  ZIP-- 郵便番号マスタ
    ON   TAIH.DELIV_ZIP_CD = ZIP.ZIP_CD
    AND ZIP.DEL_FLG = '0'
  LEFT JOIN M_CARRIER_SLIP_CES CES  -- キャリアEDIシステム送り状マスタ
    ON TAIH.SUPPLY_CUSTOMER_ID = CES.CUSTOMER_ID
    AND CES.DEL_FLG = '0'
  LEFT JOIN M_WAREHOUSE WAR
    ON TAIB.WAREHOUSE_ID = WAR.WAREHOUSE_ID
    AND WAR.CENTER_ID = PAH.CENTER_ID
    AND WAR.DEL_FLG = '0'
  WHERE PIH.DEL_FLG = '0'
    /*IF pmb.centerId != null*/
    AND PIH.CENTER_ID = /*pmb.centerId*/11111111111
    /*END*/
    /*IF pmb.clientId != null*/
    AND PIH.CLIENT_ID = /*pmb.clientId*/11111111111
    /*END*/
    /*IF pmb.pickingWorkNo != null*/
    AND (PIH.PICKING_WORK_NO = /*pmb.pickingWorkNo*/'0125'
        OR PAH.SHIPPING_PACKING_NO = /*pmb.pickingWorkNo*/'0125')
    /*END*/
  GROUP BY
    PIH.CLIENT_ID
   ,PIH.CENTER_ID
   ,PIH.PICKING_WORK_NO

/*END*/

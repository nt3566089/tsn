/*
 [df:title]
 ShipmentRequestPackageデータを取得します。出荷梱包No.単位でグルーピングする。

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##Long COMP_ID##

-- !df:pmb extends Paging!
-- !!AutoDetect!!


/*IF pmb.pickingWorkNo != null*/
SELECT PAH.CLIENT_ID                                                                      -- 荷主ID
      ,MIN(MCL.CLIENT_CD) AS  CLIENT_CD                                                   -- 荷主CD
      ,PAH.CENTER_ID                                                                      -- センタID
      ,MIN(MCT.CENTER_CD) AS  CENTER_CD                                                   -- センタCD
	  ,MIN(WAR.WAREHOUSE_CD) AS WAREHOUSE_ID                                             -- 指定倉庫ID
	  ,MIN(PAH.BOX_ID) AS  COMP_ID                                                        -- 荷材ID
      ,MIN(BOX.BOX_CD) AS  COMP_CD                                                        -- 荷材CD
      ,MIN(PRT.PRODUCT_ABBR) AS PRODUCT_ABBR                                              -- 商品略称
      ,MIN(PAH.GROSS_WEIGHT) AS GROSS_WEIGHT                                              -- 配送コードCD
      ,MIN(BOX.LENGTH) AS LENGTH                                                          -- 縦(mm)
      ,MIN(BOX.WIDTH) AS WIDTH                                                            -- 横(mm)
      ,MIN(BOX.HEIGHT) AS HEIGHT                                                          -- 高さ(mm)
      ,MIN(PRT.NMFC_CODE) AS NMFC_CODE                                                    -- NMFC Code
      ,MIN(DICT.DICT_NM) AS FREIGHT_CLS                                                   -- Freight Class
      ,PAH.SHIPPING_PACKING_NO                                                            -- 出荷梱包No
      ,MIN(TSIH.CLIENT_SHIPPING_NO) AS CLIENT_SHIPPING_NO                                 -- 顧客出荷指示No.

  FROM T_PICKING_H PIH  -- 出庫ヘッダ
  INNER JOIN (
              SELECT PICKING_H_ID
                    ,SHIPPING_PACKING_NO
					,CLIENT_ID
					,CENTER_ID
					,BOX_ID
                    ,MIN(CARRIER_TRACE_NUM) AS CARRIER_TRACE_NUM
                    ,COUNT(SHIPPING_PACKING_NO) AS PKGS
                    ,SUM(GROSS_WEIGHT) AS GROSS_WEIGHT
                FROM T_PACKING_H    -- 梱包ヘッダ
                WHERE DEL_FLG = '0'
                GROUP BY PICKING_H_ID
                      ,SHIPPING_PACKING_NO
					  ,CLIENT_ID
					  ,CENTER_ID
					  ,BOX_ID
                  )  PAH
         ON PIH.PICKING_H_ID = PAH.PICKING_H_ID
         AND PIH.CLIENT_ID = PAH.CLIENT_ID
		 AND PIH.CENTER_ID = PAH.CENTER_ID
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
  LEFT JOIN M_PRODUCT PRT  -- 商品マスタ
    ON TAIB.PRODUCT_ID = PRT.PRODUCT_ID
    AND PRT.DEL_FLG = '0'
  LEFT JOIN M_BOX BOX-- 荷材マスタ
    ON   PAH.BOX_ID = BOX.BOX_ID
    AND BOX.DEL_FLG = '0'
  LEFT JOIN M_WAREHOUSE WAR
    ON TAIB.WAREHOUSE_ID = WAR.WAREHOUSE_ID
    AND WAR.CENTER_ID = PAH.CENTER_ID
    AND WAR.DEL_FLG = '0'
  LEFT JOIN b_class BCS
    ON BCS.CLASS_CD='FREIGHT_CLS'
	AND BCS.DEL_FLG = '0'
  LEFT JOIN b_class_dtl BCD
    ON BCD.CLASS_ID = BCS.CLASS_ID
	AND BCD.CLASS_DTL_CD = PRT.FREIGHT_CLS
	AND BCD.DEL_FLG = '0'
  LEFT JOIN b_dict DICT
    ON DICT.DICT_ID = BCD.DICT_ID
	AND DICT.DEL_FLG = '0'
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
    PAH.CLIENT_ID
   ,PAH.CENTER_ID
   ,PAH.SHIPPING_PACKING_NO

/*END*/

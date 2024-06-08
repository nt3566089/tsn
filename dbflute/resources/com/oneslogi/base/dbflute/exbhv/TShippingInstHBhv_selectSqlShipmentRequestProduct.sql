/*
 [df:title]
 ShipmentRequestProductデータを取得します。商品コード単位でグルーピングする。

 [df:description]
  SQL Description here.

*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!


/*IF pmb.pickingWorkNo != null*/
SELECT PIH.CLIENT_ID                                                                      -- 荷主ID
      ,MIN(MCL.CLIENT_CD) AS  CLIENT_CD                                                   -- 荷主CD
      ,PIH.CENTER_ID                                                                      -- センタID
      ,MIN(MCT.CENTER_CD) AS  CENTER_CD                                                   -- センタCD
	  ,MIN(WAR.WAREHOUSE_CD) AS WAREHOUSE_ID                                              -- 指定倉庫ID
      ,MIN(PRT.PRODUCT_ABBR) AS PRODUCT_ABBR                                              -- 商品略称
      ,MIN(PRT.PRODUCT_NM) AS PRODUCT_NM                                                  -- 商品名称
      ,MIN(PRT.COUNNTRY_OF_ORIGIN) AS COUNNTRY_OF_ORIGIN                                  -- Country of Origin
      ,MIN(PRT.UNIT_VAL) AS UNIT_VAL                                                      -- Unit Value
      ,SUM(PAH.PACKING_NUM) AS PACKING_NUM                                                -- 梱包数
      ,MIN(PRT.HTS_CD) AS HTS_CD                                                          -- Harmonized Code
      ,PRT.PRODUCT_CD                                                                     -- 商品CD
  FROM T_PICKING_H PIH  -- 出庫ヘッダ
  INNER JOIN (
              SELECT H.PICKING_H_ID
                    ,H.SHIPPING_PACKING_NO
					,H.CLIENT_ID
					,H.CENTER_ID
					,AB.PRODUCT_ID
                    ,SUM(PACKING_NUM) AS PACKING_NUM
                FROM T_PACKING_H H   -- 梱包ヘッダ
                INNER JOIN T_PACKING_B B  -- 梱包ボディ
                 ON H.PACKING_H_ID = B.PACKING_H_ID
                 AND B.DEL_FLG = '0'
                INNER JOIN T_ALLOC_INST_H AH
                 ON H.ALLOC_INST_H_ID = AH.ALLOC_INST_H_ID
                 AND AH.DEL_FLG = '0'
                INNER JOIN T_ALLOC_INST_B AB
                  ON AH.ALLOC_INST_H_ID = AB.ALLOC_INST_H_ID
                 AND B.ALLOC_INST_B_ID = AB.ALLOC_INST_B_ID
                 AND AB.DEL_FLG = '0'
                WHERE H.DEL_FLG = '0'
                GROUP BY H.PICKING_H_ID
                      ,H.SHIPPING_PACKING_NO
					  ,H.CLIENT_ID
					  ,H.CENTER_ID
					  ,AB.PRODUCT_ID
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
  INNER JOIN T_ALLOC_INST_B TAIB  -- 引当指示ボディ
    ON PIH.ALLOC_INST_H_ID = TAIB.ALLOC_INST_H_ID
    AND PAH.PRODUCT_ID = TAIB.PRODUCT_ID
    AND TAIB.DEL_FLG = '0'
  LEFT JOIN M_PRODUCT PRT  -- 商品マスタ
    ON TAIB.PRODUCT_ID = PRT.PRODUCT_ID
    AND PRT.DEL_FLG = '0'
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
   ,PRT.PRODUCT_CD

/*END*/

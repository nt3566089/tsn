/*
 [df:title]
  SQL title here.

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##Long VERSION_NO##
-- ##Long COUNT##
-- [Ver3.0] unit of measure対応 2017.11.22 ライ Start --
-- *M_PRODUCT.PRODUCT_ID*
-- [Ver3.0] unit of measure対応 2017.11.22 ライ End --
-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
SELECT TPH.PACKING_H_ID
-- 荷主センタ変更対応 2017.03.28 hdis Start
	  ,TPH.CENTER_ID
      ,MAX(MC.CENTER_CD) AS CENTER_CD
      ,MAX(MC.CENTER_NM) AS CENTER_NM
	  ,TPH.CLIENT_ID
      ,MAX(MCL.CLIENT_CD) AS CLIENT_CD
      ,MAX(MCL.CLIENT_NM) AS CLIENT_NM
-- 荷主センタ変更対応 2017.03.28 hdis End
      ,MAX(MB.BOX_CD) AS BOX_CD
	  ,MAX(MB.BOX_NM) AS BOX_NM
      ,MP.PRODUCT_CD
	  ,MAX(MP.JAN_CD) AS JAN_CD
	  ,MAX(MP.PRODUCT_NM) AS PRODUCT_NM
	  -- [Ver3.0] unit of measure対応 2017.11.22 ライ Start
	  ,MP.PRODUCT_ID
	  -- [Ver3.0] unit of measure対応 2017.11.22 ライ END
	  ,MAX(MP.PRODUCT_ABBR) AS PRODUCT_ABBR
	  ,SUM(TPB.PACKING_NUM) AS PACKING_NUM_SUM
	  ,MAX(TAH.DELIV_DT) AS DELIV_DT
	  ,MAX(TAH.DELIV_TZ) AS DELIV_TZ
	  ,MAX(TAH.DELIV_ZIP_CD) AS DELIV_ZIP_CD
	  -- 個人情報暗号化対応 2016.09.01 kawana Start
	  --,MAX(f_decrypt(TAH.DELIV_TEL_NO)) AS DELIV_TEL_NO
	  --,MAX(f_decrypt(TAH.DELIV_ADDRESS1)) AS DELIV_ADDRESS1
	  --,MAX(f_decrypt(TAH.DELIV_ADDRESS2)) AS DELIV_ADDRESS2
	  --,MAX(f_decrypt(TAH.DELIV_ADDRESS3)) AS DELIV_ADDRESS3
	  --,MAX(f_decrypt(TAH.DELIV_CUSTOMER_NM)) AS DELIV_CUSTOMER_NM
	  ,MAX(TAH.DELIV_TEL_NO) AS DELIV_TEL_NO
	  ,MAX(TAH.DELIV_ADDRESS1) AS DELIV_ADDRESS1
	  ,MAX(TAH.DELIV_ADDRESS2) AS DELIV_ADDRESS2
	  ,MAX(TAH.DELIV_ADDRESS3) AS DELIV_ADDRESS3
	  ,MAX(TAH.DELIV_CUSTOMER_NM) AS DELIV_CUSTOMER_NM
	  -- 個人情報暗号化対応 2016.09.01 kawana End
	  ,MAX(TAH.VERSION_NO) AS VERSION_NO
	  ,TPH.PROCESS_TYPE_ID
      -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
	  ,TPH.ALLOC_INST_H_ID
	  ,TPH.PICKING_H_ID
      -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
	  ,MAX(TPH.SHIPPING_PACKING_NO) AS SHIPPING_PACKING_NO
	  ,MAX(TPH.CARRIER_TRACE_NUM) AS CARRIER_TRACE_NUM
      ,(SELECT SUM(TB.PICKING_NUM)
          FROM T_PICKING_B TB
		      ,T_ALLOC_INST_B TAIB
         -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
		 WHERE TB.PICKING_H_ID = TPH.PICKING_H_ID
		   AND TB.ALLOC_INST_B_ID = TAIB.ALLOC_INST_B_ID
		   AND TAIB.PRODUCT_ID = MP.PRODUCT_ID) AS PICKING_NUM_SUM
         -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
	  ,(SELECT MAX(TSIH.UPD_DT)
	      FROM T_SHIPPING_INST_H TSIH
	     WHERE TPH.ALLOC_INST_H_ID = TSIH.ALLOC_INST_H_ID
		   AND TSIH.DEL_FLG = '0') AS UPD_DT
      ,(SELECT COUNT(TSIH.SHIPPING_INST_H_ID)
	      FROM T_SHIPPING_INST_H TSIH
	     WHERE TPH.ALLOC_INST_H_ID = TSIH.ALLOC_INST_H_ID
		   AND TSIH.DEL_FLG = '0') AS COUNT
-- ELSE SELECT COUNT(TPH.PACKING_H_ID)
/*END*/
  FROM T_PACKING_H TPH
    INNER JOIN T_PACKING_B TPB
            ON TPH.PACKING_H_ID = TPB.PACKING_H_ID
	       AND TPB.DEL_FLG = '0'
     LEFT JOIN T_PICKING_H TH
            ON TPH.PICKING_H_ID = TH.PICKING_H_ID
	       AND TH.DEL_FLG  = '0'
     LEFT JOIN T_ALLOC_INST_H TAH
            ON TPH.ALLOC_INST_H_ID = TAH.ALLOC_INST_H_ID
	       AND TAH.DEL_FLG = '0'
     LEFT JOIN T_ALLOC_INST_B TAB
	        ON TPB.ALLOC_INST_B_ID = TAB.ALLOC_INST_B_ID
	       AND TAB.DEL_FLG = '0'
     LEFT JOIN M_PRODUCT MP
	        ON TAB.PRODUCT_ID = MP.PRODUCT_ID
     LEFT JOIN M_BOX MB
	        ON TPH.BOX_ID = MB.BOX_ID
-- 荷主センタ変更対応 2017.03.28 hdis Start
     LEFT JOIN M_CENTER MC
            ON TPH.CENTER_ID = MC.CENTER_ID
           AND MC.DEL_FLG = '0'
     LEFT JOIN M_CLIENT MCL
            ON TPH.CLIENT_ID = MCL.CLIENT_ID
           AND MCL.DEL_FLG = '0'
-- 荷主センタ変更対応 2017.03.28 hdis End
 WHERE TPH.DEL_FLG = '0'
 -- [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe Start
 	AND(TH.PICKING_STATUS = '25'
 		OR TH.PICKING_STATUS = '35'
 		OR TH.PICKING_STATUS = '50'
 	)
 -- [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe End
   /*IF pmb.centerCd != null*/
   AND TH.CENTER_ID = /*pmb.centerCd*/'1'
   /*END*/
   /*IF pmb.clientCd != null*/
   AND TH.CLIENT_ID = /*pmb.clientCd*/'11'
   /*END*/
   /*IF pmb.pickingWorkNo != null*/
   AND TH.PICKING_WORK_NO = /*pmb.pickingWorkNo*/'TEST1'
   /*END*/
 GROUP BY TPH.PACKING_H_ID
         ,MP.PRODUCT_CD
         ,MP.PRODUCT_ID
         ,TPH.CENTER_ID
         ,TPH.CLIENT_ID
         ,TPH.PROCESS_TYPE_ID
         -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
         ,TPH.PICKING_H_ID
         ,TPH.ALLOC_INST_H_ID
         -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
/*IF pmb.isPaging()*/
 ORDER BY TPH.PACKING_H_ID
         ,MP.PRODUCT_CD
         ,MP.PRODUCT_ID
/*END*/

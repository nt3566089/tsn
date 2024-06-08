/*
 [df:title]
  納品明細を取得します。出庫ヘッダ1レコード毎です。

 [df:description]
  SQL Description here.
*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
SELECT
	-- [新ｿﾘ-094] SQL修正 2014.11.28 yangc Start
	MC.CLIENT_CD,
    -- [新ｿﾘ-094] 荷主も名称に変更 2014.12.05 yokosuka Start
	-- MC.CLIENT_ABBR AS CLIENT_NM,
	-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
	MAX(MC.CLIENT_NM) AS CLIENT_NM,
	-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
    -- [新ｿﾘ-094] 荷主も名称に変更 2014.12.05 yokosuka End
    -- [新ｿﾘ-094] 複数伝票時の数量がおかしい。 2014.12.05 yokosuka Start
    -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
	MAX(MR.CENTER_CD) AS CENTER_CD,
	MAX(MR.CENTER_ABBR) AS CENTER_NM,
	-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
	-- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
	TSIH.SUPPLY_CUSTOMER_CD,
	-- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
	-- [検査-175] 納品先名称に変更 2014.12.02 koseki Start
	MAX(MMCR.CUSTOMER_NM) AS SUPPLY_CUSTOMER_NM,
	-- [検査-175] 納品先名称に変更 2014.12.02 koseki End
	-- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
	TSIH.SHIPPING_DT,
	TSIH.DELIV_DT,
	-- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
	TSIH.SHIPPING_SLIP_NO,
	-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
	MAX(TSIH.CLIENT_SHIPPING_NO) AS CLIENT_SHIPPING_NO,
	-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
	MP.PRODUCT_CD,
	-- [検査-175] 商品名称に変更 2014.12.02 koseki Start
	MAX(MP.PRODUCT_NM) AS PRODUCT_NM,
	-- [検査-175] 商品名称に変更 2014.12.02 koseki End
	-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
	MAX(MCR.TEL_NO) AS TEL_NO,
	-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
	TL.LOT,
	TL.LIMIT_DT,
	-- [検査-179] 複数伝票時の数量がおかしい。 2014.12.01 KI Start
    -- [新ｿﾘ-094] 複数伝票時の数量がおかしい。 2014.12.05 yokosuka Start
	-- MAX(TPB.PICKING_NUM) AS PICKING_NUM,
	SUM(TPB.PICKING_NUM) AS PICKING_NUM,
    -- [新ｿﾘ-094] 複数伝票時の数量がおかしい。 2014.12.05 yokosuka End
	-- [検査-179] 複数伝票時の数量がおかしい。 2014.12.01 KI End
	TPR.PACKING_OUT_FLG,  -- // cls(ListOutFlg)
	-- [EC-CT1-162] 出庫作業Noのバーコードを追加する 2015.03.31 Kyo Start
	TPH.PICKING_WORK_NO AS PICKING_WORK_NO,
	-- [EC-CT1-162] 出庫作業Noのバーコードを追加する 2015.03.31 Kyo End
	-- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
	MAX(TSIH.TOTAL_PRICE) AS TOTAL_PRICE,
	MAX(TSIH.TOTAL_TAX) AS TOTAL_TAX,
	MAX(RESULT_PRICE.PRICE) AS PRICE,
	MAX(RESULT_PRICE.TAX) AS TAX,
    TSIB.SHIPPING_INST_B_ID
	-- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End
  FROM T_PICKING_H TPH
    INNER JOIN T_PICKING_B TPB
            ON TPH.PICKING_H_ID = TPB.PICKING_H_ID
     LEFT JOIN M_CLIENT MC
            ON TPH.CLIENT_ID = MC.CLIENT_ID
           AND MC.DEL_FLG = '0'
     LEFT JOIN M_CENTER MR
            ON TPH.CENTER_ID = MR.CENTER_ID
           AND MR.DEL_FLG = '0'
     LEFT JOIN T_ALLOC_INST_H TAIH
            ON TPH.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
           AND TAIH.DEL_FLG = '0'
     LEFT JOIN T_PICKING_R TPR
            ON TPH.PICKING_H_ID = TPR.PICKING_H_ID
           AND TPR.DEL_FLG = '0'
     LEFT JOIN M_CUSTOMER MCR
            ON TAIH.SUPPLY_CUSTOMER_ID = MCR.CUSTOMER_ID
           AND MCR.DEL_FLG = '0'
	 LEFT JOIN T_ALLOC_INST_B TAIB
	        ON TPB.ALLOC_INST_B_ID = TAIB.ALLOC_INST_B_ID
	       -- [SK2-012] 全欠品以外のデータが出力できるように修正 2014/12/10 KI Start
           AND TAIB.ALLOC_NUM > 0
           -- [SK2-012] 全欠品以外のデータが出力できるように修正 2014/12/10 KI End
	       AND TAIB.DEL_FLG = '0'
	 LEFT JOIN T_SHIPPING_INST_B TSIB
	        ON TAIB.ALLOC_INST_B_ID = TSIB.ALLOC_INST_B_ID
	       AND TPB.SHIPPING_INST_B_ID = TSIB.SHIPPING_INST_B_ID
	       AND TSIB.DEL_FLG = '0'
	 LEFT JOIN  T_SHIPPING_INST_H TSIH
	        ON TAIH.ALLOC_INST_H_ID = TSIH.ALLOC_INST_H_ID
	       AND TSIH.SHIPPING_INST_H_ID = TSIB.SHIPPING_INST_H_ID
	       AND TSIH.DEL_FLG = '0'
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
 	 LEFT JOIN T_STOCK TS
            ON TPB.STOCK_ID = TS.STOCK_ID
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
           AND TS.DEL_FLG = '0'
	 LEFT JOIN M_PRODUCT MP
            ON TS.PRODUCT_ID = MP.PRODUCT_ID
           AND MP.DEL_FLG = '0'
	 LEFT JOIN T_LOT TL
            ON TS.LOT_ID = TL.LOT_ID
           AND TL.DEL_FLG = '0'
     LEFT JOIN  M_CUSTOMER MMCR
            ON TAIH.SUPPLY_CUSTOMER_ID = MMCR.CUSTOMER_ID
          AND MMCR.DEL_FLG = '0'
     -- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
     LEFT JOIN (
       SELECT
         T_PICKING_B.PICKING_B_ID
         , T_SHIPPING_INST_B.UNIT_PRICE
         , T_SHIPPING_INST_B.PRICE
         , T_SHIPPING_INST_B.TAX
       FROM
         T_SHIPPING_INST_B
         INNER JOIN T_PICKING_B
           ON T_PICKING_B.SHIPPING_INST_B_ID = T_SHIPPING_INST_B.SHIPPING_INST_B_ID
     )  RESULT_PRICE
     ON TPB.PICKING_B_ID = RESULT_PRICE.PICKING_B_ID
     -- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End

 WHERE TPH.DEL_FLG = '0'
   AND TPB.DEL_FLG = '0'
   /*IF pmb.controlNo != null*/
   AND TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
   /*END*/
/*END*/
/*IF pmb.isPaging()*/
 GROUP BY
         -- [検査-179] 複数伝票時の数量がおかしい。 2014.12.02 KI Start
          MC.CLIENT_CD
 		 ,TPR.PACKING_OUT_FLG
         ,TSIH.SUPPLY_CUSTOMER_CD
         ,TSIH.SHIPPING_DT
         ,TSIH.DELIV_DT
         ,MP.PRODUCT_CD
         ,TL.LOT
         ,TL.LIMIT_DT
         ,TPH.PICKING_WORK_NO
		 ,TSIH.SHIPPING_SLIP_NO
	     -- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
		 ,TSIB.SHIPPING_INST_B_ID
	     -- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End

         -- [SK2-067] 指定ロケが登録されている場合、同一商品の明細が複数印字されることの修正 2014.12.16 horita Start
		 -- [検査-179] 複数伝票時の数量がおかしい。 2014.12.04 KI Start
		 -- ,TAIB.LOCATION_CD
		 -- [検査-179] 複数伝票時の数量がおかしい。 2014.12.04 KI End
         -- [SK2-067] 指定ロケが登録されている場合、同一商品の明細が複数印字されることの修正 2014.12.16 horita End
         -- [検査-179] 複数伝票時の数量がおかしい。 2014.12.02 KI End
-- [EC-CT1-177] ピッキングリスト発行のソート順にあわせて変更 2015.04.03 kawana Start
 ORDER BY
          TPR.PACKING_OUT_FLG ASC
         ,MC.CLIENT_CD ASC
         -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
         ,CENTER_CD ASC
         ,MIN(TSIH.WORK_DT) ASC
         ,MIN(TSIH.PICKING_BATCH_NO) ASC
         ,MIN(TSIH.DELIVERY_COURSE_CD) ASC
         -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
-- [EC-CT1-177] ピッキングリスト発行のソート順にあわせて変更 2015.04.03 kawana End
-- [EC-CT1-177] ソート順に出庫作業No.を追加 2015.04.02 kawana Start
         ,TPH.PICKING_WORK_NO ASC
-- [EC-CT1-177] ソート順に出庫作業No.を追加 2015.04.02 kawana End
         -- [新ｿﾘ-094] 複数伝票時の数量がおかしい。並び順もおかしい 2014.12.05 yokosuka Start
         ,MAX(TSIH.SHIPPING_SLIP_NO) ASC
         -- [新ｿﾘ-094] 複数伝票時の数量がおかしい。並び順もおかしい 2014.12.05 yokosuka End
         ,MP.PRODUCT_CD ASC
	     -- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
		 ,TSIB.SHIPPING_INST_B_ID ASC
	     -- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End
         ,TL.LOT ASC
         ,TL.LIMIT_DT ASC
         -- [SK2-067] 指定ロケが登録されている場合、同一商品の明細が複数印字されることの修正 2014.12.16 horita Start
         -- [検査-179] 複数伝票時の数量がおかしい。 2014.12.04 KI Start
		 -- ,TAIB.LOCATION_CD
		 -- [検査-179] 複数伝票時の数量がおかしい。 2014.12.04 KI End
         -- [SK2-067] 指定ロケが登録されている場合、同一商品の明細が複数印字されることの修正 2014.12.16 horita End
         -- [検査-179] 複数伝票時の数量がおかしい。 2014.12.01 KI Start
         -- [新ｿﾘ-094] 複数伝票時の数量がおかしい。並び順もおかしい 2014.12.05 yokosuka Start
         -- ,MAX(TSIH.SHIPPING_SLIP_NO) ASC
         -- [新ｿﾘ-094] 複数伝票時の数量がおかしい。並び順もおかしい 2014.12.05 yokosuka End
         -- [検査-179] 複数伝票時の数量がおかしい。 2014.12.01 KI End
  -- [新ｿﾘ-094] SQL修正 2014.11.28 yangc End
/*END*/

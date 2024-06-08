/*
 [df:title]
 商品マスタ一括取込一覧を取得します。

 [df:description]
  SQL Description here.

*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!Long cultureId!!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
SELECT EP.PRODUCT_ID
	-- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.09 honma start
	  ,EP.RECEIVE_CD
	-- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.09 honma end
	  ,EP.RECEIVE_ROW_ID
	  ,EP.IMPORT_FLG
	  ,EP.ERROR_FLG
	  ,EP.ERROR_MESSAGE_CD
	  ,EP.CLIENT_CD
	  ,EP.PRODUCT_CD
	  ,EP.PRODUCT_NM
	  ,EP.PRODUCT_ABBR
	  ,EP.JAN_CD
	  ,EP.LOT_MANAG_FLG
	  ,EP.LOT_REVERSE_FLG
	  ,EP.LIMIT_DT_MANAG_FLG
	  ,EP.LIMIT_DT_REVERSE_FLG
	  ,EP.RECEIVE_LIMIT_NUM
	  ,EP.SHIPPING_LIMIT_NUM
	  ,EP.MERGE_CLS
	  ,EP.SHIPPING_STOP_FLG
	  ,EP.FIXED_POINT
	  ,EP.SHAPE_GRP_CD
	  ,EP.LENGTH
	  ,EP.WIDTH
	  ,EP.HEIGHT
	  ,EP.VOLUME
	  ,EP.NET_WEIGHT
	  ,EP.GROSS_WEIGHT
	  ,BM_0.MESSAGE_NM
-- ELSE SELECT COUNT(*)
/*END*/
	FROM E_PRODUCT EP
		INNER JOIN M_CLIENT MCL_0
			ON MCL_0.CLIENT_CD = EP.CLIENT_CD
		LEFT JOIN B_MESSAGE BM_0
			ON BM_0.MESSAGE_CD=EP.ERROR_MESSAGE_CD
			/*IF pmb.cultureId != null*/
			AND BM_0.CULTURE_ID=/*pmb.cultureId*/1
			/*END*/
	WHERE 1 = 1
		-- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.09 honma start
 		AND EP.RECEIVE_CD = /*pmb.receiveCd*/'E12345678901'
		-- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.09 honma end
 		AND EP.CLIENT_CD = /*pmb.clientCd*/'MK001'
		/*IF pmb.errorFlg != null*/
 		AND EP.ERROR_FLG=/*pmb.errorFlg*/'1'
		/*END*/
		/*IF pmb.importFlg != null*/
 		AND EP.IMPORT_FLG=/*pmb.importFlg*/'0'
		/*END*/
/*IF pmb.isPaging()*/
	ORDER BY EP.PRODUCT_ID ASC
			-- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.09 honma start
			,EP.RECEIVE_CD ASC
			-- [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.09 honma end
			,EP.RECEIVE_ROW_ID ASC
/*END*/

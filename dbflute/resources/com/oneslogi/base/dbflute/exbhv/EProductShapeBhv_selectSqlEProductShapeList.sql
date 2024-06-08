/*
 [df:title]
 商品荷姿マスタ一括取込一覧を取得します。

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##Long MS_UNIT_NUM##

-- !df:pmb extends Paging!
-- !!Long cultureId!!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
SELECT EPS.PRODUCT_SHAPE_ID
	  ,EPS.RECEIVE_CD
	  ,EPS.RECEIVE_ROW_ID
	  ,EPS.IMPORT_FLG
	  ,EPS.ERROR_FLG
	  ,EPS.ERROR_MESSAGE_CD
	  ,EPS.CLIENT_CD
	  ,EPS.PRODUCT_CD
	  ,EPS.SHAPE_CD
	  ,EPS.UNIT_NUM
	  ,EPS.LENGTH
	  ,EPS.WIDTH
	  ,EPS.HEIGHT
	  ,EPS.VOLUME
	  ,EPS.NET_WEIGHT
	  ,EPS.GROSS_WEIGHT
	  ,EPS.DEL_FLG
	  ,EPS.VERSION_NO
	  ,EPS.CONTROL_NO
	  ,EPS.ADD_DT
	  ,EPS.ADD_USER
	  ,EPS.ADD_PROCESS
	  ,EPS.UPD_DT
	  ,EPS.UPD_USER
	  ,EPS.UPD_PROCESS
	  ,BM_0.MESSAGE_NM
	  ,MP_0.PRODUCT_ID
	  ,MP_0.PRODUCT_NM
	  ,MS_1.SHAPE_ID
	  ,MS_1.SHAPE_CD
-- TODO [#2799]UoM対応
--	  ,MS_0.UNIT_NUM AS MS_UNIT_NUM
	  ,0 AS MS_UNIT_NUM
	-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
	  ,VD_1.DICT_NM AS SHAPE_NM
	-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
-- ELSE SELECT COUNT(*)
/*END*/
	FROM E_PRODUCT_SHAPE EPS
		INNER JOIN M_CLIENT MCL_0
			ON MCL_0.CLIENT_CD = EPS.CLIENT_CD
		LEFT JOIN M_PRODUCT MP_0
			ON MP_0.PRODUCT_CD = EPS.PRODUCT_CD
			AND MP_0.CLIENT_ID=MCL_0.CLIENT_ID
			AND MP_0.DEL_FLG='0'
-- TODO [#2799]UoM対応 ここから
--		LEFT JOIN
--			-- [#49] 辞書マスタを辞書ビューに変更(不要な結合を削除) 2016.10.24 kawana Start
--			(SELECT MS_1.SHAPE_CD
--			-- [#49] 辞書マスタを辞書ビューに変更(不要な結合を削除) 2016.10.24 kawana End
--				   ,MP_1.PRODUCT_CD
--				   ,MP_1.CLIENT_ID
--				   ,MS_1.SHAPE_ID
--				   ,MS_1.DEL_FLG
--				   ,MS_1.SHAPE_DICT_ID
--				   ,MPS_1.UNIT_NUM
--			 FROM M_PRODUCT_SHAPE MPS_1
--				INNER JOIN M_SHAPE MS_1
--					ON MS_1.SHAPE_ID = MPS_1.SHAPE_ID
--				INNER JOIN M_PRODUCT MP_1
--					ON MP_1.PRODUCT_ID=MPS_1.PRODUCT_ID
--				-- [#49] 辞書マスタを辞書ビューに変更(不要な結合を削除) 2016.10.24 kawana
--			) MS_0
--			ON MS_0.CLIENT_ID=MCL_0.CLIENT_ID
--			AND MS_0.SHAPE_CD=EPS.SHAPE_CD
--			AND MS_0.PRODUCT_CD=EPS.PRODUCT_CD
--			AND MS_0.DEL_FLG='0'
-- TODO [#2799]UoM対応 ここまで
		LEFT JOIN M_SHAPE MS_1
			ON MS_1.SHAPE_CD=EPS.SHAPE_CD
		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
		LEFT JOIN V_DICT VD_1
			ON VD_1.DICT_ID = MS_1.SHAPE_DICT_ID
			AND (VD_1.CULTURE_ID = /*pmb.cultureId*/11111111111 OR VD_1.CULTURE_ID IS NULL)
		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
		LEFT JOIN B_MESSAGE BM_0
			ON BM_0.MESSAGE_CD=EPS.ERROR_MESSAGE_CD
			/*IF pmb.cultureId != null*/
			AND BM_0.CULTURE_ID=/*pmb.cultureId*/1
			/*END*/
	WHERE 1 = 1
 		AND EPS.RECEIVE_CD = /*pmb.receiveCd*/'E12345678901'
		AND EPS.CLIENT_CD = /*pmb.clientCd*/'MK001'
		/*IF pmb.errorFlg != null*/
 		AND EPS.ERROR_FLG=/*pmb.errorFlg*/'0'
		/*END*/
		/*IF pmb.importFlg != null*/
 		AND EPS.IMPORT_FLG=/*pmb.importFlg*/'0'
		/*END*/
/*IF pmb.isPaging()*/
	ORDER BY EPS.PRODUCT_SHAPE_ID ASC
			,EPS.RECEIVE_CD ASC
			,EPS.RECEIVE_ROW_ID ASC
/*END*/
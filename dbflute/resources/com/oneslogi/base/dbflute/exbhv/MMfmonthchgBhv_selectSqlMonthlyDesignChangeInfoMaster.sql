/*
[df:title]
月替り・デザイン変更情報マスタメンテナンスを取得します。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String SOTEDUNIT_NM##
-- ##String DESIGNFLG_NM##
-- ##String DEL_FLG_NM##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
/*IF pmb.isPaging()*/
SELECT	MMC.PRODUCT_CD,
 		MP.PRODUCT_NM,
 		MMC.SOTEDUNIT,
 		NULL as SOTEDUNIT_NM,
 		MMC.LIMITDATE,
 		MMC.DESIGNFLG,
		NULL as DESIGNFLG_NM,
 		MMC.SOTEDLOC,
 		MMC.PICKLISTKEY,
 		MMC.PICKLISTGNO,
 		MMC.UPD_DT,
 		MMC.UPD_USER,
 		MMC.DEL_FLG,
 		NULL as DEL_FLG_NM,
 		MMC.MFMONTHCHG_ID,
		MMC.VERSION_NO,
		MMC.CENTER_ID,
		CASE
				WHEN	MMC.SOTEDUNIT LIKE 'L%'	THEN
					10
				WHEN	MMC.SOTEDUNIT LIKE 'B%' THEN
					20
				WHEN	MMC.SOTEDUNIT  =   '99' THEN
					99
				WHEN	MMC.SOTEDUNIT  =   '9903' THEN
					9903
				ELSE
					9999
		END	AS	SORT
		
-- ELSE SELECT COUNT(*)
/*END*/		
FROM	M_MFMONTHCHG							MMC ---月替わり・デ変情報マスタ
LEFT 	OUTER JOIN 		M_PRODUCT				MP  ---銘柄マスタ
		ON 				MMC.CLIENT_ID	= MP.CLIENT_ID
		AND				MMC.PRODUCT_CD	= MP.PRODUCT_CD
		AND				MP.DEL_FLG		= '0'
		   
-- 検索条件
WHERE		MMC.CENTER_ID	=		/*pmb.centerId*/1

	AND		MMC.CLIENT_ID	=		/*pmb.clientId*/1

/*IF pmb.productCd != null*/
	AND		MMC.PRODUCT_CD		LIKE	/*pmb.productCd*/'PD0%'
/*END*/

/*IF pmb.sotedunit != null*/
	AND		MMC.SOTEDUNIT	=		/*pmb.sotedunit*/'x'
/*END*/

/*IF pmb.delFlg != null*/
	AND		MMC.DEL_FLG		=		/*pmb.delFlg*/'0'
/*END*/

/*IF pmb.isPaging()*/
ORDER	BY
		MP.USERNUM1	ASC,
		MP.USERNUM3    ASC,
		SORT			ASC,
		MMC.SOTEDUNIT   ASC
/*END*/


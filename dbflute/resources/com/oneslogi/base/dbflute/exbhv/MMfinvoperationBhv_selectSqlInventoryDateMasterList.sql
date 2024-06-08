/*
[df:title]
たな卸実施日マスタメンテナンス一覧を取得します。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String TARGET_DATE_EDIT##
-- ##String SUNDAY_FLG_NM##
-- ##String INV_DATE_EDIT##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
/*IF pmb.isPaging()*/
SELECT	MFO.MFINVOPERATION_ID,
		MFO.TARGET_DATE,
		NULL 			AS		TARGET_DATE_EDIT,
		NULL			AS		SUNDAY_FLG_NM,
		MFO.SUNDAY_FLG,
		MFO.INV_DATE,
		NULL 			AS		INV_DATE_EDIT,
		MFO.UPD_DT,
		MFO.UPD_USER,
		USR.USER_NM
-- ELSE SELECT COUNT(*)
/*END*/		
FROM	M_MFINVOPERATION			MFO

LEFT	JOIN	B_USER					USR
		ON		MFO.UPD_USER			=		USR.USER_CD
		AND		USR.DEL_FLG				=		'0'

-- 検索条件
WHERE	MFO.CENTER_ID			=		/*pmb.centerId*/1
AND		MFO.CLIENT_ID			=		/*pmb.clientId*/1
	/*IF pmb.targetDate != null*/
	AND		MFO.TARGET_DATE		LIKE	/*pmb.targetDate*/'2021%'
	/*END*/
	/*IF pmb.sundayFlg != null*/
	AND		MFO.SUNDAY_FLG		=		/*pmb.sundayFlg*/'0'
	/*END*/
AND		MFO.DEL_FLG				=		'0'
	
/*IF pmb.isPaging()*/
ORDER	BY
		MFO.INV_DATE	ASC
/*END*/


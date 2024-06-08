/*
[df:title]
たな卸実施日マスタメンテナンス編集を取得します。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String SUNDAY_FLG_NM##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long mfinvoperationId!!
SELECT	MFO.MFINVOPERATION_ID,
		MFO.CENTER_ID,
		CEN.CENTER_CD,
		MFO.CLIENT_ID,
		CLI.CLIENT_CD,
		MFO.TARGET_DATE,
		NULL AS TARGET_DATE_EDIT,
		MFO.SUNDAY_FLG,
		MFO.INV_DATE,
		NULL AS INV_DATE_EDIT,
		MFO.VERSION_NO
FROM	M_MFINVOPERATION			MFO
LEFT	JOIN	M_CENTER			CEN
		ON		MFO.CENTER_ID		=		CEN.CENTER_ID
		AND		CEN.DEL_FLG			=		'0'
LEFT	JOIN	M_CLIENT			CLI
		ON		MFO.CLIENT_ID		=		CLI.CLIENT_ID
		AND		CLI.DEL_FLG			=		'0'

-- 検索条件
WHERE	MFO.CENTER_ID			=		/*pmb.centerId*/1
AND		MFO.MFINVOPERATION_ID	=		/*pmb.mfinvoperationId*/1
AND		MFO.DEL_FLG				=		'0'



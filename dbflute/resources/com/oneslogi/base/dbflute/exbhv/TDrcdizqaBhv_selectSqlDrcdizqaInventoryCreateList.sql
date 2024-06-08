/*
[df:title]
方面別残数をリスト検索、方面別残数リストを取得する。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

SELECT 
	MP.PRODUCT_ID,
	TD.ZZMATNR,
	TD.LINBLK,
	TD.LOCID,
	TD.SRRNK,
	TD.SROPRTCNT,
	TD.DED,
	TD.PSTNID,
	TD.ZQACP,
	TD.ZQACTQA,
	MP.UNIT1,
	MP.UNIT2,
	ML.LOCATION_ID
FROM			T_DRCDIZQA							   TD--方面別残数

INNER	JOIN	M_PRODUCT							MP--銘柄マスタ
		ON		MP.CLIENT_ID				=		TD.CLIENT_ID
		AND		MP.PRODUCT_CD				=		TD.ZZMATNR
		AND		MP.DEL_FLG					=		'0'

INNER	JOIN	M_LOCATION							ML--ロケーションマスタ
		ON		ML.LOCATION_CD				=		TD.LINBLK + '-' + TD.LOCID
		AND		ML.DEL_FLG					=		'0'

-- 検索条件
WHERE	TD.CENTER_ID			=	/*pmb.centerId*/1
AND		TD.CLIENT_ID			=	/*pmb.clientId*/1
AND		TD.LINBLK				=	/*pmb.lineBlock*/'L123'
AND		TD.DED					=	/*pmb.ded*/'A0'
AND		TD.PSTNID				=	/*pmb.pstnid*/'B11'
AND		TD.DEL_FLG				=	'0'

ORDER BY 
	TD.SRRNK,
	TD.DED,
	TD.PSTNID

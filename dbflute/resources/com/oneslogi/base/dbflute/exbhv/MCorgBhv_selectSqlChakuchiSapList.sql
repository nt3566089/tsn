/*
 [df:title]
  着地リスト検索。

 [df:description]
 着地リストを検索する。

*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!

SELECT
	 MCR.CENTER_CD	AS		RLYBSCD--拠点CD
	,MCG.ORGNMKJ	AS		RLYBSSNM--組織名略称(TSN)(全角)

FROM

					M_CORG				MCG--組織(仕分)マスタ

INNER		JOIN	M_CENTER					MCR--拠点マスタ
ON					MCR.CENTER_ID	=	MCG.CENTER_ID
AND					MCR.DEL_FLG		=	'0'
WHERE
		(
		MCG.ZZABLYMD			IS		NULL
		OR
		MCG.ZZABLYMD			>		/*pmb.systemDt*/'20230203'
		)
AND		MCG.ZZFRDATEH		<=		/*pmb.systemDt*/'20230203'
AND		MCG.ZZTODATEH		>=		/*pmb.systemDt*/'20230203'
AND		MCG.DEL_FLG			=		'0'

ORDER BY
	MCR.CENTER_CD	ASC

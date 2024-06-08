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
	 MC.RLYBSCD--中継拠点CD
	,MC.RLYBSSNM--中継拠点短縮名

FROM
					M_CRELAYBS				MC--中継拠点マスタ
WHERE
		(
		MC.DELYMD			IS		NULL
		OR
		MC.DELYMD			>		/*pmb.systemDt*/'20230203'
		)
AND		MC.ZZFRDATEH		<=		/*pmb.systemDt*/'20230203'
AND		MC.ZZTODATEH		>=		/*pmb.systemDt*/'20230203'
AND		MC.DEL_FLG			=		'0'

ORDER BY
	MC.RLYBSCD	ASC

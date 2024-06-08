/*
 [df:title]
 銘柄カテゴリマスタリストを取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!
SELECT	CTG.BRCTG,
		CTG.BRCTGNM
FROM	M_CBRCTG					CTG
LEFT	JOIN	M_CENTER			CTR
		ON		CTG.CENTER_ID		=		CTR.CENTER_ID
		AND		CTR.DEL_FLG 		=		'0'
LEFT	JOIN	M_CLIENT			CLI
		ON		CTG.CLIENT_ID		=		CLI.CLIENT_ID
		AND		CLI.DEL_FLG 		=		'0'
WHERE	1=1
AND		CTR.CENTER_CD		= /*pmb.centerCd*/'3020'
AND		CLI.CLIENT_CD		= /*pmb.clientCd*/'3020'
ORDER	BY
		CTG.BRCTG



/*
[df:title]
段ボール情報をリスト検索、ケース情報を取得する。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

SELECT 
TT.TRSYMBOL_ID,
TT.VERSION_NO
FROM			T_TRSYMBOL						TT--段ボール情報

-- 検索条件
WHERE	TT.CENTER_ID			=	/*pmb.centerId*/1
AND		TT.CLIENT_ID			=	/*pmb.clientId*/1
AND		TT.CASECD				IN	/*pmb.caseCdList*/(1,2)
AND		TT.DEL_FLG				=	'0'

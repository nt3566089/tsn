/*
[df:title]
ケース明細情報をリスト検索、ケース明細情報を取得する。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

SELECT 
TTD.TRCASEDETAIL_ID,
TTD.VERSION_NO
FROM			T_TRCASEDETAIL						TTD--ケース明細情報

INNER	JOIN	T_TRSYMBOL							TTS--段ボール情報
		ON		TTS.TRSYMBOL_ID				=		TTD.TRSYMBOL_ID
		AND		TTS.DEL_FLG					=		'0'

-- 検索条件
WHERE	TTS.CENTER_ID			=	/*pmb.centerId*/1
AND		TTS.CLIENT_ID			=	/*pmb.clientId*/1
AND		TTD.CASEDETAILNO		IN	/*pmb.caseDetailNoList*/(1,2)
AND		TTD.DEL_FLG				=	'0'

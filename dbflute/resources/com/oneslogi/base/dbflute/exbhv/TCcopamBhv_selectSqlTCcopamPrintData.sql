/*
[df:title]
引継項目から配車実績マスタを単一検索、配車実績マスタを取得する

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

SELECT TC.TDRELAYID
	,TC.STCD
	,TC.SNNO1
	,TC.SNNO2
	,TC.SNNO3
	,TC.SNNO1
	,TC.SNYMD
	,TC.ARVYMD
	,TC.PLNCARKND
	,TC.AMCARKND
	,TC.TRANNM
	,TC.CARNO
	,TC.GNLPLTQA
	,TC.OTPLTQA
	,CASE 
		WHEN /*pmb.supplierrCvFlg*/'1' = '2' THEN ''
		ELSE TC.GNLPLTQA + TC.OTPLTQA 
	END AS SUMPLTQA
	,CASE
		WHEN /*pmb.supplierrCvFlg*/'1' = '2' THEN GNLPLTQA
		ELSE ''
	END AS QTY
	,CASE
		WHEN /*pmb.supplierrCvFlg*/'1' = '2' THEN GNLPLTQA
		ELSE ''
	END AS TOTALNUM
	,TC.SELNO1
	,TC.SELNO2
	,TC.SELNO3
FROM T_CCOPAM TC
WHERE TC.CONTROL_NO = /*pmb.controlNo*/11111111111
	AND TC.DEL_FLG = '0'
ORDER BY TC.SNNO3
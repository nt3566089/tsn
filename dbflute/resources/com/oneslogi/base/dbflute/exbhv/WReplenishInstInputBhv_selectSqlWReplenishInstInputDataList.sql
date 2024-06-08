/*
[df:title]
融通指示一括取込ワーク を検索するチェックします。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

SELECT SQL1.FLEXLNS_NO
	,SQL1.SCH_DATE
	,SQL1.SUPPLIER_CD
	,SQL1.RCV_DATE
	,SQL1.SHIP_CD
	,SQL1.ITEM_CD
	,SQL1.MANUFACTURE_DATE
	,SQL1.DESIGN_CD
	,SQL1.QTY
	,SQL1.FLEX_UPD_USER_CD
	,SQL1.REPLENISH_INST_INPUT_ID
	,SQL1.VERSION_NO
	,SQL1.OTHERCD1
	,SQL1.OTHERCD2 
FROM
(
	SELECT WRII.FLEXLNS_NO
		,WRII.SCH_DATE
		,WRII.SUPPLIER_CD
		,WRII.RCV_DATE
		,WRII.SHIP_CD
		,WRII.ITEM_CD
		,WRII.MANUFACTURE_DATE
		,WRII.DESIGN_CD
		,WRII.QTY
		,WRII.FLEX_UPD_USER_CD
		,WRII.REPLENISH_INST_INPUT_ID
		,WRII.VERSION_NO
		,MCDS.OTHERCD1
		,MCDS.OTHERCD2
	FROM
		W_REPLENISH_INST_INPUT WRII
	LEFT OUTER JOIN M_CENTER_CLASS MC
		ON MC.CLASS_CD = 'DESIGNFLG'
		AND MC.CENTER_ID = /*pmb.centerId*/11111111111111
		AND MC.DEL_FLG = '0'
	LEFT OUTER JOIN M_CENTER_CLASS_DTL MCD
		ON MCD.CENTER_CLASS_ID = MC.CENTER_CLASS_ID
		AND MCD.CLASS_DTL_CD = WRII.DESIGN_CD
		AND MCD.DEL_FLG = '0'
	LEFT OUTER JOIN M_CENTER_CLASS_DTL_SUB MCDS
		ON MCDS.CENTER_CLASS_DTL_ID = MCD.CENTER_CLASS_DTL_ID
		AND MCDS.DEL_FLG = '0'
	WHERE WRII.RECEIVE_CD = /*pmb.receiveCd*/'000000001'
		AND WRII.CENTER_CD = /*pmb.centerCd*/'11111'
		AND WRII.CLIENT_CD = /*pmb.clientCd*/'11111'
		AND WRII.DEL_FLG = '0'
	ORDER BY WRII.LINE_NO
	Offset 0 rows
) AS SQL1
GROUP BY SQL1.FLEXLNS_NO
	,SQL1.SCH_DATE
	,SQL1.SUPPLIER_CD
	,SQL1.RCV_DATE
	,SQL1.SHIP_CD
	,SQL1.ITEM_CD
	,SQL1.MANUFACTURE_DATE
	,SQL1.DESIGN_CD
	,SQL1.QTY
	,SQL1.FLEX_UPD_USER_CD
	,SQL1.REPLENISH_INST_INPUT_ID
	,SQL1.VERSION_NO
	,SQL1.OTHERCD1
	,SQL1.OTHERCD2
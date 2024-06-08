/*
[df:title]
融通指示一括取込ワークを基に融通内訳情報を検索する。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
WITH SQL2 AS 
(
	SELECT TTRFL.REFNO
		,TTRFL.SHIPSCHDATE
		,TTRFL.SHIPCD
		,TTRFL.SHIPTOSCHDATE
		,TTRFL.SHIPTOCD
		,MP.PRODUCT_CD
		,SUM(TTRFL.QTY) AS QTY_SUM
	FROM T_TRFLEXIBILITYBREAKDOWN TTRFL
	INNER JOIN M_PRODUCT MP
		ON MP.CLIENT_ID = /*pmb.clientId*/1111111111
		AND TTRFL.PRODUCT_ID = MP.PRODUCT_ID
		AND MP.DEL_FLG = '0'
	WHERE TTRFL.DEL_FLG = '0'
	GROUP BY TTRFL.REFNO
		,TTRFL.SHIPSCHDATE
		,TTRFL.SHIPCD
		,TTRFL.SHIPTOSCHDATE
		,TTRFL.SHIPTOCD
		,MP.PRODUCT_CD
)


SELECT 
	SQL2.REFNO
FROM
(
	SELECT WRII.FLEXLNS_NO
		,WRII.SCH_DATE
		,WRII.SUPPLIER_CD
		,WRII.RCV_DATE
		,WRII.SHIP_CD
		,WRII.ITEM_CD
		,SUM(CAST(WRII.QTY AS INT)) AS QTY_SUM
	FROM W_REPLENISH_INST_INPUT WRII
	WHERE WRII.RECEIVE_CD = /*pmb.receiveCd*/'000000001'
		AND WRII.CENTER_CD = /*pmb.centerCd*/'11111'
		AND WRII.CLIENT_CD = /*pmb.clientCd*/'11111'
		AND WRII.FLEXLNS_NO = /*pmb.flexlnsNo*/'11111'
		AND WRII.DEL_FLG = '0'
	GROUP BY WRII.FLEXLNS_NO
		,WRII.SCH_DATE
		,WRII.SUPPLIER_CD
		,WRII.RCV_DATE
		,WRII.SHIP_CD
		,WRII.ITEM_CD
 	ORDER BY WRII.FLEXLNS_NO
 		,WRII.ITEM_CD
	Offset 0 ROWS
) AS SQL1 
INNER JOIN SQL2
ON SQL2.SHIPSCHDATE = SQL1.SCH_DATE
AND SQL2.SHIPCD = SQL1.SUPPLIER_CD
AND SQL2.SHIPTOSCHDATE = SQL1.RCV_DATE
AND SQL2.SHIPTOCD = SQL1.SHIP_CD
AND SQL2.PRODUCT_CD = SQL1.ITEM_CD
AND SQL2.QTY_SUM = SQL1.QTY_SUM
AND 
(
	SELECT COUNT(DISTINCT TTRFL.PRODUCT_ID) AS PRODUCT_ID_COUNT
	FROM T_TRFLEXIBILITYBREAKDOWN TTRFL
	WHERE TTRFL.REFNO = SQL2.REFNO
		AND TTRFL.DEL_FLG = '0'
	GROUP BY TTRFL.REFNO
)
=
(
	SELECT COUNT(DISTINCT WRII.ITEM_CD) AS ITEM_CD_COUNT
	FROM W_REPLENISH_INST_INPUT WRII
	WHERE WRII.RECEIVE_CD = /*pmb.receiveCd*/'000000001'
		AND WRII.CENTER_CD = /*pmb.centerCd*/'11111'
		AND WRII.CLIENT_CD = /*pmb.clientCd*/'11111'
		AND WRII.FLEXLNS_NO = /*pmb.flexlnsNo*/'11111'
		AND WRII.DEL_FLG = '0'
	GROUP BY WRII.FLEXLNS_NO
)

WHERE 
(
	SELECT COUNT(REFNO) FROM SQL2
)
=
(
	SELECT COUNT(DISTINCT WRII.ITEM_CD) AS ITEM_CD_COUNT
	FROM W_REPLENISH_INST_INPUT WRII
	WHERE WRII.RECEIVE_CD = /*pmb.receiveCd*/'000000001'
		AND WRII.CENTER_CD = /*pmb.centerCd*/'11111'
		AND WRII.CLIENT_CD = /*pmb.clientCd*/'11111'
		AND WRII.FLEXLNS_NO = /*pmb.flexlnsNo*/'11111'
		AND WRII.DEL_FLG = '0'
	GROUP BY WRII.FLEXLNS_NO
)

GROUP BY SQL2.REFNO





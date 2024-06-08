/*
[df:title]
販売物流在庫情報をリスト検索、販売物流在庫情報リストを取得する。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

SELECT
	PRODUCT_ID,
	PRODUCT_CD,
	SUM(STOCKQTY)		AS	STOCKQTY
FROM
(
	SELECT 
		MP.PRODUCT_ID,
		ISNULL(MP.LOTATRB1TITLE, TT.PRODUCT_CD)		AS	PRODUCT_CD,
		TT.STOCKQTY
	FROM			T_TRHANBAIINV							   TT--販売物流在庫情報

	INNER	JOIN	M_PRODUCT							MP--銘柄マスタ
			ON		MP.CLIENT_ID				=		TT.CLIENT_ID
			AND		MP.PRODUCT_CD				=		ISNULL(MP.LOTATRB1TITLE, TT.PRODUCT_CD)
			AND		MP.DEL_FLG					=		'0'

	-- 検索条件
	WHERE	TT.CENTER_ID			=	/*pmb.centerId*/1
	AND		TT.CLIENT_ID			=	/*pmb.clientId*/1
	AND		CONVERT(VARCHAR(12),TT.STOCKDATETIME,112)		=   /*pmb.stockDatetime*/'20140805'
	AND		TT.GOODITEMKBN			=	'0'
	/*IF pmb.productCd != null*/
	AND 	TT.PRODUCT_CD like /*pmb.productCd*/'a123%'
	/*END*/
	AND		TT.DEL_FLG				=	'0'
) SUBTT

GROUP BY 
	SUBTT.PRODUCT_CD,
	SUBTT.PRODUCT_ID

ORDER	BY
	PRODUCT_CD
	
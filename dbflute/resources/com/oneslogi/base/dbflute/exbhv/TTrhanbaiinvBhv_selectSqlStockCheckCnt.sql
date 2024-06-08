/*
 [df:title]
 国免在庫照合データ取得

 [df:description]
  国免在庫照合データを取得します。
*/

-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT  COUNT(*) AS CNT
-- ELSE SELECT COUNT(*)
/*END*/
FROM	T_TRHANBAIINV		TRH	--販売物流在庫情報
	INNER	JOIN		M_PRODUCT	PRO	--銘柄マスタ
		ON	PRO.PRODUCT_CD			=	TRH.PRODUCT_CD	--銘柄マスタ.商品CD	=	販売物流在庫情報.銘柄CD
		AND	PRO.CLIENT_ID			=	TRH.CLIENT_ID	--銘柄マスタ.荷主ID	=	販売物流在庫情報.荷主ID
		AND	PRO.DEL_FLG				=	'0'
	INNER	JOIN		T_INVENTORY_B	TIB	--棚卸ボディ
		ON	TIB.PRODUCT_CD				=	TRH.PRODUCT_CD	--棚卸ボディ.銘柄CD	=	販売物流在庫情報.銘柄CD
		AND	TIB.DEL_FLG				=	'0'
	INNER	JOIN		T_INVENTORY_H	TIH	--棚卸ヘッダ
		ON	TIH.INVENTORY_H_ID		=	TIB.INVENTORY_H_ID	--棚卸ヘッダ.棚卸ヘッダID	=	棚卸ボディ.棚卸ヘッダID
		AND	TIH.CLIENT_ID			=	TRH.CLIENT_ID	--棚卸ヘッダ.荷主ID	=	販売物流在庫情報.荷主ID
		AND	TIH.DEL_FLG				=	'0'
	INNER	JOIN		M_CENTER		CEN	--拠点マスタ
		ON	CEN.CENTER_ID			=	TRH.CENTER_ID	--拠点マスタ.拠点ID	=	販売物流在庫情報.拠点ID
		AND	CEN.DEL_FLG				=	'0'
	INNER	JOIN		M_CLIENT		CLI	--荷主マスタ
		ON	CLI.CLIENT_ID			=	TRH.CLIENT_ID	--荷主マスタ.荷主ID	=	販売物流在庫情報.荷主ID
		AND	CLI.DEL_FLG				=	'0'
WHERE	1	=	1
/*IF pmb.centerId != null*/
	AND	TRH.CENTER_ID				=	/*pmb.centerId*/1
/*END*/
/*IF pmb.clientId != null*/
	AND	TRH.CLIENT_ID				=	/*pmb.clientId*/1
/*END*/
/*IF pmb.inventoryKey != null*/	--棚卸ボディ.棚卸Ｋｅｙ	==	検索.在庫調査指示キー
	AND	TIH.INVENTORY_KEY		=	/*pmb.inventoryKey*/222
/*END*/
/*IF pmb.productCd != null*/	--販売物流在庫情報.銘柄CD	like	検索.銘柄CD
	AND	TRH.PRODUCT_CD			LIKE	/*pmb.productCd*/'PD%'
/*END*/
/*IF pmb.goodItemKbn != null*/	--販売物流在庫情報.適品・不適品区分	==	変数.適品・不適品区分
	AND	TRH.GOODITEMKBN		=	/*pmb.goodItemKbn*/'0'
/*END*/
	AND	TRH.DEL_FLG					=	'0'
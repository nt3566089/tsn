/*
[df:title]
棚卸ボディをリスト検索、棚卸ボディリストを取得する。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

SELECT
	TIB.INVENTORY_B_ID,--棚卸ボディID
	TIH.INVENTORY_KEY,--在庫調査指示キー
	TIH.INVENTORY_DT,--棚卸日
	TIB.PRODUCT_CD,--柄CD
	ML.LOCATION_CD,--ロケーションCD
	TT.MANUFACTURE_DATE,--製造年月日
	TTD.TRMANUFACTUREDATEDETAIL_ID,--製造年月日明細ID
	TTD.CENTER_ID,--拠点ID"
	TTD.CLIENT_ID,--荷主ID
	TTD.CENTER_CD,--拠点CD
	TTD.OWNER_CD,--取引先（荷主）CD
	TTD.INVENTORY_KBN,--棚卸区分
	TTD.LINE_BLOCK,--ライン／ブロック
	TTD.PRODUCT_CD,--銘柄CD"
	TTD.INVENTORY_KEY,--在庫調査指示キー
	TTD.INVENTORY_B_ID,--棚卸ボディID
	TTD.INVENTORY_DATE,--在庫調査日
	TTD.BF_MANUFACTURE_DATE,--前回製造年月日
	TTD.AF_MANUFACTURE_DATE,--今回製造年月日
	TTD.DESIGN_FLG,--デザイン区分
	TTD.VERSION_NO
FROM			T_INVENTORY_B							   TIB--棚卸ボディ
INNER	JOIN	T_INVENTORY_H				TIH--棚卸ヘッダ
		ON		TIH.INVENTORY_H_ID			=		TIB.INVENTORY_H_ID
		AND		TIH.CENTER_ID				=		/*pmb.centerId*/1
		AND		TIH.CLIENT_ID				=		/*pmb.clientId*/1
		AND		TIH.INVENTORY_DT			=		/*pmb.inventoryDt*/'20140805'
		AND		TIH.INVENTORY_KEY			=		/*pmb.inventoryKey*/1
		AND		TIH.DEL_FLG					=		'0'
			
INNER	JOIN	M_LOCATION					ML--ロケーションマスタ
		ON		ML.LOCATION_ID				=		TIB.LOCATION_ID
		AND		ML.DEL_FLG					=		'0'

LEFT	OUTER	JOIN	T_TRMANUFACTUREDATE			TT--製造年月日
		ON		TT.LINE_BLOCK				=		LEFT(ML.LOCATION_CD,2)
		AND		TT.PRODUCT_CD				=		TIB.PRODUCT_CD
		AND		TT.CENTER_ID				=		/*pmb.centerId*/1
		AND		TT.CLIENT_ID				=		/*pmb.clientId*/1
		AND		TT.INVENTORY_KBN			=		'02'
		AND		TT.DEL_FLG					=		'0'

LEFT	OUTER	JOIN	T_TRMANUFACTUREDATEDETAIL			TTD--製造年月日明細
		ON		TTD.LINE_BLOCK				=		LEFT(ML.LOCATION_CD,2)
		AND		TTD.PRODUCT_CD				=		TIB.PRODUCT_CD
		AND		TTD.INVENTORY_DATE			=		TIH.INVENTORY_DT
		AND		TTD.INVENTORY_KEY			=		TIH.INVENTORY_KEY
		AND		TTD.CENTER_ID				=		/*pmb.centerId*/1
		AND		TTD.CLIENT_ID				=		/*pmb.clientId*/1
		AND		TTD.INVENTORY_KBN			=		'02'
		AND		TTD.DEL_FLG					=		'0'
		AND		TTD.INVENTORY_B_ID			=		TIB.INVENTORY_B_ID
		
WHERE	TIB.CHARGE_NUM			=	0
AND		TIB.ALLOC_NUM			=	0
AND		TIB.MOVE_NUM			=	0
AND		TIB.DEL_FLG				=	'0'

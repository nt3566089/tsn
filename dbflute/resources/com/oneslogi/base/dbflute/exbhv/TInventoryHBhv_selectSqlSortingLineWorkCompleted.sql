/*
[df:title]
移動中数存在チェックします。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

SELECT COUNT(*) AS STOCK_CNT

FROM			T_INVENTORY_H							   TIH--棚卸ヘッダ

INNER	JOIN	T_INVENTORY_INST							TII--棚卸指示
		ON		TII.INVENTORY_H_ID			=		TIH.INVENTORY_H_ID
		AND		TII.INVENTORY_INST_KBN		=		/*pmb.inventoryInstKbn*/'03'
		AND		TII.DEL_FLG					=		'0'

-- 検索条件
WHERE	TIH.CENTER_ID			=	/*pmb.centerId*/1
AND		TIH.CLIENT_ID			=	/*pmb.clientId*/1
AND		TIH.INVENTORY_DT		=	/*pmb.inventoryDt*/'20140805'
AND		TIH.DEL_FLG				=	'0'

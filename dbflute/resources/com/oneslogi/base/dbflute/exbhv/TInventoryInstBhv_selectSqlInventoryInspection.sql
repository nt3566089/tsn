/*
 [df:title]
  棚卸情報を検索

 [df:description]
   棚卸情報を検索
*/

-- #df:entity#
-- ##Long INVENTORY_BODY_COUNT##
-- ##Long INSPECTION_NOT_COMPLETE_COUNT##

-- !df:pmb!
-- !!Long clientId!!
-- !!Long centerId!!
-- !!String systemDt!!
-- !!AutoDetect!!
SELECT 
	COUNT( TIB.INVENTORY_B_ID ) AS INVENTORY_BODY_COUNT, 		--保管場棚卸件数
	SUM( 
		CASE 
			WHEN TIB.INVENTORY_INPUT_FLG = '0' 
				THEN 1 
			ELSE 0 
		END 
	) AS INSPECTION_NOT_COMPLETE_COUNT							--棚卸未完了件数
FROM
	T_INVENTORY_INST TII --棚卸指示
	INNER JOIN T_INVENTORY_H TIH --棚卸ヘッダ
		ON TIH.INVENTORY_H_ID = TII.INVENTORY_H_ID 
		AND TIH.CLIENT_ID = /*pmb.clientId*/1
		AND TIH.CENTER_ID = /*pmb.centerId*/1
		AND TIH.INVENTORY_DT = /*pmb.systemDt*/'20240324'
		AND TIH.DEL_FLG = '0'
	INNER JOIN T_INVENTORY_B TIB --棚卸ボディ
		ON TIB.INVENTORY_H_ID = TIH.INVENTORY_H_ID 
		AND TIB.DEL_FLG = '0' 
WHERE
	TII.INVENTORY_INST_KBN = /*pmb.inventoryInstKbn*/'00'
	AND TII.DEL_FLG = '0'

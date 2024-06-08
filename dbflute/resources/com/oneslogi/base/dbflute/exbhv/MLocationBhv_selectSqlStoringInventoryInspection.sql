/*
 [df:title]
  保管場の棚卸未完了件数を検索

 [df:description]
  保管場の棚卸未完了件数を検索
*/

-- #df:entity#
-- ##Long INSPECTION_NOT_COMPLETE_COUNT##

-- !df:pmb!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!String systemDt!!
-- !!AutoDetect!!
SELECT 
	SUM( 
		CASE 
			WHEN ISNULL( TIB.INVENTORY_INPUT_FLG, '0' ) = '0' 
					THEN 1 
					ELSE 0 
		END 
	) AS INSPECTION_NOT_COMPLETE_COUNT                           --棚卸未完了件数
FROM	
	M_LOCATION ML  --ロケーションマスタ
	LEFT OUTER JOIN T_INVENTORY_B TIB  --棚卸ボディ
		ON TIB.LOCATION_ID = ML.LOCATION_ID 
		AND TIB.DEL_FLG = '0'
	INNER JOIN T_INVENTORY_H TIH  --棚卸ヘッダ
		ON TIH.INVENTORY_H_ID = TIB.INVENTORY_H_ID 
		AND TIH.CLIENT_ID = /*pmb.clientId*/1 
		AND TIH.CENTER_ID = /*pmb.centerId*/1 
		AND TIH.INVENTORY_DT = /*pmb.systemDt*/'20240324'
		AND TIH.DEL_FLG = '0'
	INNER JOIN T_INVENTORY_INST TII  --棚卸指示
		ON TII.INVENTORY_H_ID = TIH.INVENTORY_H_ID 
		AND TII.INVENTORY_INST_KBN= '00' 
		AND TII.DEL_FLG = '0' 
WHERE
	ML.LocGroup= '02' 
	AND ML.DEL_FLG = '0' 
	AND NOT EXISTS (
		SELECT
			1 
		FROM
			B_CLASS BC
			INNER JOIN B_CLASS_DTL BCD 
				ON BCD.CLASS_ID = BC.CLASS_ID
			INNER JOIN B_CLASS_DTL_SUB BCDS 
				ON BCDS.CLASS_DTL_ID = BCD.CLASS_DTL_ID 
		WHERE
			ML.LOCATION_CD = BCDS.OTHERCD1 
			AND BC.CLASS_CD= 'FZLOCCD' 
			AND BCD.CLASS_DTL_CD= '1' 
			AND BC.DEL_FLG= '0' 
			AND BCD.DEL_FLG= '0' 
			AND BCDS.DEL_FLG = '0' 
	)

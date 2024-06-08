/*
 [df:title]
  仕分場の棚卸未完了件数を検索

 [df:description]
  仕分場の棚卸未完了件数を検索
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
	) AS INSPECTION_NOT_COMPLETE_COUNT   								--棚卸未完了件数
FROM
	M_LOCATION ML --ロケーションマスタ
	LEFT OUTER JOIN T_INVENTORY_B TIB --棚卸ボディ
		ON TIB.LOCATION_ID = ML.LOCATION_ID 
		AND TIB.DEL_FLG = '0'
	INNER JOIN T_INVENTORY_H TIH --棚卸ヘッダ
		ON TIH.INVENTORY_H_ID = TIB.INVENTORY_H_ID 
		AND TIH.CLIENT_ID = /*pmb.clientId*/1 
		AND TIH.CENTER_ID = /*pmb.centerId*/1 
		AND TIH.INVENTORY_DT = /*pmb.systemDt*/'20240324'
		AND TIH.DEL_FLG = '0'
	INNER JOIN T_INVENTORY_INST TII --棚卸指示
		ON TII.INVENTORY_H_ID = TIH.INVENTORY_H_ID 
		AND TII.INVENTORY_INST_KBN= '03' 
		AND TII.DEL_FLG = '0' 
WHERE
	ML.LocGroup = '06' 
	AND ML.LOCID IN ( '0', '1' ) 
	AND ML.DEL_FLG = '0'
	
/*
 [df:title]
 ロケーションマスタ受信一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!String systemDt!!
SELECT LOC.LOCATION_ID
FROM   M_LOCATION LOC -- ロケーションマスタ
LEFT   JOIN	(
				SELECT     BODY.LOCATION_ID LID
				FROM       T_INVENTORY_H HEAD
				INNER JOIN T_INVENTORY_INST INST
				ON         HEAD.INVENTORY_H_ID     = INST.INVENTORY_H_ID
				AND        INST.INVENTORY_INST_KBN = '03'
				AND        INST.DEL_FLG			   = '0'
				INNER JOIN T_INVENTORY_B BODY
				ON         HEAD.INVENTORY_H_ID     = BODY.INVENTORY_H_ID
				AND        BODY.DEL_FLG			   = '0'
				WHERE      HEAD.CENTER_ID          = /*pmb.centerId*/1
				AND        HEAD.CLIENT_ID          = /*pmb.clientId*/1
				AND        HEAD.INVENTORY_DT       = /*pmb.systemDt*/2024/11/11
				AND        HEAD.DEL_FLG			   = '0'
			) SUB
ON     SUB.LID                                     = LOC.LOCATION_ID
WHERE  LOC.CENTER_ID                               = /*pmb.centerId*/1
AND    LOC.LOCGROUP                                = '06'
AND    LOC.LOCID IN ('0', '1')
AND    LOC.LOCATION_TYPE                           <> 'ZZ'
AND    SUB.LID IS NULL
AND    LOC.DEL_FLG			                       = '0'


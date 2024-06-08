/*
[df:title]
棚卸ヘッダをリスト検索、ケース在庫調査情報、在庫調査補正情報を取得する。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!String systemDt!!

SELECT HEAD.INVENTORY_H_ID HEADID, -- 棚卸ヘッダID
INFO.TRCASEINVENTORY_ID INFOID, -- ケース在庫調査情報ID
INFO.VERSION_NO INFOVERSION, -- バージョンNo
OFFSET.TRINVCORRECT_ID OFFSETID, -- 在庫調査補正情報ID
OFFSET.PUTDMYCASECD OFFSETCASECD, -- 挿入ダミーケースCD
OFFSET.PUTDMYCUTCASECD OFFSETCUTCASECD, -- 挿入ダミー分割ケースCD
OFFSET.PUTDMYCASEDETAILNO OFFSETDTLNO, -- 挿入ダミーケース明細番号
OFFSET.PUTDMYDIRECTIONNO OFFSETINSTNO, -- 挿入ダミーさしず番号
OFFSET.PUTDMYDIRECTIONORDERGNO OFFSETINSTBRANCHNO, -- 挿入ダミーさしず実績枝番号
OFFSET.VERSION_NO OFFSETVERSION -- バージョンNo.
FROM  T_INVENTORY_H HEAD
INNER JOIN T_INVENTORY_INST INST
ON    HEAD.INVENTORY_H_ID                      = INST.INVENTORY_H_ID
AND   INST.INVENTORY_INST_KBN                  = '01' -- (仕分場(開始))
AND   INST.DEL_FLG			                   = '0'
INNER JOIN T_INVENTORY_B BODY
ON    BODY.INVENTORY_H_ID                      = HEAD.INVENTORY_H_ID
AND   BODY.DEL_FLG			                   = '0'
INNER JOIN T_TRCASEINVENTORY INFO
ON    INFO.INVENTORYKEY                        = HEAD.INVENTORY_KEY
AND   INFO.INVENTORY_B_ID                      = BODY.INVENTORY_B_ID
AND   INFO.DEL_FLG			                   = '0'
INNER JOIN T_TRINVCORRECT OFFSET
ON    OFFSET.CASEINVENTORYNO                   = INFO.CASEINVENTORYNO
AND   OFFSET.DEL_FLG			               = '0'
WHERE HEAD.CENTER_ID                           = /*pmb.centerId*/1
AND   HEAD.CLIENT_ID                           = /*pmb.clientId*/1
AND   HEAD.INVENTORY_DT                        = /*pmb.systemDt*/2024/11/11
AND   HEAD.DEL_FLG			                   = '0'

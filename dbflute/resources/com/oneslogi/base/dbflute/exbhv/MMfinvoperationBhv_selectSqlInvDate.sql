/*
 [df:title]
  たな卸実施日マスタを単一検索、たな卸実施日を取得する。

 [df:description]
  たな卸実施日マスタを単一検索、たな卸実施日を取得する。
*/

-- #df:entity#

-- !df:pmb!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!AutoDetect!!
SELECT
    INV_DATE                            --たな卸実施日
FROM
    M_MFINVOPERATION  --たな卸実施日マスタ
WHERE
    CLIENT_ID = /*pmb.clientId*/1
    AND CENTER_ID = /*pmb.centerId*/1
    AND TARGET_DATE LIKE /*pmb.systemDt*/'202401%'
    and DEL_FLG = '0'
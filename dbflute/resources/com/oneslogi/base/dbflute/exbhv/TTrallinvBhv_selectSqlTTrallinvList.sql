/*
 [df:title]
  統合在庫実績をリスト検索

 [df:description]
   統合在庫実績をリスト検索
*/

-- #df:entity#

-- !df:pmb!
-- !!Long clientId!!
-- !!Long centerId!!
-- !!AutoDetect!!
SELECT 
    TT.*
FROM
    T_TRALLINV TT --統合在庫実績
WHERE
    TT.CENTER_ID = /*pmb.centerId*/1
    AND TT.CLIENT_ID = /*pmb.clientId*/1
ORDER BY 
    TT.TRALLINV_ID ASC
/*
 [df:title]
  集約銘柄件数

 [df:description]
  集約銘柄件数
*/

-- #df:entity#
-- ##Long DUAL_PRODUCT_COUNT##

-- !df:pmb!
-- !!Long clientId!!
-- !!Long centerId!!
-- !!AutoDetect!!
SELECT
    COUNT(*) as DUAL_PRODUCT_COUNT                                  --集約銘柄件数
FROM
    T_TRALLINV TT --統合在庫実績
    INNER JOIN M_PRODUCT MP --銘柄マスタ
    ON MP.PRODUCT_ID = TT.PRODUCT_ID
    AND MP.LOTATRB1TITLE= CONCAT('00',/*pmb.dualItemCd*/'00')
    AND MP.DEL_FLG ='0'
WHERE    
    TT.CENTER_ID = /*pmb.centerId*/1
    AND TT.CLIENT_ID = /*pmb.clientId*/1
    AND TT.DEL_FLG = '0'
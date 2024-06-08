/*
 [df:title]
   庫内作業集約CDで統合在庫実績を取得

 [df:description]
   庫内作業集約CDで統合在庫実績を取得
*/

-- #df:entity#
-- ##String CAPITEMFLG##
-- ##String DUALITEMCD##
-- ##Long DUALPRODUCTID##

-- !df:pmb!
-- !!Long clientId!!
-- !!Long centerId!!
-- !!AutoDetect!!
SELECT
    MC.CENTER_CD,                                         --拠点CD
    TT.EXECUTEDATE,                                       --在庫実績日
    TT.INOUTKBN,                                          --内外区分
    TT.PRODUCT_ID,                                        --銘柄ID
    TT.SYSINVTOTALINV,                                    --システム適品在庫計
    TT.SYSINVKEEPLOCINV,                                  --システム保管場在庫
    TT.SYSINVRECEIVELOCINV,                               --システム引取場在庫
    TT.SYSINVDAMAGEITEM,                                  --システムかし品在庫
    TT.SYSINVCLSSIFYLOCINV,                               --システム仕分場在庫
    TT.SYSINVTMPLOCINV,                                   --システム仕分済在庫
    TT.SYSINVAUTOINV,                                     --システム自動在庫
    TT.INVESTTOTALINV,                                    --調査適品在庫計
    TT.INVESTKEEPLOCINV,                                  --調査保管場在庫
    TT.INVESTRECEIVELOCINV,                               --調査引取場在庫
    TT.INVESTDAMAGEITEM,                                  --調査かし品在庫
    TT.INVESTCLSSIFYLOCINV,                               --調査仕分場在庫
    TT.INVESTTMPLOCINV,                                   --調査仕分済在庫
    TT.INVESTAUTOINV,                                     --調査自動在庫
    TT.YDAYTLEQULYTOTALINV,                               --過不足統計適品在庫計
    TT.TDAYEQYTOTALINV,                                   --過不足当日適品在庫計
    TT.CAPITEMFLG AS CAPITEMFLG,                          --CAP銘柄区分
    TT.CENTER_ID,                                         --拠点ID
    TT.CLIENT_ID,                                         --荷主ID
    MP.PRODUCT_ID AS DUALPRODUCTID,                       --庫内作業集約CD商品ID
    SUBSTRING(MP.LOTATRB1TITLE,3,4) AS DUALITEMCD         --庫内作業集約CD
FROM
    T_TRALLINV TT --統合在庫実績
    INNER JOIN M_PRODUCT MP --銘柄マスタ
    ON MP.PRODUCT_ID = TT.PRODUCT_ID
    AND MP.PRODUCT_CD = /*pmb.dualItemCd*/'00'
    AND MP.DEL_FLG = '0'
    INNER JOIN M_CENTER MC --拠点マスタ
    ON MC.CENTER_ID = TT.CENTER_ID
    AND MC.DEL_FLG = '0'
WHERE 
    TT.CENTER_ID = /*pmb.centerId*/1
    AND TT.CLIENT_ID = /*pmb.clientId*/1
    AND TT.DEL_FLG = '0'    
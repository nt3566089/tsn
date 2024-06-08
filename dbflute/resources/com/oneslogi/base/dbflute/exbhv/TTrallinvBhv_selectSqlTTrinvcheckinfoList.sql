/*
 [df:title]
  統合在庫実績をリスト検索する。

 [df:description]
   統合在庫実績をリスト検索する。
*/

-- #df:entity#
-- ##String DUALITEMCD##
-- ##String CAPITEMFLG##


-- !df:pmb!
-- !!Long clientId!!
-- !!Long centerId!!
-- !!AutoDetect!!
SELECT
    MC.CENTER_CD,                                   --拠点CD
    TR.EXECUTEDATE,                                 --在庫実績日
    TR.INOUTKBN,                                    --内外区分
    MP.PRODUCT_ID,                                  --商品ID
    TR.SYSINVTOTALINV,                              --システム適品在庫計
    TR.SYSINVKEEPLOCINV,                            --システム保管場在庫
    TR.SYSINVRECEIVELOCINV,                         --システム引取場在庫
    TR.SYSINVDAMAGEITEM,                            --システムかし品在庫
    TR.SYSINVCLSSIFYLOCINV,                         --システム仕分場在庫
    TR.SYSINVTMPLOCINV,                             --システム仕分済在庫
    TR.SYSINVAUTOINV,                               --システム自動在庫
    TR.INVESTTOTALINV,                              --調査適品在庫計
    TR.INVESTKEEPLOCINV,                            --調査保管場在庫
    TR.INVESTRECEIVELOCINV,                         --調査引取場在庫
    TR.INVESTDAMAGEITEM,                            --調査かし品在庫
    TR.INVESTCLSSIFYLOCINV,                         --調査仕分場在庫
    TR.INVESTTMPLOCINV,                             --調査仕分済在庫
    TR.INVESTAUTOINV,                               --調査自動在庫
    TR.YDAYTLEQULYTOTALINV,                         --過不足統計適品在庫計
    TR.TDAYEQYTOTALINV,                             --過不足当日適品在庫計
    TR.CAPITEMFLG AS CAPITEMFLG,                    --CAP銘柄区分
    TR.CENTER_ID,                                   --拠点ID
    TR.CLIENT_ID,                                   --荷主ID
    SUBSTRING(MP.LOTATRB1TITLE,3,4) AS DUALITEMCD   --庫内作業集約CD
FROM 
    T_TRALLINV TR --統合在庫実績
    INNER JOIN M_PRODUCT MP --銘柄マスタ
    ON MP.PRODUCT_ID = TR.PRODUCT_ID
    AND SUBSTRING(MP.LOTATRB1TITLE,3,4) IS NOT NULL
    AND MP.DEL_FLG = '0'
    INNER JOIN M_CENTER MC --拠点マスタ
    ON MC.CENTER_ID = TR.CENTER_ID
    AND MC.DEL_FLG = '0'
WHERE 
    TR.CENTER_ID =  /*pmb.centerId*/1
    AND TR.CLIENT_ID = /*pmb.clientId*/1
    AND TR.DEL_FLG = '0'
    ORDER BY MP.PRODUCT_CD ASC
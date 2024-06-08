/*
 [df:title]
  集計用統合在庫実績をリスト検索する。

 [df:description]
  集計用統合在庫実績をリスト検索する。
*/

-- #df:entity#
-- ##String CAPITEMFLG##
-- ##Long DUALPRODUCTID##

-- !df:pmb!
-- !!Long clientId!!
-- !!Long centerId!!
-- !!AutoDetect!!
SELECT
    MC.CENTER_CD,                                                   --拠点CD 
    SUB1.EXECUTEDATE,                                               --在庫実績日
    SUB1.INOUTKBN,                                                  --内外区分
    SUB1.DUALITEMCD,                                                --庫内作業集約CD
    SUB1.CENTER_ID,                                                 --拠点ID
    SUB1.CLIENT_ID,                                                 --荷主ID
    MAX(MP.PRODUCT_ID) AS DUALPRODUCTID,                            --庫内作業集約CD商品ID
    MP.USERNUM4 AS CAPITEMFLG,                                      --CAP銘柄区分
    SUM(SUB1.SYSINVTOTALINV) AS SYSINVTOTALINV,                     --システム適品在庫計
    SUM(SUB1.INVESTTOTALINV) AS INVESTTOTALINV,                     --調査適品在庫計
    SUM(SUB1.INVESTKEEPLOCINV) AS INVESTKEEPLOCINV,                 --調査保管場在庫
    SUM(SUB1.INVESTRECEIVELOCINV) AS INVESTRECEIVELOCINV,           --調査引取場在庫    
    SUM(SUB1.INVESTDAMAGEITEM) AS INVESTDAMAGEITEM,                 --調査かし品在庫
    SUM(SUB1.INVESTCLSSIFYLOCINV) AS INVESTCLSSIFYLOCINV,           --調査仕分場在庫
    SUM(SUB1.INVESTTMPLOCINV) AS INVESTTMPLOCINV,                   --調査仕分済在庫
    SUM(SUB1.INVESTAUTOINV) AS INVESTAUTOINV,                       --調査自動在庫
    SUM(SUB1.YDAYTLEQULYTOTALINV) AS YDAYTLEQULYTOTALINV,           --過不足統計適品在庫計
    SUM(SUB1.TDAYEQYTOTALINV) AS TDAYEQYTOTALINV                    --過不足当日適品在庫計
FROM
(
    SELECT
    	TT.EXECUTEDATE,                                 --在庫実績日
    	TT.INOUTKBN,                                    --内外区分
    	TT.PRODUCT_ID,                                  --商品ID
    	TT.SYSINVTOTALINV,                              --システム適品在庫計
    	TT.INVESTTOTALINV,                              --調査適品在庫計
    	TT.INVESTKEEPLOCINV,                            --調査保管場在庫
    	TT.INVESTRECEIVELOCINV,                         --調査引取場在庫
    	TT.INVESTDAMAGEITEM,                            --調査かし品在庫
    	TT.INVESTCLSSIFYLOCINV,                         --調査仕分場在庫
    	TT.INVESTTMPLOCINV,                             --調査仕分済在庫
    	TT.INVESTAUTOINV,                               --調査自動在庫
    	TT.YDAYTLEQULYTOTALINV,                         --過不足統計適品在庫計
    	TT.TDAYEQYTOTALINV,                             --過不足当日適品在庫計
    	TT.CAPITEMFLG,                                  --CAP銘柄区分
    	TT.CENTER_ID,                                   --拠点ID
    	TT.CLIENT_ID,                                   --荷主ID
        MP.PRODUCT_ID AS DUALPRODUCTID,                 --庫内作業集約CD商品ID
    	CASE
    			WHEN MP.LOTATRB1TITLE IS NOT NULL 
    					THEN SUBSTRING(MP.LOTATRB1TITLE,3,4)
    			ELSE CAST(MP.PRODUCT_CD AS NVARCHAR(4))
    	END  AS DUALITEMCD      --庫内作業集約CD
    FROM
    	T_TRALLINV TT --統合在庫実績
    	INNER JOIN M_PRODUCT MP --銘柄マスタ
    	ON MP.PRODUCT_ID = TT.PRODUCT_ID
    	AND MP.DEL_FLG='0'
    WHERE
    	TT.CENTER_ID = /*pmb.centerId*/1
    	AND TT.CLIENT_ID = /*pmb.clientId*/1
    	and TT.DEL_FLG = '0'
) SUB1 --副問合せ1
INNER JOIN M_PRODUCT MP --銘柄マスタ
    ON MP.CLIENT_ID = SUB1.CLIENT_ID
    AND MP.PRODUCT_CD = SUB1.DUALITEMCD
    AND MP.DEL_FLG = '0'
INNER JOIN M_CENTER MC --拠点マスタ
    ON MC.CENTER_ID = SUB1.CENTER_ID
    AND MC.DEL_FLG = '0'
GROUP BY 
    MC.CENTER_CD,
    SUB1.EXECUTEDATE,
    SUB1.INOUTKBN,
    SUB1.DUALITEMCD,
    SUB1.CENTER_ID,
    SUB1.CLIENT_ID,
    MP.USERNUM4
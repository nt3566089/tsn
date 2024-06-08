/*
 [df:title]
  販売物流在庫情報をリスト検索

 [df:description]
  販売物流在庫情報をリスト検索
*/

-- #df:entity#

-- !df:pmb!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!String systemDtFrom!!
-- !!String systemDtTo!!
-- !!AutoDetect!!
SELECT
    TT.CENTER_ID,                           --拠点ID
    TT.CLIENT_ID,                           --荷主ID       
    TT.INOUTKBN,                            --内外区分
    MP.PRODUCT_ID,                          --商品ID
    TT.STOCKQTY,                            --在庫数量
    TT.DAMAGEITEMQTY                        --かし品数量
FROM 
	T_TRHANBAIINV TT --販売物流在庫情報
	INNER JOIN M_PRODUCT MP --銘柄マスタ
    	ON MP.CLIENT_ID = TT.CLIENT_ID  
        AND MP.SUPPLIERITEMCD = TT.PRODUCT_CD
        AND MP.DEL_FLG = '0'
WHERE
    TT.CENTER_ID =  /*pmb.centerId*/1   
    AND TT.CLIENT_ID = /*pmb.clientId*/1
    AND TT.STOCKDATETIME >= /*pmb.systemDtFrom*/'20240417 00:00:00'
    AND TT.STOCKDATETIME <= /*pmb.systemDtTo*/'20240417 23:59:59'
    AND TT.GOODITEMKBN = '0'
    AND TT.DEL_FLG= '0'
	
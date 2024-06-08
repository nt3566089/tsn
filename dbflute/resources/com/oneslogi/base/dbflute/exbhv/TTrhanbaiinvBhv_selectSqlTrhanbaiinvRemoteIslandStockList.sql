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
-- !!String centerCd!!
-- !!String systemDtFrom!!
-- !!String systemDtTo!!
-- !!AutoDetect!!
SELECT 
    TT.CENTER_ID,                                           --拠点ID
    TT.CLIENT_ID,                                           --荷主ID    
    MP.PRODUCT_ID,                                          --商品ID
    MAX(MP.USERNUM1) AS USERNUM1,                           --国産・輸入区分
    SUM(
        (REMOTE_ISLAND.CASE_NUM*MP.UNIT1*MP.UNIT2)
        +REMOTE_ISLAND.CARTON_NUM*MP.UNIT2
    ) AS STOCK_NUM                                          --在庫数
FROM 
	T_TRHANBAIINV TT --販売物流在庫情報
	INNER JOIN M_PRODUCT MP --銘柄マスタ
	ON MP.CLIENT_ID = TT.CLIENT_ID
	AND MP.PRODUCT_CD = TT.PRODUCT_CD
	AND MP.DEL_FLG = '0'
INNER JOIN
(
        SELECT 
            TCH.CENTER_ID,                                  --拠点ID
            TCH.CLIENT_ID,                                  --荷主ID
            TC.ZZMATNR,                                     --銘柄CD
            ISNULL(TC.SLQACB,0) AS CASE_NUM,                --ケース数
            ISNULL(TC.SLQACT,0) AS CARTON_NUM               --カートン数
        FROM
            T_CORDDTASR TC --さしずデータ(仕分中)
            INNER JOIN T_CORDHDR TCH --さしずヘッダ
            ON TCH.ORDER_H_ID = TC.ORDER_H_ID
            AND TCH.CENTER_ID = /*pmb.centerId*/1
            AND TCH.CLIENT_ID = /*pmb.clientId*/1
            AND TCH.DEL_FLG = '0'
            INNER JOIN M_PRODUCT MP --銘柄マスタ
            ON MP.CLIENT_ID = TCH.CLIENT_ID
            AND MP.PRODUCT_CD = TC.ZZMATNR
            AND MP.USERDATE1 <= TC.DLVYMD
            AND MP.USERDATE2 >= TC.DLVYMD
            AND (
                MP.USERDATE3 IS NULL
                OR
                MP.USERDATE3 > TC.DLVYMD
            )
            AND MP.DEL_FLG = '0'
            INNER JOIN M_CDRCATT MC --方面属性マスタ
            ON MC.CENTER_ID = TCH.CENTER_ID
            AND MC.CLIENT_ID = TCH.CLIENT_ID
            AND MC.DRCCD = TC.DED
            AND MC.ZZPSTNID = TC.PSTNID
            AND MC.REMOTEISLAND = '1'
            AND MC.DEL_FLG = '0'
        WHERE
            TC.SRWHCD = /*pmb.centerCd*/'00'
            AND TC.SRYMD = /*pmb.systemDt*/'20240324'
            AND TC.ORDDVFG = '1'
            AND TC.SRLINCD != 'X1'
            AND TC.SRLINCD != 'X2'
            AND TC.DEL_FLG = '0'
) REMOTE_ISLAND --副問合せ1(さしず(離島)情報)
	ON REMOTE_ISLAND.CENTER_ID = TT.CENTER_ID
	AND REMOTE_ISLAND.CLIENT_ID = TT.CLIENT_ID
	AND REMOTE_ISLAND.ZZMATNR = TT.PRODUCT_CD
WHERE
	TT.CENTER_ID = /*pmb.centerId*/1
	AND TT.CLIENT_ID =  /*pmb.clientId*/1
	AND TT.STOCKDATETIME >= /*pmb.systemDtFrom*/'20240417 00:00:00'
    AND TT.STOCKDATETIME <= /*pmb.systemDtTo*/'20240417 23:59:59'
	AND TT.GOODITEMKBN = '0'
	AND TT.DEL_FLG ='0'
	GROUP BY
	TT.CENTER_ID,
	TT.CLIENT_ID,
	MP.PRODUCT_ID
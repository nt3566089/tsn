/*
 [df:title]
 区分値マスタを単一検索、決算たな卸月件数を取得する。

 [df:description]
  SQL Description here.

*/
-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

SELECT
    COUNT(BCD.CLASS_DTL_ID) AS   SETTLEMENTINVMONTH_NUM                           -- 決算たな卸月件数
FROM
    B_CLASS BC--①区分値マスタ
    INNER JOIN B_CLASS_DTL BCD--②区分値明細マスタ
    ON BCD.CLASS_ID = BC.CLASS_ID
    AND BCD.CLASS_DTL_CD = SUBSTRING(/*pmb.classDtlCd*/'TOKYO',5,2)
    AND BCD.DEL_FLG = '0'
WHERE
    BC.CLASS_CD = 'SETTLEMENTINVMONTH'
AND
    BC.DEL_FLG = '0'
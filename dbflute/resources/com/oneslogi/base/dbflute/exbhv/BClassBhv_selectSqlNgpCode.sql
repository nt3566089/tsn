/*
 [df:title]
  NGP製品銘柄コード取得

 [df:description]
  NGP製品銘柄コード取得
*/

-- #df:entity#

-- !df:pmb!
-- !!String classDtlCd!!
-- !!AutoDetect!!
SELECT
    BCDS.OTHERCD1                                               --その他コード１
FROM
    B_CLASS BC --区分値マスタ
    INNER JOIN B_CLASS_DTL BCD --区分値明細マスタ
    ON BCD.CLASS_ID = BC.CLASS_ID
    AND BCD.CLASS_DTL_CD = /*pmb.classDtlCd*/'MIN'
    AND BCD.DEL_FLG = '0'
    INNER JOIN B_CLASS_DTL_SUB BCDS --区分値明細マスタサブ
    ON BCDS.CLASS_DTL_ID = BCD.CLASS_DTL_ID
    AND BCDS.DEL_FLG = '0'
WHERE
    BC.CLASS_CD='NGPITEMCD'
    AND BC.DEL_FLG = '0'
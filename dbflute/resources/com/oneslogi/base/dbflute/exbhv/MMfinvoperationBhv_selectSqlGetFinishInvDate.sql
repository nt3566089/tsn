/*
 [df:title]
  たな卸実施日マスタ取得(終了日の取得)

 [df:description]
  SQL Description here.

*/
-- #df:entity#

-- !df:pmb!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!AutoDetect!!
SELECT
    MIN(MM.INV_DATE) AS RcvToDate					-- たな卸実施日(終了日)
FROM
    M_MFINVOPERATION MM
WHERE
    MM.CLIENT_ID = /*pmb.clientId*/'1'
AND
    MM.CENTER_ID =  /*pmb.centerId*/'1'
AND
    MM.INV_DATE >= /*pmb.invDate*/'20210101'
AND
    MM.DEL_FLG = '0'
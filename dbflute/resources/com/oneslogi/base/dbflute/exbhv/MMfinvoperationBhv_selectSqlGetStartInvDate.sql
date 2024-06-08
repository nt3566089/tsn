/*
 [df:title]
 たな卸実施日マスタ取得(開始日の取得)

 [df:description]
  たな卸実施日マスタ取得(開始日の取得)

*/
-- #df:entity#

-- !df:pmb!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!AutoDetect!!
SELECT
    FORMAT(DATEADD(DAY,1,MAX(MM.INV_DATE)),'yyyyMMdd') AS RcvFrDate 				-- たな卸実施日(開始日)
FROM
   M_MFINVOPERATION MM
WHERE
    MM.CLIENT_ID = /*pmb.clientId*/'1'
AND
    MM.CENTER_ID = /*pmb.centerId*/'1'
AND
    MM.INV_DATE < /*pmb.invDate*/'20210101'
AND  
    MM.DEL_FLG = '0'
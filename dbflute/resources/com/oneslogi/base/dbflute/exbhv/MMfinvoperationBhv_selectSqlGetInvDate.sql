/*
 [df:title]
 たな卸実施日マスタを単一検索、たな卸実施日を取得する

 [df:description]
  SQL Description here.

*/
-- #df:entity#

-- !df:pmb!
-- !!Long centerId!!
-- !!AutoDetect!!

SELECT
    MM.INV_DATE                                 -- たな卸実施日
FROM
    M_MFINVOPERATION MM
WHERE
    MM.CLIENT_ID =  /*pmb.clientId*/11111111111
AND
    MM.CENTER_ID = /*pmb.centerId*/11111111111
AND
    MM.INV_DATE LIKE CONCAT(SUBSTRING(/*pmb.invDate*/'20210101',1,6),'%')
AND
    MM.DEL_FLG = '0'
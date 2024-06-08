/*
 [df:title]
 郵便番号マスタ受信一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!Long cultureId!!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT
    EZ.ZIP_ID,
    EZ.RECEIVE_CD,
    EZ.RECEIVE_ROW_ID,
    EZ.IMPORT_FLG,
    EZ.ERROR_FLG,
    EZ.ERROR_MESSAGE_CD,
    EZ.ZIP_CD,
    EZ.PUBLIC_CD,
    EZ.ZIP_CD5,
    EZ.ADDRESS_KN1,
    EZ.ADDRESS_KN2,
    EZ.ADDRESS_KN3,
    EZ.COMPANY_KN,
    EZ.ADDRESS1,
    EZ.ADDRESS2,
    EZ.ADDRESS3,
    EZ.ADDRESS4,
    EZ.COMPANY_NM,
    EZ.FLG1,
    EZ.FLG2,
    EZ.FLG3,
    EZ.FLG4,
    EZ.UPD_TYPE,
    EZ.REASON_TYPE,
    EZ.HANDLING_ADDRESS,
    EZ.FLG5,
    EZ.FLG6,
    EZ.UPD_CD,
    EZ.COMPANY_FLG,
    EZ.DEL_FLG,
    EZ.VERSION_NO,
    EZ.CONTROL_NO,
    EZ.ADD_DT,
    EZ.ADD_USER,
    EZ.ADD_PROCESS,
    EZ.UPD_DT,
    EZ.UPD_USER,
    EZ.UPD_PROCESS,
    BM.MESSAGE_NM,
    MZ.ZIP_ID AS MZIP_ID,
    MZ.VERSION_NO AS MVERSION_NO
-- ELSE SELECT COUNT(*)
/*END*/
FROM E_ZIP EZ
    LEFT JOIN B_MESSAGE BM
    ON BM.MESSAGE_CD=EZ.ERROR_MESSAGE_CD
    /*IF pmb.cultureId != null*/
    AND BM.CULTURE_ID = /*pmb.cultureId*/12345678901
    /*END*/
  LEFT JOIN M_ZIP MZ
    ON EZ.ZIP_CD = MZ.ZIP_CD
WHERE
    1 = 1
AND EZ.RECEIVE_CD = /*pmb.receiveCd*/'E12345678901'
/*IF pmb.errorFlg != null*/
    AND EZ.ERROR_FLG = /*pmb.errorFlg*/'0'
/*END*/
/*IF pmb.importFlg != null*/
    AND EZ.IMPORT_FLG = /*pmb.importFlg*/'0'
/*END*/
/*IF pmb.isPaging()*/
ORDER BY
    EZ.ZIP_ID ASC,
    EZ.RECEIVE_CD ASC,
    EZ.RECEIVE_ROW_ID ASC
/*END*/

/*
 [df:title]
 不適品ラベル一覧。

 [df:description]
  不適品ラベル一覧を出力します。

*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
SELECT
  TRBAD.TRBADITEMCASE_ID,
  TRBAD.CREATEDDATE,
  TRBAD.TARGETMON,
  TRBAD.ITEMCD,
  MPR.PRODUCT_ABBR,
  TRBAD.LBLKBN,
  TRBAD.INOUTKBN,
  TRBAD.VA_EXTDATA2,
  MPR.ALLOCPOLICYKEY,
  (MPR.UNIT1 * MPR.UNIT2) AS CASE_NUM,
  TRBAD.BADITEMCD,
  ISNULL(TRBAD_CNT.TODAY_NUM, 0) AS TODAY_NUM,
  TRBAD.CREATEDNUM,
  TRBAD.REPRINTEDFLG,
  TRBAD.VA_EXTDATA1,
  TRBAD.VERSION_NO,
  MPR.USERNUM3,
  MCE.CENTER_ID,
  MCE.CENTER_NM,
  MCL.CLIENT_ID,
  MCL.CLIENT_NM
-- ELSE SELECT COUNT(*)
/*END*/
FROM T_TRBADITEMCASE TRBAD -- 不適品ラベル情報
LEFT OUTER JOIN
( -- 当日作成ラベル枚数を不適品ラベル情報から取得
  SELECT
    LBLKBN,
    VA_EXTDATA2,
    EXPITEMCD,
    COUNT(*) TODAY_NUM
  FROM T_TRBADITEMCASE
  WHERE
    CENTER_ID = /*pmb.centerId*/11111111111
    AND CLIENT_ID = /*pmb.clientId*/11111111111
    AND DT_EXTDATA1 = /*pmb.dtExtdata1*/'20240101'
    /*IF pmb.inoutkbn != null*/
    AND INOUTKBN = /*pmb.inoutkbn*/'a123'
    /*END*/
    /*IF pmb.vaExtdata2 != null*/
    AND VA_EXTDATA2 = /*pmb.vaExtdata2*/'a123'
    /*END*/
    AND DEL_FLG = '0'
  GROUP BY
    LBLKBN,
    VA_EXTDATA2,
    EXPITEMCD
) TRBAD_CNT
  ON TRBAD_CNT.LBLKBN = TRBAD.LBLKBN
  AND TRBAD_CNT.VA_EXTDATA2 = TRBAD.VA_EXTDATA2
  AND TRBAD_CNT.EXPITEMCD = TRBAD.EXPITEMCD
INNER JOIN M_CENTER MCE -- 拠点マスタ
  ON MCE.CENTER_ID = TRBAD.CENTER_ID
  AND MCE.DEL_FLG = '0'
INNER JOIN M_CLIENT MCL -- 荷主マスタ
  ON MCL.CLIENT_ID = TRBAD.CLIENT_ID
  AND MCL.DEL_FLG = '0'
INNER JOIN M_PRODUCT MPR  -- 銘柄マスタ
  ON MPR.CLIENT_ID = TRBAD.CLIENT_ID
  AND MPR.PRODUCT_CD = TRBAD.ITEMCD
  AND MPR.DEL_FLG = '0'
WHERE
  TRBAD.CENTER_ID = /*pmb.centerId*/11111111111
  AND TRBAD.CLIENT_ID = /*pmb.clientId*/11111111111
  AND TRBAD.LBLKBN = '0000'
  /*IF pmb.createddateFrom != null*/
  AND TRBAD.CREATEDDATE >= /*pmb.createddateFrom*/'20000101'
  /*END*/
  /*IF pmb.createddateTo != null*/
  AND TRBAD.CREATEDDATE <= /*pmb.createddateTo*/'20240101'
  /*END*/
  /*IF pmb.targetmon != null*/
  AND TRBAD.TARGETMON LIKE /*pmb.targetmon*/'202401%'
  /*END*/
  /*IF pmb.reprintedflg != null*/
  AND TRBAD.REPRINTEDFLG = /*pmb.reprintedflg*/'a123'
  /*END*/
  /*IF pmb.inoutkbn != null*/
  AND TRBAD.INOUTKBN = /*pmb.inoutkbn*/'a123'
  /*END*/
  /*IF pmb.vaExtdata2 != null*/
  AND TRBAD.VA_EXTDATA2 = /*pmb.vaExtdata2*/'a123'
  /*END*/
  /*IF pmb.itemcd != null*/
  AND TRBAD.ITEMCD LIKE /*pmb.itemcd*/'a123%'
  /*END*/
  /*IF pmb.baditemcd != null*/
  AND TRBAD.BADITEMCD = /*pmb.baditemcd*/11111111111
  /*END*/
  /*IF pmb.todayPrintOnlyFlg == '1'*/
  AND TRBAD_CNT.TODAY_NUM > 1
  /*END*/
  AND TRBAD.DEL_FLG = '0'
/*IF pmb.isPaging()*/
ORDER BY
  TRBAD.CREATEDDATE ASC,
  TRBAD.TARGETMON ASC,
  TRBAD.VA_EXTDATA2 ASC,
  MPR.USERNUM3 ASC,
  TRBAD.ITEMCD ASC,
  TRBAD.BADITEMCD ASC
/*END*/

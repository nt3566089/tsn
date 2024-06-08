/*
 [df:title]
  作業量照会リスト検索。

 [df:description]
 作業実績(基盤)から作業量照会のリストを検索する。

*/
-- #df:entity#
-- ##Long store_record_h_id##
-- ##Long store_record_b_id##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT
    TWK.SEQUENCENO
  , FORMAT(CONVERT(DATE, TWK.WORK_DT),'yyyy/MM/dd') WORK_DT
  , TWK.USERCD
  , BU.USER_NM
  /*IF pmb.sequenceno != null*/
  , TWK.TASK_TYPE
  , TWK.TASK_TYPE_DETAIL
  , FORMAT(TWK.WORKTIME, 'yyyy/MM/dd HH:mm:ss') WORKTIME
  , TWK.START_END
  -- ELSE
  -- , VD1.DICT_NM TASK_TYPE
  -- , VD2.DICT_NM TASK_TYPE_DETAIL
  -- , FORMAT(TWK.WORKTIME, 'HH:mm') WORKTIME
  -- , VD3.DICT_NM START_END
  /*END*/
  , TWK.WORK_PALLET_QTY
  , TWK.WORK_CASE_QTY
  , TWK.WORK_CARTON_QTY
  , TWK.WORK_QTY
  , TWK.CENTER_CD
  , MCT.CENTER_NM
  , TWK.CLIENT_CD
  , MCL.CLIENT_NM 
-- ELSE SELECT COUNT(*)
/*END*/
FROM
  T_TRWORK TWK 
  INNER JOIN B_USER BU                            -- ユーザマスタ
    ON TWK.USERCD = BU.USER_CD 
    AND BU.DEL_FLG = '0' 
  INNER JOIN B_CLASS BC1 
    ON BC1.CLASS_CD = 'TASKTYPE' 
    AND BC1.DEL_FLG = '0' 
  INNER JOIN B_CLASS_DTL BD1 
    ON BD1.CLASS_ID = BC1.CLASS_ID 
    AND BD1.CLASS_DTL_CD = TWK.TASK_TYPE 
    AND BD1.DEL_FLG = '0' 
  INNER JOIN V_DICT VD1 
    ON VD1.DICT_ID = BD1.DICT_ID 
    AND VD1.CULTURE_ID = /*pmb.cultureId*/11111111111
  INNER JOIN B_CLASS BC2 
    ON BC2.CLASS_CD = 'TASKTYPEDETAIL' 
    AND BC2.DEL_FLG = '0' 
  INNER JOIN B_CLASS_DTL BD2 
    ON BD2.CLASS_ID = BC2.CLASS_ID 
    AND BD2.CLASS_DTL_CD = TWK.TASK_TYPE_DETAIL 
    AND BD2.DEL_FLG = '0' 
  INNER JOIN V_DICT VD2 
    ON VD2.DICT_ID = BD2.DICT_ID 
    AND VD2.CULTURE_ID = /*pmb.cultureId*/11111111111
  INNER JOIN B_CLASS BC3 
    ON BC3.CLASS_CD = 'START_END' 
    AND BC3.DEL_FLG = '0' 
  INNER JOIN B_CLASS_DTL BD3 
    ON BD3.CLASS_ID = BC3.CLASS_ID 
    AND BD3.CLASS_DTL_CD = TWK.START_END 
    AND BD3.DEL_FLG = '0' 
  INNER JOIN V_DICT VD3 
    ON VD3.DICT_ID = BD3.DICT_ID 
    AND VD3.CULTURE_ID = /*pmb.cultureId*/11111111111
  INNER JOIN M_CLIENT MCL                         -- 荷主マスタ
    ON TWK.CLIENT_CD = MCL.CLIENT_CD 
    AND MCL.DEL_FLG = '0' 
  INNER JOIN M_CENTER MCT                         -- センタマスタ
    ON TWK.CENTER_CD = MCT.CENTER_CD 
    AND MCT.DEL_FLG = '0' 
WHERE
  TWK.DEL_FLG = '0' 
  /*IF pmb.sequenceno != null*/
  AND TWK.SEQUENCENO IN /*pmb.sequenceno*/(11111111111) 
  /*END*/
  /*IF pmb.centerCd != null*/
  AND TWK.CENTER_CD = /*pmb.centerCd*/'3020' 
  /*END*/
  /*IF pmb.clientCd != null*/
  AND TWK.CLIENT_CD = /*pmb.clientCd*/'A' 
  /*END*/
  /*IF pmb.taskType != null*/
  AND TWK.TASK_TYPE = /*pmb.taskType*/'HN' 
  /*END*/
  /*IF pmb.taskTypeDetail != null*/
  AND TWK.TASK_TYPE_DETAIL = /*pmb.taskTypeDetail*/'HN002L01' 
  /*END*/
  /*IF pmb.workDt != null*/
  AND TWK.WORK_DT = /*pmb.workDt*/'20230403' 
  /*END*/
  /*IF pmb.workTimeFrom != null*/
  AND FORMAT(TWK.WORKTIME, 'HH:mm') >= /*pmb.workTimeFrom*/'00:00' 
  /*END*/
  /*IF pmb.workTimeTo != null*/
  AND FORMAT(TWK.WORKTIME, 'HH:mm') <= /*pmb.workTimeTo*/'23:59' 
  /*END*/
  /*IF pmb.startendType != null*/
  AND TWK.START_END = /*pmb.startendType*/'1' 
  /*END*/
  /*IF pmb.usercd != null*/
  AND TWK.USERCD LIKE /*pmb.usercd*/'%' 
  /*END*/
  /*IF pmb.userNm != null*/
  AND BU.USER_NM LIKE /*pmb.userNm*/'%' 
  /*END*/
/*IF pmb.isPaging()*/
ORDER BY
  TWK.USERCD asc
  , TWK.WORKTIME asc
/*END*/

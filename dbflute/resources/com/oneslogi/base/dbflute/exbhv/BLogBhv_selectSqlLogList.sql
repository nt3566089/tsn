/*
 [df:title]
  ログ一覧メンテナンスを取得します。出荷指示ヘッダ1レコード毎です。

 [df:description]
  SQL Description here.

*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!Long cultureId!!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/

SELECT
  BM2.MESSAGE_NM
  , VD.DICT_NM                                    -- ログステータス
  , BL.PROCESS_START_DT                           -- 処理開始日時
  , BL.PROCESS_END_DT                             -- 処理終了日時
  , BL.LOG_GROUP_CD                               -- ロググループCD
  , BL.LOG_ID                                     -- ログID
  , CASE
    WHEN BL.LOG_GROUP_NM IS NULL OR TRIM(BL.LOG_GROUP_NM)=''
    THEN BM1.MESSAGE_NM
    ELSE BL.LOG_GROUP_NM
    END LOG_GROUP_NM                              -- ロググループ名称
  , BL.PGM_CD                                     -- プログラムCD
  , CASE
    WHEN BL.PGM_NM IS NULL OR TRIM(BL.PGM_NM)=''
    THEN BM2.MESSAGE_NM
    ELSE BL.PGM_NM
    END PGM_NM                                    -- プログラム名称
  , BL.ATTRIBUTE1                                 -- センタCD
  , MCE.CENTER_NM                                 -- センタ名称
  , BL.ATTRIBUTE2                                 -- 荷主CD
  , MCL.CLIENT_NM                                 -- 荷主名称
  , BL.ATTRIBUTE3                                 -- 属性３CD
  , '' AS ATTRIBUTE3_NM                           -- 属性３名称
  , BL.ATTRIBUTE4                                 -- 属性４CD
  , '' AS ATTRIBUTE4_NM                           -- 属性４名称
  , BL.ATTRIBUTE5                                 -- 属性５CD
  , '' AS ATTRIBUTE5_NM                           -- 属性５名称
-- ELSE SELECT COUNT(*)
/*END*/
FROM
  B_LOG BL
  LEFT OUTER JOIN B_CLASS BC
    ON BC.CLASS_CD = 'LOG_STATUS'
  LEFT OUTER JOIN B_CLASS_DTL BCD
    ON BC.CLASS_ID = BCD.CLASS_ID
    AND BL.LOG_STATUS = BCD.CLASS_DTL_CD
  LEFT OUTER JOIN V_DICT VD
    ON VD.DICT_ID = BCD.DICT_ID
  -- [ON推-品向-588] b_dict_culture検索を追加 2015.05.21 pangjh 修正 Start
    AND (VD.CULTURE_ID = /*pmb.cultureId*/11111111111 OR VD.CULTURE_ID IS NULL)
  -- [ON推-品向-588] b_dict_culture検索を追加 2015.05.21 pangjh 修正 End
  LEFT OUTER JOIN B_MESSAGE BM1
    ON BL.LOG_GROUP_CD = BM1.MESSAGE_CD
    AND BM1.CULTURE_ID = /*pmb.cultureId*/'1'
  LEFT OUTER JOIN B_MESSAGE BM2
    ON BL.PGM_CD = BM2.MESSAGE_CD
    AND BM2.CULTURE_ID = /*pmb.cultureId*/'1'
  LEFT OUTER JOIN M_CENTER MCE
    ON BL.ATTRIBUTE1 = MCE.CENTER_CD
  LEFT OUTER JOIN M_CLIENT MCL
    ON BL.ATTRIBUTE2 = MCL.CLIENT_CD
WHERE
   1 = 1
  -- ログステータス
  /*IF pmb.logStatus != null*/
  AND BL.LOG_STATUS = /*pmb.logStatus*/'1'
  /*END*/
  -- 処理日From
  /*IF pmb.processDtFrom != null*/
  AND (
    BL.PROCESS_START_DT >= /*pmb.processDtFrom*/'20140808'
    OR BL.PROCESS_END_DT >= /*pmb.processDtFrom*/'20140809'
  )
   /*END*/
  -- 処理日To
  /*IF pmb.processDtTo != null*/
  AND (
    BL.PROCESS_START_DT <= /*pmb.processDtTo*/'20140908'
    OR BL.PROCESS_END_DT <= /*pmb.processDtTo*/'20140909'
  )
  /*END*/
  -- プログラム
  /*IF pmb.pgm != null*/
  AND (
    BL.PGM_CD LIKE /*pmb.pgm*/'%プログラム%'
    OR BL.PGM_NM LIKE /*pmb.pgm*/'%プログラム%'
    OR BM2.MESSAGE_NM LIKE /*pmb.pgm*/'%プログラム%'
  )
  /*END*/
  -- センタCD
  /*IF pmb.attribute1 != null*/
  -- [ON推-品向-1180] 修正対応 2016.08.22 chou Mod Start
  AND (BL.ATTRIBUTE1 = /*pmb.attribute1*/'TESTCENTER1' OR BL.ATTRIBUTE1 IS NULL)
  -- [ON推-品向-1180] 修正対応 2016.08.22 chou Mod End
  /*END*/
  -- 荷主CD
  /*IF pmb.attribute2 != null*/
  AND BL.ATTRIBUTE2 = /*pmb.attribute2*/'TEST1'
  /*END*/
  -- 属性３
  /*IF pmb.attribute3 != null*/
  AND BL.ATTRIBUTE3 = /*pmb.attribute3*/'属性103'
  /*END*/
  -- 属性４
  /*IF pmb.attribute4 != null*/
  AND BL.ATTRIBUTE4 = /*pmb.attribute4*/'属性104'
  /*END*/
  -- 属性５
  /*IF pmb.attribute5 != null*/
  AND BL.ATTRIBUTE5 = /*pmb.attribute5*/'属性105'
  /*END*/
/*IF pmb.isPaging()*/
  ORDER BY
    BL.PROCESS_START_DT desc
    ,BL.PROCESS_END_DT desc
    ,BL.LOG_ID desc
/*END*/

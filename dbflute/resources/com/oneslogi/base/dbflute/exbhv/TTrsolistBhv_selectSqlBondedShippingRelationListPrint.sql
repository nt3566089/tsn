/*
 [df:title]
 保税出庫関連リスト出力一覧データ取得

 [df:description]
  保税出庫関連リスト出力一覧データを取得します。
*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
-- ELSE SELECT COUNT(*) FROM (
/*END*/
SELECT  TBP.PICKBATCHKEY,
        TRL.WORKALLOCATEID,
        TBP.PICKDATE,
        TRL.LISTKBN,
        TRL.PRINTEDFLG,
        MAX(BD2.DICT_NM)        AS LISTKBN_NM,
        MAX(BD1.DICT_NM)        AS PRINTEDFLG_NM,
        MAX(MCN.CENTER_CD)      AS CENTER_CD,
        MAX(MCN.CENTER_ABBR)    AS CENTER_ABBR,
        MAX(MCL.CLIENT_CD)      AS CLIENT_CD,
        MAX(MCL.CLIENT_ABBR)    AS CLIENT_ABBR
FROM    T_TRSOLIST  TRL
    INNER   JOIN    T_TRSO              TRS
            ON      TRS.PICKING_INST_ID = TRL.PICKING_INST_ID
            AND     TRS.DEL_FLG         = '0'
    INNER   JOIN    T_BTRPICK           TBP
            ON      TBP.PICKING_INST_ID = TRS.PICKING_INST_ID
            AND     TBP.DEL_FLG         = '0'
    INNER   JOIN    M_CENTER            MCN
            ON      MCN.CENTER_ID       = TRL.CENTER_ID
            AND     MCN.DEL_FLG         = '0'
    INNER   JOIN    M_CLIENT            MCL
            ON      MCL.CLIENT_ID       = TRL.CLIENT_ID
            AND     MCL.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS             BC1
            ON      BC1.CLASS_CD        = 'LIST_OUT_KBN'
            AND     BC1.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS_DTL         BL1
            ON      BL1.CLASS_ID        = BC1.CLASS_ID
            AND     BL1.CLASS_DTL_CD    = TRL.PRINTEDFLG
            AND     BL1.DEL_FLG         = '0'
    INNER   JOIN    B_DICT              BD1
            ON      BD1.DICT_ID         = BL1.DICT_ID
    INNER   JOIN    B_CLASS             BC2
            ON      BC2.CLASS_CD        = 'SOLISTKBN_2'
            AND     BC2.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS_DTL         BL2
            ON      BL2.CLASS_ID        = BC2.CLASS_ID
            AND     BL2.CLASS_DTL_CD    = TRL.LISTKBN
            AND     BL2.DEL_FLG         = '0'
    INNER   JOIN    B_DICT              BD2
            ON      BD2.DICT_ID         = BL2.DICT_ID
WHERE   1 = 1
/*IF pmb.centerId != null*/
AND     TRL.CENTER_ID       =       /*pmb.centerId*/11111111111
/*END*/
/*IF pmb.clientId != null*/
AND     TRL.CLIENT_ID       =       /*pmb.clientId*/11111111111
/*END*/
/*IF pmb.shipschdateFrom != null*/
AND     TRS.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
/*END*/
/*IF pmb.shipschdateTo != null*/
AND     TRS.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
/*END*/
/*IF pmb.printedflg != null*/
AND     TRL.PRINTEDFLG      =       /*pmb.printedflg*/'1'
/*END*/
/*IF pmb.listkbn != null*/
AND     TRL.LISTKBN         =       /*pmb.listkbn*/'11111111111'
/*END*/
/*IF pmb.pickbatchkey != null*/
AND     TBP.PICKBATCHKEY    LIKE    /*pmb.pickbatchkey*/'11111111111%'
/*END*/
/*IF pmb.workallocateid != null*/
AND     TRL.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
/*END*/
AND     TRL.LISTKBN         <>      '7'
AND     TRL.DEL_FLG         =       '0'
GROUP   BY
        TRL.PRINTEDFLG,
        TRL.LISTKBN,
        TBP.PICKBATCHKEY,
        TRL.WORKALLOCATEID,
        TBP.PICKDATE
/*IF pmb.isPaging()*/
ORDER   BY
        TRL.WORKALLOCATEID,
        TRL.LISTKBN,
        TRL.PRINTEDFLG
-- ELSE ) CNT
/*END*/

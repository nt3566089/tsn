/*
 [df:title]
 保税出庫関連リスト出力

 [df:description]
 出庫関連リスト印刷をカウント

*/

-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Timestamp pickdate!!

SELECT  COUNT(*)    AS REC_CNT
FROM    T_TRSOLIST  TRL
    INNER   JOIN    T_TRSO              TRS
            ON      TRS.PICKING_INST_ID = TRL.PICKING_INST_ID
            AND     TRS.DEL_FLG         = '0'
    INNER   JOIN    T_BTRPICK           TBP
            ON      TBP.PICKING_INST_ID = TRS.PICKING_INST_ID
            /*IF pmb.pickbatchkey != null*/
            AND     TBP.PICKBATCHKEY    = /*pmb.pickbatchkey*/11111111111
            /*END*/
            /*IF pmb.pickdate != null*/
            AND     TBP.PICKDATE        = /*pmb.pickdate*/'2011-01-28 00:00:00'
            /*END*/
            AND     TBP.DEL_FLG         = '0'
WHERE   1                               = 1
/*IF pmb.centerId != null*/
AND     TRL.CENTER_ID       = /*pmb.centerId*/11111111111
/*END*/
/*IF pmb.clientId != null*/
AND     TRL.CLIENT_ID       = /*pmb.clientId*/11111111111
/*END*/
/*IF pmb.printedflg != null*/
AND     TRL.PRINTEDFLG                  = /*pmb.printedflg*/'1'
/*END*/
/*IF pmb.listkbn != null*/
AND     TRL.LISTKBN                     = /*pmb.listkbn*/'11111111111'
/*END*/
/*IF pmb.workallocateid != null*/
AND     TRL.WORKALLOCATEID              = /*pmb.workallocateid*/11111111111
/*END*/
AND     TRL.DEL_FLG                     = '0'

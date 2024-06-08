/*
 [df:title]
 保税出庫関連リスト出力

 [df:description]
 コントロールNo.更新対象を取得する。

*/

-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!
-- !!Timestamp pickdate!!

SELECT  *
FROM    T_TRSOLIST     TRL
WHERE   1 = 1

/*IF pmb.printedflg != null*/
AND     TRL.PRINTEDFLG      = /*pmb.printedflg*/'1'
/*END*/
/*IF pmb.listkbn != null*/
AND     TRL.LISTKBN         = /*pmb.listkbn*/'11111111111'
/*END*/
/*IF pmb.workallocateid != null*/
AND     TRL.WORKALLOCATEID  = /*pmb.workallocateid*/11111111111
/*END*/
/*IF pmb.centerId != null*/
AND     TRL.CENTER_ID       = /*pmb.centerId*/11111111111
/*END*/
/*IF pmb.clientId != null*/
AND     TRL.CLIENT_ID       = /*pmb.clientId*/11111111111
/*END*/
AND     TRL.DEL_FLG                     = '0'

AND     EXISTS  (
                    SELECT  'X'
                    FROM    T_TRSO              TRS
                    WHERE   TRS.PICKING_INST_ID = TRL.PICKING_INST_ID
                    AND     TRS.DEL_FLG         = '0'
        )
AND     EXISTS  (
                    SELECT  'X'
                    FROM    T_BTRPICK           TBP
                    WHERE   TBP.PICKING_INST_ID = TRL.PICKING_INST_ID
                    /*IF pmb.pickbatchkey != null*/
                    AND     TBP.PICKBATCHKEY    = /*pmb.pickbatchkey*/11111111111
                    /*END*/
                    /*IF pmb.pickdate != null*/
                    AND     TBP.PICKDATE        = /*pmb.pickdate*/'2011-01-28 00:00:00'
                    /*END*/
                    AND     TBP.DEL_FLG         = '0'
        )
ORDER   BY
        TRL.SHIPPING_LIST_PRINT_ID;

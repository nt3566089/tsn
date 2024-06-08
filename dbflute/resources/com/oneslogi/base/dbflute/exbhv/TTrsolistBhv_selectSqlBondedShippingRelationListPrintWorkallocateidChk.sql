/*
 [df:title]
 保税出庫関連リスト出力

 [df:description]
 棚出しリストキー（＝引当バッチキー）有効チェック

*/

-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

SELECT  COUNT(*)                AS REC_CNT
FROM    T_BTRPICKDETAIL         BRD
    INNER   JOIN    T_BTRPICK   BRP
            ON      BRP.PICKING_INST_ID = BRD.PICKING_INST_ID
           /*IF pmb.centerId != null*/
            AND     BRP.CENTER_ID       = /*pmb.centerId*/11111111111
            /*END*/
            AND     BRP.DEL_FLG         = '0'
WHERE   1   = 1
/*IF pmb.workallocateid != null*/
AND     BRD.WORKALLOCATEID  = /*pmb.workallocateid*/11111111111
/*END*/
AND     BRD.DEL_FLG         = '0'

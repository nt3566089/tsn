/*
 [df:title]
 保税出庫関連リスト出力

 [df:description]
 出庫予定のマージ状態区分が「失敗」のレコードをカウント

*/

-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

SELECT  COUNT(*)    AS REC_CNT
FROM    T_TRSO      TRS
    INNER   JOIN    T_TRSODETAIL    TRD
            ON      TRD.SOID        = TRD.SOID
            AND     TRD.OTHERLOT2   IN ('20', '21', '48', '49')
            AND     TRD.DEL_FLG     = '0'
    INNER   JOIN    (   SELECT  TRS.CENTER_ID,
                                TRS.CLIENT_ID,
                                TRS.SHIPTOCD,
                                TRS.RMANO,
                                TRD.OTHERLOT3,
                                TRD.OTHERLOT4
                        FROM    T_TRSO      TRS
                            INNER   JOIN    T_TRSODETAIL        TRD
                                    ON      TRD.SOID            = TRS.SOID
                                    AND     TRD.DEL_FLG         = '0'
                            INNER   JOIN    T_BTRPICK           TPK
                                    ON      TPK.PICKING_INST_ID = TRS.PICKING_INST_ID
                                    /*IF pmb.pickbatchkey != null*/
                                    AND     TPK.PICKBATCHKEY    = /*pmb.pickbatchkey*/11111111111
                                    /*END*/
                                    AND     TPK.DEL_FLG         = '0'
                        WHERE   1                           = 1
                        /*IF pmb.centerId != null*/
                        AND     TRS.CENTER_ID               = /*pmb.centerId*/11111111111
                        /*END*/
                        /*IF pmb.clientId != null*/
                        AND     TRS.CLIENT_ID               = /*pmb.clientId*/11111111111
                        /*END*/
                        AND     TRS.DEL_FLG                 = '0'
                    )   OT1
            ON          OT1.CENTER_ID   = TRS.CENTER_ID
            AND         OT1.CLIENT_ID   = TRS.CLIENT_ID
            AND         OT1.SHIPTOCD    = TRS.SHIPTOCD
            AND         OT1.RMANO       = TRS.RMANO
            AND         OT1.OTHERLOT3   = TRD.OTHERLOT3
            AND         OT1.OTHERLOT4   = TRD.OTHERLOT4
WHERE   TRS.POSTNO                      = '2'
AND     TRS.DEL_FLG                     = '0'

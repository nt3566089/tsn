/*
 [df:title]
 保税出庫関連リスト出力

 [df:description]
 棚出リスト発行データ取得

*/

-- #df:entity#
-- ##BigDecimal PALLET_QTY##
-- ##BigDecimal CASE_QTY##
-- ##BigDecimal SORT_RECEIVED_CASE_QTY##
-- ##BigDecimal SORT_RECEIVED_CARTON_QTY##
-- ##BigDecimal PICKED_PALLET_QTY##
-- ##BigDecimal PICKED_CASE_QTY##
-- ##BigDecimal PICKED_CARTON_QTY##

-- !df:pmb!
-- !!AutoDetect!!
SELECT  TSL.FLOOR,
        TSL.WORKALLOCATEID,
        TPL.LOT3,
        TPL.OTHERLOT1,
        TPL.LOT1,
        TPL.LOT2,
        TPL.LOT4,
        TPL.LISTKBN,
        TPL.EXPECTQTY1              AS PALLET_QTY,
        TPL.EXPECTQTY1 * PRD.P_QTY  AS CASE_QTY,
        TPL.EXPECTQTY1 * PRD.P_QTY
            + TPL.EXPECTQTY2        AS SORT_RECEIVED_CASE_QTY,
        TPL.EXPECTQTY3              AS SORT_RECEIVED_CARTON_QTY,
        TPL.EXPECTQTY1              AS PICKED_PALLET_QTY,
        TPL.EXPECTQTY2              AS PICKED_CASE_QTY,
        TPL.EXPECTQTY3              AS PICKED_CARTON_QTY,
        CASE WHEN TPL.NOSHIPPINGFLG = '2'
             THEN 'TSN'
             ELSE NULL
        END                         AS CLIENT_NM,
        OT1.MIN_SHIPSCHDATE,
        OT1.MAX_SHIPSCHDATE,
        CEN.CENTER_CD,
        CEN.CENTER_ABBR,
        CLI.CLIENT_ABBR,
        PRD.PRODUCT_CD,
        PRD.PRODUCT_ABBR,
        PRD.USERNUM3,
        BD1.OTHERCD3,
        USR.USER_CD,
        USR.USER_NM,
        LOC.LOCATION_CD
FROM    T_TRSOLIST  TSL
    INNER   JOIN    T_PICKLIST              TPL
            ON      TPL.WORKALLOCATEID      = TSL.WORKALLOCATEID
            AND     TPL.FLOOR               = TSL.FLOOR
            AND     TPL.LISTKBN             = CASE WHEN TSL.LISTKBN = '1'
                                                   THEN 2
                                                   ELSE 1
                                              END
            AND     TPL.DEL_FLG             = '0'
    INNER   JOIN    (
                        SELECT  TRS.CENTER_ID,
                                TRS.CLIENT_ID,
                                TRS.PICKING_INST_ID,
                                MIN(TRS.SHIPSCHDATE) AS MIN_SHIPSCHDATE,
                                MAX(TRS.SHIPSCHDATE) AS MAX_SHIPSCHDATE
                        FROM    T_TRSO      TRS
                        WHERE   EXISTS  (
                                            SELECT  'X'
                                            FROM    T_TRSOLIST      TSL
                                            WHERE   TSL.PICKING_INST_ID = TRS.PICKING_INST_ID
                                            /*IF pmb.controlNo != null*/
                                            AND     TSL.CONTROL_NO      = /*pmb.controlNo*/11111111111
                                            /*END*/
                                            AND     TSL.DEL_FLG         = '0'
                                        )
                        AND     TRS.DEL_FLG = '0'
                        GROUP   BY
                                TRS.CENTER_ID,
                                TRS.CLIENT_ID,
                                TRS.PICKING_INST_ID
                    )   OT1
            ON      OT1.PICKING_INST_ID     = TSL.PICKING_INST_ID
    INNER   JOIN    M_CENTER                CEN
            ON      CEN.CENTER_ID           = TSL.CENTER_ID
            AND     CEN.DEL_FLG             = '0'
    INNER   JOIN    M_CLIENT                CLI
            ON      CLI.CLIENT_ID           = TSL.CLIENT_ID
            AND     CLI.DEL_FLG             = '0'
    INNER   JOIN    M_PRODUCT               PRD
            ON      PRD.PRODUCT_ID          = TPL.PRODUCT_ID
            AND     PRD.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS                 BC1
            ON      BC1.CLASS_CD            = 'ZAIKODIV'
            AND     BC1.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS_DTL             BL1
            ON      BL1.CLASS_ID            = BC1.CLASS_ID
            AND     BL1.CLASS_DTL_CD        = TPL.OTHERLOT1
            AND     BL1.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS_DTL_SUB         BD1
            ON      BD1.CLASS_DTL_ID        = BL1.CLASS_DTL_ID
            AND     BD1.DEL_FLG             = '0'
    INNER   JOIN    B_USER                  USR
            ON      USR.USER_CD             = TSL.UPD_USER
            AND     USR.DEL_FLG             = '0'
    INNER   JOIN    M_LOCATION              LOC
            ON      LOC.LOCATION_ID         = TPL.LOCATION_ID
            AND     LOC.DEL_FLG             = '0'
WHERE   1                   = 1
/*IF pmb.controlNo != null*/
AND     TSL.CONTROL_NO      = /*pmb.controlNo*/11111111111
/*END*/
AND     TSL.DEL_FLG         = '0'
ORDER   BY
        TPL.LISTKBN,
        TSL.WORKALLOCATEID,
        TSL.FLOOR,
        PRD.USERNUM3,
        PRD.PRODUCT_CD,
        TPL.LOT1,
        TPL.LOT4,
        TPL.LOT3,
        LOC.LOCATION_CD

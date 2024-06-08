/*
 [df:title]
 保税出庫関連リスト出力

 [df:description]
 仕分場受入検品リスト発行データ取得

*/

-- #df:entity#
-- ##BigDecimal PICK_CASE_QTY##
-- ##BigDecimal PICK_CARTON_QTY##
-- ##BigDecimal CASE_EXPECT_QTY##
-- ##BigDecimal CARTON_EXPECT_QTY##
-- ##BigDecimal PALLET_EXPECT_QTY##

-- !df:pmb!
-- !!AutoDetect!!
SELECT  MCN.CENTER_CD,                                  -- 拠点CD
        TSL.WORKALLOCATEID,                             -- 棚出リストキー
        TPL.OTHERLOT1,                                  -- 在庫区分
        TPL.LOT1,                                       -- 商社搬入番号
        TPL.LOT2,                                       -- 製造記号
        TPL.LOT3,                                       -- デザイン区分
        TPL.LOT4,                                       -- 製造年月日
        TPL.FLOOR,                                      -- フロア
        MPR.PRODUCT_CD,                                 -- 銘柄CD
        CASE WHEN TPL.NOSHIPPINGFLG = '2'
             THEN 'TSN'
             ELSE NULL
        END                     AS CLIENT_NM,           -- TSN在庫
        MAX(TPL.LISTKBN)        AS LISTKBN,             -- 単品・端数区分
        SUM(TPL.EXPECTQTY1) * MPR.P_QTY + SUM(TPL.EXPECTQTY2) AS PICK_CASE_QTY,   -- 仕分場受入ケース数
        SUM(TPL.EXPECTQTY3)     AS PICK_CARTON_QTY,     -- 仕分場受入カートン数
        SUM(TPL.EXPECTQTY2)     AS CASE_EXPECT_QTY,     -- ケース
        SUM(TPL.EXPECTQTY3)     AS CARTON_EXPECT_QTY,   -- カートン
        SUM(TPL.EXPECTQTY1)     AS PALLET_EXPECT_QTY,   -- パレット
        OT1.MIN_SHIPSCHDATE,                            -- 出庫予定日(開始)
        OT1.MAX_SHIPSCHDATE,                            -- 出庫予定日(終了)
        MCN.CENTER_ABBR,                                -- 拠点名称
        MPR.PRODUCT_ABBR,                               -- 銘柄名称
        MPR.USERNUM3,                                   -- 一般出力順
        MAX(BD1.OTHERCD3)       AS OTHERCD3,            -- 在庫区分名称
        MAX(USR.USER_CD)        AS USER_CD,             -- ユーザCD
        MAX(USR.USER_NM)        AS USER_NM              -- ユーザ名
FROM    T_TRSOLIST              TSL
    LEFT OUTER  JOIN    T_PICKLIST  TPL
                ON      TPL.WORKALLOCATEID  = TSL.WORKALLOCATEID
                AND     TPL.LISTKBN         = 2
                AND     TPL.DEL_FLG         = '0'
    INNER   JOIN    (
                        SELECT  TRS.PICKING_INST_ID,
                                MIN(TRS.SHIPSCHDATE)    AS MIN_SHIPSCHDATE,
                                MIN(TRS.SHIPSCHDATE)    AS MAX_SHIPSCHDATE
                        FROM    T_TRSO          TRS
                        WHERE   TRS.DEL_FLG     = '0'
                        AND     EXISTS (
                                            SELECT  'X'
                                            FROM    T_TRSOLIST  LST
                                            WHERE   LST.PICKING_INST_ID = TRS.PICKING_INST_ID
                                            /*IF pmb.controlNo != null*/
                                            AND     LST.CONTROL_NO      = /*pmb.controlNo*/11111111111
                                            /*END*/
                                        )
                        GROUP   BY
                                TRS.PICKING_INST_ID
                    ) OT1
                ON  OT1.PICKING_INST_ID     = TSL.PICKING_INST_ID
    INNER   JOIN    M_CENTER                MCN
            ON      MCN.CENTER_ID           = TSL.CENTER_ID
            AND     MCN.DEL_FLG             = '0'
    INNER   JOIN    M_PRODUCT               MPR
            ON      MPR.PRODUCT_ID          = TPL.PRODUCT_ID
            AND     MPR.DEL_FLG             = '0'
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
WHERE   1                   = 1
/*IF pmb.controlNo != null*/
AND     TSL.CONTROL_NO      = /*pmb.controlNo*/11111111111
/*END*/
AND     TSL.DEL_FLG         = '0'
GROUP   BY
        MCN.CENTER_CD,
        MCN.CENTER_ABBR,
        TSL.WORKALLOCATEID,
        MPR.PRODUCT_CD,
        MPR.PRODUCT_ABBR,
        TPL.LOT1,
        TPL.LOT4,
        TPL.LOT3,
        MPR.USERNUM3,
        OT1.MIN_SHIPSCHDATE,
        OT1.MAX_SHIPSCHDATE,
        TPL.LOT2,
        TPL.NOSHIPPINGFLG,
        TPL.FLOOR,
        MPR.P_QTY,
        TPL.OTHERLOT1
ORDER   BY
        MPR.USERNUM3,
        MPR.PRODUCT_CD,
        TPL.LOT1,
        TPL.FLOOR,
        TPL.LOT4,
        TPL.LOT3

/*
 [df:title]
 保税出庫関連リスト出力

 [df:description]
 積込リスト発行データ取得

*/

-- #df:entity#
-- ##BigDecimal EXPECTQTY1##
-- ##BigDecimal EXPECTQTY2##
-- !df:pmb!
-- !!AutoDetect!!
SELECT  TRL.SHIPSCHDATE,                    -- 出庫予定日
        TRL.TRSOLISTKEY,                    -- 出庫関連リストキー
        MCN.CENTER_CD,                      -- 拠点CD
        TRS.OWNERSONO,                      -- 整理番号
        TRS.PHONENO,                        -- 車記号
        TRS.SHIPTOCD,                       -- 受入先CD
        TRS.DELIVNAME,                      -- 出庫先名称
        TRS.CUSTOMER_CD,                    -- 特約店CD
        TRS.RMANO,                          -- 問合せ番号
        TRS.OTHERREFNO1,                    -- 輸送形態
        TRS.ORDERTYPE,                      -- 依頼種別
        TRS.FAX1,                           -- 出庫経路区分
        TRD.PRICE2,                         -- パレタイズ順
        TRD.NOTES,                          -- パレット番号(保税)
        MPR.PRODUCT_CD,                     -- 銘柄CD
        OT1.LOT3,                           -- デザイン区分
        OT1.LOT1,                           -- 商社搬入番号
        OT1.LOT4,                           -- 製造年月日
        dbo.FX_QTYBYSTYLE1(OT1.EXPECTQTY1, 
            MPR.UNIT1, 
            MPR.UNIT2) AS EXPECTQTY1,       -- 出庫予定数量（ケース）
        dbo.FX_QTYBYSTYLE2(OT1.EXPECTQTY1, 
            MPR.UNIT1, 
            MPR.UNIT2) AS EXPECTQTY2,       -- 出庫予定数量（カートン数）
        MCN.CENTER_ABBR,                    -- 拠点名称
        MCS.CUSTOMER_ABBR,                  -- 取引先略称
        MPR.PRODUCT_ABBR,                   -- 銘柄名称
        MPR.USERNUM3,                       -- 一般出力順
        USR.USER_CD,                        -- ユーザCD
        USR.USER_NM,                        -- ユーザ名
        BD1.DICT_NM     AS OTHERREFNO1_NM,  -- 輸送形態名称
        BD2.DICT_NM     AS ORDERTYPE_NM,    -- 依頼種別名称
        OTHERLOT2_CNT,                      -- 依頼種別件数
        MCP.TRANSPORTPRIORITY               -- 出力順(組織)

FROM    T_TRSOLIST  TRL
    INNER   JOIN    T_TRSO              TRS
            ON      TRS.PICKING_INST_ID = TRL.PICKING_INST_ID
            AND     TRS.SOID            = TRL.SOID
            AND     TRS.DEL_FLG         = '0'
    INNER   JOIN    T_TRSODETAIL        TRD
            ON      TRD.SOID            = TRS.SOID
            AND     TRD.DEL_FLG         = '0'
    INNER   JOIN    (
                        SELECT  TPD.SOID,
                                MIN(DTL.SOLINENO)       AS SOLINENO,
                                DTL.NOTES,
                                LOT.LOT1,
                                LOT.LOT3,
                                LOT.LOT4,
                                SUM(TPD.EXPECTQTY1)     AS EXPECTQTY1
                        FROM    T_BTRPICKDETAIL TPD
                            INNER   JOIN    T_LOT           LOT
                                    ON      LOT.LOT_ID      = TPD.LOT_ID
                                    AND     LOT.DEL_FLG     = '0'
                            INNER   JOIN    T_TRSODETAIL    DTL
                                    ON      DTL.SOID        = TPD.SOID
                                    AND     DTL.SODETAILID  = TPD.SODETAILID
                                    AND     DTL.DEL_FLG     = '0'
                        WHERE   EXISTS (
                                        SELECT  'X'
                                        FROM    T_TRSOLIST      TRL
                                        WHERE   TRL.SOID        = TPD.SOID
                                        /*IF pmb.controlNo != null*/
                                        AND     TRL.CONTROL_NO  = /*pmb.controlNo*/11111111111
                                        /*END*/
                                        AND     TRL.DEL_FLG     = '0'
                                )
                        GROUP   BY
                                TPD.SOID,
                                DTL.NOTES,
                                LOT.PRODUCT_ID,
                                LOT.LOT1,
                                LOT.LOT3,
                                LOT.LOT4
                    ) OT1
            ON      OT1.SOID        = TRD.SOID
            AND     OT1.SOLINENO    = TRD.SOLINENO
    INNER   JOIN    (
                        SELECT  TRS.SOID,
                                CASE WHEN TRS.POSTNO = '1' AND OT21.OTHERLOT2_CNT != 1 THEN NULL
                                     WHEN TRS.POSTNO = '1' AND OT21.OTHERLOT2_CNT  = 1 THEN OTHERLOT2
                                     ELSE TRS.ORDERTYPE
                                END AS ORDERTYPE,
                                OTHERLOT2_CNT
                        FROM    T_TRSO      TRS,
                                (
                                    SELECT  DTL.SOID,
                                            COUNT(DISTINCT DTL.OTHERLOT2)   AS OTHERLOT2_CNT,
                                            MIN(DTL.OTHERLOT2)              AS OTHERLOT2
                                    FROM    T_TRSODETAIL    DTL
                                    WHERE   DTL.DEL_FLG     = '0'
                                    AND     EXISTS (
                                                    SELECT  'X'
                                                    FROM    T_TRSOLIST      TRL
                                                    WHERE   TRL.SOID        = DTL.SOID
                                                    /*IF pmb.controlNo != null*/
                                                    AND     TRL.CONTROL_NO  = /*pmb.controlNo*/11111111111
                                                    /*END*/
                                                    AND     TRL.DEL_FLG     = '0'
                                            )
                                    GROUP   BY
                                            DTL.SOID
                                ) OT21
                        WHERE   OT21.SOID   = TRS.SOID
                        AND     TRS.DEL_FLG = '0'
                    ) OT2
            ON      OT2.SOID            = TRD.SOID
    INNER JOIN      M_CENTER            MCN
            ON      MCN.CENTER_ID       = TRS.CENTER_ID
            AND     MCN.DEL_FLG         = '0'
    LEFT OUTER JOIN M_MFCOMPANY         MCP
            ON      MCP.COMPANY_CD      = TRS.SHIPTOCD
            AND     MCP.DEL_FLG         = '0'
    LEFT OUTER JOIN M_CUSTOMER          MCS
            ON      MCS.CLIENT_ID       = TRS.CLIENT_ID
            AND     MCS.CUSTOMER_CD     = TRS.CUSTOMER_CD
            AND     MCS.DEL_FLG         = '0'
    INNER   JOIN    M_PRODUCT           MPR
            ON      MPR.PRODUCT_ID      = TRD.PRODUCT_ID
            AND     MPR.DEL_FLG         = '0'
    INNER   JOIN    B_USER              USR
            ON      USR.USER_CD         = TRL.UPD_USER
            AND     USR.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS             BC1
            ON      BC1.CLASS_CD        = 'TRAFFICPATTERN'
            AND     BC1.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS_DTL         BL1
            ON      BL1.CLASS_ID        = BC1.CLASS_ID
            AND     BL1.CLASS_DTL_CD    = TRS.OTHERREFNO1
            AND     BL1.DEL_FLG         = '0'
    INNER   JOIN    B_DICT              BD1
            ON      BD1.DICT_ID         = BL1.DICT_ID
            AND     BL1.DEL_FLG         = '0'
    LEFT OUTER JOIN B_CLASS             BC2
            ON      BC2.CLASS_CD        = 'REQUESTTYPE'
            AND     BC2.DEL_FLG         = '0'
    LEFT OUTER JOIN B_CLASS_DTL         BL2
            ON      BL2.CLASS_ID        = BC2.CLASS_ID
            AND     BL2.CLASS_DTL_CD    = OT2.ORDERTYPE
            AND     BL2.DEL_FLG         = '0'
    LEFT OUTER JOIN B_DICT              BD2
            ON      BD2.DICT_ID         = BL2.DICT_ID
            AND     BL2.DEL_FLG         = '0'
WHERE   1                   = 1
/*IF pmb.controlNo != null*/
AND     TRL.CONTROL_NO      = /*pmb.controlNo*/11111111111
/*END*/
AND     TRL.DEL_FLG         = '0'
ORDER   BY
    TRL.SHIPSCHDATE,
    CASE WHEN TRS.FAX1 = '3' THEN MCS.SHOW_PRIORITY ELSE MCP.TRANSPORTPRIORITY END,
    TRS.PHONENO,
    TRS.OWNERSONO,
    TRL.TRSOLISTKEY,
    TRD.NOTES,
    TRD.PRICE2 DESC,
    MPR.USERNUM3,
    MPR.PRODUCT_CD,
    OT1.LOT1,
    OT1.LOT4,
    OT1.LOT3

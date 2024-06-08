/*
 [df:title]
 保税出庫関連リスト出力

 [df:description]
 パレット明細(端数)発行データ取得

*/

-- #df:entity#
-- ##BigDecimal EXPECT_CASE_QTY##
-- ##BigDecimal EXPECT_CARTON_QTY##
-- !df:pmb!
-- !!AutoDetect!!
SELECT  TRL.TRSOLISTKEY,                                        -- 出庫関連リストキー
        TRS.SHIPSCHDATE,                                        -- 出庫予定日
        TRS.FAX1,                                               -- 出庫経路区分
        TRS.CARRIERSNAME,                                       -- 出庫先短縮名称
        TRS.RMANO,                                              -- 問合せ番号
        OT4.OTHERLOT3                   AS OWNERSONO,           -- ヘッダ整理番号
        TRD.LOT2,                                               -- 製造記号
        TRD.LOT4,                                               -- 製造年月日
        TRD.OTHERLOT3,                                          -- 整理番号
        TRD.LOT3,                                               -- デザイン区分
        TRD.NOTES                       AS SOPALLETNO,          -- パレット番号(保税)
        TRD.IFITEMCD,                                           -- IF銘柄CD
        TRD.LOT1,                                               -- 商社搬入番号
        OT1.LOT4_CNT,                                           -- 製造年月件数
        OT2.LOT1_CNT,                                           -- 商社搬入番号件数
        dbo.FX_QTYBYSTYLE1(OT3.EXPECTQTY1, 
            MPR.UNIT1, 
            MPR.UNIT2)                  AS EXPECT_CASE_QTY,     -- 出庫予定数量(ケース)
        dbo.FX_QTYBYSTYLE2(OT3.EXPECTQTY1, 
            MPR.UNIT1, 
            MPR.UNIT2)                  AS EXPECT_CARTON_QTY,   -- 出庫予定数量(カートン)
        OT4.OTHERLOT3_CNT,                                      -- 整理番号件数
        MCN.CENTER_ABBR,                                        -- 拠点略称
        MCS.CUSTOMER_ABBR,                                      -- 取引先略称
        MPR.PRODUCT_CD,                                         -- 銘柄CD
        MPR.PRODUCT_ABBR,                                       -- 商品略称
        BD1.DICT_NM                     AS OTHERREFNO1,         -- 輸送形態
        TRD.PRICE2,                                             -- パレタイズ順
        MPR.USERNUM3,                                           -- 一般出力順
        MCP.TRANSPORTPRIORITY                                   -- 出力順(組織)
FROM    T_TRSOLIST                      TRL
    INNER   JOIN    T_TRSO              TRS
            ON      TRS.SOID            = TRL.SOID
            AND     TRS.DEL_FLG         = '0'
    INNER   JOIN    T_TRSODETAIL        TRD
            ON      TRD.SOID            = TRL.SOID
            AND     (   TRD.NOTES       = TRL.SOPALLETNO
            OR          (
                            TRD.NOTES       IS NULL
            AND             TRL.SOPALLETNO  IS NULL
                        )
                    )
            AND     TRD.DEL_FLG         = '0'
    INNER   JOIN    (
                        SELECT  OT11.SOID,
                                OT11.NOTES,
                                MAX(OT11.LOT4_CNT) AS LOT4_CNT
                        FROM    (
                                    SELECT  OT111.PRODUCT_ID,
                                            OT111.SOID,
                                            OT111.NOTES,
                                            COUNT(*) AS LOT4_CNT
                                    FROM    (
                                                SELECT  DTL.PRODUCT_ID,
                                                        DTL.SOID,
                                                        DTL.NOTES,
                                                        SUBSTRING(DTL.LOT4, 1, 6) AS LOT4
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
                                                        DTL.PRODUCT_ID,
                                                        DTL.SOID,
                                                        DTL.NOTES,
                                                        SUBSTRING(DTL.LOT4, 1, 6)
                                            ) OT111
                                    GROUP   BY
                                            OT111.PRODUCT_ID,
                                            OT111.SOID,
                                            OT111.NOTES
                                ) OT11
                        GROUP   BY
                                OT11.SOID,
                                OT11.NOTES
                    ) OT1
            ON      OT1.SOID            = TRD.SOID
            AND     (   OT1.NOTES       = TRD.NOTES
            OR          (
                            OT1.NOTES   IS NULL
            AND             TRD.NOTES   IS NULL
                        )
                    )
    INNER   JOIN    (
                        SELECT  OT21.SOID,
                                OT21.NOTES,
                                MAX(OT21.LOT1_CNT) AS LOT1_CNT
                        FROM    (
                                    SELECT  OT211.PRODUCT_ID,
                                            OT211.SOID,
                                            OT211.NOTES,
                                            COUNT(*) AS LOT1_CNT
                                    FROM    (
                                                SELECT  DTL.PRODUCT_ID,
                                                        DTL.SOID,
                                                        DTL.NOTES,
                                                        DTL.LOT1
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
                                                        DTL.PRODUCT_ID,
                                                        DTL.SOID,
                                                        DTL.NOTES,
                                                        DTL.LOT1
                                            ) OT211
                                    GROUP   BY
                                            OT211.PRODUCT_ID,
                                            OT211.SOID,
                                            OT211.NOTES
                                ) OT21
                        GROUP   BY
                                OT21.SOID,
                                OT21.NOTES
                    ) OT2
            ON      OT2.SOID            = TRD.SOID
            AND     (   OT2.NOTES       = TRD.NOTES
            OR          (
                            OT2.NOTES   IS NULL
            AND             TRD.NOTES   IS NULL
                        )
                    )
    INNER   JOIN    (
                        SELECT  OT31.SOID,
                                OT31.NOTES,
                                OT31.PRODUCT_ID,
                                OT31.LOT1,
                                OT31.LOT2,
                                OT31.LOT3,
                                OT31.LOT4,
                                OT31.OTHERLOT3,
                                MIN(OT31.SOLINENO)      AS SOLINENO,
                                SUM(OT31.EXPECTQTY1)    AS EXPECTQTY1
                        FROM    (
                                    SELECT  DTL.SOID,
                                            DTL.SOLINENO,
                                            DTL.NOTES,
                                            LOT.PRODUCT_ID,
                                            LOT.LOT1,
                                            LOT.LOT2,
                                            LOT.LOT3,
                                            LOT.LOT4,
                                            DTL.OTHERLOT3,
                                            SUM(PDL.EXPECTQTY1) AS EXPECTQTY1
                                    FROM    T_BTRPICKDETAIL     PDL
                                        INNER   JOIN    T_TRSODETAIL        DTL
                                                ON      DTL.SOID            = PDL.SOID
                                                AND     DTL.SODETAILID      = PDL.SODETAILID
                                                AND     DTL.DEL_FLG         = '0'
                                        INNER   JOIN    T_LOT               LOT
                                                ON      LOT.LOT_ID          = PDL.LOT_ID
                                                AND     LOT.DEL_FLG         = '0'
                                    WHERE   PDL.PALLETTYPE      = 0
                                    AND     PDL.DEL_FLG         = '0'
                                    AND     EXISTS (
                                                    SELECT  'X'
                                                    FROM    T_TRSOLIST      TRL
                                                    WHERE   TRL.SOID        = PDL.SOID
                                                    /*IF pmb.controlNo != null*/
                                                    AND     TRL.CONTROL_NO  = /*pmb.controlNo*/11111111111
                                                    /*END*/
                                                    AND     TRL.DEL_FLG     = '0'
                                            )
                                    GROUP   BY
                                            DTL.SOID,
                                            DTL.SOLINENO,
                                            DTL.NOTES,
                                            LOT.PRODUCT_ID,
                                            LOT.LOT1,
                                            LOT.LOT2,
                                            LOT.LOT3,
                                            LOT.LOT4,
                                            DTL.OTHERLOT3
                                ) OT31
                        GROUP   BY
                                OT31.SOID,
                                OT31.NOTES,
                                OT31.PRODUCT_ID,
                                OT31.LOT1,
                                OT31.LOT2,
                                OT31.LOT3,
                                OT31.LOT4,
                                OT31.OTHERLOT3
                    ) OT3
            ON  OT3.SOID            = TRD.SOID
            AND (   OT3.LOT1        = TRD.LOT1
            OR      (
                        OT3.LOT1    IS NULL
            AND         TRD.LOT1    IS NULL
                    )
                )
            AND (
                    OT3.LOT3        = TRD.LOT3
            OR      TRD.LOT3        IS NULL
                )
            AND OT3.LOT4            = TRD.LOT4
            AND OT3.OTHERLOT3       = TRD.OTHERLOT3
            AND OT3.NOTES           = TRD.NOTES
            AND OT3.SOLINENO        = TRD.SOLINENO
    INNER   JOIN    (
                        SELECT  OT41.SOID,
                                OT41.NOTES,
                                MAX(OT41.OTHERLOT3_CNT) AS OTHERLOT3_CNT,
                                CASE WHEN MAX(TRS.POSTNO) = '1' AND MAX(OT41.OTHERLOT3_CNT) != 1 THEN NULL
                                     WHEN MAX(TRS.POSTNO) = '1' AND MAX(OT41.OTHERLOT3_CNT) =  1 THEN MAX(OT41.OTHERLOT3)
                                     ELSE MAX(TRS.OWNERSONO)
                                END         AS OTHERLOT3
                        FROM    T_TRSO      TRS,
                                (
                                    SELECT  OT411.SOID,
                                            OT411.NOTES,
                                            MIN(OT411.OTHERLOT3)    AS OTHERLOT3,
                                            COUNT(*)                AS OTHERLOT3_CNT
                                    FROM    (
                                                SELECT  DTL.SOID,
                                                        DTL.NOTES,
                                                        DTL.OTHERLOT3
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
                                                        DTL.SOID,
                                                        DTL.NOTES,
                                                        DTL.OTHERLOT3
                                            ) OT411
                                    GROUP   BY
                                            OT411.SOID,
                                            OT411.NOTES
                                ) OT41
                        WHERE   OT41.SOID   =   TRS.SOID
                        AND     TRS.DEL_FLG =   '0'
                        GROUP   BY
                                OT41.SOID,
                                OT41.NOTES
                    ) OT4
            ON      OT4.SOID            = TRD.SOID
            AND     (   OT4.NOTES       = TRD.NOTES
            OR          (
                            OT4.NOTES   IS NULL
            AND             TRD.NOTES   IS NULL
                        )
                    )
    INNER JOIN      M_CENTER            MCN
            ON      MCN.CENTER_ID       = TRL.CENTER_ID
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
    INNER   JOIN    B_CLASS             BC2
            ON      BC2.CLASS_CD        = 'REQUESTTYPE'
            AND     BC2.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS_DTL         BL2
            ON      BL2.CLASS_ID        = BC2.CLASS_ID
            AND     BL2.CLASS_DTL_CD    = TRS.ORDERTYPE
            AND     BL2.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS_DTL_SUB     BS2
            ON      BS2.CLASS_DTL_ID    = BL2.CLASS_DTL_ID
            AND     BS2.DEL_FLG         = '0'
WHERE   1                   = 1
/*IF pmb.controlNo != null*/
AND     TRL.CONTROL_NO      = /*pmb.controlNo*/11111111111
/*END*/
AND     TRL.DEL_FLG         = '0'
ORDER   BY
        TRS.SHIPSCHDATE,
        CASE WHEN BS2.OTHERCD1 = '1' THEN MCP.TRANSPORTPRIORITY ELSE NULL END,
        TRS.OWNERSONO,
        TRD.NOTES,
        TRD.PRICE2 DESC,
        MPR.USERNUM3,
        MPR.PRODUCT_CD,
        TRD.LOT1,
        TRD.LOT4,
        TRD.LOT3

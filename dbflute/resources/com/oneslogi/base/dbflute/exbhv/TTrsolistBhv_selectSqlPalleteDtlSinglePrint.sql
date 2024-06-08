/*
 [df:title]
 保税出庫関連リスト出力

 [df:description]
 パレット明細(単品)発行データ取得

*/

-- #df:entity#
-- ##BigDecimal CASE_EXPECTQTY1##
-- !df:pmb!
-- !!AutoDetect!!
SELECT  TRL.TRSOLISTKEY,                                    -- 出庫関連リストキー
        TRL.WORKALLOCATEID,                                 -- 棚出リストキー
        TRS.FAX1,                                           -- 出庫経路区分
        TRS.CARRIERSNAME,                                   -- 出庫先短縮名称
        TRS.SHIPSCHDATE,                                    -- 出庫予定日
        TRS.OWNERSONO,                                      -- 整理番号
        TRS.NOTES,                                          -- 出庫時備考
        TRS.RMANO,                                          -- 問合せ番号
        TRD.NOTES                   AS SOPALLETNO,          -- パレット番号(保税)
        TRD.STOCK_TYPE_CD,                                  -- 在庫区分
        TRD.SOLINENO,                                       -- 出庫指示行№
        dbo.FX_QTYBYSTYLE1(TRD.EXPECTQTY1, 
            MPR.UNIT1, 
            MPR.UNIT2)              AS CASE_EXPECTQTY1,     -- 出庫予定数量(ケース)
        TRD.LOT1,                                           -- 商社搬入番号
        TRD.LOT4,                                           -- 製造年月日
        TRD.IFITEMCD,                                       -- IF銘柄CD
        OT1.LOCATION_CD,                                    -- ロケーションCD
        LOT.LOT3,                                           -- デザイン区分
        LOT.LOT2,                                           -- 製造記号
        MCS.CUSTOMER_ABBR,                                  -- 取引先略称
        MCN.CENTER_ABBR,                                    -- 拠点略称
        MPR.PRODUCT_CD,                                     -- 銘柄CD
        MPR.PRODUCT_ABBR,                                   -- 商品略称
        MPR.USERNUM3,                                       -- 一般出力順
        MCP.TRANSPORTPRIORITY,                              -- 出力順(組織)
        BD1.OTHERCD3,                                       -- その他コード３
        BD2.DICT_NM                 AS OTHERREFNO1          -- 輸送形態

FROM    T_TRSOLIST                      TRL
    INNER   JOIN    T_TRSO              TRS
            ON      TRS.SOID            = TRL.SOID
            AND     TRS.PICKING_INST_ID = TRL.PICKING_INST_ID
            AND     TRS.DEL_FLG         = '0'
    INNER   JOIN    T_TRSODETAIL        TRD
            ON      TRD.SOID            = TRL.SOID
            AND     TRD.SODETAILID      = TRL.SODETAILID
            AND     TRD.DEL_FLG         = '0'
    INNER   JOIN    (
                        SELECT  TPD.SOID,
                                TPD.SODETAILID,
                                LOC.LOCATION_CD,
                                TPD.LOT_ID
                        FROM    T_BTRPICKDETAIL     TPD
                            INNER   JOIN    M_LOCATION  LOC
                                    ON      LOC.LOCATION_ID     = TPD.LOCATION_ID
                                    AND     LOC.DEL_FLG         = '0'
                        WHERE   TPD.PALLETTYPE      = 1
                        AND     TPD.DEL_FLG         = '0'
                        AND     EXISTS  (
                                            SELECT  'X'
                                            FROM    T_TRSOLIST      TRL
                                            WHERE   TRL.SOID        = TPD.SOID
                                            /*IF pmb.controlNo != null*/
                                            AND     TRL.CONTROL_NO      = /*pmb.controlNo*/11111111111
                                            /*END*/
                                        )
                        GROUP   BY
                                TPD.SOID,
                                TPD.SODETAILID,
                                LOC.LOCATION_CD,
                                TPD.LOT_ID
                    ) OT1
            ON      OT1.SOID                = TRD.SOID
            AND     OT1.SODETAILID          = TRD.SODETAILID
    INNER   JOIN    T_LOT                   LOT
            ON      LOT.LOT_ID              = OT1.LOT_ID
            AND     LOT.DEL_FLG             = '0'
    LEFT OUTER JOIN M_MFCOMPANY             MCP
            ON      MCP.COMPANY_CD          = TRS.SHIPTOCD
            AND     MCP.DEL_FLG             = '0'
    LEFT OUTER JOIN M_CUSTOMER              MCS
            ON      MCS.CLIENT_ID           = TRS.CLIENT_ID
            AND     MCS.CUSTOMER_CD         = TRS.CUSTOMER_CD
            AND     MCS.DEL_FLG             = '0'
    INNER JOIN      M_CENTER                MCN
            ON      MCN.CENTER_ID           = TRL.CENTER_ID
            AND     MCN.DEL_FLG             = '0'
    INNER   JOIN    M_PRODUCT               MPR
            ON      MPR.PRODUCT_ID          = TRD.PRODUCT_ID
            AND     MPR.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS                 BC1
            ON      BC1.CLASS_CD            = 'ZAIKODIV'
            AND     BC1.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS_DTL             BL1
            ON      BL1.CLASS_ID            = BC1.CLASS_ID
            AND     BL1.CLASS_DTL_CD        = TRD.STOCK_TYPE_CD
            AND     BL1.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS_DTL_SUB         BD1
            ON      BD1.CLASS_DTL_ID        = BL1.CLASS_DTL_ID
            AND     BD1.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS                 BC2
            ON      BC2.CLASS_CD            = 'TRAFFICPATTERN'
            AND     BC2.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS_DTL             BL2
            ON      BL2.CLASS_ID            = BC2.CLASS_ID
            AND     BL2.CLASS_DTL_CD        = TRS.OTHERREFNO1
            AND     BL2.DEL_FLG             = '0'
    INNER   JOIN    B_DICT                  BD2
            ON      BD2.DICT_ID             = BL2.DICT_ID
            AND     BL2.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS                 BC3
            ON      BC3.CLASS_CD            = 'REQUESTTYPE'
            AND     BC3.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS_DTL             BL3
            ON      BL3.CLASS_ID            = BC3.CLASS_ID
            AND     BL3.CLASS_DTL_CD        = TRS.ORDERTYPE
            AND     BL3.DEL_FLG             = '0'
    INNER   JOIN    B_CLASS_DTL_SUB         BS3
            ON      BS3.CLASS_DTL_ID        = BL3.CLASS_DTL_ID
            AND     BS3.DEL_FLG             = '0'


WHERE   1                   = 1
/*IF pmb.controlNo != null*/
AND     TRL.CONTROL_NO      = /*pmb.controlNo*/11111111111
/*END*/
AND     TRL.DEL_FLG         = '0'
ORDER   BY
        TRL.WORKALLOCATEID,
        OT1.LOCATION_CD,
        MPR.USERNUM3,
        MPR.PRODUCT_CD,
        TRD.LOT1,
        TRD.LOT4,
        TRD.LOT3,
        CASE WHEN BS3.OTHERCD1 = '1' THEN MCP.TRANSPORTPRIORITY ELSE NULL END,
        TRD.NOTES

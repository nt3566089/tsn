/*
 [df:title]
 保税出庫関連リスト再出力一覧データ取得

 [df:description]
  保税出庫関連リスト再出力一覧データを取得します。
*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Timestamp printdatetimeFrom!!
-- !!Timestamp printdatetimeTo!!

/*IF pmb.isPaging()*/
-- ELSE SELECT COUNT(*) FROM (
/*END*/
SELECT  BD1.DICT_NM         AS  LISTKBN_NM,     --帳票名
        MCN.CENTER_CD,                          --拠点CD
        MCN.CENTER_ABBR,                        --拠点名称
        OT1.SHIPPING_LIST_PRINT_ID,             --出庫関連リスト印刷ID
        OT1.PRINTDATETIME,                      --印刷年月日
        OT1.SHIPSCHDATE,                        --出庫予定日
        OT1.WORKALLOCATEID,                     --棚出リストキー
        OT1.OWNERORDERNO,                       --車割キー
        BD2.DICT_NM         AS  ORDERTYPE_NM,   --依頼種別名
        OT1.CUSTORDERNO,                        --依頼番号
        OT1.RMANO,                              --問合番号
        OT1.TRSO_OWNERSONO  AS  OWNERSONO,      --整理番号
        CASE WHEN OT1.FAX1 = '3'
             THEN OT1.CUSTOMER_CD
             ELSE OT1.SHIPTOCD
        END                 AS  SHIPTOCD,       --受入先CD
        CASE WHEN OT1.FAX1 = '3'
             THEN MCS.CUSTOMER_ABBR
             ELSE OT1.DELIVNAME
        END                 AS  DELIVNAME,      --受入先名称
        BD3.DICT_NM         AS  TRSOLISTSTS_NM, --出庫作業ステータス名
        OT1.SOPALLETNO,                         --P/LNo.
        OT1.LOCATION_CD,                        --ロケーションCD
        OT1.LISTKBN,                            --帳票区分
        OT1.SOKEY,                              --出庫指示キー
        OT1.SOID,                               --出庫予定ID
        MCL.CLIENT_CD,                          --荷主CD
        MCL.CLIENT_ABBR                         --荷主名称
FROM    (
            SELECT  TSL.*,
                    NULL AS TRSO_OWNERSONO, --出庫予定の整理番号
                    NULL AS OWNERORDERNO,   --車割キー
                    NULL AS ORDERTYPE,      --依頼種別
                    NULL AS CUSTORDERNO,    --依頼番号
                    NULL AS CUSTOMER_CD,    --特約店CD
                    NULL AS DELIVNAME,      --出庫先名称
                    NULL AS FAX1,           --出庫経路区分
                    NULL AS SOKEY,          --出庫指示Ｋｅｙ
                    CASE WHEN OT11.LOCATION_CNT = 1 THEN OT11.LOCATION_CD ELSE NULL END AS LOCATION_CD
            FROM    T_TRSOLIST  TSL
                INNER   JOIN    (
                                    SELECT  TPL.WORKALLOCATEID,
                                            TPL.FLOOR,
                                            COUNT(DISTINCT MLC.LOCATION_CD) AS LOCATION_CNT,
                                            MIN(MLC.LOCATION_CD)            AS LOCATION_CD
                                    FROM    T_PICKLIST      TPL
                                        INNER   JOIN    M_LOCATION  MLC
                                                ON      MLC.LOCATION_ID = TPL.LOCATION_ID
                                                AND     MLC.DEL_FLG     = '0'
                                    WHERE   TPL.DEL_FLG =   '0'
                                    AND     EXISTS  (
                                                        SELECT  'X'
                                                        FROM    T_TRSOLIST  EX1
                                                            INNER   JOIN    T_TRSO              EX2
                                                                    ON      EX2.PICKING_INST_ID = EX1.PICKING_INST_ID
                                                                    AND     EX2.DEL_FLG         = '0'
                                                            INNER   JOIN    T_TRSODETAIL        EX3
                                                                    ON      EX3.SOID            = EX2.SOID
                                                                    AND     EX3.DEL_FLG         = '0'
                                                        WHERE   EX1.WORKALLOCATEID  = TPL.WORKALLOCATEID
                                                        AND     EX1.FLOOR           = TPL.FLOOR
                                                        /*IF pmb.listkbn != null*/
                                                        AND     EX1.LISTKBN         =       /*pmb.listkbn*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.workallocateid != null*/
                                                        AND     EX1.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeFrom != null*/
                                                        AND     EX1.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeTo != null*/
                                                        AND     EX1.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.trsoliststs != null*/
                                                        AND     EX1.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
                                                        /*END*/
                                                        AND     EX1.LISTKBN         IN      (1, 2, 5)
                                                        AND     EX1.PRINTEDFLG      =       '1'
                                                        /*IF pmb.centerId != null*/
                                                        AND     EX2.CENTER_ID       =       /*pmb.centerId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.clientId != null*/
                                                        AND     EX2.CLIENT_ID       =       /*pmb.clientId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.shipschdateFrom != null*/
                                                        AND     EX2.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
                                                        /*END*/
                                                        /*IF pmb.shipschdateTo != null*/
                                                        AND     EX2.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
                                                        /*END*/
                                                        /*IF pmb.shiptocd != null*/
                                                        AND     EX2.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.customerCd != null*/
                                                        AND     EX2.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.ownerordrno != null*/
                                                        AND     EX2.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.rmano != null*/
                                                        AND     EX2.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot2 != null*/
                                                        AND     EX3.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.otherlot4 != null*/
                                                        AND     EX3.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot3 != null*/
                                                        AND     EX3.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.notes != null*/
                                                        AND     EX3.NOTES           LIKE    /*pmb.notes*/'11111111111%'
                                                        /*END*/
                                                        AND     EX1.DEL_FLG         =       '0'
                                                    )
                                    GROUP   BY
                                            TPL.WORKALLOCATEID,
                                            TPL.FLOOR
                                )   OT11
                        ON  OT11.WORKALLOCATEID = TSL.WORKALLOCATEID
                        AND OT11.FLOOR          = TSL.FLOOR
            WHERE   1                   =       1
            /*IF pmb.listkbn != null*/
            AND     TSL.LISTKBN         =       /*pmb.listkbn*/'11111111111'
            /*END*/
            /*IF pmb.workallocateid != null*/
            AND     TSL.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
            /*END*/
            /*IF pmb.printdatetimeFrom != null*/
            AND     TSL.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
            /*END*/
            /*IF pmb.printdatetimeTo != null*/
            AND     TSL.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
            /*END*/
            /*IF pmb.trsoliststs != null*/
            AND     TSL.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
            /*END*/
            AND     TSL.LISTKBN         IN      (1, 2, 5)
            AND     TSL.PRINTEDFLG      =       '1'
            AND     TSL.DEL_FLG         =       '0'
            AND     EXISTS  (
                                SELECT  'X'
                                FROM    T_TRSO      EX1
                                    INNER   JOIN    T_TRSODETAIL    EX2
                                            ON      EX2.SOID        = EX1.SOID
                                            AND     EX2.DEL_FLG     = '0'
                                WHERE   EX1.PICKING_INST_ID     = TSL.PICKING_INST_ID
                                /*IF pmb.centerId != null*/
                                AND     EX1.CENTER_ID       =       /*pmb.centerId*/11111111111
                                /*END*/
                                /*IF pmb.clientId != null*/
                                AND     EX1.CLIENT_ID       =       /*pmb.clientId*/11111111111
                                /*END*/
                                /*IF pmb.shipschdateFrom != null*/
                                AND     EX1.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
                                /*END*/
                                /*IF pmb.shipschdateTo != null*/
                                AND     EX1.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
                                /*END*/
                                /*IF pmb.shiptocd != null*/
                                AND     EX1.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
                                /*END*/
                                /*IF pmb.customerCd != null*/
                                AND     EX1.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
                                /*END*/
                                /*IF pmb.ownerordrno != null*/
                                AND     EX1.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
                                /*END*/
                                /*IF pmb.rmano != null*/
                                AND     EX1.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
                                /*END*/
                                /*IF pmb.otherlot2 != null*/
                                AND     EX2.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                /*END*/
                                /*IF pmb.otherlot4 != null*/
                                AND     EX2.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                /*END*/
                                /*IF pmb.otherlot3 != null*/
                                AND     EX2.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                /*END*/
                                /*IF pmb.notes != null*/
                                AND     EX2.NOTES           LIKE    /*pmb.notes*/'11111111111%'
                                /*END*/
                                AND     EX1.DEL_FLG         = '0'
                            )
            AND     EXISTS  (
                                SELECT  'X'
                                FROM    T_PICKLIST  EX1
                                    INNER   JOIN    M_LOCATION  EX2
                                            ON      EX2.LOCATION_ID = EX1.LOCATION_ID
                                            AND     EX2.DEL_FLG     = '0'
                                WHERE   EX1.WORKALLOCATEID  =       TSL.WORKALLOCATEID
                                AND     EX1.FLOOR           =       TSL.FLOOR
                                /*IF pmb.locationCd != null*/
                                AND     EX2.LOCATION_CD     LIKE    /*pmb.locationCd*/'11111111111%'
                                /*END*/
                                AND     EX1.DEL_FLG         =       '0'
                    )
            UNION   ALL
            SELECT  TSL.*,
                    CASE
                        WHEN    TRS.POSTNO = '1'
                        AND     OT21.OTHERLOT3_CNT != 1
                            THEN    NULL
                        WHEN    TRS.POSTNO = '1'
                        AND     OT21.OTHERLOT3_CNT = 1
                            THEN    OT21.OTHERLOT3
                            ELSE    TRS.OWNERSONO
                    END                         AS TRSO_OWNERSONO,  --出庫予定の整理番号
                    TRS.OWNERORDERNO,       --車割キー
                    CASE
                        WHEN    TRS.POSTNO = '1'
                        AND     OT21.OTHERLOT2_CNT != 1
                            THEN    NULL
                        WHEN    TRS.POSTNO = '1'
                        AND     OT21.OTHERLOT2_CNT = 1
                            THEN    OT21.OTHERLOT2
                            ELSE    TRS.ORDERTYPE
                    END                         AS ORDERTYPE,       --依頼種別
                    CASE
                        WHEN    TRS.POSTNO = '1'
                        AND     OT21.OTHERLOT4_CNT != 1
                            THEN    NULL
                        WHEN    TRS.POSTNO = '1'
                        AND     OT21.OTHERLOT4_CNT = 1
                            THEN    OT21.OTHERLOT4
                            ELSE    TRS.CUSTORDERNO
                    END                         AS CUSTORDERNO, --依頼番号
                    TRS.CUSTOMER_CD,        --特約店CD
                    TRS.DELIVNAME,          --出庫先名称
                    TRS.FAX1,               --出庫経路区分
                    TRS.SOKEY,              --出庫指示Ｋｅｙ
                    CASE WHEN OT22.LOCATION_CNT = 1 THEN OT22.LOCATION_CD ELSE NULL END AS LOCATION_CD
            FROM    T_TRSOLIST  TSL
                INNER   JOIN    T_TRSO  TRS
                        ON      TRS.SOID            = TSL.SOID
                        AND     TRS.DEL_FLG         = '0'
                INNER   JOIN    (
                                    SELECT  DTL.SOID,
                                            DTL.NOTES,
                                            COUNT(DISTINCT DTL.OTHERLOT3)   AS OTHERLOT3_CNT,   --整理番号件数
                                            COUNT(DISTINCT DTL.OTHERLOT2)   AS OTHERLOT2_CNT,   --依頼種別件数
                                            COUNT(DISTINCT DTL.OTHERLOT4)   AS OTHERLOT4_CNT,   --依頼番号件数
                                            MIN(DTL.OTHERLOT3)              AS OTHERLOT3,       --整理番号
                                            MIN(DTL.OTHERLOT2)              AS OTHERLOT2,       --依頼種別
                                            MIN(DTL.OTHERLOT4)              AS OTHERLOT4        --依頼番号
                                    FROM    T_TRSODETAIL    DTL
                                    WHERE   DTL.DEL_FLG     =   '0'
                                    AND     EXISTS  (
                                                        SELECT  'X'
                                                        FROM    T_TRSOLIST  EX1
                                                            INNER   JOIN    T_TRSO          EX2
                                                                    ON      EX2.PICKING_INST_ID =   EX1.PICKING_INST_ID
                                                                    AND     EX2.SOID            =   EX1.SOID
                                                                    AND     EX2.DEL_FLG         =   '0'
                                                            INNER   JOIN    T_TRSODETAIL    EX3
                                                                    ON      EX3.SOID            =   EX2.SOID
                                                                    AND     EX3.NOTES           =   EX1.SOPALLETNO
                                                                    AND     EX3.DEL_FLG         =   '0'
                                                        WHERE   EX1.SOID            =       DTL.SOID
                                                        AND     EX1.SOPALLETNO      =       DTL.NOTES
                                                        /*IF pmb.listkbn != null*/
                                                        AND     EX1.LISTKBN         =       /*pmb.listkbn*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.workallocateid != null*/
                                                        AND     EX1.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeFrom != null*/
                                                        AND     EX1.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeTo != null*/
                                                        AND     EX1.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.trsoliststs != null*/
                                                        AND     EX1.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
                                                        /*END*/
                                                        AND     EX1.LISTKBN         IN      (3, 4)
                                                        AND     EX1.PRINTEDFLG      =       '1'
                                                        /*IF pmb.centerId != null*/
                                                        AND     EX2.CENTER_ID       =       /*pmb.centerId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.clientId != null*/
                                                        AND     EX2.CLIENT_ID       =       /*pmb.clientId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.shipschdateFrom != null*/
                                                        AND     EX2.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
                                                        /*END*/
                                                        /*IF pmb.shipschdateTo != null*/
                                                        AND     EX2.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
                                                        /*END*/
                                                        /*IF pmb.shiptocd != null*/
                                                        AND     EX2.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.customerCd != null*/
                                                        AND     EX2.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.ownerordrno != null*/
                                                        AND     EX2.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.rmano != null*/
                                                        AND     EX2.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot2 != null*/
                                                        AND     EX3.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.otherlot4 != null*/
                                                        AND     EX3.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot3 != null*/
                                                        AND     EX3.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.notes != null*/
                                                        AND     EX3.NOTES           LIKE    /*pmb.notes*/'11111111111%'
                                                        /*END*/
                                                        AND     EX1.DEL_FLG         =       '0'
                                            )
                                    GROUP   BY
                                            DTL.SOID,
                                            DTL.NOTES
                                )   OT21
                        ON      OT21.SOID   =   TSL.SOID
                        AND     OT21.NOTES  =   TSL.SOPALLETNO
                INNER   JOIN    (
                                    SELECT  DTL.SOID,
                                            DTL.NOTES,
                                            COUNT(DISTINCT MLC.LOCATION_CD) AS LOCATION_CNT,
                                            MIN(MLC.LOCATION_CD)            AS LOCATION_CD
                                    FROM    T_TRSODETAIL    DTL
                                        INNER   JOIN    T_BTRPICKDETAIL TPD
                                                ON      TPD.SOID        =   DTL.SOID
                                                AND     TPD.SODETAILID  =   DTL.SODETAILID
                                                AND     TPD.DEL_FLG     =   '0'
                                        INNER   JOIN    M_LOCATION      MLC
                                                ON      MLC.LOCATION_ID =   TPD.LOCATION_ID
                                                AND     MLC.DEL_FLG     =   '0'
                                    WHERE   DTL.DEL_FLG =   '0'
                                    AND     EXISTS  (
                                                        SELECT  'X'
                                                        FROM    T_TRSOLIST  EX1
                                                            INNER   JOIN    T_TRSO          EX2
                                                                    ON      EX2.PICKING_INST_ID =   EX1.PICKING_INST_ID
                                                                    AND     EX2.SOID            =   EX1.SOID
                                                                    AND     EX2.DEL_FLG         =   '0'
                                                            INNER   JOIN    T_TRSODETAIL    EX3
                                                                    ON      EX3.SOID            =   EX2.SOID
                                                                    AND     EX3.NOTES           =   EX1.SOPALLETNO
                                                                    AND     EX3.DEL_FLG         =   '0'
                                                        WHERE   EX1.SOID            =       DTL.SOID
                                                        AND     EX1.SOPALLETNO      =       DTL.NOTES
                                                        /*IF pmb.listkbn != null*/
                                                        AND     EX1.LISTKBN         =       /*pmb.listkbn*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.workallocateid != null*/
                                                        AND     EX1.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeFrom != null*/
                                                        AND     EX1.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeTo != null*/
                                                        AND     EX1.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.trsoliststs != null*/
                                                        AND     EX1.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
                                                        /*END*/
                                                        AND     EX1.LISTKBN         IN      (3, 4)
                                                        AND     EX1.PRINTEDFLG      =       '1'
                                                        /*IF pmb.centerId != null*/
                                                        AND     EX2.CENTER_ID       =       /*pmb.centerId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.clientId != null*/
                                                        AND     EX2.CLIENT_ID       =       /*pmb.clientId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.shipschdateFrom != null*/
                                                        AND     EX2.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
                                                        /*END*/
                                                        /*IF pmb.shipschdateTo != null*/
                                                        AND     EX2.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
                                                        /*END*/
                                                        /*IF pmb.shiptocd != null*/
                                                        AND     EX2.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.customerCd != null*/
                                                        AND     EX2.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.ownerordrno != null*/
                                                        AND     EX2.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.rmano != null*/
                                                        AND     EX2.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot2 != null*/
                                                        AND     EX3.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.otherlot4 != null*/
                                                        AND     EX3.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot3 != null*/
                                                        AND     EX3.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.notes != null*/
                                                        AND     EX3.NOTES           LIKE    /*pmb.notes*/'11111111111%'
                                                        /*END*/
                                                        AND     EX1.DEL_FLG         =       '0'
                                            )
                                    GROUP   BY
                                            DTL.SOID,
                                            DTL.NOTES
                                )   OT22
                        ON      OT22.SOID   =   TSL.SOID
                        AND     OT22.NOTES  =   TSL.SOPALLETNO
            WHERE   1                   =       1
            /*IF pmb.listkbn != null*/
            AND     TSL.LISTKBN         =       /*pmb.listkbn*/'11111111111'
            /*END*/
            /*IF pmb.workallocateid != null*/
            AND     TSL.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
            /*END*/
            /*IF pmb.printdatetimeFrom != null*/
            AND     TSL.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
            /*END*/
            /*IF pmb.printdatetimeTo != null*/
            AND     TSL.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
            /*END*/
            /*IF pmb.trsoliststs != null*/
            AND     TSL.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
            /*END*/
            /*IF pmb.notes != null*/
            AND     TSL.SOPALLETNO      LIKE    /*pmb.notes*/'11111111111%'
            /*END*/
            /*IF pmb.centerId != null*/
            AND     TRS.CENTER_ID       =       /*pmb.centerId*/11111111111
            /*END*/
            /*IF pmb.clientId != null*/
            AND     TRS.CLIENT_ID       =       /*pmb.clientId*/11111111111
            /*END*/
            /*IF pmb.shipschdateFrom != null*/
            AND     TRS.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
            /*END*/
            /*IF pmb.shipschdateTo != null*/
            AND     TRS.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
            /*END*/
            /*IF pmb.shiptocd != null*/
            AND     TRS.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
            /*END*/
            /*IF pmb.customerCd != null*/
            AND     TRS.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
            /*END*/
            /*IF pmb.ownerordrno != null*/
            AND     TRS.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
            /*END*/
            /*IF pmb.rmano != null*/
            AND     TRS.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
            /*END*/
            AND     TSL.LISTKBN         IN      (3, 4)
            AND     TSL.PRINTEDFLG      =       '1'
            AND     TSL.DEL_FLG         =       '0'
            AND     EXISTS  (
                                SELECT  'X'
                                FROM    T_TRSO      EX1
                                    INNER   JOIN    T_TRSODETAIL    EX2
                                            ON      EX2.SOID        = EX1.SOID
                                            AND     EX2.DEL_FLG     = '0'
                                WHERE   EX1.PICKING_INST_ID     = TSL.PICKING_INST_ID
                                AND     EX1.SOID                = TSL.SOID
                                AND     EX2.SOID                = EX1.SOID
                                AND     EX2.NOTES               = TSL.SOPALLETNO
                                /*IF pmb.otherlot2 != null*/
                                AND     EX2.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                /*END*/
                                /*IF pmb.otherlot4 != null*/
                                AND     EX2.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                /*END*/
                                /*IF pmb.otherlot3 != null*/
                                AND     EX2.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                /*END*/
                                AND     EX1.DEL_FLG         = '0'
                            )
            AND     EXISTS  (
                                SELECT  'X'
                                FROM    T_BTRPICKDETAIL EX1
                                    INNER   JOIN    M_LOCATION  EX2
                                            ON      EX2.LOCATION_ID = EX1.LOCATION_ID
                                            AND     EX2.DEL_FLG     = '0'
                                WHERE   EX1.SOID            =       TSL.SOID
                                /*IF pmb.locationCd != null*/
                                AND     EX2.LOCATION_CD     LIKE    /*pmb.locationCd*/'11111111111%'
                                /*END*/
                                AND     EX1.DEL_FLG         =       '0'
                    )

            UNION   ALL
            SELECT  TSL.*,
                    CASE
                        WHEN    TRS.POSTNO = '1'
                        AND     OT31.OTHERLOT3_CNT != 1
                            THEN    NULL
                        WHEN    TRS.POSTNO = '1'
                        AND     OT31.OTHERLOT3_CNT = 1
                            THEN    OT31.OTHERLOT3
                            ELSE    TRS.OWNERSONO
                    END                         AS TRSO_OWNERSONO,  --出庫予定の整理番号
                    TRS.OWNERORDERNO,       --車割キー
                    CASE
                        WHEN    TRS.POSTNO = '1'
                        AND     OT31.OTHERLOT2_CNT != 1
                            THEN    NULL
                        WHEN    TRS.POSTNO = '1'
                        AND     OT31.OTHERLOT2_CNT = 1
                            THEN    OT31.OTHERLOT2
                            ELSE    TRS.ORDERTYPE
                    END                         AS ORDERTYPE,       --依頼種別
                    CASE
                        WHEN    TRS.POSTNO = '1'
                        AND     OT31.OTHERLOT4_CNT != 1
                            THEN    NULL
                        WHEN    TRS.POSTNO = '1'
                        AND     OT31.OTHERLOT4_CNT = 1
                            THEN    OT31.OTHERLOT4
                            ELSE    TRS.CUSTORDERNO
                    END                         AS CUSTORDERNO, --依頼番号
                    TRS.CUSTOMER_CD,        --特約店CD
                    TRS.DELIVNAME,          --出庫先名称
                    TRS.FAX1,               --出庫経路区分
                    TRS.SOKEY,              --出庫指示Ｋｅｙ
                    CASE WHEN OT32.LOCATION_CNT = 1 THEN OT32.LOCATION_CD ELSE NULL END AS LOCATION_CD
            FROM    T_TRSOLIST  TSL
                INNER   JOIN    T_TRSO  TRS
                        ON      TRS.SOID            = TSL.SOID
                        AND     TRS.DEL_FLG         = '0'
                INNER   JOIN    (
                                    SELECT  DTL.SOID,
                                            COUNT(DISTINCT DTL.OTHERLOT3)   AS OTHERLOT3_CNT,   --整理番号件数
                                            COUNT(DISTINCT DTL.OTHERLOT2)   AS OTHERLOT2_CNT,   --依頼種別件数
                                            COUNT(DISTINCT DTL.OTHERLOT4)   AS OTHERLOT4_CNT,   --依頼番号件数
                                            MIN(DTL.OTHERLOT3)              AS OTHERLOT3,       --整理番号
                                            MIN(DTL.OTHERLOT2)              AS OTHERLOT2,       --依頼種別
                                            MIN(DTL.OTHERLOT4)              AS OTHERLOT4        --依頼番号
                                    FROM    T_TRSODETAIL    DTL
                                    WHERE   DTL.DEL_FLG     =   '0'
                                    AND     EXISTS  (
                                                        SELECT  'X'
                                                        FROM    T_TRSOLIST  EX1
                                                            INNER   JOIN    T_TRSO          EX2
                                                                    ON      EX2.PICKING_INST_ID =   EX1.PICKING_INST_ID
                                                                    AND     EX2.SOID            =   EX1.SOID
                                                                    AND     EX2.DEL_FLG         =   '0'
                                                            INNER   JOIN    T_TRSODETAIL    EX3
                                                                    ON      EX3.SOID            =   EX2.SOID
                                                                    AND     EX3.DEL_FLG         =   '0'
                                                        WHERE   EX1.SOID            =       DTL.SOID
                                                        /*IF pmb.listkbn != null*/
                                                        AND     EX1.LISTKBN         =       /*pmb.listkbn*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.workallocateid != null*/
                                                        AND     EX1.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeFrom != null*/
                                                        AND     EX1.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeTo != null*/
                                                        AND     EX1.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.trsoliststs != null*/
                                                        AND     EX1.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
                                                        /*END*/
                                                        AND     EX1.LISTKBN         =       6
                                                        AND     EX1.PRINTEDFLG      =       '1'
                                                        /*IF pmb.centerId != null*/
                                                        AND     EX2.CENTER_ID       =       /*pmb.centerId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.clientId != null*/
                                                        AND     EX2.CLIENT_ID       =       /*pmb.clientId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.shipschdateFrom != null*/
                                                        AND     EX2.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
                                                        /*END*/
                                                        /*IF pmb.shipschdateTo != null*/
                                                        AND     EX2.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
                                                        /*END*/
                                                        /*IF pmb.shiptocd != null*/
                                                        AND     EX2.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.customerCd != null*/
                                                        AND     EX2.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.ownerordrno != null*/
                                                        AND     EX2.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.rmano != null*/
                                                        AND     EX2.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot2 != null*/
                                                        AND     EX3.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.otherlot4 != null*/
                                                        AND     EX3.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot3 != null*/
                                                        AND     EX3.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.notes != null*/
                                                        AND     EX3.NOTES           LIKE    /*pmb.notes*/'11111111111%'
                                                        /*END*/
                                                        AND     EX1.DEL_FLG         =       '0'
                                            )
                                    GROUP   BY
                                            DTL.SOID
                                )   OT31
                        ON      OT31.SOID   =   TSL.SOID
                INNER   JOIN    (
                                    SELECT  TPD.SOID,
                                            COUNT(DISTINCT MLC.LOCATION_CD) AS LOCATION_CNT,
                                            MIN(MLC.LOCATION_CD)            AS LOCATION_CD
                                    FROM    T_BTRPICKDETAIL TPD
                                        INNER   JOIN    M_LOCATION      MLC
                                                ON      MLC.LOCATION_ID =   TPD.LOCATION_ID
                                                AND     MLC.DEL_FLG     =   '0'
                                    WHERE   TPD.DEL_FLG =   '0'
                                    AND     EXISTS  (
                                                        SELECT  'X'
                                                        FROM    T_TRSOLIST  EX1
                                                            INNER   JOIN    T_TRSO          EX2
                                                                    ON      EX2.PICKING_INST_ID =   EX1.PICKING_INST_ID
                                                                    AND     EX2.SOID            =   EX1.SOID
                                                                    AND     EX2.DEL_FLG         =   '0'
                                                            INNER   JOIN    T_TRSODETAIL    EX3
                                                                    ON      EX3.SOID            =   EX2.SOID
                                                                    AND     EX3.DEL_FLG         =   '0'
                                                        WHERE   EX1.SOID            =       TPD.SOID
                                                        /*IF pmb.listkbn != null*/
                                                        AND     EX1.LISTKBN         =       /*pmb.listkbn*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.workallocateid != null*/
                                                        AND     EX1.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeFrom != null*/
                                                        AND     EX1.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeTo != null*/
                                                        AND     EX1.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.trsoliststs != null*/
                                                        AND     EX1.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
                                                        /*END*/
                                                        AND     EX1.LISTKBN         =       6
                                                        AND     EX1.PRINTEDFLG      =       '1'
                                                        /*IF pmb.centerId != null*/
                                                        AND     EX2.CENTER_ID       =       /*pmb.centerId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.clientId != null*/
                                                        AND     EX2.CLIENT_ID       =       /*pmb.clientId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.shipschdateFrom != null*/
                                                        AND     EX2.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
                                                        /*END*/
                                                        /*IF pmb.shipschdateTo != null*/
                                                        AND     EX2.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
                                                        /*END*/
                                                        /*IF pmb.shiptocd != null*/
                                                        AND     EX2.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.customerCd != null*/
                                                        AND     EX2.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.ownerordrno != null*/
                                                        AND     EX2.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.rmano != null*/
                                                        AND     EX2.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot2 != null*/
                                                        AND     EX3.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.otherlot4 != null*/
                                                        AND     EX3.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot3 != null*/
                                                        AND     EX3.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.notes != null*/
                                                        AND     EX3.NOTES           LIKE    /*pmb.notes*/'11111111111%'
                                                        /*END*/
                                                        AND     EX1.DEL_FLG         =       '0'
                                            )
                                    GROUP   BY
                                            TPD.SOID
                                )   OT32
                        ON      OT32.SOID   =   TSL.SOID
            WHERE   1                   =       1
            /*IF pmb.listkbn != null*/
            AND     TSL.LISTKBN         =       /*pmb.listkbn*/'11111111111'
            /*END*/
            /*IF pmb.workallocateid != null*/
            AND     TSL.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
            /*END*/
            /*IF pmb.printdatetimeFrom != null*/
            AND     TSL.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
            /*END*/
            /*IF pmb.printdatetimeTo != null*/
            AND     TSL.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
            /*END*/
            /*IF pmb.trsoliststs != null*/
            AND     TSL.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
            /*END*/
            /*IF pmb.centerId != null*/
            AND     TRS.CENTER_ID       =       /*pmb.centerId*/11111111111
            /*END*/
            /*IF pmb.clientId != null*/
            AND     TRS.CLIENT_ID       =       /*pmb.clientId*/11111111111
            /*END*/
            /*IF pmb.shipschdateFrom != null*/
            AND     TRS.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
            /*END*/
            /*IF pmb.shipschdateTo != null*/
            AND     TRS.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
            /*END*/
            /*IF pmb.shiptocd != null*/
            AND     TRS.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
            /*END*/
            /*IF pmb.customerCd != null*/
            AND     TRS.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
            /*END*/
            /*IF pmb.ownerordrno != null*/
            AND     TRS.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
            /*END*/
            /*IF pmb.rmano != null*/
            AND     TRS.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
            /*END*/
            AND     TSL.LISTKBN         =       6
            AND     TSL.PRINTEDFLG      =       '1'
            AND     TSL.DEL_FLG         =       '0'
            AND     EXISTS  (
                                SELECT  'X'
                                FROM    T_TRSO      EX1
                                    INNER   JOIN    T_TRSODETAIL    EX2
                                            ON      EX2.SOID        = EX1.SOID
                                            AND     EX2.DEL_FLG     = '0'
                                WHERE   EX1.PICKING_INST_ID     = TSL.PICKING_INST_ID
                                AND     EX1.SOID                = TSL.SOID
                                AND     EX2.SOID                = EX1.SOID
                                /*IF pmb.otherlot2 != null*/
                                AND     EX2.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                /*END*/
                                /*IF pmb.otherlot4 != null*/
                                AND     EX2.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                /*END*/
                                /*IF pmb.otherlot3 != null*/
                                AND     EX2.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                /*END*/
                                /*IF pmb.notes != null*/
                                AND     EX2.NOTES           LIKE    /*pmb.notes*/'11111111111%'
                                /*END*/
                                AND     EX1.DEL_FLG         = '0'
                            )
            AND     EXISTS  (
                                SELECT  'X'
                                FROM    T_BTRPICKDETAIL EX1
                                    INNER   JOIN    M_LOCATION  EX2
                                            ON      EX2.LOCATION_ID = EX1.LOCATION_ID
                                            AND     EX2.DEL_FLG     = '0'
                                WHERE   EX1.SOID            =       TSL.SOID
                                /*IF pmb.locationCd != null*/
                                AND     EX2.LOCATION_CD     LIKE    /*pmb.locationCd*/'11111111111%'
                                /*END*/
                                AND     EX1.DEL_FLG         =       '0'
                    )
            UNION   ALL
            SELECT  TSL.*,
                    TSL.OWNERSONO               AS TRSO_OWNERSONO,  --出庫予定の整理番号
                    TRS.OWNERORDERNO,       --車割キー
                    CASE
                        WHEN    TRS.POSTNO = '1'
                        AND     OT41.OTHERLOT2_CNT != 1
                            THEN    NULL
                        WHEN    TRS.POSTNO = '1'
                        AND     OT41.OTHERLOT2_CNT = 1
                            THEN    OT41.OTHERLOT2
                            ELSE    TRS.ORDERTYPE
                    END                         AS ORDERTYPE,       --依頼種別
                    CASE
                        WHEN    TRS.POSTNO = '1'
                        AND     OT41.OTHERLOT4_CNT != 1
                            THEN    NULL
                        WHEN    TRS.POSTNO = '1'
                        AND     OT41.OTHERLOT4_CNT = 1
                            THEN    OT41.OTHERLOT4
                            ELSE    TRS.CUSTORDERNO
                    END                         AS CUSTORDERNO, --依頼番号
                    TRS.CUSTOMER_CD,        --特約店CD
                    TRS.DELIVNAME,          --出庫先名称
                    TRS.FAX1,               --出庫経路区分
                    TRS.SOKEY,              --出庫指示Ｋｅｙ
                    CASE WHEN OT42.LOCATION_CNT = 1 THEN OT42.LOCATION_CD ELSE NULL END AS LOCATION_CD
            FROM    T_TRSOLIST  TSL
                INNER   JOIN    T_TRSO  TRS
                        ON      TRS.SOID            = TSL.SOID
                        AND     TRS.DEL_FLG         = '0'
                INNER   JOIN    (
                                    SELECT  DTL.SOID,
                                            DTL.NOTES,
                                            DTL.OTHERLOT3,
                                            COUNT(DISTINCT DTL.OTHERLOT2)   AS OTHERLOT2_CNT,   --依頼種別件数
                                            COUNT(DISTINCT DTL.OTHERLOT4)   AS OTHERLOT4_CNT,   --依頼番号件数
                                            MIN(DTL.OTHERLOT2)              AS OTHERLOT2,       --依頼種別
                                            MIN(DTL.OTHERLOT4)              AS OTHERLOT4        --依頼番号
                                    FROM    T_TRSODETAIL    DTL
                                    WHERE   DTL.DEL_FLG     =   '0'
                                    AND     EXISTS  (
                                                        SELECT  'X'
                                                        FROM    T_TRSOLIST  EX1
                                                            INNER   JOIN    T_TRSO          EX2
                                                                    ON      EX2.PICKING_INST_ID =   EX1.PICKING_INST_ID
                                                                    AND     EX2.SOID            =   EX1.SOID
                                                                    AND     EX2.DEL_FLG         =   '0'
                                                            INNER   JOIN    T_TRSODETAIL    EX3
                                                                    ON      EX3.SOID            =   EX2.SOID
                                                                    AND     EX3.OTHERLOT3       =   EX1.OWNERSONO
                                                                    AND     EX3.NOTES           =   EX1.SOPALLETNO
                                                                    AND     EX3.DEL_FLG         =   '0'
                                                        WHERE   EX1.SOID            =       DTL.SOID
                                                        AND     EX1.SOPALLETNO      =       DTL.NOTES
                                                        AND     EX1.OWNERSONO       =       DTL.OTHERLOT3
                                                        /*IF pmb.listkbn != null*/
                                                        AND     EX1.LISTKBN         =       /*pmb.listkbn*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.workallocateid != null*/
                                                        AND     EX1.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeFrom != null*/
                                                        AND     EX1.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeTo != null*/
                                                        AND     EX1.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.trsoliststs != null*/
                                                        AND     EX1.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
                                                        /*END*/
                                                        AND     EX1.LISTKBN         =       7
                                                        AND     EX1.PRINTEDFLG      =       '1'
                                                        /*IF pmb.centerId != null*/
                                                        AND     EX2.CENTER_ID       =       /*pmb.centerId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.clientId != null*/
                                                        AND     EX2.CLIENT_ID       =       /*pmb.clientId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.shipschdateFrom != null*/
                                                        AND     EX2.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
                                                        /*END*/
                                                        /*IF pmb.shipschdateTo != null*/
                                                        AND     EX2.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
                                                        /*END*/
                                                        /*IF pmb.shiptocd != null*/
                                                        AND     EX2.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.customerCd != null*/
                                                        AND     EX2.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.ownerordrno != null*/
                                                        AND     EX2.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.rmano != null*/
                                                        AND     EX2.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot2 != null*/
                                                        AND     EX3.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.otherlot4 != null*/
                                                        AND     EX3.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot3 != null*/
                                                        AND     EX3.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.notes != null*/
                                                        AND     EX3.NOTES           LIKE    /*pmb.notes*/'11111111111%'
                                                        /*END*/
                                                        AND     EX1.DEL_FLG         =       '0'
                                            )
                                    GROUP   BY
                                            DTL.SOID,
                                            DTL.NOTES,
                                            DTL.OTHERLOT3
                                )   OT41
                        ON      OT41.SOID       =   TSL.SOID
                        AND     OT41.NOTES      =   TSL.SOPALLETNO
                        AND     OT41.OTHERLOT3  =   TSL.OWNERSONO
                INNER   JOIN    (
                                    SELECT  DTL.SOID,
                                            DTL.NOTES,
                                            DTL.OTHERLOT3,
                                            COUNT(DISTINCT MLC.LOCATION_CD) AS LOCATION_CNT,
                                            MIN(MLC.LOCATION_CD)            AS LOCATION_CD
                                    FROM    T_TRSO      HED
                                        INNER   JOIN    T_TRSODETAIL        DTL
                                                ON      DTL.SOID        =   HED.SOID
                                                AND     DTL.DEL_FLG     =   '0'
                                        INNER   JOIN    T_TRPALLETSYMBOL    TPS
                                                ON      TPS.SOID        =   DTL.SOID
                                                AND     TPS.SODETAILID  =   DTL.SODETAILID
                                                AND     TPS.DEL_FLG     =   '0'
                                        INNER   JOIN    T_CENTER_SYMBOL     TCS
                                                ON      TCS.CENTER_SYMBOL_ID    =   TPS.CENTER_SYMBOL_ID
                                                AND     TCS.DEL_FLG     =   '0'
                                        INNER   JOIN    T_TRSYMBOL          TSY
                                                ON      TSY.TRSYMBOL_ID =   TCS.TRSYMBOL_ID
                                                AND     TSY.DEL_FLG     =   '0'
                                        INNER   JOIN    M_LOCATION      MLC
                                                ON      MLC.LOCATION_ID =   TSY.LOCATION_ID
                                                AND     MLC.DEL_FLG     =   '0'
                                    WHERE   HED.DEL_FLG =   '0'
                                    AND     EXISTS  (
                                                        SELECT  'X'
                                                        FROM    T_TRSOLIST  EX1
                                                            INNER   JOIN    T_TRSO          EX2
                                                                    ON      EX2.PICKING_INST_ID =   EX1.PICKING_INST_ID
                                                                    AND     EX2.SOID            =   EX1.SOID
                                                                    AND     EX2.DEL_FLG         =   '0'
                                                            INNER   JOIN    T_TRSODETAIL    EX3
                                                                    ON      EX3.SOID            =   EX2.SOID
                                                                    AND     EX3.OTHERLOT3       =   EX1.OWNERSONO
                                                                    AND     EX3.NOTES           =   EX1.SOPALLETNO
                                                                    AND     EX3.DEL_FLG         =   '0'
                                                        WHERE   EX1.SOID            =       DTL.SOID
                                                        AND     EX1.SOPALLETNO      =       DTL.NOTES
                                                        AND     EX1.OWNERSONO       =       DTL.OTHERLOT3
                                                        /*IF pmb.listkbn != null*/
                                                        AND     EX1.LISTKBN         =       /*pmb.listkbn*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.workallocateid != null*/
                                                        AND     EX1.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeFrom != null*/
                                                        AND     EX1.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.printdatetimeTo != null*/
                                                        AND     EX1.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
                                                        /*END*/
                                                        /*IF pmb.trsoliststs != null*/
                                                        AND     EX1.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
                                                        /*END*/
                                                        AND     EX1.LISTKBN         =       7
                                                        AND     EX1.PRINTEDFLG      =       '1'
                                                        /*IF pmb.centerId != null*/
                                                        AND     EX2.CENTER_ID       =       /*pmb.centerId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.clientId != null*/
                                                        AND     EX2.CLIENT_ID       =       /*pmb.clientId*/11111111111
                                                        /*END*/
                                                        /*IF pmb.shipschdateFrom != null*/
                                                        AND     EX2.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
                                                        /*END*/
                                                        /*IF pmb.shipschdateTo != null*/
                                                        AND     EX2.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
                                                        /*END*/
                                                        /*IF pmb.shiptocd != null*/
                                                        AND     EX2.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.customerCd != null*/
                                                        AND     EX2.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.ownerordrno != null*/
                                                        AND     EX2.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.rmano != null*/
                                                        AND     EX2.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot2 != null*/
                                                        AND     EX3.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                                        /*END*/
                                                        /*IF pmb.otherlot4 != null*/
                                                        AND     EX3.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.otherlot3 != null*/
                                                        AND     EX3.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                                        /*END*/
                                                        /*IF pmb.notes != null*/
                                                        AND     EX3.NOTES           LIKE    /*pmb.notes*/'11111111111%'
                                                        /*END*/
                                                        AND     EX1.DEL_FLG         =       '0'
                                            )
                                    GROUP   BY
                                            DTL.SOID,
                                            DTL.NOTES,
                                            DTL.OTHERLOT3
                                )   OT42
                        ON      OT42.SOID       =   TSL.SOID
                        AND     OT42.NOTES      =   TSL.SOPALLETNO
                        AND     OT42.OTHERLOT3  =   TSL.OWNERSONO
            WHERE   1                   =       1
            /*IF pmb.listkbn != null*/
            AND     TSL.LISTKBN         =       /*pmb.listkbn*/'11111111111'
            /*END*/
            /*IF pmb.workallocateid != null*/
            AND     TSL.WORKALLOCATEID  LIKE    /*pmb.workallocateid*/'11111111111%'
            /*END*/
            /*IF pmb.printdatetimeFrom != null*/
            AND     TSL.PRINTDATETIME   >=      /*pmb.printdatetimeFrom*/'2011-01-28 00:00:00'
            /*END*/
            /*IF pmb.printdatetimeTo != null*/
            AND     TSL.PRINTDATETIME   <=      /*pmb.printdatetimeTo*/'2011-01-28 00:00:00'
            /*END*/
            /*IF pmb.trsoliststs != null*/
            AND     TSL.TRSOLISTSTS     =       /*pmb.trsoliststs*/'11111111111'
            /*END*/
            /*IF pmb.notes != null*/
            AND     TSL.SOPALLETNO      LIKE    /*pmb.notes*/'11111111111%'
            /*END*/
            /*IF pmb.centerId != null*/
            AND     TRS.CENTER_ID       =       /*pmb.centerId*/11111111111
            /*END*/
            /*IF pmb.clientId != null*/
            AND     TRS.CLIENT_ID       =       /*pmb.clientId*/11111111111
            /*END*/
            /*IF pmb.shipschdateFrom != null*/
            AND     TRS.SHIPSCHDATE     >=      /*pmb.shipschdateFrom*/'20000101'
            /*END*/
            /*IF pmb.shipschdateTo != null*/
            AND     TRS.SHIPSCHDATE     <=      /*pmb.shipschdateTo*/'20301231'
            /*END*/
            /*IF pmb.shiptocd != null*/
            AND     TRS.SHIPTOCD        LIKE    /*pmb.shiptocd*/'11111111111%'
            /*END*/
            /*IF pmb.customerCd != null*/
            AND     TRS.CUSTOMER_CD     LIKE    /*pmb.customerCd*/'11111111111%'
            /*END*/
            /*IF pmb.ownerordrno != null*/
            AND     TRS.OWNERORDERNO    LIKE    /*pmb.ownerordrno*/'11111111111%'
            /*END*/
            /*IF pmb.rmano != null*/
            AND     TRS.RMANO           LIKE    /*pmb.rmano*/'11111111111%'
            /*END*/
            AND     TSL.LISTKBN         =       7
            AND     TSL.PRINTEDFLG      =       '1'
            AND     TSL.DEL_FLG         =       '0'
            AND     EXISTS  (
                                SELECT  'X'
                                FROM    T_TRSO      EX1
                                    INNER   JOIN    T_TRSODETAIL    EX2
                                            ON      EX2.SOID        = EX1.SOID
                                            AND     EX2.OTHERLOT3   = TSL.OWNERSONO
                                            AND     EX2.NOTES       = TSL.SOPALLETNO
                                            AND     EX2.DEL_FLG     = '0'
                                WHERE   EX1.PICKING_INST_ID     = TSL.PICKING_INST_ID
                                AND     EX1.SOID                = TSL.SOID
                                AND     EX2.SOID                = EX1.SOID
                                /*IF pmb.otherlot2 != null*/
                                AND     EX2.OTHERLOT2       =       /*pmb.otherlot2*/'11111111111'
                                /*END*/
                                /*IF pmb.otherlot4 != null*/
                                AND     EX2.OTHERLOT4       LIKE    /*pmb.otherlot4*/'11111111111%'
                                /*END*/
                                /*IF pmb.otherlot3 != null*/
                                AND     EX2.OTHERLOT3       LIKE    /*pmb.otherlot3*/'11111111111%'
                                /*END*/
                                AND     EX1.DEL_FLG         = '0'
                            )
            AND     EXISTS  (
                                SELECT  'X'
                                FROM    T_TRSO      EX1
                                    INNER   JOIN    T_TRSODETAIL        EX2
                                            ON      EX2.SOID        =   EX1.SOID
                                            AND     EX2.DEL_FLG     =   '0'
                                    INNER   JOIN    T_TRPALLETSYMBOL    EX3
                                            ON      EX3.SOID        =   EX2.SOID
                                            AND     EX3.SODETAILID  =   EX2.SODETAILID
                                            AND     EX3.DEL_FLG     =   '0'
                                    INNER   JOIN    T_CENTER_SYMBOL     EX4
                                            ON      EX4.CENTER_SYMBOL_ID    =   EX3.CENTER_SYMBOL_ID
                                            AND     EX4.DEL_FLG     =   '0'
                                    INNER   JOIN    T_TRSYMBOL          EX5
                                            ON      EX5.TRSYMBOL_ID =   EX4.TRSYMBOL_ID
                                            AND     EX5.DEL_FLG     =   '0'
                                    INNER   JOIN    M_LOCATION          EX6
                                            ON      EX6.LOCATION_ID =   EX5.LOCATION_ID
                                            AND     EX6.DEL_FLG     =   '0'
                                WHERE   EX1.SOID            =       TSL.SOID
                                AND     EX2.OTHERLOT3       =       TSL.OWNERSONO
                                AND     EX3.SOPALLETNO      =       TSL.SOPALLETNO
                                /*IF pmb.locationCd != null*/
                                AND     EX6.LOCATION_CD     LIKE    /*pmb.locationCd*/'11111111111%'
                                /*END*/
                                AND     EX1.DEL_FLG         =       '0'
                    )
        )   OT1
    INNER   JOIN    M_CENTER    MCN
            ON      MCN.CENTER_ID       = OT1.CENTER_ID
            AND     MCN.DEL_FLG         = '0'
    INNER   JOIN    M_CLIENT    MCL
            ON      MCL.CLIENT_ID       = OT1.CLIENT_ID
            AND     MCL.DEL_FLG         = '0'
    LEFT OUTER JOIN M_CUSTOMER  MCS
            ON      MCS.CLIENT_ID       = OT1.CLIENT_ID
            AND     MCS.CUSTOMER_CD     = OT1.CUSTOMER_CD
            AND     MCS.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS             BC1
            ON      BC1.CLASS_CD        = 'SOLISTKBN'
            AND     BC1.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS_DTL         BL1
            ON      BL1.CLASS_ID        = BC1.CLASS_ID
            AND     BL1.CLASS_DTL_CD    = OT1.LISTKBN
            AND     BL1.DEL_FLG         = '0'
    INNER   JOIN    B_DICT              BD1
            ON      BD1.DICT_ID         = BL1.DICT_ID
    LEFT OUTER JOIN B_CLASS             BC2
            ON      BC2.CLASS_CD        = 'REQUESTTYPE'
            AND     BC2.DEL_FLG         = '0'
    LEFT OUTER JOIN B_CLASS_DTL         BL2
            ON      BL2.CLASS_ID        = BC2.CLASS_ID
            AND     BL2.CLASS_DTL_CD    = OT1.ORDERTYPE
            AND     BL2.DEL_FLG         = '0'
    LEFT OUTER JOIN B_DICT              BD2
            ON      BD2.DICT_ID         = BL2.DICT_ID
    INNER   JOIN    B_CLASS             BC3
            ON      BC3.CLASS_CD        = 'PICKING_WORK_STATUS'
            AND     BC3.DEL_FLG         = '0'
    INNER   JOIN    B_CLASS_DTL         BL3
            ON      BL3.CLASS_ID        = BC3.CLASS_ID
            AND     BL3.CLASS_DTL_CD    = OT1.TRSOLISTSTS
            AND     BL3.DEL_FLG         = '0'
    INNER   JOIN    B_DICT              BD3
            ON      BD3.DICT_ID         = BL3.DICT_ID
/*IF pmb.isPaging()*/
ORDER   BY
            OT1.WORKALLOCATEID,
            OT1.LISTKBN,
            OT1.LOCATION_CD,
            OT1.SOKEY,
            OT1.SOPALLETNO
-- ELSE ) CNT
/*END*/

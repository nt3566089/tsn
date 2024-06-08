/*
 [df:title]
 コントロールNo.で在庫調査表情報を検索し、在庫調査表項目を取得する。

 [df:description]
  SQL Description here.

*/

-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!
SELECT
    MC.CENTER_CD,                                   -- 拠点CD 
    MC.CENTER_NM AS CENTER_NM,                      -- 拠点略称
    TT.EXECUTEDATE AS STOCKDATE,                    -- 実施日
    MP_0.PRODUCT_CD,                                -- 銘柄CD
    MP_0.PRODUCT_ABBR AS ITEM_NAME,                 -- 銘柄名称
    TT.DUALITEMCDFLG,                               -- 庫内作業集約フラグ
    TT.DUALITEMCD,                                  -- 庫内作業集約CD
    TT.YDAYTLEQULYTOTALINV,                         -- 前日までの過不足
    (
        CASE
            WHEN
                /*pmb.inventoryReportInv*/'4444444444444444444'  = '1' OR										--
   				/*pmb.inventoryReportInv*/'4444444444444444444'  = '2' THEN 
                TT.TDAYEQYTOTALINV
            ELSE
                TT.TDAYEQYTOTALINV-TT.YDAYTLEQULYTOTALINV
            END
    ) AS TDAY_DIFF,                                 --  当日過不足                
    TT.SYSINVTOTALINV,                              --  台帳在庫
    TT.INVESTTOTALINV,                              --  調査計
    TT.INVESTKEEPLOCINV,                            --  保管場在庫_調査結果
    TT.INVESTRECEIVELOCINV,                         --  引取場在庫_調査結果
    TT.INVESTDAMAGEITEM,                            --  かし品置場在庫_調査結果
    TT.INVESTCLSSIFYLOCINV,                         --  仕分場在庫_調査結果
    TT.INVESTTMPLOCINV,                             --  仮置場在庫仕分済分_調査結果
    TT.INVESTAUTOINV,                               --  自動倉庫在庫_調査結果
    (
        CASE
            WHEN 
                /*pmb.inventoryReportInv*/'4444444444444444444'  = '1' OR
                /*pmb.inventoryReportInv*/'4444444444444444444'  = '2' THEN 
                TT.EXCESSTOTALINV
            ELSE
                TT.EXCESSTOTALINV -
                (
                    CASE
                        WHEN TT.YDAYTLEQULYTOTALINV > 0 THEN TT.YDAYTLEQULYTOTALINV
                        ELSE 0
                    END
                )
        END
    ) AS EXCESSTOTALINV,                            --  過剰
    (
        CASE
            WHEN 
                /*pmb.inventoryReportInv*/'4444444444444444444'  = '1' OR
                /*pmb.inventoryReportInv*/'4444444444444444444'  = '2' THEN 
                TT.DEFECTTOTALINV
            ELSE
                TT.DEFECTTOTALINV -
                (
                    CASE
                        WHEN TT.YDAYTLEQULYTOTALINV < 0
                        THEN TT.YDAYTLEQULYTOTALINV
                        ELSE 0
                    END
                )
        END
    ) AS DEFECTTOTALINV,                             --  不足
    TT.CAPITEMFLG,                                   --  CAP銘柄区分
    BU.USER_CD,                                      --  ユーザCD
    BU.USER_NM,                                      --  ユーザ名
    BD.DICT_NM AS CGGDID_NM,                            --  辞書名
    /*pmb.inventoryReportInv*/'4444444444444444444' AS INVENTORYREPORTINV, --	帳票出力区分
    MP_0.USERNUM3 AS USERNUM3,                        --  一般出力順
    MP_0.CGGDID AS CGGDID
FROM
    T_TRINVCHECKINFO TT--①在庫調査表情報
    INNER JOIN M_CENTER MC--②拠点マスタ
    ON MC.CENTER_ID = TT.CENTER_ID
    AND MC.DEL_FLG = '0'
    LEFT OUTER JOIN M_PRODUCT MP_0--③銘柄マスタ
    ON MP_0.PRODUCT_ID = TT.PRODUCT_ID
    AND MP_0.DEL_FLG = '0'
    LEFT OUTER JOIN M_PRODUCT MP_1 --⑤銘柄マスタ
    ON MP_1.CLIENT_ID = TT.CLIENT_ID
    AND MP_1.PRODUCT_CD = TT.DUALITEMCD
    AND TT.DUALITEMCDFLG = '1'
    AND MP_1.DEL_FLG = '0'
    INNER JOIN  B_USER BU--⑦ユーザマスタ
    ON BU.USER_CD = TT.UPD_USER
    AND BU.DEL_FLG = '0'
    INNER JOIN  B_CLASS BC--⑧区分値マスタ
    ON BC.CLASS_CD = 'CGGDID'
    AND BC.DEL_FLG = '0'
    INNER JOIN  B_CLASS_DTL BCD--⑨区分値明細マスタ
    ON BCD.CLASS_ID = BC.CLASS_ID
    AND BCD.CLASS_DTL_CD = MP_0.CGGDID
    AND BCD.DEL_FLG = '0'
    INNER JOIN  B_DICT BD--⑩辞書マスタ
    ON BD.DICT_ID = BCD.DICT_ID
    AND BD.DEL_FLG = '0'
WHERE
    TT.CONTROL_NO = /*pmb.controlNo*/11111111111
    AND TT.DEL_FLG = '0'
ORDER BY
    MP_0.CGGDID ASC,
    TT.CAPITEMFLG ASC,
    (CASE WHEN TT.DUALITEMCDFLG = '1'
        THEN MP_1.USERNUM3 
        ELSE MP_0.USERNUM3
     END
    ) ASC,
    TT.DUALITEMCD ASC,
    TT.DUALITEMCDFLG ASC,
    MP_0.PRODUCT_CD ASC
    
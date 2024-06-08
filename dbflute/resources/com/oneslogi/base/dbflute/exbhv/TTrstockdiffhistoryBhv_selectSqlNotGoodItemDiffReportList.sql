/*
 [df:title]
 変数.対象データ無フラグ == '0'(印刷対象あり) の場合

 [df:description]
  SQL Description here.

*/
-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!


SELECT
    MC.CENTER_CD,                                                      -- ②拠点CD
    MC.CENTER_ABBR AS CENTER_NM,                                       -- 拠点名称
    /*pmb.stockDate*/'20240101' AS STOCKDATE,                          -- 棚卸実施日						
    TTRS.PRODUCT_CD,                                                   -- ①銘柄CD
    MP.PRODUCT_ABBR,                                                   -- ③銘柄名称
    TTRS.DIFFOCC_AREA,                                                 -- ①過不足発生場所
    TTRS.DIFF_QTY_1,                                                   -- ①過不足数
    MP.CGGDID,                                                         -- ③たばこ・商品区分
    BU.USER_CD,                                                        -- ⑤ユーザCD
    BU.USER_NM,                                                        -- ⑤ユーザ名
    BD_0.DICT_NM,                                                      -- たばこ・商品区分名称
    BD_1.DICT_NM,                                                       -- 内外区分名称
    /*pmb.printCount*/11111111111 AS PRINTCOUNT,                       -- 変数.印刷対象件数、
    /*pmb.emptyFlag*/'4444444444444444444' AS EMTPYFLAG                -- 対象データ無フラグ
FROM
    (
        SELECT
             TTS.CENTER_ID,                                            -- ①拠点ID
             TTS.CLIENT_ID,                                            -- ①荷主ID
             TTS.DIFFADD_DATE,                                         -- ①過不足登録日
             TTS.INOUT_KBN,                                            -- ①内外区分
             TTS.PRODUCT_CD,                                           -- ①銘柄CD
             TTS.DIFFOCC_AREA,                                         -- ①過不足発生場所
             TTS.SYHN_KBN,                                             -- 銘柄区分
             SUM(ISNULL(TTS.DIFF_QTY,0)) AS DIFF_QTY_1,                -- 過不足数
             MAX(TTS.UPD_USER) AS UPD_USER_1                           -- 更新ユーザ
        FROM
            (
                SELECT
                    TT.CENTER_ID,                                      -- ①拠点ID
                    TT.CLIENT_ID,                                      -- ①荷主ID
                    TT.DIFFADD_DATE,                                   -- ①過不足登録日
                    TT.INOUT_KBN,                                      -- ①内外区分
                    TT.PRODUCT_CD,                                     -- ①銘柄CD
                    TT.DIFFOCC_AREA,                                   -- ①過不足発生場所
                    (
                        CASE
                            WHEN    TT.INOUT_KBN = '0001' 
                                    AND SUBSTRING(TT.PRODUCT_CD,1,1) = '0'
                                THEN '0000'
                                ELSE TT.INOUT_KBN
                        END
                    ) AS SYHN_KBN,                                     -- 銘柄区分
                    TT.DIFF_QTY,                                       -- ①過不足数
                    TT.UPD_USER                                        -- ①更新ユーザ
                FROM
                    T_TRSTOCKDIFFHISTORY TT
                WHERE
                    TT.CONTROL_NO = /*pmb.controlNo*/11111111111
                AND
                    TT.DEL_FLG = '0'
            ) AS TTS
        GROUP BY
             TTS.CENTER_ID,                                            -- ①拠点ID
             TTS.CLIENT_ID,                                            -- ①荷主ID
             TTS.DIFFADD_DATE,                                         -- ①過不足登録日
             TTS.INOUT_KBN,                                            -- ①内外区分
             TTS.PRODUCT_CD,                                           -- ①銘柄CD
             TTS.DIFFOCC_AREA,                                         -- ①過不足発生場所
             TTS.SYHN_KBN                                              -- 銘柄区分
    ) AS TTRS-- ①副問合せ1
    INNER JOIN M_CENTER MC--②拠点マスタ
    ON MC.CENTER_ID = TTRS.CENTER_ID
    AND MC.DEL_FLG = '0'
    INNER JOIN M_PRODUCT MP--③銘柄マスタ
    ON MP.CLIENT_ID = TTRS.CLIENT_ID
    AND MP.DEL_FLG = '0'
    INNER JOIN B_USER BU--⑤ユーザマスタ
    ON BU.USER_CD = TTRS.UPD_USER_1
    AND BU.DEL_FLG = '0'
    INNER JOIN B_CLASS BC_0--⑥区分値マスタ
    ON BC_0.CLASS_CD = 'CGGDID'
    AND BC_0.DEL_FLG = '0'
    INNER JOIN B_CLASS_DTL BCD_0--⑦区分値明細マスタ
    ON BCD_0.CLASS_ID = BC_0.CLASS_ID
    AND BCD_0.CLASS_DTL_CD = MP.CGGDID
    AND BCD_0.DEL_FLG = '0'
    INNER JOIN B_DICT BD_0--⑧辞書マスタ
    ON BD_0.DICT_ID=BCD_0.DICT_ID
    AND BD_0.DEL_FLG = '0'
    INNER JOIN B_CLASS BC_1 --⑨区分値マスタ
    ON BC_1.CLASS_CD = 'FCFLG'
    AND BC_1.DEL_FLG = '0'
    INNER JOIN B_CLASS_DTL BCD_1--⑩区分値明細マスタ
    ON BCD_1.CLASS_ID = BC_1.CLASS_ID
    AND BCD_1.CLASS_DTL_CD = TTRS.INOUT_KBN
    AND BCD_1.DEL_FLG = '0'
    INNER JOIN B_DICT BD_1--⑪辞書マスタ
    ON BD_1.DICT_ID = BCD_1.DICT_ID
    AND BD_1.DEL_FLG = '0'
WHERE
    TTRS.DIFF_QTY_1 != 0
ORDER BY
    MP.CGGDID ASC,
    TTRS.INOUT_KBN ASC,
    MP.USERNUM3 ASC,
    TTRS.PRODUCT_CD ASC
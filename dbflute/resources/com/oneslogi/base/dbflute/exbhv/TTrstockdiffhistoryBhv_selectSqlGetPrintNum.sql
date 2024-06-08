/*
 [df:title]
 在庫過不足履歴を検索し、印刷対象件数を取得する。

 [df:description]
  SQL Description here.

*/
-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!


SELECT
    COUNT(TTS.PRODUCT_CD) AS PRINT_NUM              --  印刷対象件数
FROM
    (
        SELECT
            TT.CENTER_ID,                           --  拠点ID
            TT.CLIENT_ID,                           --  荷主ID
            TT.DIFFADD_DATE,                        --  過不足登録日
            TT.INOUT_KBN,                           --  内外区分
            TT.PRODUCT_CD,                          --  銘柄CD
            TT.DIFFOCC_AREA,                        --  過不足発生場所
            SUM(ISNULL(TT.DIFF_QTY,0)) AS  DIFFQTY  --  過不足数
        FROM
            T_TRSTOCKDIFFHISTORY TT
        WHERE
            TT.CONTROL_NO = /*pmb.controlNo*/11111111111
        AND
            TT.DEL_FLG = '0'
        GROUP BY
            TT.CENTER_ID,
            TT.CLIENT_ID,
            TT.DIFFADD_DATE,
            TT.INOUT_KBN,
            TT.PRODUCT_CD,
            TT.DIFFOCC_AREA
    ) AS TTS
WHERE
    TTS.DIFFQTY != 0
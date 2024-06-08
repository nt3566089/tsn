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
    COUNT(PRODUCT_CD) AS NUMOFPRINTS
FROM
   (
    SELECT
        TT.CENTER_ID,
        TT.CLIENT_ID,
        TT.DIFFADD_DATE,
        TT.INOUT_KBN,
        TT.PRODUCT_CD,
        TT.DIFFOCC_AREA,
        SUM(ISNULL(TT.DIFF_QTY,0)) AS DIFFQTY
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
   ) TTS
WHERE
    TTS.DIFFQTY !=0
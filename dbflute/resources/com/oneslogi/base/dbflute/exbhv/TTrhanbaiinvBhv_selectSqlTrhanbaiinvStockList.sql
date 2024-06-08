/*
 [df:title]
  販売物流在庫情報をリスト検索

 [df:description]
  販売物流在庫情報をリスト検索
*/

-- #df:entity#

-- !df:pmb!
-- !!Long centerId!!
-- !!Long clientId!!
-- !!String centerCd!!
-- !!String systemDt!!
-- !!String systemDtFrom!!
-- !!String systemDtTo!!
-- !!AutoDetect!!
SELECT
    TT.CENTER_ID,                                                           --拠点ID
    TT.CLIENT_ID,                                                           --荷主ID
    MP.PRODUCT_ID,                                                          --商品ID
    MAX(MP.USERNUM1) AS USERNUM1,                                           --国産・輸入区分
    (
        CASE
            WHEN MAX(MP.USERNUM4) != 0
                THEN 0
                ELSE 
                    SUM(
                        (ISNULL(T_CORDDTASR_0.CASE_NUM,0)
                        +ISNULL(T_CORDDTAEC_0.CASE_NUM,0)
                        -ISNULL(T_CORDDTASR_1.CASE_NUM,0)
                        -ISNULL(T_CORDDTAEC_1.CASE_NUM,0)
                        )
                        *MP.UNIT1*MP.UNIT2
                        +
                        (ISNULL(T_CORDDTASR_0.CARTON_NUM,0)
                        +ISNULL(T_CORDDTAEC_0.CARTON_NUM,0)
                        -ISNULL(T_CORDDTASR_1.CARTON_NUM,0)
                        -ISNULL(T_CORDDTAEC_1.CARTON_NUM,0)
                        )*MP.UNIT2
                        +
                        (ISNULL(T_CORDDTASR_0.ITEMS_NUM,0)
                        +ISNULL(T_CORDDTAEC_0.ITEMS_NUM,0)
                        -ISNULL(T_CORDDTASR_1.ITEMS_NUM,0)
                        -ISNULL(T_CORDDTAEC_1.ITEMS_NUM,0)
                        )
                    )
        END            
    ) AS STOCK_CONV_SU                                                  --在庫換算個数
FROM
    T_TRHANBAIINV TT --販売物流在庫情報
    INNER JOIN M_PRODUCT MP --銘柄マスタ
        ON MP.CLIENT_ID = TT.CLIENT_ID
        AND MP.PRODUCT_CD = TT.PRODUCT_CD
        AND MP.DEL_FLG = '0'
    LEFT OUTER JOIN (
       SELECT
           TCH.CENTER_ID,                                               --拠点ID
           TCH.CLIENT_ID,                                               --荷主ID
           TC.ZZMATNR,                                                  --銘柄CD
           SUM(TC.SLQACB) AS CASE_NUM,                                  --ケース数
           SUM(TC.SLQACT) AS CARTON_NUM,                                --カートン数
           SUM(TC.SLQANUM) AS ITEMS_NUM                                 --個装数
       FROM
         T_CORDDTASR TC --さしずデータ(仕分中)
         INNER JOIN T_CORDHDR TCH --さしずヘッダ
             ON TCH.ORDER_H_ID = TC.ORDER_H_ID 
             AND TCH.CENTER_ID = /*pmb.centerId*/1
             AND TCH.CLIENT_ID = /*pmb.clientId*/1
             AND TCH.DEL_FLG = '0'
         INNER JOIN M_CENTER MC --拠点マスタ
             ON MC.CENTER_CD = TC.DPCD
             AND MC.DEL_FLG = '0'
       WHERE
           TC.SRWHCD =  /*pmb.centerCd*/'00'
           AND TC.SRYMD =  /*pmb.systemDt*/'20240324'
           AND (
               TC.HDVID = 0
               OR(
                   TC.HDVID >= '2'
                   AND 
                   TC.HDVID <= '9'
               )
           )
           AND TC.BOXNO =' '
           AND TC.SROPRTCNT > 0
           AND TC.SLPTYP !='ZO71'
           AND TC.SLPTYP !='ZO72'
           AND TC.SLPTYP !='ZO73'
           AND TC.SLPTYP !='ZO74'
           AND TC.SLPTYP !='ZO75'
           AND TC.SLPTYP !='ZO76'
           AND TC.DEL_FLG = '0'
       GROUP BY
           TCH.CENTER_ID,
           TCH.CLIENT_ID,
           TC.ZZMATNR  
    ) T_CORDDTASR_0 --副問合せ4-1(仕分済品(仕分中)情報)
    ON T_CORDDTASR_0.CENTER_ID = TT.CENTER_ID
    AND T_CORDDTASR_0.CLIENT_ID = TT.CLIENT_ID
    AND T_CORDDTASR_0.ZZMATNR = TT.PRODUCT_CD
    LEFT OUTER JOIN(
            SELECT
                TCH.CENTER_ID,                                      --拠点ID
                TCH.CLIENT_ID,                                      --荷主ID
                TC.ZZMATNR,                                         --銘柄CD
                SUM(TC.SLQACB) AS CASE_NUM,                         --ケース数
                SUM(TC.SLQACT) AS CARTON_NUM,                       --カートン数
                SUM(TC.SLQANUM) AS ITEMS_NUM                        --個装数
            FROM
                T_CORDDTAEC TC --さしずデータ(取替用)
                INNER JOIN T_CORDHDR TCH  --さしずヘッダ
                    ON TCH.ORDER_H_ID = TC.ORDER_H_ID
                    AND TCH.CENTER_ID = /*pmb.centerId*/1
                    AND TCH.CLIENT_ID = /*pmb.clientId*/1
                    AND TCH.DEL_FLG = '0'
                INNER JOIN M_CENTER MC --拠点マスタ
                    ON MC.CENTER_CD = TC.DPCD
                    AND MC.DEL_FLG = '0'   
            WHERE 
                TC.SRWHCD =  /*pmb.centerCd*/'00'
                AND TC.SRYMD = /*pmb.systemDt*/'20240324'
                AND(
                    TC.HDVID = '0'
                    OR(
                        TC.HDVID >= '2'
                        AND
                        TC.HDVID <= '9'
                    )
                )
                AND TC.BOXNO =' '
                AND TC.SROPRTCNT>0
                AND TC.DEL_FLG = '0'
            GROUP BY
                TCH.CENTER_ID,
                TCH.CLIENT_ID,
                TC.ZZMATNR
    ) T_CORDDTAEC_0 --副問合せ4-2(仕分済品(取替用)情報)
    ON T_CORDDTAEC_0.CENTER_ID = TT.CENTER_ID
    AND T_CORDDTAEC_0.CLIENT_ID = TT.CLIENT_ID
    AND T_CORDDTAEC_0.ZZMATNR = TT.PRODUCT_CD
    LEFT OUTER JOIN(
            SELECT
                TCH.CENTER_ID,                          --拠点ID
                TCH.CLIENT_ID,                          --荷主ID
                TC.ZZMATNR,                             --銘柄CD
                SUM(TC.SLQACB) AS CASE_NUM,             --ケース数
                SUM(TC.SLQACT) AS CARTON_NUM,           --カートン数
                SUM(TC.SLQANUM) AS ITEMS_NUM            --個装数
            FROM
              T_CORDDTASR TC --さしずデータ(仕分中)
              INNER JOIN T_CORDHDR TCH --さしずヘッダ
                  ON TCH.ORDER_H_ID = TC.ORDER_H_ID 
                  AND TCH.CENTER_ID = /*pmb.centerId*/1
                  AND TCH.CLIENT_ID = /*pmb.clientId*/1
                  AND TCH.DEL_FLG = '0'
              INNER JOIN M_CENTER MC --拠点マスタ
                  ON MC.CENTER_CD = TC.DPCD
                  AND MC.DEL_FLG = '0'
            WHERE
                TC.SRWHCD =  /*pmb.centerCd*/'00'
                AND TC.SRYMD = /*pmb.systemDt*/'20240324'
                AND(
                    TC.HDVID = '0'
                    OR(
                        TC.HDVID >= '2'
                        AND
                        TC.HDVID <= '9'
                    )
                )
                AND TC.BOXNO =' '
                AND TC.SROPRTCNT > 0
                AND TC.DLVYMD <= TC.SRYMD
                AND TC.SLPTYP !='ZO71'
                AND TC.SLPTYP !='ZO72'
                AND TC.SLPTYP !='ZO73'
                AND TC.SLPTYP !='ZO74'
                AND TC.SLPTYP !='ZO75'
                AND TC.SLPTYP !='ZO76'
                AND TC.DEL_FLG = '0'
            GROUP BY 
                TCH.CENTER_ID,
                TCH.CLIENT_ID,
                TC.ZZMATNR
    ) T_CORDDTASR_1 --副問合せ4-3(当日販売数(仕分中)情報)
    ON T_CORDDTASR_1.CENTER_ID = TT.CENTER_ID
    AND T_CORDDTASR_1.CLIENT_ID = TT.CLIENT_ID
    AND T_CORDDTASR_1.ZZMATNR = TT.PRODUCT_CD
    LEFT OUTER JOIN(
             SELECT
                   TCH.CENTER_ID,                               --拠点ID
                   TCH.CLIENT_ID,                               --荷主ID
                   TC.ZZMATNR,                                  --銘柄CD
                   SUM(TC.SLQACB) AS CASE_NUM,                  --ケース数
                   SUM(TC.SLQACT) AS CARTON_NUM,                --カートン数
                   SUM(TC.SLQANUM) AS ITEMS_NUM                 --個装数
             FROM
                 T_CORDDTAEC TC --さしずデータ(取替用)
                 INNER JOIN T_CORDHDR TCH --さしずヘッダ
                 ON TCH.ORDER_H_ID = TC.ORDER_H_ID
                 AND TCH.CENTER_ID = /*pmb.centerId*/1
                 AND TCH.CLIENT_ID = /*pmb.clientId*/1
                 AND TCH.DEL_FLG = '0'
                 INNER JOIN M_CENTER MC --拠点マスタ
                 ON MC.CENTER_CD = TC.DPCD
                 AND MC.DEL_FLG = '0'
               WHERE
                  TC.SRWHCD =  /*pmb.centerCd*/'00'
                  AND TC.SRYMD =   /*pmb.systemDt*/'20240324'
                  AND(
                       TC.HDVID = 0
                       OR(
                           TC.HDVID >= '2'
                           AND
                           TC.HDVID <= '9'
                       )
                   )         
                   AND TC.BOXNO =' '
                   AND TC.SROPRTCNT > 0
                   AND TC.DLVYMD <= TC.SRYMD
                   AND TC.DEL_FLG = '0'
               GROUP BY
                   TCH.CENTER_ID,
                   TCH.CLIENT_ID,
                   TC.ZZMATNR 
    )  T_CORDDTAEC_1 --副問合せ4-4(当日販売数(取替用)情報)
    ON T_CORDDTAEC_1.CENTER_ID = TT.CENTER_ID
    AND T_CORDDTAEC_1.CLIENT_ID = TT.CLIENT_ID
    AND T_CORDDTAEC_1.ZZMATNR = TT.PRODUCT_CD
WHERE 
    TT.CENTER_ID = /*pmb.centerId*/1
    AND TT.CLIENT_ID = /*pmb.clientId*/1
    AND TT.STOCKDATETIME >= /*pmb.systemDtFrom*/'20240417 00:00:00'
    AND TT.STOCKDATETIME <= /*pmb.systemDtTo*/'20240417 23:59:59'
    AND TT.GOODITEMKBN = '0'
    AND TT.DEL_FLG = '0'
GROUP BY 
    TT.CENTER_ID,
    TT.CLIENT_ID,
    MP.PRODUCT_ID
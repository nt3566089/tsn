/*
 [df:title]
  棚卸情報をリスト検索

 [df:description]
   棚卸情報をリスト検索
*/

-- #df:entity#

-- !df:pmb!
-- !!Long clientId!!
-- !!Long centerId!!
-- !!String centerCd!!
-- !!String systemDt!!
-- !!String systemDtFrom!!
-- !!String systemDtTo!!
-- !!AutoDetect!!
SELECT 
    SUB1.CENTER_ID,                                 --拠点ID
    SUB1.CLIENT_ID,                                 --荷主ID
    MP.USERNUM1,                                    --国産・輸入区分
    SUB1.INVENTORY_INST_KBN,                        --在庫調査区分
    SUB1.PRODUCT_ID,                                --商品ID
    SUB1.INV_EXPECT_NUM,                            --棚卸予定数
    SUB1.INVENTORY_NUM,                             --棚卸実績数
    SUB2.STORING_SYSTEM_STOCK_NUM,                  --保管場システム在庫数
    SUB3.SORT_SYSTEM_STOCK_NUM,                     --仕分場システム在庫数
    SUB4.SORTED_SYSTEM_INVENTORY,                   --仕分済システム在庫数
    SUB5.REMOTE_ISLAND_SYSTEM_INVENTORY,            --離島システム在庫数
    SUB6.GOOD_ITEM_SYSTEM_STOCK_NUM                 --適品在庫計システム在庫
FROM
(
    SELECT 
        TIH.CENTER_ID,                              --拠点ID
        TIH.CLIENT_ID,                              --荷主ID
        TIB.PRODUCT_ID,                             --商品ID
        TII.INVENTORY_INST_KBN,                     --在庫調査区分
        SUM(
            TIB.CHARGE_NUM+TIB.ALLOC_NUM+TIB.MOVE_NUM
        ) AS INV_EXPECT_NUM,                        --棚卸予定数
        SUM(
            TIB.INVENTORY_NUM
        ) AS INVENTORY_NUM                          --棚卸実績数
    FROM 
       	T_INVENTORY_INST TII --棚卸指示
    	INNER JOIN T_INVENTORY_H TIH --棚卸ヘッダ
            ON TIH.INVENTORY_H_ID = TII.INVENTORY_H_ID 
        	AND TIH.CLIENT_ID = /*pmb.clientId*/1
        	AND TIH.CENTER_ID = /*pmb.centerId*/1
        	AND TIH.INVENTORY_DT = /*pmb.systemDt*/'20240324'
        	AND TIH.DEL_FLG = '0'
    	INNER JOIN T_INVENTORY_B TIB --棚卸ボディ
            ON TIB.INVENTORY_H_ID = TIH.INVENTORY_H_ID 
    	    AND TIB.DEL_FLG = '0' 
    WHERE 
        TII.INVENTORY_INST_KBN ='00'
        AND TII.DEL_FLG = '0'
    GROUP BY 
        TIH.CENTER_ID,
        TIH.CLIENT_ID,
        TIB.PRODUCT_ID,
        TII.INVENTORY_INST_KBN   

    UNION ALL   

    SELECT 
        TIH.CENTER_ID,                                      --拠点ID
        TIH.CLIENT_ID,                                      --荷主ID
        TIB.PRODUCT_ID,                                     --商品ID
        TII.INVENTORY_INST_KBN,                             --在庫調査区分
        SUM(
            TIB.CHARGE_NUM+TIB.ALLOC_NUM+TIB.MOVE_NUM
        ) AS INV_EXPECT_NUM,                                --棚卸予定数
        SUM(
            TIB.INVENTORY_NUM
        ) AS INVENTORY_NUM                                  --棚卸実績数
    FROM 
       	T_INVENTORY_INST TII --棚卸指示
    	INNER JOIN T_INVENTORY_H TIH  --棚卸ヘッダ
            ON TIH.INVENTORY_H_ID = TII.INVENTORY_H_ID 
        	AND TIH.CLIENT_ID = /*pmb.clientId*/1
        	AND TIH.CENTER_ID = /*pmb.centerId*/1
        	AND TIH.INVENTORY_DT = /*pmb.systemDt*/'20240324'
        	AND TIH.DEL_FLG = '0'
    	INNER JOIN T_INVENTORY_B TIB --棚卸ボディ
            ON TIB.INVENTORY_H_ID = TIH.INVENTORY_H_ID 
        	AND TIB.DEL_FLG = '0' 
    WHERE 
        TII.INVENTORY_INST_KBN ='03'
        AND TII.DEL_FLG = '0'
    GROUP BY 
        TIH.CENTER_ID,
        TIH.CLIENT_ID,
        TIB.PRODUCT_ID,
        TII.INVENTORY_INST_KBN   

    UNION ALL

    SELECT 
        TIH.CENTER_ID,                                          --拠点ID
        TIH.CLIENT_ID,                                          --荷主ID
        TIB.PRODUCT_ID,                                         --商品ID
        TII.INVENTORY_INST_KBN,                                 --在庫調査区分
        SUM(
            TIB.CHARGE_NUM+TIB.ALLOC_NUM+TIB.MOVE_NUM
        ) AS INV_EXPECT_NUM,                                    --棚卸予定数
        SUM(
            TIB.INVENTORY_NUM
        ) AS INVENTORY_NUM                                      --棚卸実績数
    FROM 
       	T_INVENTORY_INST TII --棚卸指示
    	INNER JOIN T_INVENTORY_H TIH --棚卸ヘッダ
            ON TIH.INVENTORY_H_ID = TII.INVENTORY_H_ID 
        	AND TIH.CLIENT_ID = /*pmb.clientId*/1
        	AND TIH.CENTER_ID = /*pmb.centerId*/1
        	AND TIH.INVENTORY_DT = /*pmb.systemDt*/'20240324'
        	AND TIH.DEL_FLG = '0'
    	INNER JOIN T_INVENTORY_B TIB --棚卸ボディ
            ON TIB.INVENTORY_H_ID = TIH.INVENTORY_H_ID 
        	AND TIB.DEL_FLG = '0' 
    WHERE 
        TII.INVENTORY_INST_KBN ='04'
        AND TII.DEL_FLG = '0'
    GROUP BY 
        TIH.CENTER_ID,
        TIH.CLIENT_ID,
        TIB.PRODUCT_ID,
        TII.INVENTORY_INST_KBN  

    UNION ALL
     
    SELECT 
        TIH.CENTER_ID,                                      --拠点ID
        TIH.CLIENT_ID,                                      --荷主ID
        TIB.PRODUCT_ID,                                     --商品ID
        TII.INVENTORY_INST_KBN,                             --在庫調査区分
        SUM(
            TIB.CHARGE_NUM+TIB.ALLOC_NUM+TIB.MOVE_NUM
        ) AS INV_EXPECT_NUM,                                --棚卸予定数
        SUM(
            TIB.INVENTORY_NUM
        ) AS INVENTORY_NUM                                  --棚卸実績数
    FROM 
       	T_INVENTORY_INST TII --棚卸指示
    	INNER JOIN T_INVENTORY_H TIH --棚卸ヘッダ
            ON TIH.INVENTORY_H_ID = TII.INVENTORY_H_ID 
        	AND TIH.CLIENT_ID = /*pmb.clientId*/1
        	AND TIH.CENTER_ID = /*pmb.centerId*/1
        	AND TIH.INVENTORY_DT = /*pmb.systemDt*/'20240324'
        	AND TIH.DEL_FLG = '0'
    	INNER JOIN T_INVENTORY_B TIB --棚卸ボディ
            ON TIB.INVENTORY_H_ID = TIH.INVENTORY_H_ID 
        	AND TIB.DEL_FLG = '0' 
    WHERE 
        TII.INVENTORY_INST_KBN ='05'
        AND TII.DEL_FLG = '0'
    GROUP BY 
        TIH.CENTER_ID,
        TIH.CLIENT_ID,
        TIB.PRODUCT_ID,
        TII.INVENTORY_INST_KBN
) SUB1  --副問合せ1
LEFT OUTER JOIN
(
    SELECT 
        ML.CENTER_ID,                                               --拠点ID
        TS.CLIENT_ID,                                               --荷主ID
        TS.PRODUCT_ID,                                              --商品ID
        SUM(TS.CHARGE_NUM) AS STORING_SYSTEM_STOCK_NUM              --保管場システム在庫数
    FROM
        T_STOCK TS  --在庫
        INNER JOIN M_LOCATION ML --ロケーションマスタ
            ON ML.LOCATION_ID = TS.LOCATION_ID
            AND ML.LocGroup = '02'
            AND ML.CENTER_ID = /*pmb.centerId*/1
        AND NOT EXISTS(
            SELECT
                 1
            FROM
                B_CLASS BC --区分値マスタ
                INNER JOIN B_CLASS_DTL BCD  --区分値明細マスタ
                    ON BCD.CLASS_ID = BC.CLASS_ID
                INNER JOIN B_CLASS_DTL_SUB BCDS --区分値明細マスタサブ
                    ON BCDS.CLASS_DTL_ID = BCD.CLASS_DTL_ID 
            WHERE
                ML.LOCATION_CD = BCDS.OTHERCD1 
                AND BC.CLASS_CD= 'FZLOCCD' 
                AND BCD.CLASS_DTL_CD= '1' 
                AND BC.DEL_FLG= '0' 
                AND BCD.DEL_FLG= '0' 
                AND BCDS.DEL_FLG = '0'  
        ) 
        AND ML.DEL_FLG = '0'
        AND TS.CLIENT_ID = /*pmb.clientId*/1
        AND TS.DEL_FLG ='0'
    GROUP BY
        ML.CENTER_ID,
        TS.CLIENT_ID,
        TS.PRODUCT_ID
) SUB2 --副問合せ2
ON SUB2.CENTER_ID = SUB1.CENTER_ID
AND SUB2.CLIENT_ID = SUB1.CLIENT_ID
AND SUB2.PRODUCT_ID = SUB1.PRODUCT_ID
LEFT OUTER JOIN
(
    SELECT 
        ML.CENTER_ID,                                           --拠点ID
        TS.CLIENT_ID,                                           --荷主ID
        TS.PRODUCT_ID,                                          --商品ID
    	SUM(TS.CHARGE_NUM) AS SORT_SYSTEM_STOCK_NUM             --仕分場システム在庫数
    FROM
        T_STOCK TS --在庫
        INNER JOIN M_LOCATION ML --ロケーションマスタ
            ON ML.LOCATION_ID = TS.LOCATION_ID
            AND ML.CENTER_ID = /*pmb.centerId*/1
            AND ML.LocGroup = '06'
            AND ML.LOCID IN ('0','1') 
            AND ML.DEL_FLG = '0'
    WHERE 
        TS.CLIENT_ID = /*pmb.clientId*/1
        AND TS.DEL_FLG = '0'
    GROUP BY
        ML.CENTER_ID,
        TS.CLIENT_ID,
        TS.PRODUCT_ID 
) SUB3 --副問合せ3
ON SUB3.CENTER_ID = SUB1.CENTER_ID
AND SUB3.CLIENT_ID = SUB1.CLIENT_ID
AND SUB3.PRODUCT_ID = SUB1.PRODUCT_ID
LEFT OUTER JOIN
(
    SELECT
        TT.CENTER_ID,                                               --拠点ID
        TT.CLIENT_ID,                                               --荷主ID
        MP.PRODUCT_ID,                                              --商品ID
        (CASE
            WHEN MAX(MP.USERNUM4) !=0 
                THEN 0
            ELSE
                SUM(
                    (
                        ISNULL(T_CORDDTASR_0.CASE_NUM,0)
                        +ISNULL(T_CORDDTAEC_0.CASE_NUM,0)
                        -ISNULL(T_CORDDTASR_1.CASE_NUM,0)
                        -ISNULL(T_CORDDTAEC_1.CASE_NUM,0)
                    )
                    *MP.UNIT1*MP.UNIT2
                    +(
                        ISNULL(T_CORDDTASR_0.CARTON_NUM,0)
                        +ISNULL(T_CORDDTAEC_0.CARTON_NUM,0)
                        -ISNULL(T_CORDDTASR_1.CARTON_NUM,0)
                        -ISNULL(T_CORDDTAEC_1.CARTON_NUM,0)
                    )
                    *MP.UNIT2
                    +(
                        ISNULL(T_CORDDTASR_0.ITEMS_NUM,0)
                        +ISNULL(T_CORDDTAEC_0.ITEMS_NUM,0)
                        -ISNULL(T_CORDDTASR_1.ITEMS_NUM,0)
                        -ISNULL(T_CORDDTAEC_1.ITEMS_NUM,0)
                    )
                )
          END        
         ) AS SORTED_SYSTEM_INVENTORY                                --仕分済システム在庫数
    FROM
         T_TRHANBAIINV TT --販売物流在庫情報
         INNER JOIN M_PRODUCT MP --銘柄マスタ
             ON MP.CLIENT_ID = TT.CLIENT_ID
             AND MP.PRODUCT_CD = TT.PRODUCT_CD
             AND MP.DEL_FLG = '0'
         LEFT OUTER JOIN (
            SELECT
                TCH.CENTER_ID,                                      --拠点ID
                TCH.CLIENT_ID,                                      --荷主ID
                TC.ZZMATNR,                                         --銘柄CD
                SUM(TC.SLQACB) AS CASE_NUM,                         --ケース数
                SUM(TC.SLQACT) AS CARTON_NUM,                       --カートン数
                SUM(TC.SLQANUM) AS ITEMS_NUM                        --個装数
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
                T_CORDDTAEC TC  --さしずデータ(取替用)
                INNER JOIN T_CORDHDR TCH --さしずヘッダ
                    ON TCH.ORDER_H_ID = TC.ORDER_H_ID
                    AND TCH.CENTER_ID = /*pmb.centerId*/1
                    AND TCH.CLIENT_ID = /*pmb.clientId*/1
                    AND TCH.DEL_FLG = '0'
                INNER JOIN M_CENTER MC  --拠点マスタ
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
                TCH.CENTER_ID,                                      --拠点ID
                TCH.CLIENT_ID,                                      --荷主ID
                TC.ZZMATNR,                                         --銘柄CD
                SUM(TC.SLQACB) AS CASE_NUM,                         --ケース数
                SUM(TC.SLQACT) AS CARTON_NUM,                       --カートン数
                SUM(TC.SLQANUM) AS ITEMS_NUM                        --個装数
            FROM
              T_CORDDTASR TC --さしずデータ(仕分中)
              INNER JOIN T_CORDHDR TCH  --さしずヘッダ
                  ON TCH.ORDER_H_ID = TC.ORDER_H_ID
                  AND TCH.CENTER_ID = /*pmb.centerId*/1
                  AND TCH.CLIENT_ID = /*pmb.clientId*/1
                  AND TCH.DEL_FLG = '0'
              INNER JOIN M_CENTER MC    --拠点マスタ
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
                   TCH.CENTER_ID,                                       --拠点ID
                   TCH.CLIENT_ID,                                       --荷主ID
                   TC.ZZMATNR,                                          --銘柄CD
                   SUM(TC.SLQACB) AS CASE_NUM,                          --ケース数
                   SUM(TC.SLQACT) AS CARTON_NUM,                        --カートン数
                   SUM(TC.SLQANUM) AS ITEMS_NUM                         --個装数
             FROM
                 T_CORDDTAEC TC --さしずデータ(取替用)
                 INNER JOIN T_CORDHDR TCH   --さしずヘッダ
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
        TT.CENTER_ID =  /*pmb.centerId*/1
        AND TT.CLIENT_ID =  /*pmb.clientId*/1
        AND TT.STOCKDATETIME >= /*pmb.systemDtFrom*/'20240324 00:00:00'
        AND TT.STOCKDATETIME <= /*pmb.systemDtTo*/'20240324 00:00:00'
        AND TT.GOODITEMKBN = '0'
        AND TT.DEL_FLG = '0'
    GROUP BY
        TT.CENTER_ID,
        TT.CLIENT_ID,
        MP.PRODUCT_ID
) SUB4 --副問合せ4
ON SUB4.CENTER_ID = SUB1.CENTER_ID
AND SUB4.CLIENT_ID = SUB1.CLIENT_ID
AND SUB4.PRODUCT_ID = SUB1.PRODUCT_ID
LEFT OUTER JOIN
(
    SELECT 
        TT.CENTER_ID,                                           --拠点ID
        TT.CLIENT_ID,                                           --荷主ID                                          
        MP.PRODUCT_ID,                                          --商品ID
        SUM(
            (T_CORDDTASR_0.CASE_NUM*MP.UNIT1*MP.UNIT2)
            +(T_CORDDTASR_0.CARTON_NUM*MP.UNIT2)
        ) AS REMOTE_ISLAND_SYSTEM_INVENTORY                     --離島システム在庫数
    FROM
        T_TRHANBAIINV TT --販売物流在庫情報
        INNER JOIN M_PRODUCT MP --銘柄マスタ
            ON MP.CLIENT_ID = TT.CLIENT_ID
            AND MP.PRODUCT_CD = TT.PRODUCT_CD
            AND MP.DEL_FLG = '0'
        INNER JOIN(
            SELECT 
                TCH.CENTER_ID,                                  --拠点ID
                TCH.CLIENT_ID,                                  --荷主ID
                TC.ZZMATNR,                                     --銘柄CD
                ISNULL(TC.SLQACB,0) AS CASE_NUM,                --ケース数
                ISNULL(TC.SLQACT,0) AS CARTON_NUM               --カートン数
            FROM
                T_CORDDTASR TC --さしずデータ(仕分中)
                INNER JOIN T_CORDHDR TCH --さしずヘッダ
                ON TCH.ORDER_H_ID = TC.ORDER_H_ID
                AND TCH.CENTER_ID = /*pmb.centerId*/1
                AND TCH.CLIENT_ID = /*pmb.clientId*/1
                AND TCH.DEL_FLG = '0'
                INNER JOIN M_PRODUCT MP --銘柄マスタ
                ON MP.CLIENT_ID = TCH.CLIENT_ID
                AND MP.PRODUCT_CD = TC.ZZMATNR
                AND MP.USERDATE1 <= TC.DLVYMD
                AND MP.USERDATE2 >= TC.DLVYMD
                AND (
                    MP.USERDATE3 IS NULL
                    OR
                    MP.USERDATE3 > TC.DLVYMD
                )
                AND MP.DEL_FLG = '0'
                INNER JOIN M_CDRCATT MC --方面属性マスタ
                ON MC.CENTER_ID = TCH.CENTER_ID
                AND MC.CLIENT_ID = TCH.CLIENT_ID
                AND MC.DRCCD = TC.DED
                AND MC.ZZPSTNID = TC.PSTNID
                AND MC.REMOTEISLAND = '1'
                AND MC.DEL_FLG = '0'
            WHERE
                TC.SRWHCD = /*pmb.centerCd*/'00'
                AND TC.SRYMD = /*pmb.systemDt*/'20240324'
                AND TC.ORDDVFG = '1'
                AND TC.SRLINCD != 'X1'
                AND TC.SRLINCD != 'X2'
                AND TC.DEL_FLG = '0'
        ) T_CORDDTASR_0 --副問合せ5-1(さしず(離島)情報)
        ON T_CORDDTASR_0.CENTER_ID = TT.CENTER_ID
        AND T_CORDDTASR_0.CLIENT_ID = TT.CLIENT_ID
        AND T_CORDDTASR_0.ZZMATNR = TT.PRODUCT_CD
    WHERE 
        TT.CENTER_ID = /*pmb.centerId*/1
        AND TT.CLIENT_ID = /*pmb.clientId*/1
        AND TT.STOCKDATETIME >= /*pmb.systemDtFrom*/'20240324 00:00:00'
        AND TT.STOCKDATETIME <= /*pmb.systemDtTo*/'20240324 23:59:59'
        AND TT.GOODITEMKBN = '0'
        AND TT.DEL_FLG = '0'
    GROUP BY
        TT.CENTER_ID,
        TT.CLIENT_ID,
        MP.PRODUCT_ID
) SUB5 --副問合せ5
ON SUB5.CENTER_ID = SUB1.CENTER_ID
AND SUB5.CLIENT_ID = SUB1.CLIENT_ID
AND SUB5.PRODUCT_ID = SUB1.PRODUCT_ID
LEFT OUTER JOIN
(
    SELECT
        TT.CENTER_ID,                                           --拠点ID
        TT.CLIENT_ID,                                           --荷主ID
        MP.PRODUCT_ID,                                          --商品ID
        SUM(TT.STOCKQTY) AS GOOD_ITEM_SYSTEM_STOCK_NUM          --適品在庫計システム在庫
    FROM
        T_TRHANBAIINV TT    --販売物流在庫情報
        INNER JOIN M_PRODUCT MP --銘柄マスタ
            ON MP.CLIENT_ID = TT.CLIENT_ID
            AND MP.PRODUCT_CD = TT.PRODUCT_CD
            AND MP.DEL_FLG = '0'
    WHERE 
        TT.CENTER_ID = /*pmb.centerId*/1
        AND TT.CLIENT_ID = /*pmb.clientId*/1
        AND TT.STOCKDATETIME >= /*pmb.systemDtFrom*/'20240324 00:00:00'
        AND TT.STOCKDATETIME <= /*pmb.systemDtTo*/'20240324 23:59:59'
        AND TT.GOODITEMKBN ='0'
        AND TT.DEL_FLG = '0'
    GROUP BY
        TT.CENTER_ID,
        TT.CLIENT_ID,
        MP.PRODUCT_ID
) SUB6 --副問合せ6
ON SUB6.CENTER_ID = SUB1.CENTER_ID
AND SUB6.CLIENT_ID = SUB1.CLIENT_ID
AND SUB6.PRODUCT_ID = SUB1.PRODUCT_ID
INNER JOIN M_PRODUCT MP --銘柄マスタ
ON MP.PRODUCT_ID = SUB1.PRODUCT_ID
AND MP.DEL_FLG = '0'
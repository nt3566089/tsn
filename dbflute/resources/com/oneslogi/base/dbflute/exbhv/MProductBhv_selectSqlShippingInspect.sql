/*
 [df:title]
  SQL title here.

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##BigDecimal SUM_GROSS_WEIGHT##
-- ##BigDecimal SUM_NET_WEIGHT##
-- ##Long UNIT_NUM##
-- ##Long ALLOC_INST_H_ID##
-- [Ver3.0] unit of measure対応 2017.11.20 ライ START --
-- *M_PRODUCT.PRODUCT_ID*
-- [Ver3.0] unit of measure対応 2017.11.20 ライ END --
-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
-- [1.1.4-CT-049] 検品指示数が正しく計算されない問題を修正 2016.06.02 kawana Start
SELECT TAIH.CLIENT_ID
      ,TAIH.CENTER_ID
      ,TPIH.ADD_DT
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      ,MAX(TAIH.SUPPLY_CUSTOMER_CD) AS SUPPLY_CUSTOMER_CD
      -- 個人情報暗号化対応 2016.09.01 kawana Start
      --,MAX(f_decrypt(TAIH.SUPPLY_CUSTOMER_NM)) AS SUPPLY_CUSTOMER_NM
      ,MAX(TAIH.SUPPLY_CUSTOMER_NM) AS SUPPLY_CUSTOMER_NM
      -- 個人情報暗号化対応 2016.09.01 kawana End
      ,MAX(MDC.DELIVERY_COURSE_CD) AS DELIVERY_COURSE_CD
      ,MAX(MDC.DELIVERY_COURSE_NM) AS DELIVERY_COURSE_NM
      ,MAX(MC.CARRIER_CD) AS CARRIER_CD
      -- [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana Start
      ,MAX(MC.CARRIER_NM) AS CARRIER_NM
      -- [#5117][v3.1] 運送業者名称を運送業者CDの下に表示 2018.10.12 kawana End
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
      ,SUM(TPAB.PACKING_NUM) AS SUM_INST_NUM
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      ,MAX(MP.JAN_CD) AS JAN_CD
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
      ,MP.PRODUCT_ID
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      ,MAX(MP.PRODUCT_CD) AS PRODUCT_CD
      ,MAX(MP.PRODUCT_NM) AS PRODUCT_NM
      ,MAX(MP.PRODUCT_ABBR) AS PRODUCT_ABBR
-- [Ver3.0] unit of measure対応 2017.11.20 ライ START --
      ,MAX(MPS.UNIT_NUM)  AS UNIT_NUM
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
      -- [横並076] 出荷検品中断tテーブル 商品重量(g)、総重量(g)の型を変更  数値(小数含む) ⇒ 数値(整数のみ) 2014.12.03 kawana Start
      -- [検査-119] 重量がネット重量で表示されるのをグロス重量で表示するように修正 2014.11.26 horita Start
      -- [検査-119] 対応不十分 再修正 2014.12.10 KI Start
      ,COALESCE(MAX(MPS.GROSS_WEIGHT),0) SUM_NET_WEIGHT
      -- [検査-119] 対応不十分 再修正 2014.12.10 KI End
      -- [検査-111] 引当済数*単重量の値を設定を修正 2014.12.01 SJA-ZHENG Start
      ,COALESCE(SUM(MPS.GROSS_WEIGHT * TPAB.PACKING_NUM),0) SUM_GROSS_WEIGHT
      -- [検査-111] 引当済数*単重量の値を設定を修正 2014.12.01 SJA-ZHENG End
      -- [検査-119] 重量がネット重量で表示されるのをグロス重量で表示するように修正 2014.11.26 horita End
      -- [横並076] 出荷検品中断tテーブル 商品重量(g)、総重量(g)の型を変更  数値(小数含む) ⇒ 数値(整数のみ) 2014.12.03 kawana End
-- [Ver3.0] unit of measure対応 2017.11.20 ライ END --
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      ,MAX(TAIH.ALLOC_INST_H_ID) AS ALLOC_INST_H_ID
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
-- ELSE SELECT COUNT(*)
/*END*/
  FROM T_PACKING_B  TPAB
    JOIN T_PACKING_H  TPAH
      ON TPAB.PACKING_H_ID = TPAH.PACKING_H_ID
        AND TPAH.DEL_FLG = '0'
    JOIN T_PICKING_B  TPIB
      ON TPAB.PICKING_B_ID = TPIB.PICKING_B_ID
        AND TPIB.DEL_FLG = '0'
    JOIN T_STOCK  TS
      ON TPIB.STOCK_ID = TS.STOCK_ID
        AND TS.DEL_FLG = '0'
    JOIN T_PICKING_H  TPIH
      ON TPIB.PICKING_H_ID = TPIH.PICKING_H_ID
        AND TPIH.DEL_FLG = '0'
    JOIN T_ALLOC_INST_B  TAIB
      ON TPIB.ALLOC_INST_B_ID = TAIB.ALLOC_INST_B_ID
        AND TAIB.DEL_FLG = '0'
    JOIN T_ALLOC_INST_H  TAIH
      ON TAIB.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
        AND TAIH.DEL_FLG = '0'
    LEFT OUTER JOIN M_DELIVERY_COURSE MDC
      ON MDC.DELIVERY_COURSE_ID = TAIH.DELIVERY_COURSE_ID
    LEFT JOIN M_CARRIER MC
      ON MC.CARRIER_ID = MDC.CARRIER_ID
    LEFT JOIN M_PRODUCT MP
      ON MP.PRODUCT_ID = TS.PRODUCT_ID
-- [Ver3.0] unit of measure対応 2017.11.20 ライ START --
    LEFT JOIN M_PRODUCT_SHAPE MPS
      ON MPS.PRODUCT_ID = MP.PRODUCT_ID
-- [C-CWMS-0051] 梱包計算対応で1センターに対して商品荷姿マスタテーブルにデータ複数ある為実際に使用しているデータを取得 2015.12.17 NayZaw Start
        AND MPS.SHAPE_GRP_DTL_ID IN (SELECT MSHDTL.SHAPE_GRP_DTL_ID
                              FROM M_SHAPE_GRP_DTL MSHDTL
                              WHERE MSHDTL.SHAPE_SORT = 1
                              AND MSHDTL.SHAPE_GRP_ID = MP.SHAPE_GRP_ID)
-- [C-CWMS-0051] 梱包計算対応で1センターに対して商品荷姿マスタテーブルにデータ複数ある為実際に使用しているデータを取得 2015.12.17 NayZaw End
-- [Ver3.0] unit of measure対応 2017.11.20 ライ END --
 WHERE TPAB.DEL_FLG = '0'
   AND TPAB.PACKING_NUM > 0
   /*IF pmb.centerId != null*/
   AND TPIH.CENTER_ID = /*pmb.centerId*/11111111111
   /*END*/
   /*IF pmb.clientId != null*/
   AND TPIH.CLIENT_ID = /*pmb.clientId*/11111111111
   /*END*/
   /*IF pmb.pickingWorkNo != null*/
   AND TPIH.PICKING_WORK_NO = /*pmb.pickingWorkNo*/'TEST'
   /*END*/
   /*IF pmb.packingNo != null*/
   AND TPAH.SHIPPING_PACKING_NO = /*pmb.packingNo*/'TEST'
   /*END*/
   AND TPAH.MIXED_FLG = '1'
 GROUP BY TAIH.CLIENT_ID
         ,TAIH.CENTER_ID
         ,TPIH.ADD_DT
         ,TAIH.SUPPLY_CUSTOMER_ID
         ,TAIH.DELIVERY_COURSE_ID
         ,MDC.CARRIER_ID
-- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
         ,MP.PRODUCT_ID
-- [1.1.4-CT-049] 検品指示数が正しく計算されない問題を修正 2016.06.02 kawana End
/*IF pmb.isPaging()*/
 ORDER BY PRODUCT_CD
-- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
/*END*/
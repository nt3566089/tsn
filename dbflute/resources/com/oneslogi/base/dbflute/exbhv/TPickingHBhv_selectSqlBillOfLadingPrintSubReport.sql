/*
 [df:title]
  Bill of Ladingを取得します。

 [df:description]
  SQL Description here.
*/

-- #df:entity#
-- ##Long INST_NUM2##

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
SELECT
  COUNT(H.PICKING_H_ID) AS INST_NUM2
  , MB.BOX_CD AS TYPE
  , SUM(H.GROSS_WEIGHT) AS WEIGHT
  , B.PRODUCT_ABBR AS PRODUCT_ABBR
  , B.NMFC_CODE AS NMFC_CODE
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
  , MAX(DICT.DICT_NM) AS FREIGHT_CLS
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
FROM
  T_PACKING_H H                                   -- 梱包ヘッダ
  INNER JOIN (
    SELECT
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      MAX(B.PACKING_B_ID) AS PACKING_B_ID
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
      , B.PACKING_H_ID
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      , MAX(MP.PRODUCT_ABBR) AS PRODUCT_ABBR
      , MAX(MP.NMFC_CODE) AS NMFC_CODE
      , MAX(MP.FREIGHT_CLS) AS FREIGHT_CLS
      -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
    FROM
      T_PACKING_B B                               -- 梱包ボディ
      INNER JOIN T_ALLOC_INST_B AB
        ON B.ALLOC_INST_B_ID = AB.ALLOC_INST_B_ID
        AND AB.DEL_FLG = '0'
      LEFT JOIN M_PRODUCT MP
        ON AB.PRODUCT_ID = MP.PRODUCT_ID
        AND MP.DEL_FLG = '0'
    WHERE
      B.DEL_FLG = '0'
    GROUP BY
      B.PACKING_H_ID
  ) B                                             -- 梱包ボディ
    ON H.PACKING_H_ID = B.PACKING_H_ID
  INNER JOIN T_PICKING_H TPH                      -- 出庫ヘッダ
    ON TPH.PICKING_H_ID = H.PICKING_H_ID
    AND TPH.DEL_FLG = '0'
    AND TPH.PICKING_STATUS = '50'
  INNER JOIN T_PICKING_R TPR                      -- 出庫帳票
    ON TPH.PICKING_H_ID = TPR.PICKING_H_ID
    AND TPR.DEL_FLG = '0'
  LEFT JOIN M_BOX MB                              -- 荷材マスタ
    ON H.BOX_ID = MB.BOX_ID
    AND MB.DEL_FLG = '0'
  LEFT JOIN b_class BCS
    ON BCS.CLASS_CD='FREIGHT_CLS'
	AND BCS.DEL_FLG = '0'
  LEFT JOIN b_class_dtl BCD
    ON BCD.CLASS_ID = BCS.CLASS_ID
	AND BCD.CLASS_DTL_CD = B.FREIGHT_CLS
	AND BCD.DEL_FLG = '0'
  LEFT JOIN b_dict DICT
    ON DICT.DICT_ID = BCD.DICT_ID
	AND DICT.DEL_FLG = '0'
WHERE
  H.DEL_FLG = '0' /*IF pmb.controlNo != null*/
  AND TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
  /*END*/
  /*IF pmb.bolNo != null*/
  AND TPH.BOL_NO = /*pmb.bolNo*/'1111111111'
  /*END*/
GROUP BY
  TPH.BOL_NO
  , MB.BOX_CD
  , B.PRODUCT_ABBR
  , B.NMFC_CODE
  , B.FREIGHT_CLS
/*END*/
/*IF pmb.isPaging()*/
ORDER BY
  TPH.BOL_NO ASC
  , TYPE ASC
  , PRODUCT_ABBR ASC
  , NMFC_CODE ASC
  , FREIGHT_CLS ASC
/*END*/

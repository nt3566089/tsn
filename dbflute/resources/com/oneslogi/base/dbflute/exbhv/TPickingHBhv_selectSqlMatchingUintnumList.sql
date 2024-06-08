/*
 [df:title]
  マッチング変換のデータを取得します。

 [df:description]
  SQL Description here.
*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
SELECT MM.MATCHING_KEYWORD AS MATCHING_KEYWORD
      ,MPS.UNIT_NUM AS UNIT_NUM
      ,MPS.GROSS_WEIGHT AS GROSS_WEIGHT
      ,MSGD.SHAPE_SORT
     FROM
       M_PRODUCT MP-- 商品マスタ
     LEFT JOIN M_PRODUCT_SHAPE MPS-- 商品荷姿マスタ
         ON MP.PRODUCT_ID = MPS.PRODUCT_ID
         AND MPS.DEL_FLG = '0'
     LEFT JOIN M_SHAPE_GRP_DTL MSGD-- 荷姿グループ明細マスタ
         ON MPS.SHAPE_GRP_DTL_ID = MSGD.SHAPE_GRP_DTL_ID
         AND MSGD.DEL_FLG = '0'
     LEFT JOIN M_SHAPE MS-- 荷姿マスタ
         ON MSGD.SHAPE_ID = MS.SHAPE_ID
         AND MS.DEL_FLG = '0'
     LEFT JOIN M_MATCHING MM-- マッチングマスタ
         ON MS.SHAPE_CD = MM.TRANSFORM_CD
         AND MM.DEL_FLG = '0'
     WHERE
       MP.DEL_FLG = '0'
       /*IF pmb.productId != null*/
       AND MP.PRODUCT_ID = /*pmb.productId*/11111111111
       /*END*/
/*END*/
/*IF pmb.isPaging()*/
     ORDER BY
         MSGD.SHAPE_SORT ASC
/*END*/

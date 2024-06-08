/*
 [df:title]
 入庫実績データ取得

 [df:description]
  入庫実績の送信データを取得します。

*/

-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!

SELECT
      TRR.SUPPLIERRCVNO                                                        -- 整理番号
      ,TRR.SUPPLIERCD                                                          -- 発地CD
      ,TRR.WAREHOUSE_CD                                                        -- 倉庫CD
      ,TRD.ITEMCD                                                              -- 銘柄CD
      ,SUM(TRD.EXPECTQTY1) AS EXPECTQTY1_SUM                                   -- 数量
  FROM T_TRRCV TRR -- 入庫予定
    INNER JOIN T_TRRCVDETAIL TRD -- 入庫予定明細
      ON TRD.RECEIVE_PLAN_H_ID = TRR.RECEIVE_PLAN_H_ID
      AND TRD.DEL_FLG = '0'
    INNER JOIN M_PRODUCT MPR  -- 銘柄マスタ
      ON MPR.PRODUCT_CD = TRD.ITEMCD
      AND MPR.DEL_FLG = '0'
    WHERE TRR.RECEIVE_STS = '07'
      /*IF pmb.controlNo != null*/
      AND TRR.CONTROL_NO = /*pmb.controlNo*/11111111111
      /*END*/
      AND TRR.SUPPLIERRCVNO != '9999999'
      /*IF pmb.usernum1 != null*/
      AND MPR.USERNUM1 = /*pmb.usernum1*/'11'
      /*END*/
      AND TRR.FROMSUB = '3'
      AND TRR.FROMNAME = '0'
      AND TRR.DEL_FLG = '0'
  GROUP BY
       TRR.SUPPLIERRCVNO
      ,TRR.SUPPLIERCD
      ,TRR.WAREHOUSE_CD
      ,TRD.ITEMCD
      ,MPR.USERNUM3
  ORDER BY
    TRR.SUPPLIERRCVNO
    ,MPR.USERNUM3
    ,TRD.ITEMCD

/*
 [df:title]
 入庫実績データ国産・輸入区分取得

 [df:description]
  入庫実績の国産・輸入区分を取得します。

*/

-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!

SELECT
      DISTINCT(MPR.USERNUM1) AS USERNUM1_DISTINCT                              -- 国産・輸入区分
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
      AND TRR.FROMSUB = '3'
      AND TRR.FROMNAME = '0'
      AND TRR.DEL_FLG = '0'
  ORDER BY
    MPR.USERNUM1

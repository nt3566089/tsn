/*
 [df:title]
 入荷ステータス毎の進捗表示

 [df:description]
  入荷ステータス毎の行数、入荷数を返します。

*/

-- #df:entity#
-- ##String RECEIVE_STATUS_NM##
-- ##Long RECEIVE_CNT##

-- !df:pmb!
-- !!AutoDetect!!

SELECT RPH.CLIENT_ID                                                           -- 荷主ID
      ,MCL.CLIENT_CD                                                           -- 荷主CD
      ,MAX(MCL.CLIENT_NM) AS CLIENT_NM                                         -- 荷主名称
      ,RPH.CENTER_ID                                                           -- センタID
      ,MCT.CENTER_CD                                                           -- センタCD
      ,MAX(MCT.CENTER_NM) AS CENTER_NM                                         -- センタ名称
-- [Ver3.0][#3815] 進捗表示時の入荷ステータス参照先をボディからヘッダに変更 2018.03.01 miyabe upd Start
      ,RPH.RECEIVE_STATUS                                                      -- 入荷ステータス
-- [Ver3.0][#3815] 進捗表示時の入荷ステータス参照先をボディからヘッダに変更 2018.03.01 miyabe upd End
      ,NULL AS RECEIVE_STATUS_NM                                               -- 入荷ステータス名称
       -- [#7199][OSS] 行数の値を伝票数に変更 2020.02..21 tsuboi Start
      ,COUNT(DISTINCT RPH.RECEIVE_PLAN_H_ID) RECEIVE_CNT                                -- 行数
      -- [#7199][OSS] 行数の値を伝票数に変更 2020.02..21 tsuboi End
      ,SUM(RPB.PLAN_NUM) AS NUM -- 入荷数(予定数)
  FROM T_RECEIVE_PLAN_H RPH  -- 入荷予定ヘッダ
  INNER JOIN T_RECEIVE_PLAN_B RPB  -- 入荷予定ボディ
    ON RPH.RECEIVE_PLAN_H_ID = RPB.RECEIVE_PLAN_H_ID
    AND RPB.DEL_FLG = '0'
  INNER JOIN M_CLIENT MCL  -- 荷主マスタ
    ON RPH.CLIENT_ID = MCL.CLIENT_ID
    AND MCL.DEL_FLG = '0'
  INNER JOIN M_CENTER MCT  -- センタマスタ
    ON RPH.CENTER_ID = MCT.CENTER_ID
    AND MCT.DEL_FLG = '0'
  LEFT JOIN M_CUSTOMER MC  -- 取引先マスタ
    ON RPH.PLAN_SUPPLIER_ID = MC.CUSTOMER_ID
    AND MC.DEL_FLG = '0'
  WHERE RPH.DEL_FLG = '0'
  -- [Ver3.0][#3815] 進捗表示時の入荷ステータス参照先をボディからヘッダに変更 2018.03.01 miyabe Delete
    /*IF pmb.centerId != null*/
    AND RPH.CENTER_ID = /*pmb.centerId*/11111111111
    /*END*/
    /*IF pmb.clientId != null*/
    AND RPH.CLIENT_ID = /*pmb.clientId*/11111111111
    /*END*/
-- [Ver3.0][#4078] 予定仕入先の検索条件を前方一致に変更 2018.04.12 matsumoto Start
    /*IF pmb.planSupplierCd != null*/
    AND MC.CUSTOMER_CD like /*pmb.planSupplierCd*/'123%'
    /*END*/
-- [Ver3.0][#4078] 予定仕入先の検索条件を前方一致に変更 2018.04.12 matsumoto End
	-- [#7199][OSS]予定数を出荷数として扱うのは入荷予定と入荷中のみに変更 2020.02.25 tsuboi Start
	-- [#7199][OSS]エラー有を追加 2020.03.02 tsuboi Start
	AND RPH.RECEIVE_STATUS IN ('01', '02', '99')  -- 01:入荷予定, 02:入荷中, 99:エラー有
	-- [#7199][OSS]エラー有を追加 2020.03.02 tsuboi End
	-- [#7199][OSS]予定数を出荷数として扱うのは入荷予定と入荷中のみに変更 2020.02.25 tsuboi End
    /*IF pmb.receivePlanDtFrom != null*/
    AND RPH.RECEIVE_PLAN_DT >= /*pmb.receivePlanDtFrom*/'20140430'
    /*END*/
    /*IF pmb.receivePlanDtTo != null*/
    AND RPH.RECEIVE_PLAN_DT <= /*pmb.receivePlanDtTo*/'20140430'
    /*END*/
  GROUP BY
     RPH.CLIENT_ID
    ,MCL.CLIENT_CD
    ,RPH.CENTER_ID
    ,MCT.CENTER_CD
-- [Ver3.0][#3815] 進捗表示時の入荷ステータス参照先をボディからヘッダに変更 2018.03.01 miyabe upd Start
    ,RPH.RECEIVE_STATUS
-- [Ver3.0][#3815] 進捗表示時の入荷ステータス参照先をボディからヘッダに変更 2018.03.01 miyabe upd End

-- [Ver3.0][#3815] 進捗表示時の入荷ステータス参照先をボディからヘッダに変更したため実績取得不要 2018.03.01 miyabe delete

-- [#7199][OSS]入荷済データ取得をUNION ALLのSELECT文に変更 2020.02.25 tsuboi Start

  UNION ALL
  SELECT RPH.CLIENT_ID                                                           -- 荷主ID
      ,MCL.CLIENT_CD                                                           -- 荷主CD
      ,MAX(MCL.CLIENT_NM) AS CLIENT_NM                                         -- 荷主名称
      ,RPH.CENTER_ID                                                           -- センタID
      ,MCT.CENTER_CD                                                           -- センタCD
      ,MAX(MCT.CENTER_NM) AS CENTER_NM                                         -- センタ名称
      ,RPH.RECEIVE_STATUS                                                      -- 入荷ステータス
      ,NULL AS RECEIVE_STATUS_NM                                               -- 入荷ステータス名称
      ,COUNT(DISTINCT RPH.RECEIVE_PLAN_H_ID) RECEIVE_CNT                                -- 行数
      ,SUM(SRB.STORE_NUM) AS NUM -- 入庫数(実績数)
  FROM T_RECEIVE_PLAN_H RPH  -- 入荷予定ヘッダ
  INNER JOIN T_RECEIVE_PLAN_B RPB  -- 入荷予定ボディ
    ON RPH.RECEIVE_PLAN_H_ID = RPB.RECEIVE_PLAN_H_ID
    AND RPB.DEL_FLG = '0'
  LEFT JOIN T_STORE_RECORD_B SRB -- 入庫実績ボディ
    ON RPB.RECEIVE_PLAN_B_ID = SRB.RECEIVE_PLAN_B_ID
    AND SRB.DEL_FLG = '0'
  INNER JOIN M_CLIENT MCL  -- 荷主マスタ
    ON RPH.CLIENT_ID = MCL.CLIENT_ID
    AND MCL.DEL_FLG = '0'
  INNER JOIN M_CENTER MCT  -- センタマスタ
    ON RPH.CENTER_ID = MCT.CENTER_ID
    AND MCT.DEL_FLG = '0'
  LEFT JOIN M_CUSTOMER MC  -- 取引先マスタ
    ON RPH.PLAN_SUPPLIER_ID = MC.CUSTOMER_ID
    AND MC.DEL_FLG = '0'
  WHERE RPH.DEL_FLG = '0'
    /*IF pmb.centerId != null*/
    AND RPH.CENTER_ID = /*pmb.centerId*/11111111111
    /*END*/
    /*IF pmb.clientId != null*/
    AND RPH.CLIENT_ID = /*pmb.clientId*/11111111111
    /*END*/
    /*IF pmb.planSupplierCd != null*/
    AND MC.CUSTOMER_CD like /*pmb.planSupplierCd*/'123%'
    /*END*/
    AND RPH.RECEIVE_STATUS = '03' -- 03:入荷済
    /*IF pmb.receivePlanDtFrom != null*/
    AND RPH.RECEIVE_PLAN_DT >= /*pmb.receivePlanDtFrom*/'20140430'
    /*END*/
    /*IF pmb.receivePlanDtTo != null*/
    AND RPH.RECEIVE_PLAN_DT <= /*pmb.receivePlanDtTo*/'20140430'
    /*END*/
  GROUP BY
     RPH.CLIENT_ID
    ,MCL.CLIENT_CD
    ,RPH.CENTER_ID
    ,MCT.CENTER_CD
    ,RPH.RECEIVE_STATUS

  ORDER BY
    CLIENT_CD
   ,CENTER_CD
   ,RECEIVE_STATUS
-- [#7199][OSS]入荷済データ取得をUNION ALLのSELECT文に変更 2020.02.25 tsuboi End
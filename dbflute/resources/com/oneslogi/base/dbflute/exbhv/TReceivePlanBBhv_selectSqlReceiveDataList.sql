/*
 [df:title]
  入荷データの明細リスト検索。

 [df:description]
 入庫実績があれば入庫実績、なければ入荷予定から入荷商品のリストを検索する。

*/

-- #df:entity#
-- ##Long store_record_h_id##
-- ##Long store_record_b_id##

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
SELECT
  -- 予定
  receive_data.receive_plan_h_id,
  receive_data.receive_plan_b_id,
  receive_data.receive_status,
  receive_data.product_id,
  receive_data.product_cd,
  receive_data.plan_lot,
  receive_data.plan_limit_dt,
  receive_data.plan_location_cd,
  receive_data.plan_store_label_no,
  receive_data.plan_num,
  -- 実績
  receive_data.store_record_h_id,
  receive_data.store_record_b_id,
  receive_data.lot,
  receive_data.limit_dt,
  receive_data.store_dt,
  receive_data.store_num,
  receive_data.store_location_cd,
-- [#4242][Ver3.0] SD入荷検品 - 0入荷データ表示不正(ソート順変更による在庫関連テーブル削除) 2018.04.11 honma Delete
  -- 商品
  product.product_nm,
  product.product_abbr,
  product.jan_cd,
  -- 入荷ステータス名称
  receive_status_class.receive_status_nm,
  -- ソート順使用(参考に出力)
  receive_data.receive_plan_dt,
  receive_data.plan_client_receive_no,
  receive_data.receive_slip_no,
  receive_data.line_no,
  -- 検索条件に使用 (参考に出力)
  receive_data.center_id,
  receive_data.client_id,
  receive_data.plan_supplier_cd,
  receive_data.store_supplier_cd
-- ELSE select count(*)
/*END*/
FROM
  (
    -- 入庫実績が登録されている入荷データ
    SELECT
-- [#4242][Ver3.0] SD入荷検品 - 0入荷データ表示不正 2018.04.11 honma Mod Start
-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
      -- 予定
      plan_b.receive_plan_h_id,
      plan_b.receive_plan_b_id,
      plan_b.line_no,
      plan_b.receive_status,
      plan_b.product_id,
      plan_b.product_cd,
      plan_b.plan_lot,
      plan_b.plan_limit_dt,
      plan_b.plan_location_cd,
      plan_b.plan_store_label_no,
      plan_b.plan_num,
      -- 実績
      store_b.store_record_h_id,
      store_b.store_record_b_id,
      store_b.lot,
      store_b.limit_dt,
      store_b.store_dt,
      store_b.store_num,
      store_location.location_cd AS store_location_cd,
      -- ソート順に使用
      plan_h.receive_plan_dt,
      plan_h.plan_client_receive_no,
      plan_h.receive_slip_no,
      -- 検索条件に使用 (参考)
      plan_h.center_id,
      plan_h.client_id,
      plan_h.plan_supplier_cd,
      supplier.customer_cd AS store_supplier_cd
-- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
-- [#4242][Ver3.0] SD入荷検品 - 0入荷データ表示不正 2018.04.11 honma Mod End
    FROM t_store_record_b  store_b
      JOIN t_store_record_h  store_h
        ON store_h.store_record_h_id = store_b.store_record_h_id
      JOIN m_customer  supplier
        ON supplier.customer_id = store_h.supplier_id
      JOIN t_receive_plan_b  plan_b
        ON plan_b.receive_plan_b_id = store_b.receive_plan_b_id
      JOIN t_receive_plan_h  plan_h
        ON plan_h.receive_plan_h_id = plan_b.receive_plan_h_id
      LEFT OUTER JOIN m_location  store_location
        ON store_location.location_id = store_b.store_location_id
-- [#4242][Ver3.0] SD入荷検品 - 0入荷データ表示不正(ソート順変更による在庫関連テーブル削除) 2018.04.11 honma Delete
    WHERE store_b.del_flg = 0
      AND plan_h.center_id = /*pmb.centerId*/11111111111
      AND plan_h.client_id = /*pmb.clientId*/11111111111
      /*IF pmb.receiveStatus != null*/
      AND plan_b.receive_status = /*pmb.receiveStatus*/'a123'
      /*END*/
      /*IF pmb.receivePlanDtFrom != null*/
      AND plan_h.receive_plan_dt >= /*pmb.receivePlanDtFrom*/'20140805'
      /*END*/
      /*IF pmb.receivePlanDtTo != null*/
      AND plan_h.receive_plan_dt <= /*pmb.receivePlanDtTo*/'20141105'
      /*END*/
      /*IF pmb.supplierCd != null*/
      AND (
        plan_h.plan_supplier_cd LIKE /*pmb.supplierCd*/'a123%'
        OR supplier.customer_cd LIKE /*pmb.supplierCd*/'a123%'
      )
      /*END*/
      /*IF pmb.receiveSlipNo != null*/
      AND plan_h.receive_slip_no LIKE /*pmb.receiveSlipNo*/'a123%'
      /*END*/
      /*IF pmb.planClientReceiveNo != null*/
      AND plan_h.plan_client_receive_no LIKE /*pmb.planClientReceiveNo*/'a123%'
      /*END*/
      /*IF pmb.planClientOrderNo != null*/
      AND plan_b.plan_client_order_no LIKE /*pmb.planClientOrderNo*/'a123%'
      /*END*/
      /*IF pmb.productCd != null*/
      AND plan_b.product_cd LIKE /*pmb.productCd*/'a123%'
      /*END*/

-- [#4242][Ver3.0] SD入荷検品 - 0入荷データ表示不正(ソート順変更による在庫関連テーブル削除) 2018.04.11 honma Delete

    UNION ALL

    -- 入庫実績が登録されていない入荷データ
    SELECT
      -- 予定
      plan_b.receive_plan_h_id,
      plan_b.receive_plan_b_id,
      plan_b.line_no,
      plan_b.receive_status,
      plan_b.product_id,
      plan_b.product_cd,
      plan_b.plan_lot,
      plan_b.plan_limit_dt,
      plan_b.plan_location_cd,
      plan_b.plan_store_label_no,
      plan_b.plan_num,
      -- 実績
      null AS store_record_h_id,
      null AS store_record_b_id,
      null AS lot,
      null AS limit_dt,
      null AS store_dt,
      null AS store_num,
      null AS store_location_cd,
-- [#4242][Ver3.0] SD入荷検品 - 0入荷データ表示不正(ソート順変更による在庫関連テーブル削除) 2018.04.11 honma Delete
      -- ソート順に使用
      plan_h.receive_plan_dt,
      plan_h.plan_client_receive_no,
      plan_h.receive_slip_no,
      -- 検索条件に使用 (参考)
      plan_h.center_id,
      plan_h.client_id,
      plan_h.plan_supplier_cd,
      null AS store_supplier_cd
    FROM t_receive_plan_b  plan_b
      JOIN t_receive_plan_h  plan_h
        ON plan_h.receive_plan_h_id = plan_b.receive_plan_h_id
    WHERE plan_b.del_flg = 0
      AND plan_h.center_id = /*pmb.centerId*/11111111111
      AND plan_h.client_id = /*pmb.clientId*/11111111111
      /*IF pmb.receiveStatus != null*/
      AND plan_b.receive_status = /*pmb.receiveStatus*/'a123'
      /*END*/
      /*IF pmb.receivePlanDtFrom != null*/
      AND plan_h.receive_plan_dt >= /*pmb.receivePlanDtFrom*/'20140805'
      /*END*/
      /*IF pmb.receivePlanDtTo != null*/
      AND plan_h.receive_plan_dt <= /*pmb.receivePlanDtTo*/'20141105'
      /*END*/
      /*IF pmb.supplierCd != null*/
      AND plan_h.plan_supplier_cd LIKE /*pmb.supplierCd*/'a123%'
      /*END*/
      /*IF pmb.receiveSlipNo != null*/
      AND plan_h.receive_slip_no LIKE /*pmb.receiveSlipNo*/'a123%'
      /*END*/
      /*IF pmb.planClientReceiveNo != null*/
      AND plan_h.plan_client_receive_no LIKE /*pmb.planClientReceiveNo*/'a123%'
      /*END*/
      /*IF pmb.planClientOrderNo != null*/
      AND plan_b.plan_client_order_no LIKE /*pmb.planClientOrderNo*/'a123%'
      /*END*/
      /*IF pmb.productCd != null*/
      AND plan_b.product_cd LIKE /*pmb.productCd*/'a123%'
      /*END*/
      AND NOT EXISTS -- 実績ありを除外
        (
          SELECT 1 FROM t_store_record_b  store_b WHERE plan_b.receive_plan_b_id = store_b.receive_plan_b_id
        )
  )  receive_data

  LEFT OUTER JOIN m_product  product
     ON product.product_id = receive_data.product_id

  LEFT OUTER JOIN
  ( -- 入荷ステータス名称を区分値テーブルから取得
    SELECT
      class_dtl.class_dtl_cd AS receive_status_cd,
      v_dict.dict_nm AS receive_status_nm
    -- [#1899][ver2.2.1]取得先をセンタ区分値から区分値に変更 2017.08.02 miyabe Start
    FROM b_class_dtl  class_dtl
    JOIN b_class  class
     ON class_dtl.class_id = class.class_id
    -- [#1899][ver2.2.1]取得先をセンタ区分値から区分値に変更 2017.08.02 miyabe End
     AND class.class_cd = 'RECEIVE_STATUS'
    JOIN v_dict  v_dict
      ON v_dict.dict_id = class_dtl.dict_id
     AND (v_dict.culture_id IS NULL OR v_dict.culture_id = /*pmb.cultureId*/11111111111)
  )  receive_status_class
    ON receive_status_class.receive_status_cd = receive_data.receive_status
/*IF pmb.isPaging()*/
 ORDER BY
  receive_data.receive_plan_dt ASC,
  receive_data.plan_client_receive_no ASC,
  receive_data.receive_slip_no ASC,
  receive_data.line_no ASC,
-- [#4242][Ver3.0] SD入荷検品 - 0入荷データ表示不正 2018.04.11 honma Mod Start
  receive_data.store_record_b_id ASC
-- [#4242][Ver3.0] SD入荷検品 - 0入荷データ表示不正 2018.04.11 honma Mod End
/*END*/

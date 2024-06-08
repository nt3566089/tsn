/*
 [df:title]
  ケースピッキングNo.リストの取得

 [df:description]
  未ピッキングの「ケースピッキングNo.」のリストを取得する
*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
-- ELSE SELECT COUNT(*) FROM (
/*END*/
SELECT
  t1.center_id,
  t1.case_picking_no,
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
  MAX(t1.packing_status) AS packing_status,
  MAX(packing_status_class.packing_status_nm) AS packing_status_nm,
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
  max_user.upd_user AS user_cd,
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
  MAX(bUser.user_nm) AS user_nm
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End

FROM
  (
  SELECT
    main_t.center_id,
    main_t.packing_status,
    main_t.case_picking_no,
    main_t.client_cd,
    main_t.center_cd,
    main_t.warehouse_cd,
    main_t.work_dt,
    main_t.picking_batch_no,
    main_t.zone_picking_order,
    main_t.zone_cd,
    upd_dt.max_upd_dt
  FROM
    ( -- メイン検索 (対象のケースピッキングNo.とその他情報を取得)
      SELECT
        main_query.center_id,
        MAX(main_query.packing_status) AS packing_status,
        main_query.case_picking_no,
        -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
        MAX(main_query.client_cd) AS client_cd,
        MAX(main_query.center_cd) AS center_cd,
        MAX(main_query.warehouse_cd) AS warehouse_cd,
        MAX(main_query.work_dt) AS work_dt,
        MAX(main_query.picking_batch_no) AS picking_batch_no,
        MAX(main_query.zone_picking_order) AS zone_picking_order,
        MAX(main_query.zone_cd) AS zone_cd
        -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
      FROM
        (
        SELECT
          pack_h.center_id,
          pack_h.packing_status,
          pack_b.case_picking_no,
          pack_b.upd_dt,
          mClient.client_cd,
          center.center_cd,
          warehouse.warehouse_cd,
          alloc_h.work_dt,
          ship_h.picking_batch_no,
          mZone.picking_order AS zone_picking_order,
          mZone.zone_cd
        FROM t_packing_b  pack_b
          JOIN t_packing_h  pack_h
            ON pack_b.packing_h_id = pack_h.packing_h_id
          JOIN m_client  mClient -- clientは予約語
            ON pack_h.client_id = mClient.client_id
          JOIN m_center  center
            ON pack_h.center_id = center.center_id
          JOIN t_picking_b  pick_b
            ON pack_b.picking_b_id = pick_b.picking_b_id
          JOIN t_stock  stock
            ON pick_b.stock_id = stock.stock_id
          JOIN m_location  location
            ON stock.location_id = location.location_id
          JOIN m_zone  mZone -- zoneは予約語
            ON location.zone_id = mZone.zone_id
          JOIN m_warehouse  warehouse
            ON mZone.warehouse_id = warehouse.warehouse_id
          JOIN t_picking_h  pick_h
            ON pick_b.picking_h_id = pick_h.picking_h_id
          JOIN t_picking_r  pick_r
            ON pick_h.picking_h_id = pick_r.picking_h_id
          JOIN t_alloc_inst_b  alloc_b
            ON pick_b.alloc_inst_b_id = alloc_b.alloc_inst_b_id
          JOIN t_alloc_inst_h  alloc_h
            ON alloc_b.alloc_inst_h_id = alloc_h.alloc_inst_h_id
          JOIN t_shipping_inst_b  ship_b
            ON pick_b.shipping_inst_b_id = ship_b.shipping_inst_b_id
          JOIN t_shipping_inst_h  ship_h
            ON ship_b.shipping_inst_h_id = ship_h.shipping_inst_h_id
        WHERE pack_b.del_flg = 0
          AND pack_h.center_id = /*pmb.centerId*/11111111111
          /*IF pmb.clientId != null*/
          AND pack_h.client_id = /*pmb.clientId*/11111111111
          /*END*/
          AND pack_h.mixed_flg = 0
          AND pack_b.picking_flg <> 1
          AND pack_b.inspection_flg <> 1
          /*IF pmb.casePickingNo != null*/
          AND pack_b.case_picking_no = /*pmb.casePickingNo*/'a123'
          /*END*/
          AND pack_h.packing_status IN ('25','30','40')
          /*IF pmb.emergencyFlg != null*/
          AND ship_h.emergency_flg = /*pmb.emergencyFlg*/'a123'
          /*END*/
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
          /*IF pmb.stockOutFlg == '1'*/
          AND ship_b.stock_out_num > 0
          /*END*/
          /*IF pmb.stockOutFlg == '0'*/
          AND ship_b.stock_out_num = 0
          /*END*/
-- [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
          /*IF pmb.pickingBatchNo != null*/
          AND ship_h.picking_batch_no = /*pmb.pickingBatchNo*/'a123'
          /*END*/
          /*IF pmb.pickingWorkNo != null*/
          AND pick_h.picking_work_no LIKE /*pmb.pickingWorkNo*/'%a123'
          /*END*/
          /*IF pmb.workDtFrom != null*/
          AND alloc_h.work_dt >= /*pmb.workDtFrom*/'20140805'
          /*END*/
          /*IF pmb.workDtTo != null*/
          AND alloc_h.work_dt <= /*pmb.workDtTo*/'20141105'
          /*END*/
          /*IF pmb.shippingDtFrom != null*/
          AND alloc_h.shipping_dt >= /*pmb.shippingDtFrom*/'20140805'
          /*END*/
          /*IF pmb.shippingDtTo != null*/
          AND alloc_h.shipping_dt <= /*pmb.shippingDtTo*/'20141105'
          /*END*/
          /*IF pmb.supplyCustomerCd != null*/
          AND alloc_h.supply_customer_cd LIKE /*pmb.supplyCustomerCd*/'a123%'
          /*END*/
          /*IF pmb.deliveryCourseCd != null*/
          AND ship_h.delivery_course_cd LIKE /*pmb.deliveryCourseCd*/'a123%'
          /*END*/
        )  main_query
      GROUP BY
        main_query.center_id,
        main_query.case_picking_no
    )  main_t
    JOIN
    ( -- ケースピッキングNo.ごとの最新更新日時を取得
      SELECT
        pack_h.center_id,
        pack_b.case_picking_no,
        MAX(pack_b.upd_dt) AS max_upd_dt
      FROM t_packing_b  pack_b
        JOIN t_packing_h  pack_h
          ON pack_b.packing_h_id = pack_h.packing_h_id
      GROUP BY
        pack_h.center_id,
        pack_b.case_picking_no
    )  upd_dt
      ON upd_dt.center_id = main_t.center_id
      AND upd_dt.case_picking_no = main_t.case_picking_no
  )  t1

  JOIN
  ( -- 最新更新日時の更新ユーザを取得
    SELECT
      pack_h.center_id,
      pack_b.case_picking_no,
      pack_b.upd_user,
      pack_b.upd_dt
    FROM t_packing_b  pack_b
      JOIN t_packing_h  pack_h
        ON pack_b.packing_h_id = pack_h.packing_h_id
  )  max_user
    ON max_user.center_id = t1.center_id
    AND max_user.case_picking_no = t1.case_picking_no
    AND max_user.upd_dt = t1.max_upd_dt

  LEFT OUTER JOIN b_user  bUser -- userは予約語
    ON max_user.upd_user = bUser.user_cd
  LEFT OUTER JOIN
  ( -- 梱包ステータス名称を区分値テーブルから取得
    SELECT
      class_dtl.class_dtl_cd AS packing_status_cd,
      v_dict.dict_nm AS packing_status_nm
    -- [#1899][ver2.2.1]取得先をセンタ区分値から区分値に変更 2017.08.02 miyabe Start
    FROM b_class_dtl  class_dtl
    JOIN b_class  class
     ON class_dtl.class_id = class.class_id
    -- [#1899][ver2.2.1]取得先をセンタ区分値から区分値に変更 2017.08.02 miyabe End
     AND class.class_cd = 'PACKING_STATUS'
    JOIN v_dict  v_dict
      ON v_dict.dict_id = class_dtl.dict_id
     AND (v_dict.culture_id IS NULL OR v_dict.culture_id = /*pmb.cultureId*/11111111111)
  )  packing_status_class
    ON packing_status_class.packing_status_cd = t1.packing_status
GROUP BY
  -- 最新更新日時の行が複数あることがあるためグループ指定
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  t1.center_id,
  t1.case_picking_no,
  max_user.upd_user
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
/*IF pmb.updUserCd != null*/
HAVING max_user.upd_user = /*pmb.updUserCd*/'a123'
/*END*/
/*IF pmb.isPaging()*/
ORDER BY
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  MIN(t1.client_cd) ASC,
  MIN(t1.center_cd) ASC,
  MIN(t1.warehouse_cd) ASC,
  MIN(t1.work_dt) ASC,
  MIN(t1.picking_batch_no) ASC,
  MIN(t1.zone_picking_order) ASC,
  MIN(t1.zone_cd) ASC,
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  t1.case_picking_no ASC
-- ELSE )  count_table
/*END*/
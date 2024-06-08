/*
 [df:title]
  オーダーピッキング明細データリストの取得

 [df:description]
  未ピッキングのオーダーピッキング明細データのリストを取得する
*/

-- #df:entity#
-- ##Long zone_picking_order##
-- ##Long location_picking_order##
-- [#3114][Ver3.0] SDオーダーピッキング - UoM対応 2017.12.20 honma Add Start
-- *M_PRODUCT.PRODUCT_ID*
-- [#3114][Ver3.0] SDオーダーピッキング - UoM対応 2017.12.20 honma Add End
-- !df:pmb extends Paging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/
-- ELSE SELECT COUNT(*) FROM (
/*END*/
SELECT
  main_query.center_id,
  main_query.shipping_packing_no,
  main_query.stock_id,
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
  max(main_query.box_cd) AS box_cd,
  max(main_query.box_nm) AS box_nm,
  max(main_query.product_cd) AS product_cd,
  max(main_query.product_abbr) AS product_nm, -- 商品略称
  max(main_query.jan_cd) AS jan_cd,
  max(main_query.location_cd) AS location_cd,
  max(main_query.location_nm) AS location_nm,
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
  sum(main_query.packing_num) AS picking_num,
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
  max(main_query.picking_work_no) AS picking_work_no,
  max(main_query.client_cd) AS client_cd,
  max(main_query.client_abbr) AS client_nm, -- 荷主略称
  max(main_query.center_cd) AS center_cd,
  max(main_query.center_abbr) AS center_nm, -- センタ略称
  max(main_query.warehouse_cd) AS warehouse_cd,
  max(main_query.warehouse_abbr) AS warehouse_abbr, -- 倉庫略称
  max(main_query.work_dt) AS work_dt,
  max(main_query.deliv_dt) AS deliv_dt,
  max(main_query.delivery_course_cd) AS delivery_course_cd,
  max(main_query.delivery_course_nm) AS delivery_course_nm,
  max(main_query.carrier_cd) AS carrier_cd,
  max(main_query.carrier_abbr) AS carrier_nm, -- 運送業者略称
  max(main_query.supply_customer_cd) AS supply_customer_cd,
  max(main_query.supply_customer_abbr) AS supply_customer_nm, -- 納品先略称
  max(main_query.picking_batch_no) AS picking_batch_no,
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
  min(main_query.client_shipping_no) AS client_shipping_no,
  min(main_query.shipping_slip_no) AS wms_shipping_slip_no,
  max(main_query.picking_work_message) AS picking_work_message,
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana Start
  max(main_query.zone_picking_order) AS zone_picking_order,
  max(main_query.zone_cd) AS zone_cd,
  max(main_query.zone_nm) AS zone_nm,
  max(main_query.location_picking_order) AS location_picking_order,
  max(main_query.limit_dt) AS limit_dt,
  max(main_query.lot) AS lot,
  max(main_query.store_label_no) AS store_label_no,
  max(main_query.store_dt) AS store_dt,
  main_query.client_id,
  max(main_query.stock_type_cd) AS stock_type_cd,
  max(main_query.stock_type_nm) AS stock_type_nm,
  max(main_query.charge_num) AS charge_num,
  -- [#3114][Ver3.0] SDオーダーピッキング - UoM対応 2017.12.20 honma Add Start
  main_query.product_id
  -- [#3114][Ver3.0] SDオーダーピッキング - UoM対応 2017.12.20 honma Add End
  -- [#2255] MySQLのSQL_MODE変更対応 GROUP BY 未指定列は全てMAX関数で対応 2018.03.14 kawana End
FROM
  (
    SELECT
      pack_h.center_id,
      pack_h.shipping_packing_no,
      box.box_cd,
      box.box_nm,
      pick_b.stock_id,
      pack_b.packing_num,
      location.location_cd,
      location.location_nm,
      product.product_cd,
      product.product_abbr,
      product.jan_cd,
      pick_h.picking_work_no,
      warehouse.warehouse_abbr,
      mClient.client_cd,
      mClient.client_abbr,
      center.center_cd,
      center.center_abbr,
      warehouse.warehouse_cd,
      alloc_h.work_dt,
      alloc_h.deliv_dt,
      delivery_course.delivery_course_cd,
      delivery_course.delivery_course_nm,
      carrier.carrier_cd,
      carrier.carrier_abbr,
      supplier.customer_cd AS supply_customer_cd,
      supplier.customer_abbr AS supply_customer_abbr,
      ship_h.picking_batch_no,
      ship_h.client_shipping_no,
      ship_h.shipping_slip_no,
      ship_h.picking_work_message,
      mZone.picking_order AS zone_picking_order,
      mZone.zone_cd,
      mZone.zone_nm,
      location.picking_order AS location_picking_order,
      tLot.limit_dt,
      tLot.lot,
      store_no.store_label_no,
      store_no.store_dt,
      pack_b.packing_b_id,
      pack_h.client_id,
      stock_type.stock_type_cd,
      stock_type_dict.dict_nm AS stock_type_nm,
      stock.charge_num,
      -- [#3114][Ver3.0] SDオーダーピッキング - UoM対応 2017.12.20 honma Mod Start
      product.product_id AS PRODUCT_ID
      -- [#3114][Ver3.0] SDオーダーピッキング - UoM対応 2017.12.20 honma Mod End
    FROM t_packing_b  pack_b
      JOIN t_packing_h  pack_h
        ON pack_b.packing_h_id = pack_h.packing_h_id
      JOIN m_client  mClient -- clientは予約語
        ON pack_h.client_id = mClient.client_id
      JOIN m_center  center
        ON pack_h.center_id = center.center_id
      LEFT OUTER JOIN m_box  box
        ON box.box_id = pack_h.box_id
      JOIN t_picking_b  pick_b
        ON pack_b.picking_b_id = pick_b.picking_b_id
      JOIN t_stock  stock
        ON pick_b.stock_id = stock.stock_id
      JOIN  m_stock_type  stock_type
        ON stock.stock_type_id = stock_type.stock_type_id
      JOIN v_dict  stock_type_dict
        ON stock_type_dict.dict_id = stock_type.dict_id
        AND (stock_type_dict.culture_id IS NULL OR stock_type_dict.culture_id = /*pmb.cultureId*/11111111111)
      JOIN t_lot  tLot
        ON stock.lot_id = tLot.lot_id
      JOIN t_store_no  store_no
        ON stock.store_no_id = store_no.store_no_id
      JOIN m_product  product
        ON stock.product_id = product.product_id
      JOIN m_location  location
        ON stock.location_id = location.location_id
      JOIN m_zone  mZone -- zoneは予約語
        ON location.zone_id = mZone.zone_id
      JOIN m_warehouse  warehouse
        ON mZone.warehouse_id = warehouse.warehouse_id
      JOIN t_picking_h  pick_h
        ON pick_b.picking_h_id = pick_h.picking_h_id
      JOIN t_alloc_inst_b  alloc_b
        ON pick_b.alloc_inst_b_id = alloc_b.alloc_inst_b_id
      JOIN t_alloc_inst_h  alloc_h
        ON alloc_b.alloc_inst_h_id = alloc_h.alloc_inst_h_id
      JOIN m_delivery_course  delivery_course
        ON delivery_course.delivery_course_id = alloc_h.delivery_course_id
      JOIN m_carrier  carrier
        ON carrier.carrier_id = delivery_course.carrier_id
      JOIN m_customer  supplier
        ON supplier.customer_id = alloc_h.supply_customer_id
      JOIN t_shipping_inst_b  ship_b
        ON pick_b.shipping_inst_b_id = ship_b.shipping_inst_b_id
      JOIN t_shipping_inst_h  ship_h
        ON ship_b.shipping_inst_h_id = ship_h.shipping_inst_h_id
    WHERE pack_b.del_flg = 0
      AND pack_h.center_id = /*pmb.centerId*/11111111111
      AND pack_h.client_id = /*pmb.clientId*/11111111111
      AND pack_h.mixed_flg = 1
-- [#5483][v3.1] SDピッキングに単行ピッキングデータが表示される問題を修正 2018.10.24 kawana Start
      AND pick_h.sgl_row_pic_flg <> 1
-- [#5483][v3.1] SDピッキングに単行ピッキングデータが表示される問題を修正 2018.10.24 kawana End
      AND pack_b.picking_flg <> 1
      AND pack_b.inspection_flg <> 1
      /*IF pmb.stockId != null*/
      AND pick_b.stock_id = /*pmb.stockId*/11111111111
      /*END*/
      /*IF pmb.shippingPackingNo != null*/
      AND pack_h.shipping_packing_no = /*pmb.shippingPackingNo*/'a123'
      /*END*/
      AND pack_h.packing_status IN ('25','30')
  )  main_query
  -- [#3114][Ver3.0] SDオーダーピッキング - UoM対応 ケース入数取得削除 2017.12.20 honma Delete
GROUP BY
  main_query.center_id,
  main_query.shipping_packing_no,
  main_query.stock_id,
  main_query.client_id,
  main_query.product_id
/*IF pmb.isPaging()*/
ORDER BY
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  client_cd ASC,
  center_cd ASC,
  work_dt ASC,
  picking_batch_no ASC,
  delivery_course_cd ASC,
  picking_work_no ASC,
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  main_query.shipping_packing_no ASC,
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  warehouse_cd ASC,
  zone_picking_order ASC,
  location_picking_order ASC,
  zone_cd ASC,
  location_cd ASC,
  product_cd ASC,
  limit_dt ASC,
  lot ASC,
  store_label_no ASC,
  store_dt ASC,
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  client_shipping_no ASC,
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  wms_shipping_slip_no ASC,
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  min(main_query.packing_b_id) ASC
-- ELSE )  count_table
/*END*/
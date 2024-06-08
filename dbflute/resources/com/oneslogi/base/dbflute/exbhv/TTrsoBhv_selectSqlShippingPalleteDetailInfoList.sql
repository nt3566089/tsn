/*
 [df:title]
 出庫パレット情報照会(詳細)一覧データ取得

 [df:description]
  出庫パレット情報照会(詳細)一覧データを取得します。

*/

-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!

SELECT
	   TSB.SYMBOLLINENO                                                  -- 段ボール番号
	  ,TSB.RECEIVE_PLAN_H_ID AS RCVKEY                                   -- 入庫キー
	  ,TSB.SYMBOLMAKENO                                                  -- 生出番号
	  ,MP.PRODUCT_CD                                                     -- 銘柄CD
	  ,MP.PRODUCT_NM                                                     -- 銘柄名称
	  ,TRD.LOT1                                                          -- 商社搬入番号
	  ,TRD.LOT4                                                          -- 製造年月日
	  ,TRD.LOT3                                                          -- デザイン区分
	  ,TRD.LOT2                                                          -- 製造記号
	  ,TRD.STOCK_TYPE_CD                                                 -- 在庫区分
	  ,TSB.MAKERCASENO                                                   -- メーカーケースCD
	  ,TSB.RECEIVEDATE                                                   -- 入庫年月日
	  ,FLOOR(TPS.SORTEDQTY1 / MP.UNIT2) AS TOTALQTY                      -- 数量(カートン)
	  ,TRD.FOREIGNCARGOFLG                                               -- 内貨・外貨区分
	  ,TRD.IFITEMCD                                                      -- 需給CD
	  ,MCE.CENTER_CD                                                     -- 拠点CD
	  ,MCE.CENTER_NM                                                     -- 拠点名称
	  ,MCL.CLIENT_CD                                                     -- 荷主CD
	  ,MCL.CLIENT_NM                                                     -- 荷主名称
  FROM T_TRSO TRS -- 出庫予定
    INNER JOIN T_TRSODETAIL TRD -- 出庫予定明細
	  ON TRD.SOID = TRS.SOID
      AND TRD.DEL_FLG = '0'
	INNER JOIN T_TRPALLETSYMBOL TPS -- パレット個体情報
	  ON TPS.SOID = TRD.SOID
	  AND TPS.SODETAILID = TRD.SODETAILID
      AND TPS.DEL_FLG = '0'
	INNER JOIN T_CENTER_SYMBOL TCS -- 拠点シンボル
	  ON TCS.CENTER_SYMBOL_ID = TPS.CENTER_SYMBOL_ID
      AND TCS.DEL_FLG = '0'
	INNER JOIN T_TRSYMBOL TSB -- 段ボール情報
	  ON TSB.TRSYMBOL_ID = TCS.TRSYMBOL_ID
      AND TSB.DEL_FLG = '0'
	INNER JOIN M_PRODUCT MP -- 銘柄マスタ
	  ON MP.PRODUCT_ID = TRD.PRODUCT_ID
      AND MP.DEL_FLG = '0'
    INNER JOIN M_CENTER MCE  -- 拠点マスタ
      ON TRS.CENTER_ID = MCE.CENTER_ID
      AND MCE.DEL_FLG = '0'
    INNER JOIN M_CLIENT MCL  -- 荷主マスタ
      ON TRS.CLIENT_ID = MCL.CLIENT_ID
      AND MCL.DEL_FLG = '0'
  WHERE TRS.SOID = /*pmb.soId*/11111111111
    AND TRS.DEL_FLG = '0'
  ORDER BY
    SYMBOLLINENO ASC

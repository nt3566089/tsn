/*
 [df:title]
 段ボール情報を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String DAMAGE_FLG##
-- ##String LOC_GROUP##
-- ##String SYMBOL_LOT3##
-- ##String OPEN_FLG##
-- ##String OTHERLOT1##
-- ##BigDecimal RESTQTY_CARTON##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

/*IF pmb.isPaging()*/
SELECT *
-- ELSE SELECT COUNT(*)
/*END*/
FROM (
SELECT 
	TRSYMBOL_ID,										--段ボール情報ID
	MAX(RECEIVE_PLAN_H_ID) AS RECEIVE_PLAN_H_ID,		--入荷予定ヘッダID
	MAX(SYMBOLMAKENO) AS SYMBOL_MAKE_NO,				--二次元コードの生出番号
	MAX(DAMAGEFLG) AS DAMAGE_FLG_CD,					--詰合せ状態
	NULL AS DAMAGE_FLG,									--詰合せ状態(辞書名)
	MAX(LOCATION_CD) AS LOCATION_CD,					--ロケーションCD
	MAX(LOCGROUP) AS LOC_GROUP_CD,						--ロケーショングループ
	NULL AS LOC_GROUP,									--ロケーショングループ(辞書名)
	DESTINATIONCD AS DESTINATION_CD,					--受入先CD
	MAX(DESTINATIONNM) AS DESTINATION_NM,				--受入先名称
	MAX(RECEIVEDATE) AS RECEIVE_DATE,					--入庫実績日・時刻
	MAX(SHIPDATE) AS SHIP_DATE,							--出庫実績日
	MAX(SYMBOLITEMCD) AS SYMBOL_ITEM_CD,				--二次元コードの銘柄CD
	MAX(PRODUCT_NM) AS PRODUCT_NM,						--商品名称
	MAX(LOT1) AS LOT1,									--商社搬入番号
	MAX(SYMBOLLOT4) AS SYMBOL_LOT4,						--二次元コードの製造年月日
	MAX(SYMBOLLOT3) AS SYMBOL_LOT3_CD,					--デザイン区分
	NULL AS SYMBOL_LOT3,								--デザイン区分(辞書名)
	MAX(SYMBOLPRINTERNO) AS SYMBOL_PRINTER_NO,			--二次元コードの号機(印字機)
	MAX(SYMBOLPRODUCTMARK) AS SYMBOL_PRODUCT_MARK,		--二次元コードの製造記号
	MAX(STOCK_TYPE_CD) AS STOCK_TYPE_CD,				--在庫区分CD
	NULL AS OTHERLOT1,									--在庫区分名称
	MAX(CASEITFNO) AS CASE_ITF_NO,						--ITFNo.
	MAX(CASEBARCODEVALIANT) AS CASE_BARCODE_VALIANT,	--Barcode Valiant
	MAX(CASELOT4) AS CASE_LOT4,							--実製造年月日
	MAX(CASECENTERNO) AS CASE_CENTER_NO,				--拠点No.
	MAX(CASEPACKNO) AS CASE_PACK_NO,					--ケースパッカーNo.
	MAX(CASEPACKTIME) AS CASE_PACK_TIME,				--ケースピッキング時間
	MAX(FROMADDRESS1) AS FROM_ADDRESS1,					--B/LNo
	MAX(CARRIERNAME) AS CARRIER_NAME,					--連携項目
	MAX(CARRIERWBNO) AS CARRIER_WB_NO,					--オーダーNo
	MAX(CARRIERNO) AS CARRIER_NO,						--コンテナNo.
	MAX(CARRIERSNAME) AS CARRIER_S_NAME,				--SRC＿CD
	MAX(MIXEDFLG) AS OPEN_FLG_CD,						--開封フラグ
	NULL AS OPEN_FLG,									--開封フラグ(辞書名)
	MAX(MAKERCASENO) AS MAKER_CASE_NO,					--メーカケースCD
	MAX(RESTQTY) AS RESTQTY_BOWL,						--残数量（個装）
	0 AS RESTQTY_CARTON,								--残数量（カートン）
	MAX(UNIT1) AS UNIT1,								--1ケース当カートン数
	MAX(UNIT2) AS UNIT2,								--1カートン当個数
	MAX(CENTER_CD) AS CENTER_CD,						--拠点CD
	MAX(CENTER_NM) AS CENTER_NM,						--拠点名称
	MAX(CLIENT_CD) AS CLIENT_CD,						--荷主CD
	MAX(CLIENT_NM) AS CLIENT_NM							--荷主名称
	/*END*/
FROM(
	SELECT	
		TTS.TRSYMBOL_ID,
		TTS.RECEIVE_PLAN_H_ID,
		TTS.SYMBOLMAKENO,
		TTS.DAMAGEFLG,	
		MLC.LOCATION_CD,
		MLC.LOCGROUP,
		CASE WHEN TTST.FAX1 = '3' THEN TTST.ORIGINALPONO
		ELSE TTST.CUSTOMERCD END AS DESTINATIONCD,
		CASE WHEN TTST.FAX1 = '3' THEN MCU.CUSTOMER_NM
		ELSE TTST.DELIVNAME END AS DESTINATIONNM,
		TTC.RECEIVEDATE,
		TTST.SHIPDATE,
		TTS.SYMBOLITEMCD,
		MPD.PRODUCT_NM,
		TTS.LOT1,
		TTS.SYMBOLLOT4,
		TTS.SYMBOLLOT3,
		TTS.SYMBOLPRINTERNO,
		TTS.SYMBOLPRODUCTMARK,
		TTS.STOCK_TYPE_CD,
		TTS.CASEITFNO,
		TTS.CASEBARCODEVALIANT,
		TTS.CASELOT4,
		TTS.CASECENTERNO,
		TTS.CASEPACKNO,
		TTS.CASEPACKTIME,
		TTC.FROMADDRESS1,
		TTC.CARRIERNAME,
		TTC.CARRIERWBNO,
		TTC.CARRIERNO,
		TTC.CARRIERSNAME,
		TTS.MIXEDFLG,
		TTS.MAKERCASENO,
		TTS.RESTQTY,
		MPD.UNIT1,
		MPD.UNIT2,
		MCE.CENTER_CD,
		MCE.CENTER_NM,
		MCL.CLIENT_CD,
		MCL.CLIENT_NM
		
	FROM	T_TRSYMBOL						TTS				--段ボール情報
			INNER	JOIN	M_LOCATION				MLC				--ロケーションマスタ
			ON		MLC.LOCATION_ID			=		TTS.LOCATION_ID 
			AND		MLC.DEL_FLG				=		'0'
		
			LEFT	JOIN	T_TRSYMBOLTRACE			TTST			--段ボール追跡情報
			ON		TTST.TRSYMBOL_ID		=		TTS.TRSYMBOL_ID 
			AND		TTST.TRACETYPE			=		'03' 
			AND		TTST.DEL_FLG			=		'0' 
		
			INNER	JOIN	M_CUSTOMER				MCU				--取引先マスタ
			ON		MCU.CLIENT_ID			=		TTST.CLIENT_ID 
			AND		MCU.CUSTOMER_CD			=		TTST.CUSTOMERCD 
			AND		MCU.DEL_FLG				=		'0'
		
			LEFT	JOIN	T_TRRCV					TTC				--入庫予定
			ON		TTC.RECEIVE_PLAN_H_ID	=		TTS.RECEIVE_PLAN_H_ID
			AND		TTC.DEL_FLG				=		'0'
		
			INNER	JOIN	M_PRODUCT				MPD				--銘柄マスタ
			ON		MPD.CLIENT_ID			=		TTS.CLIENT_ID
			AND		(
						MPD.PRODUCT_CD		=		'00' + TTS.SYMBOLITEMCD 
						OR	MPD.PRODUCT_CD		=		TTS.SYMBOLITEMCD
					)
			AND		MPD.ITEM_ADMIN = '0001'
			AND		MPD.DEL_FLG = '0'
		
			INNER	JOIN	M_STOCK_TYPE			MST				--在庫区分マスタ
			ON		MST.STOCK_TYPE_CD		=		TTS.STOCK_TYPE_CD
			AND		MST.DEL_FLG				=		'0'
		
			INNER	JOIN	M_CENTER				MCE				--拠点マスタ
			ON		MCE.CENTER_ID			=		TTS.CENTER_ID
			AND		MCE.DEL_FLG				=		'0'
		
			INNER	JOIN	M_CLIENT				MCL				--荷主マスタ
			ON		MCL.CLIENT_ID			=		TTS.CLIENT_ID
			AND		MCL.DEL_FLG				=		'0'
		
			WHERE	
					TTS.CENTER_ID			=		/*pmb.centerId*/1
			AND		TTS.CLIENT_ID			=		/*pmb.clientId*/1
			AND		TTS.DEL_FLG				=		'0'
			/*IF pmb.createDateTimeFrom != null*/
			AND		TTST.CREATEDATETIME		>=		/*pmb.createDateTimeFrom*/'20230201'
			/*END*/
			/*IF pmb.createDateTimeTo != null*/
			AND		TTST.CREATEDATETIME		<=		/*pmb.createDateTimeTo*/'20230201'
			/*END*/
			/*IF pmb.makerCaseNoFrom != null*/
			AND		TTS.MAKERCASENO			>=		/*pmb.makerCaseNoFrom*/'11111'
			/*END*/
			/*IF pmb.makerCaseNoTo != null*/
			AND		TTS.MAKERCASENO			<=		/*pmb.makerCaseNoTo*/'1111111'
			/*END*/
			/*IF pmb.trsymbolId != null*/
			AND		TTS.SYMBOLLINENO		LIKE	/*pmb.trsymbolId*/'11111%'
			/*END*/
			/*IF pmb.receiveDate != null*/
			AND		TTC.RECEIVEDATE			=		/*pmb.receiveDate*/'20220501'
			/*END*/
			/*IF pmb.shipDate != null*/
			AND		TTST.SHIPDATE			=		/*pmb.shipDate*/'20220501'
			/*END*/
			/*IF pmb.ItemCd != null*/
			AND		(
						'00' + TTS.SYMBOLITEMCD		LIKE	/*pmb.ItemCd*/'11111%'
					OR	TTS.SYMBOLITEMCD			LIKE	/*pmb.ItemCd*/'11111%'
				)
			/*END*/
			/*IF pmb.lot1 != null*/
			AND		TTS.LOT1				LIKE	/*pmb.lot1*/'11111%'
			/*END*/
			/*IF pmb.lot4 != null*/
			AND		TTS.LOT4				=		/*pmb.lot4*/'20220501'
			/*END*/
			/*IF pmb.symbolMakeNoFrom != null*/
			AND		TTS.SYMBOLMAKENO		>=		/*pmb.symbolMakeNoFrom*/'11111'
			/*END*/
			/*IF pmb.symbolMakeNoTo != null*/
			AND		TTS.SYMBOLMAKENO		<=		/*pmb.symbolMakeNoTo*/'1111111'
			/*END*/
			/*IF pmb.lot3 != null*/
			AND		TTS.LOT3				=		/*pmb.lot3*/'1111'
			/*END*/
			/*IF pmb.caseItfNo != null*/
			AND		TTS.CASEITFNO			LIKE	/*pmb.caseItfNo*/'11111%'
			/*END*/
			/*IF pmb.carrierNo != null*/
			AND		TTC.CARRIERNO			LIKE	/*pmb.carrierNo*/'11111%'
			/*END*/
	) AS MOVE

	GROUP BY 
		TRSYMBOL_ID, 			--段ボール情報ID
		DESTINATIONCD, 			--受入先CD
		SHIPDATE				--出庫実績日

) AS TOTAL

	/*IF pmb.isPaging()*/
	ORDER BY 
		TRSYMBOL_ID, 			--段ボール情報ID
		RECEIVE_DATE, 			--入庫実績日・時刻
		SYMBOL_ITEM_CD, 		--二次元コードの銘柄CD
		LOT1					--商社搬入番号
	/*END*/

/*
 [df:title]
  配車実績入力(一覧)一覧リスト検索。

 [df:description]
 配車実績入力(一覧)リストを検索する。

*/

-- #df:entity#
-- !!Long centerId!!
-- !!Long clientId!!

-- !df:pmb extends Paging!
-- !!AutoDetect!!

WITH	M_CORG_TMP	AS	
(
SELECT
	 MCR.CENTER_CD	AS		ORGID--拠点CD
	,MCG.ORGNMKJ	AS		ORGNMKJ--組織名略称(TSN)(全角)

FROM

					M_CORG				MCG--組織(仕分)マスタ

INNER		JOIN	M_CENTER					MCR--拠点マスタ
ON					MCR.CENTER_ID	=	MCG.CENTER_ID
AND					MCR.DEL_FLG		=	'0'
WHERE
		(
		MCG.ZZABLYMD			IS		NULL
		OR
		MCG.ZZABLYMD			>		/*pmb.systemDt*/'20230203'
		)
AND		MCG.ZZFRDATEH		<=		/*pmb.systemDt*/'20230203'
AND		MCG.ZZTODATEH		>=		/*pmb.systemDt*/'20230203'
AND		MCG.DEL_FLG			=		'0'
)


/*IF pmb.tdrelayid != null*/
/*IF pmb.isPaging()*/
SELECT	 
	 TC.TDRELAYID		AS		SUPPLIERR_CV_FLG_CD--TD中継区分CD
	,TC.STCD			AS		SHIP_CD--発送先CD
	,TC.SNNO1			AS		SUPPLIERR_CV_NO1--発送番号(1)
	,TC.SNNO2			AS		SUPPLIERR_CV_NO2--発送番号(2)
	,TC.SNNO3			AS		SUPPLIERR_CV_NO--発送番号(3)
	,TC.SNYMD			AS		SHIPMENT_DT--発送日
	,TC.ARVYMD			AS		ARRIVAL_DT--到着日
	,DICT2.DICT_NM		AS		PLANNED_CAR--計画車種
	,DICT3.DICT_NM		AS		ACHIEVED_CAR--実績車種
	,TC.TRANNM			AS		TRANSPORTATION_CO--運輸業者名
	,TC.CARNO			AS		CAR_NO--号車No.
	,TC.SELNO1			AS		SEAL_NO1--封印No.(1)
	,TC.SELNO2			AS		SEAL_NO2--封印No.(2)
	,TC.SELNO3			AS		SEAL_NO3--封印No.(3)
	,TC.CCOPAM_ID--配車実績ID
	,TC.VERSION_NO--バージョンNo.
	,MCT.CENTER_CD--拠点CD
	,MCT.CENTER_NM--拠点名称
	,MC.CLIENT_CD--荷主CD
	,MC.CLIENT_NM--荷主名称
	,DICT.DICT_NM		AS		SUPPLIERR_CV_FLG--TD中継区分

/*IF pmb.tdrelayid != null*/
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	NULL
			ELSE	TC.GNLPLTQA		END		AS		GENERIC_PALLET_NO--汎用パレット数
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	NULL
			ELSE	TC.OTPLTQA		END		AS		OTHER_PALLET_NO--その他パレット数
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	NULL
			ELSE	ISNULL(TC.GNLPLTQA,0)	+	ISNULL(TC.OTPLTQA,0)	END		AS	RCV_SUM_QTY1_PALLET--合計パレット数
			
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	ISNULL(TC.GNLPLTQA,0)
			ELSE	NULL	END		AS	NO--個数
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	ISNULL(TC.GNLPLTQA,0)	+	ISNULL(TC.OTPLTQA,0)
			ELSE	NULL	END		AS	SUM--合計数
/*END*/
/*IF pmb.tdrelayid == null*/
	,TC.GNLPLTQA											AS		GENERIC_PALLET_NO--汎用パレット数
	,TC.OTPLTQA												AS		OTHER_PALLET_NO--その他パレット数
	,(ISNULL(TC.GNLPLTQA,0)	+	ISNULL(TC.OTPLTQA,0))		AS	RCV_SUM_QTY1_PALLET--合計パレット数
	,NULL													AS	NO--個数
	,NULL													AS	SUM--合計数
/*END*/

/*IF pmb.tdrelayid == '1'*/
	,MCS.RLYBSSNM		AS		LANDING--発送先名称
/*END*/
/*IF pmb.tdrelayid == '0'*/
	,MCG2.ORGNMKJ		AS		LANDING--発送先名称
/*END*/
/*IF pmb.tdrelayid == '2'*/
	,MCG.ORGNMKJ		AS		LANDING--発送先名称
/*END*/

-- ELSE select count(*)
/*END*/
FROM
					T_CCOPAM				TC--配車実績
  INNER	JOIN		M_CENTER					MCT--拠点マスタ
  		ON			MCT.CENTER_ID		=		TC.CENTER_ID
  		AND			MCT.DEL_FLG			=		'0'
  INNER	JOIN		M_CLIENT					MC--荷主マスタ
  		ON			MC.CLIENT_ID		=		TC.CLIENT_ID
  		AND			MC.DEL_FLG			=		'0'
/*IF pmb.tdrelayid == '1'*/
  LEFT OUTER JOIN		M_CRELAYBS					MCS--中継拠点マスタ
  		ON			MCS.RLYBSCD		=		TC.STCD
		AND		(
				MCS.DELYMD			IS		NULL
				OR
				MCS.DELYMD			>		/*pmb.systemDt*/'20230203'
				)
		AND		MCS.ZZFRDATEH		<=		/*pmb.systemDt*/'20230203'
		AND		MCS.ZZTODATEH		>=		/*pmb.systemDt*/'20230203'
  		AND		MCS.DEL_FLG			=		'0'
/*END*/

/*IF pmb.tdrelayid == '0'*/
  LEFT OUTER JOIN		M_CORG_TMP					MCG2--組織(仕分)マスタ
  		ON			MCG2.ORGID		=		TC.STCD
/*END*/

/*IF pmb.tdrelayid == '2'*/
  LEFT OUTER JOIN		M_CORG_TMP					MCG--組織(仕分)マスタ
  		ON			MCG.ORGID		=		TC.STCD
/*END*/

  LEFT	OUTER	JOIN	B_CLASS					BCS
	   ON			BCS.CLASS_CD		=		'TRANSKBN'
      AND			BCS.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD
	   ON			BCD.CLASS_ID		=		BCS.CLASS_ID
      AND			BCD.CLASS_DTL_CD	=		TC.TDRELAYID
      AND			BCD.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT
	   ON			DICT.DICT_ID		=		BCD.DICT_ID
      AND			DICT.DEL_FLG		=		'0'

  LEFT	OUTER	JOIN	B_CLASS					BCS2
	   ON			BCS2.CLASS_CD		=		'CARKND'
      AND			BCS2.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD2
	   ON			BCD2.CLASS_ID		=		BCS2.CLASS_ID
      AND			BCD2.CLASS_DTL_CD	=		TC.PLNCARKND
      AND			BCD2.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT2
	   ON			DICT2.DICT_ID		=		BCD2.DICT_ID
      AND			DICT2.DEL_FLG		=		'0'

  LEFT	OUTER	JOIN	B_CLASS					BCS3
	   ON			BCS3.CLASS_CD		=		'CARKND'
      AND			BCS3.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD3
	   ON			BCD3.CLASS_ID		=		BCS3.CLASS_ID
      AND			BCD3.CLASS_DTL_CD	=		TC.AMCARKND
      AND			BCD3.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT3
	   ON			DICT3.DICT_ID		=		BCD3.DICT_ID
      AND			DICT3.DEL_FLG		=		'0'

WHERE
		TC.CENTER_ID		=		/*pmb.centerId*/1
AND		TC.CLIENT_ID		=		/*pmb.clientId*/1
/*IF pmb.tdrelayid != null*/
AND		TC.TDRELAYID		=		/*pmb.tdrelayid*/'a123'
/*END*/
/*IF pmb.stcd != null*/
AND		TC.STCD				=		/*pmb.stcd*/'a123'
/*END*/
/*IF pmb.snno3 != null*/
AND		TC.SNNO3			LIKE	/*pmb.snno3*/'a123%'
/*END*/
AND		TC.DEL_FLG			=		'0'
/*END*/

/*IF pmb.tdrelayid != null*/
/*IF pmb.isPaging()*/
ORDER BY
	TC.SNNO3	DESC
/*END*/
/*END*/






/*IF pmb.tdrelayid == null*/
/*IF pmb.isPaging()*/
SELECT	 
	 TC.TDRELAYID		AS		SUPPLIERR_CV_FLG_CD--TD中継区分CD
	,TC.STCD			AS		SHIP_CD--発送先CD
	,TC.SNNO1			AS		SUPPLIERR_CV_NO1--発送番号(1)
	,TC.SNNO2			AS		SUPPLIERR_CV_NO2--発送番号(2)
	,TC.SNNO3			AS		SUPPLIERR_CV_NO--発送番号(3)
	,TC.SNYMD			AS		SHIPMENT_DT--発送日
	,TC.ARVYMD			AS		ARRIVAL_DT--到着日
	,DICT2.DICT_NM		AS		PLANNED_CAR--計画車種
	,DICT3.DICT_NM		AS		ACHIEVED_CAR--実績車種
	,TC.TRANNM			AS		TRANSPORTATION_CO--運輸業者名
	,TC.CARNO			AS		CAR_NO--号車No.
	,TC.SELNO1			AS		SEAL_NO1--封印No.(1)
	,TC.SELNO2			AS		SEAL_NO2--封印No.(2)
	,TC.SELNO3			AS		SEAL_NO3--封印No.(3)
	,TC.CCOPAM_ID--配車実績ID
	,TC.VERSION_NO--バージョンNo.
	,MCT.CENTER_CD--拠点CD
	,MCT.CENTER_NM--拠点名称
	,MC.CLIENT_CD--荷主CD
	,MC.CLIENT_NM--荷主名称
	,DICT.DICT_NM		AS		SUPPLIERR_CV_FLG--TD中継区分

/*IF pmb.tdrelayid != null*/
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	NULL
			ELSE	TC.GNLPLTQA		END		AS		GENERIC_PALLET_NO--汎用パレット数
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	NULL
			ELSE	TC.OTPLTQA		END		AS		OTHER_PALLET_NO--その他パレット数
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	NULL
			ELSE	ISNULL(TC.GNLPLTQA,0)	+	ISNULL(TC.OTPLTQA,0)	END		AS	RCV_SUM_QTY1_PALLET--合計パレット数
			
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	ISNULL(TC.GNLPLTQA,0)
			ELSE	NULL	END		AS	NO--個数
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	ISNULL(TC.GNLPLTQA,0)	+	ISNULL(TC.OTPLTQA,0)
			ELSE	NULL	END		AS	SUM--合計数
/*END*/
/*IF pmb.tdrelayid == null*/
	,TC.GNLPLTQA											AS		GENERIC_PALLET_NO--汎用パレット数
	,TC.OTPLTQA												AS		OTHER_PALLET_NO--その他パレット数
	,(ISNULL(TC.GNLPLTQA,0)	+	ISNULL(TC.OTPLTQA,0))		AS	RCV_SUM_QTY1_PALLET--合計パレット数
	,NULL													AS	NO--個数
	,NULL													AS	SUM--合計数
/*END*/

	,MCS.RLYBSSNM		AS		LANDING--発送先名称

FROM
					T_CCOPAM				TC--配車実績
  INNER	JOIN		M_CENTER					MCT--拠点マスタ
  		ON			MCT.CENTER_ID		=		TC.CENTER_ID
  		AND			MCT.DEL_FLG			=		'0'
  INNER	JOIN		M_CLIENT					MC--荷主マスタ
  		ON			MC.CLIENT_ID		=		TC.CLIENT_ID
  		AND			MC.DEL_FLG			=		'0'

  LEFT OUTER JOIN		M_CRELAYBS					MCS--中継拠点マスタ
  		ON			MCS.RLYBSCD		=		TC.STCD
		AND		(
				MCS.DELYMD			IS		NULL
				OR
				MCS.DELYMD			>		/*pmb.systemDt*/'20230203'
				)
		AND		MCS.ZZFRDATEH		<=		/*pmb.systemDt*/'20230203'
		AND		MCS.ZZTODATEH		>=		/*pmb.systemDt*/'20230203'
  		AND		MCS.DEL_FLG			=		'0'

  LEFT	OUTER	JOIN	B_CLASS					BCS
	   ON			BCS.CLASS_CD		=		'TRANSKBN'
      AND			BCS.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD
	   ON			BCD.CLASS_ID		=		BCS.CLASS_ID
      AND			BCD.CLASS_DTL_CD	=		TC.TDRELAYID
      AND			BCD.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT
	   ON			DICT.DICT_ID		=		BCD.DICT_ID
      AND			DICT.DEL_FLG		=		'0'

  LEFT	OUTER	JOIN	B_CLASS					BCS2
	   ON			BCS2.CLASS_CD		=		'CARKND'
      AND			BCS2.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD2
	   ON			BCD2.CLASS_ID		=		BCS2.CLASS_ID
      AND			BCD2.CLASS_DTL_CD	=		TC.PLNCARKND
      AND			BCD2.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT2
	   ON			DICT2.DICT_ID		=		BCD2.DICT_ID
      AND			DICT2.DEL_FLG		=		'0'

  LEFT	OUTER	JOIN	B_CLASS					BCS3
	   ON			BCS3.CLASS_CD		=		'CARKND'
      AND			BCS3.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD3
	   ON			BCD3.CLASS_ID		=		BCS3.CLASS_ID
      AND			BCD3.CLASS_DTL_CD	=		TC.AMCARKND
      AND			BCD3.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT3
	   ON			DICT3.DICT_ID		=		BCD3.DICT_ID
      AND			DICT3.DEL_FLG		=		'0'

WHERE
		TC.CENTER_ID		=		/*pmb.centerId*/1
AND		TC.CLIENT_ID		=		/*pmb.clientId*/1

AND		TC.TDRELAYID		=		'1'

/*IF pmb.stcd != null*/
AND		TC.STCD				=		/*pmb.stcd*/'a123'
/*END*/
/*IF pmb.snno3 != null*/
AND		TC.SNNO3			LIKE	/*pmb.snno3*/'a123%'
/*END*/
AND		TC.DEL_FLG			=		'0'

UNION	ALL

(
SELECT	 
	 TC.TDRELAYID		AS		SUPPLIERR_CV_FLG_CD--TD中継区分CD
	,TC.STCD			AS		SHIP_CD--発送先CD
	,TC.SNNO1			AS		SUPPLIERR_CV_NO1--発送番号(1)
	,TC.SNNO2			AS		SUPPLIERR_CV_NO2--発送番号(2)
	,TC.SNNO3			AS		SUPPLIERR_CV_NO--発送番号(3)
	,TC.SNYMD			AS		SHIPMENT_DT--発送日
	,TC.ARVYMD			AS		ARRIVAL_DT--到着日
	,DICT2.DICT_NM		AS		PLANNED_CAR--計画車種
	,DICT3.DICT_NM		AS		ACHIEVED_CAR--実績車種
	,TC.TRANNM			AS		TRANSPORTATION_CO--運輸業者名
	,TC.CARNO			AS		CAR_NO--号車No.
	,TC.SELNO1			AS		SEAL_NO1--封印No.(1)
	,TC.SELNO2			AS		SEAL_NO2--封印No.(2)
	,TC.SELNO3			AS		SEAL_NO3--封印No.(3)
	,TC.CCOPAM_ID--配車実績ID
	,TC.VERSION_NO--バージョンNo.
	,MCT.CENTER_CD--拠点CD
	,MCT.CENTER_NM--拠点名称
	,MC.CLIENT_CD--荷主CD
	,MC.CLIENT_NM--荷主名称
	,DICT.DICT_NM		AS		SUPPLIERR_CV_FLG--TD中継区分

/*IF pmb.tdrelayid != null*/
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	NULL
			ELSE	TC.GNLPLTQA		END		AS		GENERIC_PALLET_NO--汎用パレット数
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	NULL
			ELSE	TC.OTPLTQA		END		AS		OTHER_PALLET_NO--その他パレット数
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	NULL
			ELSE	ISNULL(TC.GNLPLTQA,0)	+	ISNULL(TC.OTPLTQA,0)	END		AS	RCV_SUM_QTY1_PALLET--合計パレット数
			
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	ISNULL(TC.GNLPLTQA,0)
			ELSE	NULL	END		AS	NO--個数
	,CASE WHEN 		TC.TDRELAYID = '2'	THEN	ISNULL(TC.GNLPLTQA,0)	+	ISNULL(TC.OTPLTQA,0)
			ELSE	NULL	END		AS	SUM--合計数
/*END*/
/*IF pmb.tdrelayid == null*/
	,TC.GNLPLTQA											AS		GENERIC_PALLET_NO--汎用パレット数
	,TC.OTPLTQA												AS		OTHER_PALLET_NO--その他パレット数
	,(ISNULL(TC.GNLPLTQA,0)	+	ISNULL(TC.OTPLTQA,0))		AS	RCV_SUM_QTY1_PALLET--合計パレット数
	,NULL													AS	NO--個数
	,NULL													AS	SUM--合計数
/*END*/

	,MCG.ORGNMKJ		AS		LANDING--発送先名称

FROM
					T_CCOPAM				TC--配車実績
  INNER	JOIN		M_CENTER					MCT--拠点マスタ
  		ON			MCT.CENTER_ID		=		TC.CENTER_ID
  		AND			MCT.DEL_FLG			=		'0'
  INNER	JOIN		M_CLIENT					MC--荷主マスタ
  		ON			MC.CLIENT_ID		=		TC.CLIENT_ID
  		AND			MC.DEL_FLG			=		'0'

  LEFT OUTER JOIN		
(SELECT
	 MCR.CENTER_CD	AS		ORGID--拠点CD
	,MCG.ORGNMKJ	AS		ORGNMKJ--組織名略称(TSN)(全角)

FROM

					M_CORG				MCG--組織(仕分)マスタ

INNER		JOIN	M_CENTER					MCR--拠点マスタ
ON					MCR.CENTER_ID	=	MCG.CENTER_ID
AND					MCR.DEL_FLG		=	'0'
WHERE
		(
		MCG.ZZABLYMD			IS		NULL
		OR
		MCG.ZZABLYMD			>		/*pmb.systemDt*/'20230203'
		)
AND		MCG.ZZFRDATEH		<=		/*pmb.systemDt*/'20230203'
AND		MCG.ZZTODATEH		>=		/*pmb.systemDt*/'20230203'
AND		MCG.DEL_FLG			=		'0')					MCG--組織(仕分)マスタ
  		ON			MCG.ORGID		=		TC.STCD


  LEFT	OUTER	JOIN	B_CLASS					BCS
	   ON			BCS.CLASS_CD		=		'TRANSKBN'
      AND			BCS.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD
	   ON			BCD.CLASS_ID		=		BCS.CLASS_ID
      AND			BCD.CLASS_DTL_CD	=		TC.TDRELAYID
      AND			BCD.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT
	   ON			DICT.DICT_ID		=		BCD.DICT_ID
      AND			DICT.DEL_FLG		=		'0'

  LEFT	OUTER	JOIN	B_CLASS					BCS2
	   ON			BCS2.CLASS_CD		=		'CARKND'
      AND			BCS2.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD2
	   ON			BCD2.CLASS_ID		=		BCS2.CLASS_ID
      AND			BCD2.CLASS_DTL_CD	=		TC.PLNCARKND
      AND			BCD2.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT2
	   ON			DICT2.DICT_ID		=		BCD2.DICT_ID
      AND			DICT2.DEL_FLG		=		'0'

  LEFT	OUTER	JOIN	B_CLASS					BCS3
	   ON			BCS3.CLASS_CD		=		'CARKND'
      AND			BCS3.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD3
	   ON			BCD3.CLASS_ID		=		BCS3.CLASS_ID
      AND			BCD3.CLASS_DTL_CD	=		TC.AMCARKND
      AND			BCD3.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT3
	   ON			DICT3.DICT_ID		=		BCD3.DICT_ID
      AND			DICT3.DEL_FLG		=		'0'

WHERE
		TC.CENTER_ID		=		/*pmb.centerId*/1
AND		TC.CLIENT_ID		=		/*pmb.clientId*/1

AND		TC.TDRELAYID		=		'0'

/*IF pmb.stcd != null*/
AND		TC.STCD				=		/*pmb.stcd*/'a123'
/*END*/
/*IF pmb.snno3 != null*/
AND		TC.SNNO3			LIKE	/*pmb.snno3*/'a123%'
/*END*/
AND		TC.DEL_FLG			=		'0'

)
ORDER BY
	TC.SNNO3	DESC
/*END*/


/*IF !pmb.isPaging()*/
select count(*)

FROM
					T_CCOPAM				TC--配車実績
  INNER	JOIN		M_CENTER					MCT--拠点マスタ
  		ON			MCT.CENTER_ID		=		TC.CENTER_ID
  		AND			MCT.DEL_FLG			=		'0'
  INNER	JOIN		M_CLIENT					MC--荷主マスタ
  		ON			MC.CLIENT_ID		=		TC.CLIENT_ID
  		AND			MC.DEL_FLG			=		'0'

WHERE
		TC.CENTER_ID		=		/*pmb.centerId*/1
AND		TC.CLIENT_ID		=		/*pmb.clientId*/1

AND		(TC.TDRELAYID		=		'1'	OR	TC.TDRELAYID		=		'0')

/*IF pmb.stcd != null*/
AND		TC.STCD				=		/*pmb.stcd*/'a123'
/*END*/
/*IF pmb.snno3 != null*/
AND		TC.SNNO3			LIKE	/*pmb.snno3*/'a123%'
/*END*/
AND		TC.DEL_FLG			=		'0'
/*END*/
/*END*/








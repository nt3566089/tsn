/*
[df:title]
配車実績検索します。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long controlNo!!

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

SELECT
	 TCM.TDRELAYID		AS		DELIVERY_CLASS_CD--TD中継区分CD
	,TCM.STCD			AS		SHIP_CD--発送先CD
	,TCM.SNNO1			AS		SN_NO1--発送番号(1)
	,TCM.SNNO2			AS		SN_NO2--発送番号(2)
	,TCM.SNNO3			AS		SN_NO3--発送番号(3)
	,TCM.SNYMD			AS		SN_Y_M_D--発送日
	,TCM.ARVYMD			AS		ARV_Y_M_D--到着日
	,TCM.PLNCARKND		AS		PLN_CAR_KND--計画車種
	,TCM.AMCARKND		AS		AM_CAR_KND--実績車種
	,TCM.TRANNM			AS		CARRIER_NM--運輸業者名
	,TCM.CARNO			AS		CAR_NO--号車No.
	,TCM.SELNO1			AS		SEAL_NO1--封印No.(1)
	,TCM.SELNO2			AS		SEAL_NO2--封印No.(2)
	,TCM.SELNO3			AS		SEAL_NO3--封印No.(3)
	,TCM.CCOPAM_ID--配車実績ID
	,DICT.DICT_NM		AS		DELIVERY_CLASS--TD中継区分
/*IF pmb.tdrelayid == '1'*/
	,MCS.RLYBSSNM		AS		SHIP_NM--発送先名称
/*END*/
/*IF pmb.tdrelayid == '0'*/
	,MCG2.ORGNMKJ		AS		SHIP_NM--発送先名称
/*END*/
/*IF pmb.tdrelayid == '2'*/
	,MCG.ORGNMKJ		AS		SHIP_NM--発送先名称
/*END*/

/*IF pmb.tdrelayid != null*/
	,CASE WHEN 		TCM.TDRELAYID = '2'	THEN	NULL
			ELSE	TCM.GNLPLTQA		END		AS		GN_PLT_QA--汎用パレット数
	,CASE WHEN 		TCM.TDRELAYID = '2'	THEN	NULL
			ELSE	TCM.OTPLTQA		END		AS		OT_PLT_QA--その他パレット数
	,CASE WHEN 		TCM.TDRELAYID = '2'	THEN	NULL
			ELSE	ISNULL(TCM.GNLPLTQA,0)	+	ISNULL(TCM.OTPLTQA,0)	END		AS	RCV_SUM_QTY1_PALLET--合計パレット数
			
	,CASE WHEN 		TCM.TDRELAYID = '2'	THEN	ISNULL(TCM.GNLPLTQA,0)
			ELSE	NULL	END		AS	NO--個数
	,CASE WHEN 		TCM.TDRELAYID = '2'	THEN	ISNULL(TCM.GNLPLTQA,0)	+	ISNULL(TCM.OTPLTQA,0)
			ELSE	NULL	END		AS	SUM--合計数
/*END*/
/*IF pmb.tdrelayid == null*/
	,TCM.GNLPLTQA											AS		GN_PLT_QA--汎用パレット数
	,TCM.OTPLTQA											AS		OT_PLT_QA--その他パレット数
	,(ISNULL(TCM.GNLPLTQA,0)	+	ISNULL(TCM.OTPLTQA,0))	AS	RCV_SUM_QTY1_PALLET--合計パレット数
	,NULL													AS	NO--個数
	,NULL													AS	SUM--合計数
/*END*/

FROM			T_CCOPAM							   TCM--配車実績

/*IF pmb.tdrelayid == '1'*/
  LEFT	OUTER	JOIN	M_CRELAYBS					MCS--中継拠点マスタ
  		ON			MCS.RLYBSCD		=		TCM.STCD
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
  LEFT	OUTER	JOIN	M_CORG_TMP					MCG2--組織(仕分)マスタ
  		ON			MCG2.ORGID		=		TCM.STCD
/*END*/

/*IF pmb.tdrelayid == '2'*/
  LEFT	OUTER	JOIN	M_CORG_TMP					MCG--組織(仕分)マスタ
  		ON			MCG.ORGID		=		TCM.STCD
/*END*/

  LEFT	OUTER	JOIN	B_CLASS					BCS
	   ON			BCS.CLASS_CD		=		'TRANSKBN'
      AND			BCS.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_CLASS_DTL				BCD
	   ON			BCD.CLASS_ID		=		BCS.CLASS_ID
      AND			BCD.CLASS_DTL_CD	=		TCM.TDRELAYID
      AND			BCD.DEL_FLG			=		'0'
  LEFT	OUTER	JOIN	B_DICT					DICT
	   ON			DICT.DICT_ID		=		BCD.DICT_ID
      AND			DICT.DEL_FLG		=		'0'

-- 検索条件
WHERE	TCM.CONTROL_NO			=	/*pmb.controlNo*/1
AND		TCM.DEL_FLG				=	'0'

ORDER	BY
	TCM.SNNO3		DESC

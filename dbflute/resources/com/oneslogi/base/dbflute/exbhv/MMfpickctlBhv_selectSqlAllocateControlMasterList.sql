/*
 [df:title]
 引当制御マスタメンテナンスを取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String VALIDTYPE
-- ##String VALIDTYPE_NM##
-- ##String PICKRANK1_NM##
-- ##String PICKRANK2_NM##
-- ##String PICKRANK3_NM##
-- ##String PICKRANK4_NM##
-- ##String PICKRANK5_NM##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long clientId!!
/*IF pmb.isPaging()*/

SELECT	
		MMP.MFPICKCTL_ID,
		MPD.PRODUCT_CD,
		MPD.PRODUCT_NM,
		MMP.PICKFRDATE,
		MMP.PICKTODATE,
		MMP.VALIDTYPE,
		null as VALIDTYPE_NM,
		MMP.PICKRANK1,
		null as PICKRANK1_NM,
		MMP.PICKRANK2,
		null as PICKRANK2_NM,
		MMP.PICKRANK3,
		null as PICKRANK3_NM,
		MMP.PICKRANK4,
		null as PICKRANK4_NM,
		MMP.PICKRANK5,
		null as PICKRANK5_NM,
		MMP.UPD_DT,
		MMP.UPD_USER,
		MCL.CLIENT_CD,
		MCL.CLIENT_NM,
		MCL.CLIENT_ID,
		MCE.CENTER_CD,
		MCE.CENTER_NM,
		MMP.MFPICKCTL_ID,
		MMP.VERSION_NO
		
		
-- ELSE SELECT COUNT(*)
/*END*/
FROM			M_MFPICKCTL							MMP--引当制御マスタリスト

LEFT	JOIN	M_PRODUCT							MPD--銘柄マスタ
		ON		MPD.CLIENT_ID				=		MMP.CLIENT_ID
		AND		MPD.PRODUCT_CD				=		MMP.PRODUCT_CD
		AND		MPD.DEL_FLG					=		'0'
	
LEFT	JOIN	M_CLIENT							MCL--荷主マスタ
		ON		MCL.CLIENT_ID				=		MMP.CLIENT_ID
		AND		MCL.DEL_FLG					=		'0'
		
LEFT	JOIN	B_USER								BUS--ユーザマスタ
		ON		BUS.USER_CD					=		MMP.UPD_USER
		AND		BUS.DEL_FLG					=		'0'		
		
LEFT	JOIN	M_CENTER							MCE--拠点マスタ
		ON		MCE.CENTER_CD				=		MMP.CLIENT_ID
		AND		MCE.DEL_FLG					=		'0'	

WHERE	MMP.CLIENT_ID		=		/*pmb.clientId*/1
	/*IF pmb.productCd != null*/
		AND		MPD.PRODUCT_CD		LIKE		/*pmb.productCd*/'PD%'
	/*END*/
	/*IF pmb.pickfrdateFrom != null*/
		AND		MMP.PICKFRDATE		>=		/*pmb.pickfrdateFrom*/'20000301'
	/*END*/
	/*IF pmb.pickfrdateTo != null*/
		AND		MMP.PICKFRDATE		<=		/*pmb.pickfrdateTo*/'20240331'
	/*END*/
	/*IF pmb.picktodateFrom != null*/
		AND		MMP.PICKTODATE		>=		/*pmb.picktodateFrom*/'20000401'
	/*END*/
	/*IF pmb.picktodateTo != null*/
		AND		MMP.PICKTODATE		<=		/*pmb.picktodateTo*/'20240430'
	/*END*/
 	/*IF pmb.designflg != null*/
	    AND		(
				MMP.PICKRANK1			 = 		/*pmb.designflg*/'00'
		
		OR	    MMP.PICKRANK2 			 = 		/*pmb.designflg*/'00'
		
		OR 		MMP.PICKRANK3 			 = 		/*pmb.designflg*/'00'
		
		OR 		MMP.PICKRANK4 			 = 		/*pmb.designflg*/'00'
		
		OR 		MMP.PICKRANK5            = 		/*pmb.designflg*/'00'
		)
 	/*END*/
	/*IF pmb.validtype != null*/
		AND		MMP.VALIDTYPE		=		/*pmb.validtype*/'0'
	/*END*/
		AND		MMP.DEL_FLG			=		'0'
	

/*IF pmb.isPaging()*/
ORDER	BY
		MPD.USERNUM1		    ASC,
		MPD.USERNUM2		    ASC,
		MMP.PICKFRDATE			ASC
/*END*/


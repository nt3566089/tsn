/*
 [df:title]
 引当制御マスタメンテナンスを取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String VALIDTYPE
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long mfpickctlId!!
-- !!Long centerId!!
SELECT	
		MMP.MFPICKCTL_ID,
		MPD.PRODUCT_CD,
		MPD.PRODUCT_NM,
		MMP.PICKFRDATE,
		MMP.PICKTODATE,
		MMP.VALIDTYPE,
		MMP.PICKRANK1,
		MMP.PICKRANK2,
		MMP.PICKRANK3,
		MMP.PICKRANK4,
		MMP.PICKRANK5,
		MMP.UPD_DT,
		MMP.UPD_USER,
		MCL.CLIENT_CD,
		MCL.CLIENT_ID,
		MCE.CENTER_CD,
		MCE.CENTER_ID,
		MMP.MFPICKCTL_ID,
		MMP.VERSION_NO,
		MMP.DEL_FLG
	
		
		
FROM			M_MFPICKCTL							MMP--引当制御マスタ

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

WHERE			MMP.MFPICKCTL_ID		=		/*pmb.mfpickctlId*/1
AND				MMP.DEL_FLG				=		'0'
	


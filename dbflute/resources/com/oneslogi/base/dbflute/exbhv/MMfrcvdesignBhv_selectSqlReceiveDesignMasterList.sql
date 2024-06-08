/*
[df:title]
受入デザインマスタメンテナンス一覧を取得します。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String PRODUCT_CD##
-- ##String PRODUCT_NM##
-- ##String DISTRIBUTIONCD##
-- ##String VALID_TYPE_NM##
-- ##String DISTRIBUTION_CD_NM##
-- ##String DESIGN_FLG_NM##
-- ##String DEL_FLG_NM##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long clientId!!
/*IF pmb.isPaging()*/
SELECT	MFR.MFRCVDESIGN_ID,
		PRO.PRODUCT_CD,
		PRO.PRODUCT_NM,
		MFR.RCVFRDATE,
		MFR.RCVTODATE,
		MFR.VALIDTYPE,
		NULL		AS		VALID_TYPE_NM,
		MFR.DISTRIBUTIONCD,
		NULL		AS		DISTRIBUTION_CD_NM,
		MFR.DESIGNFLG,
		NULL		AS		DESIGN_FLG_NM,
		MFR.DEL_FLG,
		NULL		AS		DEL_FLG_NM,
		MFR.ADD_DT,
		MFR.ADD_USER,
		MFR.UPD_DT,
		MFR.UPD_USER,
		PRO.USERNUM3
-- ELSE SELECT COUNT(*)
/*END*/		
FROM	M_MFRCVDESIGN			MFR

LEFT	JOIN	M_PRODUCT					PRO
		ON		MFR.PRODUCT_ID			=		PRO.PRODUCT_ID
		AND		PRO.DEL_FLG				=		'0'

-- 検索条件
WHERE	MFR.CLIENT_ID			=		/*pmb.clientId*/1
	/*IF pmb.productCd != null*/
	AND		PRO.PRODUCT_CD		LIKE	/*pmb.productCd*/'PD%'
	/*END*/		
	/*IF pmb.validType != null*/
	AND		MFR.VALIDTYPE		=	/*pmb.validType*/'1'
	/*END*/		
	/*IF pmb.upDate != null*/
	AND 	CONVERT(DATE,MFR.UPD_DT)	= /*pmb.upDate*/'20240324'
	/*END*/	
	/*IF pmb.rcvfrDateFrom != null*/
	AND		MFR.RCVFRDATE		>=		/*pmb.rcvfrDateFrom*/'0'
	/*END*/
	/*IF pmb.rcvfrDateTo != null*/
	AND		MFR.RCVFRDATE		<=		/*pmb.rcvfrDateTo*/'0'
	/*END*/
	/*IF pmb.rcvtoDateFrom != null*/
	AND		MFR.RCVTODATE		>=		/*pmb.rcvtoDateFrom*/'0'
	/*END*/
	/*IF pmb.rcvtoDateTo != null*/
	AND		MFR.RCVTODATE		<=		/*pmb.rcvtoDateTo*/'0'
	/*END*/	
/*IF pmb.isPaging()*/
ORDER	BY
		MFR.DEL_FLG		ASC,
		PRO.USERNUM3	ASC,
		PRO.PRODUCT_CD	ASC,
		MFR.RCVFRDATE	ASC
/*END*/

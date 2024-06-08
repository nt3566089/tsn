/*
 [df:title]
 仕分場構成マスタリストを取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String DEL_FLG_NM##
-- ##String HDRDBOXRSFID_NM##
-- ##String SPRPRSID_NM##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
/*IF pmb.isPaging()*/
SELECT	LIN.LINCD,
		LIN.LINNM,
		LIN.LINBLK1,
		LIN.LINBLK2,
		LIN.LINBLK3,
		LIN.HDRDBOXRSFID,
		NULL				AS		HDRDBOXRSFID_NM,
	  
		LIN.PKGRT,
		LIN.SPRPRSID,
		NULL				AS		SPRPRSID_NM,
		LIN.DEL_FLG,
		NULL				AS		DEL_FLG_NM
-- ELSE SELECT COUNT(*)
/*END*/
FROM	M_CLIN						LIN
LEFT	JOIN	M_CENTER			CTR
		ON		LIN.CENTER_ID		=		CTR.CENTER_ID
		AND		CTR.DEL_FLG 		=		'0'

WHERE	LIN.CENTER_ID	=	/*pmb.centerId*/1


	/*IF pmb.delFlg != null*/
		AND		LIN.DEL_FLG		= /*pmb.delFlg*/'0'
	/*END*/
    
/*IF pmb.isPaging()*/
ORDER	BY
		LINCD	ASC
/*END*/

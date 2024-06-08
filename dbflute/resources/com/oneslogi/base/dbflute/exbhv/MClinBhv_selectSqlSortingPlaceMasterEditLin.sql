/*
 [df:title]
 仕分場構成マスタリストを取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
SELECT	LIN.LINCD,
		LIN.LINNM,
		LIN.LINBLK1,
		LIN.LINBLK2,
		LIN.LINBLK3,
		LIN.HDRDBOXRSFID,	  
		LIN.PKGRT,
		LIN.SPRPRSID,
		LIN.DEL_FLG,
		LIN.CLIN_ID,
		LIN.VERSION_NO,
		LIN.CENTER_ID

FROM	M_CLIN						LIN

WHERE	LIN.CENTER_ID	=	/*pmb.centerId*/1
AND		LIN.LINCD		=	/*pmb.lincd*/'0'



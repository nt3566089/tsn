/*
 [df:title]
 ロケーションマスタ受信一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
SELECT	LOC.LOCATION_ID

FROM	M_LOCATION				LOC				--ロケーションマスタ
INNER	JOIN	M_PRODUCT		PRD				--銘柄マスタ
		ON		LOC.REPLENISH_PRODUCT_ID	=	PRD.PRODUCT_ID
		AND		PRD.DEL_FLG					=	'0'

INNER	JOIN	M_CLIN			LIN				--ラインマスタ
		ON		LOC.CENTER_ID	=	LIN.CENTER_ID
		AND		LOC.LINBLK		=	LIN.LINCD

WHERE	LIN.CENTER_ID		=	/*pmb.centerId*/1

AND		(
			LIN.LINBLK1		=	/*pmb.linblk*/'X'
		OR	LIN.LINBLK2		=	/*pmb.linblk*/'X'
		OR	LIN.LINBLK3		=	/*pmb.linblk*/'X'
		)

AND		PRD.CLIENT_ID		=	/*pmb.clientId*/1
AND		PRD.PRODUCT_CD		=	/*pmb.productCd*/'X'
AND		LIN.DEL_FLG			=	'0'


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
SELECT	MLC.REPLENISH_PRODUCT_ID
FROM	(
/*IF pmb.lincd != null*/
			SELECT	MLC.REPLENISH_PRODUCT_ID
			FROM	M_LOCATION						MLC
			WHERE	MLC.CENTER_ID	=	/*pmb.centerId*/1
			AND		MLC.LINBLK		=	/*pmb.lincd*/'L1'
			AND		MLC.REPLENISH_PRODUCT_ID	IS	NOT	NULL
/*END*/
			
/*IF pmb.blkcd1 != null*/
			UNION	ALL
			
			SELECT	MLC.REPLENISH_PRODUCT_ID
			FROM	M_LOCATION						MLC
			WHERE	MLC.CENTER_ID	=	/*pmb.centerId*/1
			AND		MLC.LINBLK		=	/*pmb.blkcd1*/'B1'
			AND		MLC.REPLENISH_PRODUCT_ID	IS	NOT	NULL
/*END*/

/*IF pmb.blkcd2 != null*/
			UNION	ALL
			
			SELECT	MLC.REPLENISH_PRODUCT_ID
			FROM	M_LOCATION						MLC
			WHERE	MLC.CENTER_ID	=	/*pmb.centerId*/1
			AND		MLC.LINBLK		=	/*pmb.blkcd2*/'B1'
			AND		MLC.REPLENISH_PRODUCT_ID	IS	NOT	NULL
/*END*/
			
/*IF pmb.blkcd3 != null*/
			UNION	ALL
			
			SELECT	MLC.REPLENISH_PRODUCT_ID
			FROM	M_LOCATION						MLC
			WHERE	MLC.CENTER_ID	=	/*pmb.centerId*/1
			AND		MLC.LINBLK		=	/*pmb.blkcd3*/'B1'
			AND		MLC.REPLENISH_PRODUCT_ID	IS	NOT	NULL
/*END*/
		)	MLC
GROUP	BY
		MLC.REPLENISH_PRODUCT_ID
HAVING	COUNT(MLC.REPLENISH_PRODUCT_ID)	>	1



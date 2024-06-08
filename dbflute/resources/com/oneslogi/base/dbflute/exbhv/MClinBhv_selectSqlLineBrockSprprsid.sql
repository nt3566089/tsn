/*
 [df:title]
 ラインマスタリストを取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String LOCIDFBRCTG##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
SELECT	LIN.LINCD
FROM	M_CLIN		LIN
INNER	JOIN		M_CBLK			BLK2
		ON			LIN.CENTER_ID	=	BLK2.CENTER_ID
		AND			LIN.LINBLK2		=	BLK2.BLKCD
		AND			BLK2.DEL_FLG	=	'0'

INNER	JOIN		M_CBLK			BLK3
		ON			LIN.CENTER_ID	=	BLK3.CENTER_ID
		AND			LIN.LINBLK3		=	BLK3.BLKCD
		AND			BLK3.DEL_FLG	=	'0'

WHERE	LIN.CENTER_ID	=	1
AND		LIN.LINBLK1		=	/*pmb.blkcd*/'B1' -- 紐づくラインマスタを指定

AND		BLK2.SPRPRSID	=	'1'
AND		BLK3.SPRPRSID	=	'1'

UNION	ALL

SELECT	LIN.LINCD
FROM	M_CLIN		LIN
INNER	JOIN		M_CBLK			BLK1
		ON			LIN.CENTER_ID	=	BLK1.CENTER_ID
		AND			LIN.LINBLK1		=	BLK1.BLKCD
		AND			BLK1.DEL_FLG	=	'0'

INNER	JOIN		M_CBLK			BLK3
		ON			LIN.CENTER_ID	=	BLK3.CENTER_ID
		AND			LIN.LINBLK3		=	BLK3.BLKCD
		AND			BLK3.DEL_FLG	=	'0'

WHERE	LIN.CENTER_ID	=	1
AND		LIN.LINBLK2		=	/*pmb.blkcd*/'B1' -- 紐づくラインマスタを指定

AND		BLK1.SPRPRSID	=	'1'
AND		BLK3.SPRPRSID	=	'1'


UNION	ALL

SELECT	LIN.LINCD
FROM	M_CLIN		LIN
INNER	JOIN		M_CBLK			BLK1
		ON			LIN.CENTER_ID	=	BLK1.CENTER_ID
		AND			LIN.LINBLK1		=	BLK1.BLKCD
		AND			BLK1.DEL_FLG	=	'0'

INNER	JOIN		M_CBLK			BLK2
		ON			LIN.CENTER_ID	=	BLK2.CENTER_ID
		AND			LIN.LINBLK2		=	BLK2.BLKCD
		AND			BLK2.DEL_FLG	=	'0'

WHERE	LIN.CENTER_ID	=	1
AND		LIN.LINBLK3		=	/*pmb.blkcd*/'B1' -- 紐づくラインマスタを指定

AND		BLK1.SPRPRSID	=	'1'
AND		BLK2.SPRPRSID	=	'1'


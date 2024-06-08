/*
 [df:title]
 仕分場構成マスタリストを取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String LOCIDFBRCTG##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
SELECT	BLK.CBLK_ID,
		BLK.BLKCD,
		BLK.BLKNM,
		BLK.LOCIDFRNK,
		BLK.VERSION_NO,
		BLK.LOCIDFBRCTG1,
		BLK.LOCIDFBRCTG2,
		BLK.LOCIDFBRCTG3,
		BLK.LOCIDFBRCTG4,
		BLK.LOCIDFBRCTG5,
		BLK.LOCIDFBRCTG6,
		BLK.LOCIDFBRCTG7,
		BLK.LOCIDFBRCTG8,
		BLK.LOCIDFBRCTG9,
		BLK.LOCIDFBRCTG10,
		BLK.HDRDBOXRSFID,
		BLK.PKGRT,
		BLK.SPRPRSID,
		BLK.DEL_FLG,
		BLK.CENTER_ID
		
FROM	M_CBLK						BLK

WHERE	BLK.CENTER_ID	=	/*pmb.centerId*/1
AND		BLK.BLKCD		=	/*pmb.blkcd*/'0'


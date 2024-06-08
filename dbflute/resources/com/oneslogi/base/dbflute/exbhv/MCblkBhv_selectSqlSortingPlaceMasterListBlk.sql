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
-- ##String LOCIDFRNK_NM##
-- ##String LOCIDFBRCTG##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
/*IF pmb.isPaging()*/
SELECT	BLK.BLKCD,
		BLK.BLKNM,
		BLK.LOCIDFRNK,
		NULL				AS		LOCIDFRNK_NM,
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
		NULL				AS		LOCIDFBRCTG,
		BLK.HDRDBOXRSFID,
		NULL				AS		HDRDBOXRSFID_NM,
		BLK.PKGRT,
		BLK.SPRPRSID,
		NULL				AS		SPRPRSID_NM,
		BLK.DEL_FLG,
		NULL				AS		DEL_FLG_NM
-- ELSE SELECT COUNT(*)
/*END*/
FROM	M_CBLK						BLK
LEFT	JOIN	M_CENTER			CTR
		ON		BLK.CENTER_ID		=		CTR.CENTER_ID
		AND		CTR.DEL_FLG 		=		'0'

WHERE	BLK.CENTER_ID	=	/*pmb.centerId*/1


	/*IF pmb.delFlg != null*/
		AND		BLK.DEL_FLG		= /*pmb.delFlg*/'0'
	/*END*/
    
/*IF pmb.isPaging()*/
ORDER	BY
		BLKCD	ASC
/*END*/

/*
[df:title]
梱包箱情報マスタメンテナンスを取得します。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String BOX_TYPE_NM##
-- ##String DEL_FLG_NM##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
/*IF pmb.isPaging()*/
SELECT	MBX.BOX_CD,
 		MBX.BOX_NM,
 		MBX.BOX_TYPE,
 		NULL as BOX_TYPE_NM,
 		MBX.BXWEIGHT,
 		MBX.BXOSZL,
 		MBX.BXOSZW,
 		MBX.BXOSZH,
 		MBX.LENGTH,
 		MBX.WIDTH,
 		MBX.HEIGHT,
 		CONVERT(FLOAT,(CEILING(MBX.LENGTH * MBX.WIDTH * MBX.HEIGHT)/1000))	AS 'BXCPY',
 		MBX.VOLUME_RATE,
 		MBX.DEL_FLG,
 		NULL as DEL_FLG_NM,
 		MBX.VERSION_NO,
		MBX.BOX_ID,
		MBX.CENTER_ID
		
-- ELSE SELECT COUNT(*)
/*END*/		
FROM	M_BOX							MBX

-- 検索条件
WHERE	MBX.CENTER_ID			=	/*pmb.centerId*/1
/*IF pmb.boxCd != null*/
	AND		MBX.BOX_CD		LIKE	/*pmb.boxCd*/'1%'
/*END*/

/*IF pmb.boxNm != null*/
	AND		MBX.BOX_NM		LIKE	/*pmb.boxNm*/'ダ%'
/*END*/

/*IF pmb.boxType != null*/
	AND		MBX.BOX_TYPE	=		/*pmb.boxType*/'x'
/*END*/

/*IF pmb.delFlg != null*/
	AND		MBX.DEL_FLG		=		/*pmb.delFlg*/'0'
/*END*/

/*IF pmb.isPaging()*/
ORDER	BY
		MBX.BOX_CD	ASC
/*END*/


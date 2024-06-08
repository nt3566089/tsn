/*
 [df:title]
 仕分場構成マスタリストを取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##String LOCIDFRNK_NM##
-- ##String LOCIDFBRCTG##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
/*IF pmb.isPaging()*/
SELECT	ZNE.LOCIDFRNK,
		NULL				AS		LOCIDFRNK_NM,
		ZNE.LOCIDFBRCTG1,
		ZNE.LOCIDFBRCTG2,
		ZNE.LOCIDFBRCTG3,
		ZNE.LOCIDFBRCTG4,
		ZNE.LOCIDFBRCTG5,
		ZNE.LOCIDFBRCTG6,
		ZNE.LOCIDFBRCTG7,
		ZNE.LOCIDFBRCTG8,
		ZNE.LOCIDFBRCTG9,
		ZNE.LOCIDFBRCTG10,
		NULL				AS		LOCIDFBRCTG
-- ELSE SELECT COUNT(*)
/*END*/
FROM	T_CSRWHADM						ZNE
LEFT	JOIN	M_CENTER			CTR
		ON		ZNE.CENTER_ID		=		CTR.CENTER_ID
		AND		CTR.DEL_FLG 		=		'0'

WHERE	ZNE.CENTER_ID	=	/*pmb.centerId*/1


	/*IF pmb.delFlg != null*/
		AND		ZNE.DEL_FLG		= /*pmb.delFlg*/'0'
	/*END*/
    

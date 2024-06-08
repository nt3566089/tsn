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
SELECT	SRW.LOCIDFRNK,
		NULL				AS		LOCIDFRNK_NM,
		SRW.LOCIDFBRCTG1,
		SRW.LOCIDFBRCTG2,
		SRW.LOCIDFBRCTG3,
		SRW.LOCIDFBRCTG4,
		SRW.LOCIDFBRCTG5,
		SRW.LOCIDFBRCTG6,
		SRW.LOCIDFBRCTG7,
		SRW.LOCIDFBRCTG8,
		SRW.LOCIDFBRCTG9,
		SRW.LOCIDFBRCTG10,
		NULL				AS		LOCIDFBRCTG
-- ELSE SELECT COUNT(*)
/*END*/
FROM	T_CSRWHADM					SRW
LEFT	JOIN	M_CENTER			CTR
		ON		SRW.CENTER_ID		=		CTR.CENTER_ID
		AND		CTR.DEL_FLG 		=		'0'

WHERE	SRW.CENTER_ID	=	/*pmb.centerId*/1


	/*IF pmb.delFlg != null*/
		AND		SRW.DEL_FLG		= /*pmb.delFlg*/'0'
	/*END*/
    

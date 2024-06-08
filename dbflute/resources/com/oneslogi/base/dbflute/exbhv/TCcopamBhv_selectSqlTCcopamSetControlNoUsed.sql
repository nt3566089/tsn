/*
[df:title]
配車実績検索します。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long ccopamId!!

SELECT 	 TCM.CCOPAM_ID
		,TCM.VERSION_NO

FROM			T_CCOPAM							   TCM--配車実績

-- 検索条件
WHERE	TCM.CCOPAM_ID			=	/*pmb.ccopamId*/1
AND		TCM.DEL_FLG				=	'0'

/*
 [df:title]
 引当制御マスタメンテナンスを取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- ##String VALIDTYPE
-- !!Long clientId!!

SELECT	MMP.MFPICKCTL_ID,
		MMP.PICKFRDATE,
		MMP.PICKTODATE,
		MMP.VALIDTYPE,
		MMP.VERSION_NO
		
FROM			M_MFPICKCTL							MMP--引当制御マスタ

INNER	JOIN	M_PRODUCT							MPD--銘柄マスタ
		ON		MPD.PRODUCT_CD				=		MMP.PRODUCT_CD
		AND		MPD.CLIENT_ID				=		MMP.CLIENT_ID
		AND		MPD.DEL_FLG					=		'0'


WHERE	MMP.CLIENT_ID		=		/*pmb.clientId*/1
AND		MPD.PRODUCT_CD		=		/*pmb.productCd*/'PD'
AND		MMP.PICKFRDATE		>		/*pmb.pickfrdate*/'20000301'
AND		MMP.DEL_FLG			=				'0'	

ORDER	BY
		MMP.PICKFRDATE		    ASC

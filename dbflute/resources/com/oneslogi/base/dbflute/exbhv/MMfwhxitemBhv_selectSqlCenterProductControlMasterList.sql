/*
 [df:title]
  拠点別銘柄制御データリストの取得
 [df:description]
  拠点別銘柄制御マスタのデータのリストを取得する
*/

-- #df:entity#
-- !df:pmb extends AutoPaging!
-- !!AutoDetect!!

/*IF pmb.isPaging()*/

SELECT
	MM.MFWH_ITEM_ID,
	MM.PRODUCT_CD,
	MP.PRODUCT_NM,
	MM.SLOTLOCNAME,
	MM.PICKLOCNAME,
	MM.UPD_DT,
	MM.UPD_USER,
	MMF.TRANSPORTPRIORITY,
	MP.USERNUM3,
	MP.USERNUM1
-- ELSE SELECT COUNT(*)
/*END*/

FROM M_MFWHxITEM MM
	INNER JOIN  M_PRODUCT MP -- 銘柄マスタ --
		ON MM.PRODUCT_ID = MP.PRODUCT_ID -- 商品ID --
			AND MM.DEL_FLG = '0'
	INNER JOIN M_CENTER MC -- 拠点マスタ --
		ON MM.CENTER_ID = MC.CENTER_ID -- 拠点ID --
			AND MM.DEL_FLG = '0'
	INNER JOIN M_MFCOMPANY MMF -- 組織マスタ --
		ON MC.CENTER_CD = MMF.COMPANY_CD -- 拠点CD、組織CD --

WHERE 1=1

/*IF pmb.centerId != null*/
AND MM.CENTER_ID = /*pmb.centerId*/11111111111
/*END*/

/*IF pmb.clientId != null*/
AND MM.CLIENT_ID = /*pmb.clientId*/11111111111
/*END*/

/*IF pmb.productCd != null*/
AND MM.PRODUCT_CD like /*pmb.productCd*/'a123%'
/*END*/

/*IF pmb.isPaging()*/
ORDER BY
	MMF.TRANSPORTPRIORITY, -- 出力順(組織) --
	MM.SLOTLOCNAME, -- 保管ロケ名称 --
	MM.PRODUCT_CD , -- 銘柄CD --
	MP.USERNUM1, -- 国産・輸入区分 --
	MP.USERNUM3 -- 一般出力順 --
/*END*/

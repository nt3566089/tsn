/*
[df:title]
方面別残数をリスト検索、方面別残数リストを取得する。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!

SELECT 
	MP.PRODUCT_ID, -- 商品ID
	TD.ZZMATNR,    -- 銘柄CD
	TD.LINBLK,     -- ライン／ブロック
	TD.LOCID,      -- ロケーションＮｏ.
	TD.SRRNK,      -- 仕分順
	TD.SROPRTCNT,  -- 仕分作業回数
	TD.DED,        -- 配達方面
	TD.PSTNID,     -- ピストン区分
	TD.ZQACP,      -- 残数　段ボール
	TD.ZQACTQA,    -- 残数　カートン数
	MP.UNIT1,      -- 1ケース当カートン数
	MP.UNIT2,      -- 1カートン当個数
	ML.LOCATION_ID -- ロケーションID
FROM			T_DRCDIZQA							   TD--方面別残数

INNER	JOIN	M_PRODUCT							MP--銘柄マスタ
		ON		MP.CLIENT_ID				=		TD.CLIENT_ID
		AND		MP.PRODUCT_CD				=		TD.ZZMATNR
		AND		MP.DEL_FLG					=		'0'

INNER	JOIN	M_LOCATION							ML--ロケーションマスタ
		ON		ML.LOCATION_CD				=		TD.LINBLK + '-' + TD.LOCID
		AND		ML.DEL_FLG					=		'0'

-- 検索条件
WHERE	TD.CENTER_ID			=	/*pmb.centerId*/1
AND		TD.CLIENT_ID			=	/*pmb.clientId*/1
AND		TD.LINBLK				=	/*pmb.lineBlock*/'L123'
AND		TD.DED					=	/*pmb.ded*/'A0'    -- 配達方面
AND		TD.PSTNID				=	/*pmb.pstnid*/'1'  -- ピストン区分
AND		TD.DEL_FLG				=	'0'

ORDER BY 
	TD.SRRNK,
	TD.DED,
	TD.PSTNID

/*
[df:title]
仕分一連処理確認します。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!

SELECT COUNT(*) AS STOCK_CNT

FROM			T_CSRWHADM							   TC--仕分拠点管理

-- 検索条件
WHERE	TC.CENTER_ID			=	/*pmb.centerId*/1
AND		TC.SRYMD				=   /*pmb.srymd*/'20140805'
AND		TC.SROPRTCNT			>	0
AND		TC.DEL_FLG				=	'0'

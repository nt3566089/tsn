/*
[df:title]
仕分拠点管理を単一検索、仕分日を取得します。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!

SELECT TC.SRYMD

FROM			T_CSRWHADM								TC--仕分拠点管理

-- 検索条件
WHERE	TC.CENTER_ID				=	/*pmb.centerId*/1
AND		TC.ZZORGNCD					=	/*pmb.zzorgnCd*/'3020'
AND		TC.DEL_FLG					=	'0'

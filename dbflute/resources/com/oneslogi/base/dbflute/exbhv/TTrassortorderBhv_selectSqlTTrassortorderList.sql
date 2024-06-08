/*
[df:title]
追跡情報(棚卸)をリスト検索、追跡情報(棚卸)を取得する。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!

SELECT 
TT.DIRECTIONORDERKEY,
TT.DIRECTIONORDERGNO,
TT.VERSION_NO
FROM T_TRASSORTORDER TT--追跡情報(棚卸)

-- 検索条件
WHERE TT.WAREHOUSECD = /*pmb.warehouseCd*/'W001'
AND   CONVERT(VARCHAR,TT.DIRECTIONORDERKEY) + ',' + CONVERT(VARCHAR, TT.DIRECTIONORDERGNO) IN /*pmb.tempInstNoList*/('1,1','1,2')
AND   TT.DEL_FLG = '0'

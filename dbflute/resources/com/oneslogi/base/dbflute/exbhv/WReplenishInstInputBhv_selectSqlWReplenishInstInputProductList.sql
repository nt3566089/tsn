/*
[df:title]
融通指示一括取込ワーク を検索するチェックします。

[df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
SELECT COUNT(*) AS COUNT_NUM
FROM
	W_REPLENISH_INST_INPUT WRII
INNER JOIN M_PRODUCT MP
	ON MP.CLIENT_ID = /*pmb.clientId*/1111111111111
	AND MP.PRODUCT_CD = WRII.ITEM_CD
	AND MP.DEL_FLG = '0'
WHERE WRII.RECEIVE_CD = /*pmb.receiveCd*/'000000001'
	AND WRII.CENTER_CD = /*pmb.centerCd*/'11111'
	AND WRII.CLIENT_CD = /*pmb.clientCd*/'11111'
	AND WRII.FLEXLNS_NO = /*pmb.flexlnsNo*/'11111'
	AND MP.USERNUM1 != /*pmb.userNum1*/1111111111111
	AND WRII.DEL_FLG = '0'

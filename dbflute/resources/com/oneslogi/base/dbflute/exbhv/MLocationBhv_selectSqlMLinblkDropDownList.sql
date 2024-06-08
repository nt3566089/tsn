/*
 [df:title]
 ロケーションマスタ受信一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##Long PICKING_ORDER##
-- ##String CLIENT_CD##
-- ##String LocGroupNm##
-- ##String ALLOC_NG_FLG_NM##
-- ##String DEL_FLG_NM##
-- ##String LIN_OR_BLOCK##
-- ##String LOCKBN_NM##
-- ##String REPLENISHMENT_ROUNDEDUP__UNIT_NM##
-- ##String TOSPLMD_NM##
-- ##String PRESPLMD_NM##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long centerId!!
-- !!Long clientId!!
/*IF pmb.isPaging()*/
SELECT	 LINBLK

		
-- ELSE SELECT COUNT(*)
/*END*/

FROM	M_LOCATION	MLC--ロケーションマスタ



WHERE

--		CLI.CLIENT_ID		=		1
		MLC.CENTER_ID		=		1

/*END*/

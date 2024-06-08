/*
 [df:title]
 ロケーションマスタ受信一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- ##Long PICKING_ORDER##
-- ##String CLIENT_CD##
-- ##String LOCID_NM##
-- ##String SPLREVUN_NM##
-- !df:pmb extends Paging!
-- !!AutoDetect!!
-- !!Long clientId!!
-- !!Long centerId!!
WITH	BOWL_SHA AS	(
			SELECT	SGD.SHAPE_GRP_DTL_ID									--①荷姿グループ明細ID
			FROM	M_SHAPE_GRP					SGR							--①荷姿グループマスタ
			INNER	JOIN	M_SHAPE_GRP_DTL		SGD							--②荷姿グループ明細マスタ
					ON		SGR.SHAPE_GRP_ID	=		SGD.SHAPE_GRP_ID	--荷姿グループID
			INNER	JOIN	M_SHAPE				SHA							--③荷姿マスタ
					ON		SGD.SHAPE_ID		=		SHA.SHAPE_ID		--荷姿ID
			WHERE	SHA.SHAPE_CD				=		'BOWL'				--③荷姿CD=BOWL
		),
		CASE_SHA AS	(
			SELECT	SGD.SHAPE_GRP_DTL_ID
			FROM	M_SHAPE_GRP					SGR
			INNER	JOIN	M_SHAPE_GRP_DTL		SGD
					ON		SGR.SHAPE_GRP_ID	=		SGD.SHAPE_GRP_ID
			INNER	JOIN	M_SHAPE				SHA
					ON		SGD.SHAPE_ID		=		SHA.SHAPE_ID
			WHERE	SHA.SHAPE_CD				=		'CASE'
		)


SELECT	CASE
			WHEN	MLI.LINNM	IS	NULL	THEN
				MBL.BLKNM
			ELSE
				MLI.LINNM
			END											AS	LIN_BLK,

 			CEN.CENTER_NM								AS	SORT_CENTER,
			RIGHT 	(MLC.LOCATION_CD,5)					AS	LOCATION_CD,

 			PRD.PRODUCT_CD								AS	PRODUCT_CD,
	 		PRD.PRODUCT_NM								AS	PRODUCT_NM,

			FLOOR(
				FLOOR(
					STK.CHARGE_NUM /
						(
							CASE
								WHEN	ISNULL(SHP_BOWL.UNIT_NUM,0)	=	0	THEN
									1
								ELSE
										SHP_BOWL.UNIT_NUM
							END
						)
						/
						(
							CASE
								WHEN	ISNULL(SHP_CASE.UNIT_NUM,0)	=	0	THEN
									1
								ELSE
										SHP_CASE.UNIT_NUM
							END
						)
						
					)
			)											AS	STOCK_BOX,
			FLOOR(
					(STK.CHARGE_NUM %
						((
							CASE
								WHEN	ISNULL(SHP_BOWL.UNIT_NUM,0)	=	0	THEN
									1
								ELSE
									SHP_BOWL.UNIT_NUM
								END
						)
						*
						(
							CASE
								WHEN	ISNULL(SHP_CASE.UNIT_NUM,0)	=	0	THEN
									1
								ELSE
										SHP_CASE.UNIT_NUM
							END
						))
					)
					/
					(
						CASE
							WHEN	ISNULL(SHP_BOWL.UNIT_NUM,0)	=	0	THEN
								1
							ELSE
								SHP_BOWL.UNIT_NUM
						END
					)
			)											AS	STOCK_CARTON,
			MLC.LOCID,
			NULL										AS	LOCID_NM,

			CTG.BRCTG									AS	BRCTG,		--銘柄カテゴリ
	 		MLC.TOSPLMD									AS	TOSPLMD,	--当日補充方式
			MLC.PRESPLMD								AS	PRESPLMD,	--事前補充方式
			MLC.SPLREVUN,												--補充切り上げ単位
			NULL										AS	SPLREVUN_NM,
		
			MLC.SPLREVCTQA								AS	SPLREVCTQA,
			MLC.REPLENISH_P_NUM							AS	REPLENISH_P_NUM,
			MLC.BSSPLPT									AS	BSSPLPT,	--基本補充量

			FLOOR	(ROUND(MLC.REPLENISH_P_NUM	*	CTG.TOSPLMGN,	0))				AS	TO_REPLENISH_P_NUM,
			FLOOR	(ROUND(MLC.BSSPLPT			*	CTG.TOSPLMGN,	0))				AS	TO_REPLENISH_P_QTY,
			FLOOR	(ROUND(MLC.REPLENISH_P_NUM	*	CTG.PRESPLMGN,	0))				AS	PRE_REPLENISH_P_NUM,
			FLOOR	(ROUND(MLC.BSSPLPT			*	CTG.PRESPLMGN,	0))				AS	PRE_REPLENISH_P_QTY,
			FORMAT	(GETDATE()	,'yyyy/MM/dd HH:mm:ss')								AS	CREATEDATE



FROM	M_LOCATION	MLC--①ロケーションマスタ
--LEFT	JOIN	M_LOCATION_SUB				MLS--②ロケーションマスタサブ
--		ON		MLS.LOCATION_ID				=	MLC.LOCATION_ID
--		AND		MLS.DEL_FLG					=		'0'

LEFT	JOIN	T_STOCK						STK--⑧在庫マスタ
		ON		STK.LOCATION_ID			=		MLC.LOCATION_ID
		AND		STK.DEL_FLG					=		'0'

LEFT	JOIN	M_PRODUCT					PRD--③銘柄マスタ
		ON		PRD.PRODUCT_ID				=	STK.PRODUCT_ID
		AND		PRD.DEL_FLG					=		'0'

--LEFT	JOIN	M_PRODUCT_SUB				PRS--④銘柄マスタサブ
--		ON		PRS.PRODUCT_ID				=	PRD.PRODUCT_ID
--		AND		PRS.DEL_FLG					=		'0'

-- -- TODO:★確認
LEFT	JOIN	M_CLIN						MLI--⑤ラインマスタ
		ON		MLI.CENTER_ID				=		MLC.CENTER_ID
		AND		MLI.LINCD					=		MLC.LINBLK
		AND		MLI.DEL_FLG					=		'0'

LEFT	JOIN	M_CBLK						MBL--⑥ブロックマスタ
		ON		MBL.CENTER_ID				=		MLC.CENTER_ID
		AND		MBL.BLKCD					=		MLC.LINBLK
		AND		MBL.DEL_FLG					=		'0'

LEFT	JOIN	M_CBRCTG					CTG--⑦銘柄カテゴリマスタ
-- ★★結合条件不足では？
		ON		CTG.BRCTG					=		PRD.BRCTG
		AND		CTG.DEL_FLG					=		'0'

LEFT	JOIN	M_PRODUCT_SHAPE				SHP_BOWL--⑨商品荷姿マスタ
		ON		SHP_BOWL.PRODUCT_ID				=	PRD.PRODUCT_ID						--③⑨
		AND		EXISTS	(
					SELECT	'X'
					FROM	BOWL_SHA
					WHERE	SHP_BOWL.SHAPE_GRP_DTL_ID	=	BOWL_SHA.SHAPE_GRP_DTL_ID	--荷姿グループ明細ID
				)
		AND		SHP_BOWL.DEL_FLG					=		'0'


LEFT	JOIN	M_PRODUCT_SHAPE				SHP_CASE--⑩商品荷姿マスタ
		ON		SHP_CASE.PRODUCT_ID				=	PRD.PRODUCT_ID
		AND		EXISTS	(
					SELECT	'X'
					FROM	CASE_SHA
					WHERE	SHP_CASE.SHAPE_GRP_DTL_ID	=	CASE_SHA.SHAPE_GRP_DTL_ID
				)
		AND		SHP_CASE.DEL_FLG					=		'0'

LEFT	JOIN	M_CENTER					CEN--⑰拠点マスタ
		ON		CEN.CENTER_ID				=	MLC.CENTER_ID
		AND		CEN.DEL_FLG					=		'0'

WHERE	MLC.CENTER_ID		=		/*pmb.centerId*/1

-- AND		STK.CLIENT_ID		=		1

/*IF pmb.locGroup != null*/
	AND		MLC.LocGroup		=		/*pmb.locGroup*/'06'
/*END*/

/*IF pmb.locationCd != null*/
	AND		MLC.LOCATION_CD		LIKE	/*pmb.locationCd*/'A%'
/*END*/

/*IF pmb.delFlg != null*/
	AND		MLC.DEL_FLG			=	/*pmb.delFlg*/'0'
/*END*/



ORDER	BY

		MLC.LOCATION_CD				ASC


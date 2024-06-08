/*
 [df:title]
 出庫パレット情報照会一覧データ取得

 [df:description]
  出庫パレット情報照会一覧データを取得します。

*/

-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!

SELECT
       TRS.STS                                                                   -- 出荷ステータス
	  ,TPS.SOPALLETNO                                                            -- パレット番号
      ,TRS.SHIPSCHDATE                                                           -- 出庫予定日
	  ,TRS.OWNERORDERNO                                                          -- 車割キー
	  ,CASE WHEN TRS.POSTNO = '1' AND SUB1.CNT_ORDERTYPE != 1 THEN '00'
	    WHEN TRS.POSTNO = '1' AND SUB1.CNT_ORDERTYPE = 1 THEN TRD.OTHERLOT2
		ELSE TRS.ORDERTYPE
	    END AS ORDERTYPE                                                        -- 依頼種別
	  ,CASE WHEN TRS.POSTNO = '1' AND SUB2.CNT_CUSTORDERNO != 1 THEN ' '
	    WHEN TRS.POSTNO = '1' AND SUB2.CNT_CUSTORDERNO = 1 THEN TRD.OTHERLOT4
		ELSE TRS.CUSTORDERNO
	    END AS CUSTORDERNO                                                      -- 依頼番号
	  ,TRS.RMANO                                                                -- 問合せ番号
	  ,CASE WHEN TRS.POSTNO = '1' AND SUB3.CNT_OWNERSONO != 1 THEN ' '
	    WHEN TRS.POSTNO = '1' AND SUB3.CNT_OWNERSONO = 1 THEN TRD.OTHERLOT3
		ELSE TRS.OWNERSONO
	    END AS OWNERSONO                                                       -- 整理番号
	  ,TRS.SHIPDATE                                                            -- 出庫実績日
	  ,SUM(TPS.SORTEDQTY1 + MP.UNIT1 + MP.UNIT2) AS ExpectQty1Style1           -- 積付合計数量（ケース）
	  ,SUM(TPS.SORTEDQTY1 * MP.UNIT1 * MP.UNIT2) AS ExpectQty1Style2           -- 積付合計数量（カートン）
	  ,CASE WHEN TRS.FAX1 = '3' THEN TRS.CUSTOMER_CD
	    ELSE TRS.SHIPTOCD
	    END AS SHIPTOCD                                                        -- 受入先CD
	  ,CASE WHEN TRS.FAX1 = '3' THEN MC.CUSTOMER_NM
	    ELSE TRS.DELIVNAME
	    END AS SHIPTONAME                                                      -- 受入先名称
	  ,TRS.OTHERREFNO1                                                         -- 輸送形態
	  ,TPS.PALLETKEY                                                           -- パレット積付キー
	  ,TRS.SOID                                                                -- 出庫予定ID
  FROM T_TRSO TRS -- 出庫予定
    INNER JOIN T_TRSODETAIL TRD -- 出庫予定明細
	  ON TRD.SOID = TRS.SOID
      AND TRD.DEL_FLG = '0'
	INNER JOIN T_TRPALLETSYMBOL TPS -- パレット個体情報
	  ON TPS.SOID = TRD.SOID
	  AND TPS.SODETAILID = TRD.SODETAILID
      AND TPS.DEL_FLG = '0'
	INNER JOIN M_PRODUCT MP -- 銘柄マスタ
	  ON MP.PRODUCT_ID = TRD.PRODUCT_ID
      AND MP.DEL_FLG = '0'
    LEFT JOIN M_CUSTOMER MC  -- 取引先マスタ
      ON TRS.CLIENT_ID = MC.CLIENT_ID
      AND TRS.CUSTOMER_CD = MC.CUSTOMER_CD
      AND MC.DEL_FLG = '0'
	LEFT JOIN (
	SELECT
       TPS.PALLETKEY AS PALLETKEY                                     -- パレット積付キー
	  ,COUNT(distinct OTHERLOT2) AS CNT_ORDERTYPE                     -- 依頼種別
      FROM T_TRSODETAIL TRD -- 出庫予定明細
	  INNER JOIN T_TRPALLETSYMBOL TPS -- パレット個体情報
	    ON TPS.SOID = TRD.SOID
	    AND TPS.SODETAILID = TRD.SODETAILID
        AND TPS.DEL_FLG = '0'
      WHERE TRD.DEL_FLG = '0'
      GROUP BY TPS.PALLETKEY
	) SUB1 -- 副問合せ1
	  ON TPS.PALLETKEY = SUB1.PALLETKEY
	LEFT JOIN (
	SELECT
       TPS.PALLETKEY AS PALLETKEY                                     -- パレット積付キー
	  ,COUNT(distinct OTHERLOT4) AS CNT_CUSTORDERNO                     -- 依頼番号
      FROM T_TRSODETAIL TRD -- 出庫予定明細
	  INNER JOIN T_TRPALLETSYMBOL TPS -- パレット個体情報
	    ON TPS.SOID = TRD.SOID
	    AND TPS.SODETAILID = TRD.SODETAILID
        AND TPS.DEL_FLG = '0'
      WHERE TRD.DEL_FLG = '0'
      GROUP BY TPS.PALLETKEY
	) SUB2 -- 副問合せ2
	  ON TPS.PALLETKEY = SUB2.PALLETKEY
	LEFT JOIN (
	SELECT
       TPS.PALLETKEY AS PALLETKEY                                     -- パレット積付キー
	  ,COUNT(distinct OTHERLOT3) AS CNT_OWNERSONO                     -- 整理番号
      FROM T_TRSODETAIL TRD -- 出庫予定明細
	  INNER JOIN T_TRPALLETSYMBOL TPS -- パレット個体情報
	    ON TPS.SOID = TRD.SOID
	    AND TPS.SODETAILID = TRD.SODETAILID
        AND TPS.DEL_FLG = '0'
      WHERE TRD.DEL_FLG = '0'
      GROUP BY TPS.PALLETKEY
	) SUB3 -- 副問合せ3
	  ON TPS.PALLETKEY = SUB3.PALLETKEY
  WHERE TRS.CENTER_ID = /*pmb.centerId*/11111111111
    AND TRS.CLIENT_ID = /*pmb.clientId*/11111111111
    /*IF pmb.shipSchDtFrom != null*/
    AND TRS.SHIPSCHDATE >= /*pmb.shipSchDtFrom*/'20240311'
    /*END*/
    /*IF pmb.shipSchDtTo != null*/
    AND TRS.SHIPSCHDATE <= /*pmb.shipSchDtTo*/'20240312'
    /*END*/
    /*IF pmb.ownerOrderNo != null*/
    AND TRS.OWNERORDERNO LIKE /*pmb.ownerOrderNo*/'123%'
    /*END*/
    /*IF pmb.requestType != null*/
    AND TRD.OTHERLOT2 = /*pmb.requestType*/'1'
    /*END*/
    /*IF pmb.custorderNo != null*/
    AND TRD.OTHERLOT4 LIKE /*pmb.custorderNo*/'123%'
    /*END*/
    /*IF pmb.rmaNo != null*/
    AND TRS.RMANO LIKE /*pmb.rmaNo*/'123%'
    /*END*/
    /*IF pmb.refNo != null*/
    AND TRD.OTHERLOT3 LIKE /*pmb.refNo*/'a123%'
    /*END*/
    /*IF pmb.soPalletNo != null*/
    AND TPS.SOPALLETNO LIKE /*pmb.soPalletNo*/'123%'
    /*END*/
    /*IF pmb.status != null*/
    AND TRS.STS = /*pmb.status*/'1'
    /*END*/
    /*IF pmb.shipToCd != null*/
    AND TRS.SHIPTOCD LIKE /*pmb.shipToCd*/'123%'
    /*END*/
    /*IF pmb.customerCd != null*/
    AND TRS.CUSTOMER_CD LIKE /*pmb.customerCd*/'123%'
    /*END*/
    AND TRS.DEL_FLG = '0'
  GROUP BY
    TRS.STS
   ,TPS.SOPALLETNO
   ,TRS.SHIPSCHDATE
   ,TRS.OWNERORDERNO
   ,ORDERTYPE
   ,CUSTORDERNO
   ,TRS.RMANO
   ,TRS.OWNERSONO
   ,TRS.SHIPDATE
   ,TPS.SORTEDQTY1
   ,MP.UNIT1
   ,MP.UNIT2
   ,SHIPTOCD
   ,TRS.OTHERREFNO1
   ,TPS.PALLETKEY
   ,TRS.SOID
   ,TRD.OTHERLOT2
   ,TRS.POSTNO
   ,CNT_ORDERTYPE
   ,OTHERLOT3
   ,CNT_CUSTORDERNO
   ,OTHERLOT4
   ,CNT_OWNERSONO
   ,TRS.CUSTOMER_CD
   ,TRS.FAX1
   ,TRS.DELIVNAME
   ,MC.CUSTOMER_NM
  ORDER BY
    SHIPSCHDATE ASC
   ,SOPALLETNO ASC


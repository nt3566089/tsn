/*
 [df:title]
  統合在庫実績ワークをリスト検索

 [df:description]
   統合在庫実績ワークをリスト検索
*/

-- #df:entity#

-- !df:pmb!
-- !!Long clientId!!
-- !!Long centerId!!
-- !!String invDt!!
-- !!String systemDt!!
-- !!AutoDetect!!
SELECT
    SUB1.CENTER_ID,											--拠点ID
    SUB1.CLIENT_ID,											--荷主ID
    SUB1.INOUTKBN,											--内外区分
    SUB1.PRODUCT_ID,										--商品ID
    SUB1.SYSINVTOTALINV,									--システム適品在庫計
    SUB1.SYSINVKEEPLOCINV,									--システム保管場在庫
    SUB1.SYSINVRECEIVELOCINV,								--システム引取場在庫
    SUB1.SYSINVDAMAGEITEM,									--システムかし品在庫
    SUB1.SYSINVCLSSIFYLOCINV,								--システム仕分場在庫
    SUB1.SYSINVTMPLOCINV,									--システム仕分済在庫
    SUB1.SYSINVAUTOINV,										--システム自動在庫
    SUB1.INVESTTOTALINV,									--調査適品在庫計
    SUB1.INVESTKEEPLOCINV,									--調査保管場在庫
    SUB1.INVESTRECEIVELOCINV,								--調査引取場在庫
    SUB1.INVESTDAMAGEITEM,									--調査かし品在庫
    SUB1.INVESTCLSSIFYLOCINV,								--調査仕分場在庫
    SUB1.INVESTTMPLOCINV,									--調査仕分済在庫
    SUB1.INVESTAUTOINV,										--調査自動在庫
    SUB1.TDAYEQYTOTALINV,									--過不足当日適品在庫計
    SUB1.TDAYEQYKEEPLOCINV,									--過不足当日保管場在庫
    SUB1.TDAYEQYRECEIVELOCINV,								--過不足当日引取場在庫
    SUB1.TDAYEQYDAMAGEITEM,									--過不足当日かし品在庫
    SUB1.TDAYEQYCLSSIFYLOCINV,								--過不足当日仕分場在庫
    (
     SUB2.KEEPLOCDIFFQTY+
     SUB2.RECEIVELOCDIFFQTY+
     SUB2.DAMAGETMPDIFFQTY+
     SUB2.CLSSIFYLOCDIFFQTY
    ) AS YDAYTLEQULYTOTALINV,								--過不足統計適品在庫計
    SUB2.KEEPLOCDIFFQTY AS YDAYTLEQULYKEEPLOCINV,			--過不足統計保管場在庫
    SUB2.RECEIVELOCDIFFQTY AS YDAYTLEQULYRECEIVELOCINV,		--過不足統計引取場在庫
    SUB2.DAMAGETMPDIFFQTY AS YDAYTLEQULYDAMAGEITEM,			--過不足統計かし品在庫
    SUB2.CLSSIFYLOCDIFFQTY AS YDAYTLEQULYCLSSIFYLOCINV,		--過不足統計仕分場在庫
    MP.PRODUCT_CD,											--商品CD
    MP.USERNUM4												--CAP銘柄区分
FROM
(
	SELECT
			CENTER_ID,										--拠点ID
			CLIENT_ID,										--荷主ID
			INOUTKBN,										--内外区分
			PRODUCT_ID,										--商品ID
			SUM(
					CASE WHEN TAG_TYPE = '99'
										THEN QTY1 + QTY3
							 ELSE 0
					END          
			) AS SYSINVTOTALINV, 							--システム適品在庫計
			SUM(
					CASE WHEN TAG_TYPE = '00'
										THEN QTY1
							 ELSE 0       
					END 
			) AS SYSINVKEEPLOCINV,							--システム保管場在庫
			SUM(
					CASE WHEN TAG_TYPE = '04'
										THEN QTY1
							 ELSE 0
					END           
			) AS SYSINVRECEIVELOCINV,						--システム引取場在庫
			SUM(
					CASE WHEN TAG_TYPE = '99'
										THEN QTY3
							 ELSE 0
					END
			) AS SYSINVDAMAGEITEM,							--システムかし品在庫
			SUM(
					CASE WHEN TAG_TYPE = '03'
										THEN QTY1
							 ELSE 0
					END
			) AS SYSINVCLSSIFYLOCINV,						--システム仕分場在庫
			SUM(
					CASE WHEN TAG_TYPE = '07'
										THEN QTY1
							 ELSE 0
					END
			) AS SYSINVTMPLOCINV,    						--システム仕分済在庫
			SUM(
					CASE WHEN TAG_TYPE = '08'
										THEN QTY1
							 ELSE 0
					END
			) AS SYSINVAUTOINV,   							--システム自動在庫
			SUM(
					CASE WHEN TAG_TYPE = '07'
										THEN QTY1
							 ELSE 0
					END
					+
					CASE WHEN TAG_TYPE = '08'
										THEN QTY1
							 ELSE 0
					END 
					+
					CASE WHEN TAG_TYPE = '00'
										THEN QTY2
							 ELSE 0
					END 
					+ 
					CASE WHEN TAG_TYPE = '04'
										THEN QTY2
							 ELSE 0
					END 
					+        
					CASE WHEN TAG_TYPE = '05'
										THEN QTY4
							 ELSE 0
					END 
					+
					CASE WHEN TAG_TYPE = '03'
										THEN QTY2
							 ELSE 0
					END 
			) AS INVESTTOTALINV,   							--調査適品在庫計
			SUM(
					CASE WHEN TAG_TYPE = '00'
										THEN QTY2
							 ELSE 0
					END
			) AS INVESTKEEPLOCINV,             				--調査保管場在庫
			SUM(
					CASE WHEN TAG_TYPE = '04'
										THEN QTY2
							 ELSE 0
					END
			) AS INVESTRECEIVELOCINV, 						--調査引取場在庫
			SUM(
					CASE WHEN TAG_TYPE = '05'
										THEN QTY4
							 ELSE 0
					END
			) AS INVESTDAMAGEITEM,							--調査かし品在庫
			SUM(
					CASE WHEN TAG_TYPE = '03'
										THEN QTY2
							 ELSE 0
					END
			) AS INVESTCLSSIFYLOCINV,						--調査仕分場在庫
			SUM(
					CASE WHEN TAG_TYPE = '07'
										THEN QTY1
							 ELSE 0
					END
			) AS INVESTTMPLOCINV,							--調査仕分済在庫
			SUM(
					CASE WHEN TAG_TYPE = '08'
										THEN QTY1
							 ELSE 0
					END
			) AS INVESTAUTOINV,								--調査自動在庫
			SUM(
					CASE WHEN TAG_TYPE = '07'
										THEN QTY1
							 ELSE 0
					END+
					CASE WHEN TAG_TYPE = '08'
										THEN QTY1
							 ELSE 0
					END+ 
					CASE WHEN TAG_TYPE = '00'
										THEN QTY2
							 ELSE 0
					END+               
					CASE WHEN TAG_TYPE = '04'
										THEN QTY2
							 ELSE 0
					END+
					CASE WHEN TAG_TYPE = '05'
										THEN QTY4
							 ELSE 0
					END+
					CASE WHEN TAG_TYPE = '03'
										THEN QTY2
							 ELSE 0
					END-
					CASE WHEN TAG_TYPE = '99'
										THEN QTY1+QTY3
							 ELSE 0
					END        
			) AS TDAYEQYTOTALINV,							--過不足当日適品在庫計
			SUM(
					CASE WHEN TAG_TYPE = '00'
										THEN QTY2
							 ELSE 0
					END-
					CASE WHEN TAG_TYPE = '00'
										THEN QTY1
							 ELSE 0
					END
			) AS TDAYEQYKEEPLOCINV,    						--過不足当日保管場在庫
			SUM(
					CASE WHEN TAG_TYPE = '04'
										THEN QTY2
							 ELSE 0
					END-
					CASE WHEN TAG_TYPE = '04'
										THEN QTY1
							 ELSE 0
					END
			) AS TDAYEQYRECEIVELOCINV,						--過不足当日引取場在庫
			SUM(
					CASE WHEN TAG_TYPE = '05'
										THEN QTY4
							 ELSE 0
					END-
					CASE WHEN TAG_TYPE = '99'
										THEN QTY3
							 ELSE 0
					END
			) AS TDAYEQYDAMAGEITEM,							--過不足当日かし品在庫
			SUM(
					CASE WHEN TAG_TYPE = '03'
										THEN QTY2
							 ELSE 0
					END-
					CASE WHEN TAG_TYPE = '03'
										THEN QTY1
							 ELSE 0
					END
			) AS TDAYEQYCLSSIFYLOCINV    					--過不足当日仕分場在庫
	FROM
			W_TRALLINV --統合在庫実績ワーク
	WHERE 
			CENTER_ID = /*pmb.centerId*/1
			AND CLIENT_ID = /*pmb.clientId*/1
	GROUP BY
			CENTER_ID,
			CLIENT_ID,
			INOUTKBN,
			PRODUCT_ID
) SUB1 --副問合せ1
LEFT OUTER JOIN
(
    SELECT
        TT.CENTER_ID,										--拠点ID
        TT.CLIENT_ID,										--荷主ID
        MP.PRODUCT_ID,										--商品ID
        SUM(
            CASE WHEN TT.DIFFOCC_AREA = '1'
                      THEN TT.DIFF_QTY
                 ELSE 0
            END          
        ) AS KEEPLOCDIFFQTY,								--保管場過不足数
        SUM(
            CASE WHEN TT.DIFFOCC_AREA = '2'
                      THEN TT.DIFF_QTY
                 ELSE 0
            END          
        ) AS RECEIVELOCDIFFQTY,								--引取場過不足数
        SUM(
            CASE WHEN TT.DIFFOCC_AREA = '3'
                      THEN TT.DIFF_QTY
                 ELSE 0
            END          
        ) AS DAMAGETMPDIFFQTY,								--かし品仮置過不足数
        SUM(
            CASE WHEN TT.DIFFOCC_AREA = '5'
                      THEN TT.DIFF_QTY
                 ELSE 0
            END          
        ) AS CLSSIFYLOCDIFFQTY								--仕分場過不足数
    FROM
        T_TRSTOCKDIFFHISTORY TT --在庫過不足履歴
        INNER JOIN M_PRODUCT MP --銘柄マスタ
        ON MP.CLIENT_ID = TT.CLIENT_ID
        AND MP.SUPPLIERITEMCD = TT.PRODUCT_CD
        AND MP.DEL_FLG = '0'
    WHERE
        TT.CENTER_ID = /*pmb.centerId*/1
        AND TT.CLIENT_ID = /*pmb.clientId*/1
        AND TT.DIFFADD_DATE >= /*pmb.invDt*/'20240324'
        AND TT.DIFFADD_DATE <= /*pmb.systemDt*/'20240324'
        AND TT.GOOD_ITEM_KBN = '0'
        AND TT.DEL_FLG = '0'
    GROUP BY
        TT.CENTER_ID,
        TT.CLIENT_ID,
        MP.PRODUCT_ID
) SUB2 --副問合せ2
    ON SUB2.CENTER_ID = SUB1.CENTER_ID
    AND SUB2.CLIENT_ID = SUB1.CLIENT_ID
    AND SUB2.PRODUCT_ID = SUB1.PRODUCT_ID
INNER JOIN
M_PRODUCT MP --銘柄マスタ
    ON MP.PRODUCT_ID = SUB1.PRODUCT_ID
    AND MP.DEL_FLG = '0'
ORDER BY 
    MP.PRODUCT_CD ASC
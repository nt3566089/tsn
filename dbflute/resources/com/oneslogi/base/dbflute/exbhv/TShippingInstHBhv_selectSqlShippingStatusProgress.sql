/*
 [df:title]
 出荷ステータス毎の進捗表示

 [df:description]
  出荷ステータス毎の伝票数、数量を返します。

*/

-- #df:entity#
-- ##String SHIPPING_STATUS_NM##

-- !df:pmb!
-- !!AutoDetect!!

SELECT SIH.CLIENT_ID                                                           -- 荷主ID
      ,MCL.CLIENT_CD                                                           -- 荷主CD
      ,MAX(MCL.CLIENT_NM) AS CLIENT_NM                                         -- 荷主名称
      ,SIH.CENTER_ID                                                           -- センタID
      ,MCT.CENTER_CD                                                           -- センタCD
      ,MAX(MCT.CENTER_NM) AS CENTER_NM                                         -- センタ名称
      ,SIH.SHIPPING_STATUS                                                     -- 出荷ステータス
      ,NULL AS SHIPPING_STATUS_NM                                              -- 出荷ステータス名称
      ,COUNT(DISTINCT SIH.SHIPPING_INST_H_ID) SHIPPING_CNT                     -- 伝票数
      ,SUM(SIB.INST_NUM) AS NUM                                                -- 指示数
  FROM T_SHIPPING_INST_H SIH  -- 出荷指示ヘッダ
  INNER JOIN T_SHIPPING_INST_B SIB  -- 出荷指示ボディ
    ON SIH.SHIPPING_INST_H_ID = SIB.SHIPPING_INST_H_ID
    AND SIB.DEL_FLG = '0'
  INNER JOIN M_CLIENT MCL  -- 荷主マスタ
    ON SIH.CLIENT_ID = MCL.CLIENT_ID
    AND MCL.DEL_FLG = '0'
  INNER JOIN M_CENTER MCT  -- センタマスタ
    ON SIH.CENTER_ID = MCT.CENTER_ID
    AND MCT.DEL_FLG = '0'
  LEFT JOIN M_DELIVERY_COURSE MDC  -- 配送コースマスタ
    ON SIH.DELIVERY_COURSE_ID = MDC.DELIVERY_COURSE_ID
    AND MDC.DEL_FLG = '0'
  WHERE SIH.DEL_FLG = '0'
  -- [#376][2.1.0-CT-073] 出荷ステータス別進捗 出庫指示中が表示されない不具合を修正 2016.12.07 kawana Start
  -- [#7105][OSS] 配送コースCDを前方一致に修正 2020.02.03 tsuboi Start
    AND SIH.SHIPPING_STATUS IN ('10','15', '99') -- 10:未出荷 15:出庫指示中 99:エラー有
  -- [#7105][OSS] 配送コースCDを前方一致に修正 2020.02.03 tsuboi End
  -- [#376][2.1.0-CT-073] 出荷ステータス別進捗 出庫指示中が表示されない不具合を修正 2016.12.07 kawana End
    /*IF pmb.centerId != null*/
    AND SIH.CENTER_ID = /*pmb.centerId*/11111111111
    /*END*/
    /*IF pmb.clientId != null*/
    AND SIH.CLIENT_ID = /*pmb.clientId*/11111111111
    /*END*/
    -- [#7105][OSS] 配送コースCDを前方一致に修正 2020.02.03 tsuboi Start
    /*IF pmb.deliveryCourseCd != null*/
    AND MDC.DELIVERY_COURSE_CD like /*pmb.deliveryCourseCd*/'a123%'
    /*END*/
    -- [#7105][OSS] 配送コースCDを前方一致に修正 2020.02.03 tsuboi End
    /*IF pmb.shippingDt != null*/
    AND SIH.SHIPPING_DT = /*pmb.shippingDt*/'20140430'
    /*END*/
    /*IF pmb.workDt != null*/
    AND SIH.WORK_DT = /*pmb.workDt*/'20140430'
    /*END*/
  GROUP BY
     SIH.CLIENT_ID
    ,MCL.CLIENT_CD
    ,SIH.CENTER_ID
    ,MCT.CENTER_CD
    ,SIH.SHIPPING_STATUS
UNION ALL
SELECT AIH.CLIENT_ID                                                           -- 荷主ID
      ,MCL.CLIENT_CD                                                           -- 荷主CD
      ,MAX(MCL.CLIENT_NM) AS CLIENT_NM                                         -- 荷主名称
      ,AIH.CENTER_ID                                                           -- センタID
      ,MCT.CENTER_CD                                                           -- センタCD
      ,MAX(MCT.CENTER_NM) AS CENTER_NM                                         -- センタ名称
      ,PIH.PICKING_STATUS AS SHIPPING_STATUS                                   -- 出荷ステータス
      ,NULL AS SHIPPING_STATUS_NM                                              -- 出荷ステータス名称
      ,SUM(SIH.SHIPPING_CNT) AS SHIPPING_CNT                                   -- 伝票数
      ,SUM(AIB.ALLOC_NUM) AS NUM                                               -- 引当済数
  FROM T_ALLOC_INST_H AIH  -- 引当指示ヘッダ
  INNER JOIN (SELECT AIH.ALLOC_INST_H_ID
                    ,SUM(AIB.ALLOC_NUM) AS ALLOC_NUM
                FROM T_ALLOC_INST_H AIH  -- 引当指示ヘッダ
                INNER JOIN T_ALLOC_INST_B AIB  -- 引当指示ボディ
                  ON AIH.ALLOC_INST_H_ID = AIB.ALLOC_INST_H_ID
                  AND AIB.DEL_FLG = '0'
                WHERE AIH.DEL_FLG = '0'
                  /*IF pmb.centerId != null*/
                  AND AIH.CENTER_ID = /*pmb.centerId*/11111111111
                  /*END*/
                  /*IF pmb.clientId != null*/
                  AND AIH.CLIENT_ID = /*pmb.clientId*/11111111111
                  /*END*/
                  /*IF pmb.shippingDt != null*/
                  AND AIH.SHIPPING_DT = /*pmb.shippingDt*/'20140430'
                  /*END*/
                  /*IF pmb.workDt != null*/
                  AND AIH.WORK_DT = /*pmb.workDt*/'20140430'
                  /*END*/
                GROUP BY AIH.ALLOC_INST_H_ID
             ) AIB
    ON AIH.ALLOC_INST_H_ID = AIB.ALLOC_INST_H_ID
  INNER JOIN M_CLIENT MCL  -- 荷主マスタ
    ON AIH.CLIENT_ID = MCL.CLIENT_ID
    AND MCL.DEL_FLG = '0'
  INNER JOIN M_CENTER MCT  -- センタマスタ
    ON AIH.CENTER_ID = MCT.CENTER_ID
    AND MCT.DEL_FLG = '0'
  INNER JOIN T_PICKING_H PIH  -- 出庫ヘッダ
    ON AIH.ALLOC_INST_H_ID = PIH.ALLOC_INST_H_ID
    AND PIH.DEL_FLG = '0'
  INNER JOIN M_DELIVERY_COURSE MDC  -- 配送コースマスタ
    ON AIH.DELIVERY_COURSE_ID = MDC.DELIVERY_COURSE_ID
    AND MDC.DEL_FLG = '0'
  INNER JOIN (SELECT SIH.ALLOC_INST_H_ID
                    ,COUNT(DISTINCT SIH.SHIPPING_INST_H_ID) AS SHIPPING_CNT
                FROM T_SHIPPING_INST_H SIH
               WHERE SIH.DEL_FLG = '0'
                 /*IF pmb.centerId != null*/
                 AND SIH.CENTER_ID = /*pmb.centerId*/11111111111
                 /*END*/
                 /*IF pmb.clientId != null*/
                 AND SIH.CLIENT_ID = /*pmb.clientId*/11111111111
                 /*END*/
                 /*IF pmb.shippingDt != null*/
                 AND SIH.SHIPPING_DT = /*pmb.shippingDt*/'20140430'
                 /*END*/
                 /*IF pmb.workDt != null*/
                 AND SIH.WORK_DT = /*pmb.workDt*/'20140430'
                 /*END*/
               GROUP BY SIH.ALLOC_INST_H_ID
             ) SIH
    ON AIH.ALLOC_INST_H_ID = SIH.ALLOC_INST_H_ID
  WHERE AIH.DEL_FLG = '0'
    /*IF pmb.centerId != null*/
    AND AIH.CENTER_ID = /*pmb.centerId*/11111111111
    /*END*/
    /*IF pmb.clientId != null*/
    AND AIH.CLIENT_ID = /*pmb.clientId*/11111111111
    /*END*/
    -- [#7105][OSS] 配送コースCDを前方一致に修正 2020.02.03 tsuboi Start
    /*IF pmb.deliveryCourseCd != null*/
    AND MDC.DELIVERY_COURSE_CD like /*pmb.deliveryCourseCd*/'a123%'
    /*END*/
    -- [#7105][OSS] 配送コースCDを前方一致に修正 2020.02.03 tsuboi End
    /*IF pmb.shippingDt != null*/
    AND AIH.SHIPPING_DT = /*pmb.shippingDt*/'20140430'
    /*END*/
    /*IF pmb.workDt != null*/
    AND AIH.WORK_DT = /*pmb.workDt*/'20140430'
    /*END*/
  GROUP BY
     AIH.CLIENT_ID
    ,MCL.CLIENT_CD
    ,AIH.CENTER_ID
    ,MCT.CENTER_CD
    ,PIH.PICKING_STATUS
  ORDER BY
    CLIENT_CD
   ,CENTER_CD
   ,SHIPPING_STATUS

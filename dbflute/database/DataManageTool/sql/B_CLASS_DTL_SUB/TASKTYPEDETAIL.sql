INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HN'	
  , '入庫管理'	
  , '受入検品'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HN002L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HN'	
  , '入庫管理'	
  , 'はり紙検品'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HN003L01';	



INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HN'	
  , '入庫管理'	
  , '入庫格納'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HN001L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HN'	
  , '入庫管理'	
  , 'ケース検品'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HN004L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HS'	
  , '山出し管理'	
  , '山出し作業'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HS001L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HS'	
  , '山出し管理'	
  , '製品移動'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HS002L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HS'	
  , '山出し管理'	
  , 'ケース単位出荷'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HS004L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HZ'	
  , '在庫管理'	
  , 'ケース情報照会'	
  , '0'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HZ009L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HZ'	
  , '在庫管理'	
  , 'はい替'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HZ003L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HC'	
  , '在庫調査'	
  , '保管場'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HZ001L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HC'	
  , '在庫調査'	
  , '引取場'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HZ008L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HC'	
  , '在庫調査'	
  , '仕分場'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HZ004L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HC'	
  , '在庫調査'	
  , '国税還付品'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HZ007L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HC'	
  , '在庫調査'	
  , 'かし品'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HZ006L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HW'	
  , '仕分場管理'	
  , 'うしろ補充'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HW001L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HW'	
  , '仕分場管理'	
  , 'まえ補充'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HW002L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HW'	
  , '仕分場管理'	
  , '取出'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HW003L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HT'	
  , '引取場管理'	
  , '引取場受入登録'	
  , '0'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HT001L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'HT'	
  , '引取場管理'	
  , '引取場受入解除'	
  , '0'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'HT002L01';	


INSERT 	
INTO B_CLASS_DTL_SUB( 	
  CLASS_DTL_ID	
  , OTHERCD1	
  , OTHERCD2	
  , OTHERCD3	
  , OTHERCD4	
  , OTHER1_COMMENT	
  , OTHER2_COMMENT	
  , OTHER3_COMMENT	
  , OTHER4_COMMENT	
) 	
SELECT	
  BCD.CLASS_DTL_ID	
  , 'TH'	
  , '返品管理'	
  , '返品業務'	
  , '1'	
  , '作業実績区分コード'	
  , '作業実績区分名称(業務別帳票出力用)'	
  , '作業実績区分詳細名称(業務別帳票出力用)'	
  , '帳票出力フラグ（１：出力対象、０：出力対象外）'	
FROM	
  B_CLASS BC 	
  INNER JOIN B_CLASS_DTL BCD 	
    ON BC.CLASS_ID = BCD.CLASS_ID 	
WHERE	
  1 = 1 	
  AND BC.CLASS_CD = 'TASKTYPEDETAIL' 	
  AND BCD.CLASS_DTL_CD = 'TH002L01';	


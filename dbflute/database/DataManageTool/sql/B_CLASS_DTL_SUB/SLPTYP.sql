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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO01'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO02'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO03'; 

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
    , null
    , '8888'
    , null
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO04'; 

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
    , '9940'
    , '9940'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO05'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO06'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO07'; 

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
    , null
    , '9106'
    , null
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO08'; 

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
    , null
    , '9106'
    , null
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO09'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO10'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO11'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO15'; 

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
    , '9940'
    , '9940'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO18'; 

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
    , '9970'
    , '9970'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO22'; 

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
    , '9970'
    , '9970'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO23'; 

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
    , '9960'
    , '9960'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO24'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO25'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO31'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO32'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO33'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO34'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO35'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO36'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO37'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO38'; 

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
    , '9950'
    , '9950'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO71'; 

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
    , '9950'
    , '9950'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO72'; 

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
    , '9950'
    , '9950'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO73'; 

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
    , '9950'
    , '9950'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO74'; 

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
    , '9950'
    , '9950'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO75'; 

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
    , '9950'
    , '9950'
    , 'A'
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO76'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO81'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO82'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO83'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO84'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO86'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO87'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO88'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO91'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO92'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO93'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO94'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZO99'; 

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
    , null
    , '9900'
    , null
    , 'A'
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZZUB'; 

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
    , null
    , null
    , null
    , null
    , '配達方面'
    , '画面表示用配達方面'
    , '伝票タイプ'
    , '画面表示用伝票タイプ' 
FROM
    B_CLASS BC 
    INNER JOIN B_CLASS_DTL BCD 
        ON BC.CLASS_ID = BCD.CLASS_ID 
WHERE
    1 = 1 
    AND BC.CLASS_CD = 'SLPTYP' 
    AND BCD.CLASS_DTL_CD = 'ZZZZ';


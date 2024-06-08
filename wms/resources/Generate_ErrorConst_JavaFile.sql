SELECT JAVA FROM (
SELECT DISTINCT 
       CONCAT(''
        ,CONCAT(
           '/** '
        ,CONCAT(
           (SELECT MESSAGE_NM FROM B_MESSAGE S WHERE S.DEL_FLG = '0' AND S.CULTURE_ID = 1 AND S.MESSAGE_ID = M.MESSAGE_ID)
        ,CONCAT(
           ' */'
        ,CONCAT(
'
'
        ,CONCAT(
           'public static final String '
        ,CONCAT(
           UPPER(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(MESSAGE_CD, 'A', '_A'), 'B', '_B'), 'C', '_C'), 'D', '_D'), 'E', '_E'), 'F', '_F'), 'G', '_G'), 'H', '_H'), 'I', '_I'), 'J', '_J'), 'K', '_K'), 'L', '_L'), 'M', '_M'), 'N', '_N'), 'O', '_O'), 'P', '_P'), 'Q', '_Q'), 'R', '_R'), 'S', '_S'), 'T', '_T'), 'U', '_U'), 'V', '_V'), 'W', '_W'), 'X', '_X'), 'Y', '_Y'), 'Z', '_Z'))
        ,CONCAT(
           ' = "'
        ,CONCAT(
           MESSAGE_CD
        ,CONCAT(
           '";'
       , '')))))))))) AS JAVA
      ,MESSAGE_CD
  FROM B_MESSAGE M
 WHERE DEL_FLG = '0' AND CULTURE_ID = 1 AND SYSTEM_TYPE = 'wms'
 ORDER BY MESSAGE_CD
) MAIN

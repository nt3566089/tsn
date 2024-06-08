SELECT JAVA FROM (
SELECT DISTINCT
       CONCAT(''
        ,CONCAT(
           '/** '
        ,CONCAT(
           BIZ_NM
        ,CONCAT(
           ' */'
        ,CONCAT(
'
'
        ,CONCAT(
           'public static final String '
        ,CONCAT(
           UPPER(BIZ_CD)
        ,CONCAT(
           ' = "'
        ,CONCAT(
           BIZ_CD
        ,CONCAT(
           '";'
       , '')))))))))) AS JAVA
      ,BIZ_CD
  FROM B_NUMBERING M
 WHERE DEL_FLG = '0'
 UNION
SELECT DISTINCT
       CONCAT(''
        ,CONCAT(
           '/** '
        ,CONCAT(
           BIZ_NM
        ,CONCAT(
           ' */'
        ,CONCAT(
'
'
        ,CONCAT(
           'public static final String '
        ,CONCAT(
           UPPER(BIZ_CD)
        ,CONCAT(
           ' = "'
        ,CONCAT(
           BIZ_CD
        ,CONCAT(
           '";'
       , '')))))))))) AS JAVA
      ,BIZ_CD
  FROM M_NUMBERING_CENTER M
 WHERE DEL_FLG = '0'
   AND CENTER_ID = (
         SELECT MIN(S.CENTER_ID) FROM M_NUMBERING_CENTER S WHERE S.DEL_FLG = '0' AND S.BIZ_CD = M.BIZ_CD
       )
 ORDER BY BIZ_CD
) MAIN

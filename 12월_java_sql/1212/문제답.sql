SELECT * FROM 한빛무역.고객;
SELECT 고객번호, 담당자명, 고객회사명, 마일리지 AS "10% 인상된 마일리지" FROM 고객;
#AS <- 마일리지에 별명 붙이기

SELECT 고객번호, 담당자명, 마일리지 FROM 고객 WHERE 마일리지 >= 100000;

SELECT 고객번호, 담당자명, 도시, 마일리지 AS 포인트 FROM 고객 WHERE 도시 = '서울특별시';

SELECT * FROM  고객 limit 3;

SELECT 고객번호,담당자명,마일리지,도시 FROM 고객 WHERE 도시='부산광역시' 
UNION
SELECT 고객번호,담당자명,마일리지,도시 FROM 고객 WHERE 마일리지 <1000;

SELECT * FROM 고객 WHERE 지역 ="";

UPDATE 고객 SET 지역 = null WHERE 지역 = '';

UPDATE 고객 SET 지역 = null WHERE 지역 = '';

SELECT 고객번호, 담당자명, 담당자직위 FROM 고객 WHERE 담당자직위 = '영업 과장' OR 담당자직위 = '마케팅 과장';

SELECT 담당자명, 마일리지 FROM 고객 WHERE 마일리지 BETWEEN 100000 and 200000;
SELECT * FROM 고객 WHERE 도시 LIKE '%광역시';

#문제1
SELECT * FROM 고객 WHERE 도시 LIKE '서울%'
AND
마일리지 BETWEEN 15000 and 20000; 

#문제2
SELECT DISTINCT 지역, 도시 FROM 고객 ORDER BY 1,2;

#문제3
SELECT * FROM 고객 WHERE 도시 IN ('춘천시','과천시','광명시') 
AND 
(담당자직위 LIKE '%이사%' OR 담당자직위 LIKE'%사원%');

#문제4
SELECT * FROM 고객 
WHERE NOT (도시 LIKE '%광역시' OR 도시 LIKE '%특별시')
ORDER BY 마일리지 DESC limit 3;

#문제5
SELECT * FROM 고객 WHERE 지역  = '' 
AND
담당자직위 <> '대표 이사';


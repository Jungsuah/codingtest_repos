-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.name
from ANIMAL_INS i,ANIMAL_OUTS o
where i.ANIMAL_ID = o.ANIMAL_ID
and I.DATETIME > O.DATETIME
ORDER BY I.DATETIME;
with cte AS
(select num
from MyNumbers 
group by num
having count(num)=1)

select case when count(num)>0 then max(num) else null end AS num
from cte 
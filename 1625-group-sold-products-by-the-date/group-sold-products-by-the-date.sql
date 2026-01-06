# Write your MySQL query statement below
select sell_date,count(Distinct product) AS num_sold,
group_concat(distinct product order by product) AS products
from Activities
group by sell_date
# Write your MySQL query statement below
WITH cte AS
(select p.product_id,p.price * s.units as al,s.units
from prices p
left join unitssold s
on p.product_id=s.product_id
AND s.purchase_date BETWEEN p.start_date AND p.end_date)

select product_id,ROUND(
        IFNULL(SUM(al) / SUM(units), 0),
        2) as average_price 
FROM cte
GROUP BY product_id
# Write your MySQL query statement below
select 
#ROUND(avg(IF(min_order_date = min_customer_pref_delivery_date, 1, 0)) * 100 , 2)
round(sum(if(oe=oc,1,0)*100)/count(*),2) as immediate_percentage 
from 
(select 
 delivery_id , customer_id ,
 min(order_date) as oe , min(customer_pref_delivery_date) as oc
 from delivery
 group by customer_id) as temp
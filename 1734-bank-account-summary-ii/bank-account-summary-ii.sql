# Write your MySQL query statement below
Select u.name,sum(t.amount) as balance
from users  u inner join 
transactions t
on u.account=t.account
group by u.name,u.account
HAVING SUM(t.amount) > 10000
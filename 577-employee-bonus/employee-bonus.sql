# Write your MySQL query statement below
Select e.name ,b.bonus
from Employee e
left join Bonus b
on e.empID=b.empId
where bonus<1000 or bonus is null

# Write your MySQL query statement below
select u.unique_id,e.name
from Employees e
left join EmployeeUNI u #becauase we have to take each value of left table(name)
on e.id=u.id

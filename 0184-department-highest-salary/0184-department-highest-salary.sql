# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary
from Employee as e
inner Join Department as d on e.departmentId=d.id 
where (departmentId,salary) in 
(select departmentId,Max(salary)
from Employee
group by departmentId); 


# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary Salary
from Department as d,Employee as e
where e.departmentId=d.id and (select  count(distinct salary)
from Employee where departmentId=d.id and salary >e.salary)<3
order by d.name,e.salary desc;

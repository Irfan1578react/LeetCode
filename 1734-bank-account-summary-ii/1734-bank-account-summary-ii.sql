# Write your MySQL query statement below
select name ,sum(amount) as balance 
from Users as u
left join Transactions t on u.account=t.account 
group by u.account,u.name
having sum(amount) >10000;
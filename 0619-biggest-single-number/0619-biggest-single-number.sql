# Write your MySQL query statement below
select IFNULL((select num from MyNumbers
group by num
having count(num)=1
order by num desc
limit 0,1
),NULL)AS num;
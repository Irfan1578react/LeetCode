# Write your MySQL query statement below
select id from Weather as w
where  temperature >(select temperature from Weather as w2 where w2.recordDate=date_sub(w.recordDate,interval 1 day) ); 
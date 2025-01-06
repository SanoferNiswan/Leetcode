# Write your MySQL query statement below
-- select * from Cinema order by id where id%2!=0 && description!="boring";
select * from Cinema 
where Mod(id,2) != 0 
and description != 'boring'
order by rating desc;
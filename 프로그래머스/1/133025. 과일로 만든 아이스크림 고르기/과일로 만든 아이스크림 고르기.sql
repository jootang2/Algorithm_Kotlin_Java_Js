-- 코드를 입력하세요
select A.flavor from (select * from first_half where total_order > 3000) A,
(select * from icecream_info where ingredient_type = 'fruit_based') B 
where B.flavor = A.flavor order by A.total_order desc

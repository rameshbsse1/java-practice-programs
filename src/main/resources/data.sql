// Remove duplicates where are columns values are same, only 1 copy must be there
with cte as (
            select *,
                    ROW_NUMBER() OVER (PARTITION BY age, name, city ORDER BY (SELECT NULL)) as rn
      from people)
 delete from cte  where rn>1;

 // find the 2nd highest salary of an employee in each department
 with cte as (
                select *,
                    DENSE RANK() OVER (PARTITION BY dept ORDER BY salary DESC) as rn
           from employee)
  select * from cte where rn=2;


  // find the 2nd highest salary of an employee
  with cte as (
                select name, salary, DENSE_RANK() OVER (ORDER BY salary DESC) as rn from employee )
               select * from cte where rn = 2

  // Employees earning more than his manager
    select e.name, e.salary, m.name as mgr_name, m.salary as mgr_salary from emp e join employee m
    on e.manager_id = m.id where e.salary > m.salary;




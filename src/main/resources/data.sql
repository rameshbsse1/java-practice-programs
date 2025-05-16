// Remove duplicates where are columns values are same, only 1 copy must be there
with cte as (
            select *,
                    ROW_NUMBER() OVER (PARTITION BY age, name, city ORDER BY (SELECT NULL)) as rn
      from people)
 delete from cte  where rn>1;

 // find the 2nd highest salary of an employee in each department
 with cte as (
                select *,
                    DENSE_RANK() OVER (PARTITION BY dept ORDER BY salary DESC) as rn
           from employee)
  select * from cte where rn=2;


  // find the 2nd highest salary of an employee
  with cte as (
                select name, salary, DENSE_RANK() OVER (ORDER BY salary DESC) as rn from employee )
               select * from cte where rn = 2

  // Employees earning more than his manager
    select e.name, e.salary, m.name as mgr_name, m.salary as mgr_salary from employee e join employee m
    on e.manager_id = m.id where e.salary > m.salary;


    #Part 1:
    --------
    You have a table of employees with Eid, Fname, Lname, Email, Salary etc. Write an SQL query to print names of all the employees whose salary greater than or equal to the employee with first name “Rita"
    Table Name : Employee :: Column Names : Eid, Fname, Lname, Email, Salary

    select e.Fname from Employee e where e.salary >= (select max(salary) from Employee where Fname = 'Rita')



    #Part 2:
    --------
    Now assume the salary has been moved to Salary Table. Write an SQL query to print names of all the employees whose salary greater than or equal to the employee with first name “Rita”.
    Table Name : Employee :: Column Names : Eid, Fname, Lname, Email .
    Table Name : Salary :: Column Names : Eid, Salary

    select e2.Fname, s2.salary  from Employee e2 inner join Salary s2 on e2.EID = s2.EID where s2.salary >=
    (select max(s1.salary) from Employee e1 inner join Salary s1 on e1.Eid = s1.Eid
    where e1.Fname = 'Rita' )




# Write your MySQL query statement below
select Customers.Name as Customers
from Customers left join Orders 
On Orders.CustomerID = Customers.Id
where Orders.CustomerId is null;

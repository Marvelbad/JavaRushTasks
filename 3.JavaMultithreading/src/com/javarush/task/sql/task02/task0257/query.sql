-- Write your code here:
SELECT name, avg(price), sum(price)
from cars
group by name
having avg(price) > 100000;
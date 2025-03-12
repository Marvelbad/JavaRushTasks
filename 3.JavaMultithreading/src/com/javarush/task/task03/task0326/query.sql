-- Write your code here:
SELECT customers.email, *
    FROM customers
RIGHT JOIN orders ON customers.customer_id = orders.customer_id;
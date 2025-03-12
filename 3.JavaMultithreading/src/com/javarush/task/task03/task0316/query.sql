-- Write your code here:
SELECT retailer.name AS ret_name, supplier.name AS sup_name,
       retailer.hq_location AS ret_location
FROM top_retailers AS retailer, suppliers AS supplier
WHERE retailer.annual_revenue_billions > 100;
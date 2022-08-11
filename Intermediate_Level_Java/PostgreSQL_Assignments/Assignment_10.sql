-- Answer 1 --
SELECT city.city, country.country FROM city
INNER JOIN country ON country.country_id = city.country_id; 

-- Answer 2 --
SELECT customer.first_name, customer.last_name, payment.payment_id FROM customer
INNER JOIN payment ON customer.customer_id = payment.customer_id;

-- Answer 3 --
SELECT rental.rental_id, customer.first_name, customer.last_name FROM customer
INNER JOIN rental ON rental.customer_id = customer.customer_id;

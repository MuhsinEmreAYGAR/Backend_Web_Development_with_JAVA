
-- Answer 1 --
SELECT city.city, country.country FROM city
LEFT JOIN country ON city.country_id = country.country_id;

-- Answer 2 --
SELECT customer.first_name, customer.last_name ,payment.payment_id FROM payment
RIGHT JOIN customer ON customer.customer_id = payment.customer_id;

-- Answer 3 --
SELECT customer.first_name,customer.last_name , rental.rental_id FROM customer
FULL OUTER JOIN rental ON rental.customer_id = customer.customer_id;

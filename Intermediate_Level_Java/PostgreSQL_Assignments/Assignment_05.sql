-- Answer 1 --

SELECT COUNT(*) FROM film
WHERE length > 
(
  SELECT AVG(length) FROM film
);

-- Answer 2 --

SELECT COUNT(*) AS best_films FROM film
WHERE rental_rate = ANY
(
    SELECT MAX(film.rental_rate) FROM film
);

-- Answer 3 --

SELECT * FROM film
WHERE rental_rate =
(
    SELECT MIN(rental_rate) FROM film
) 
AND replacement_cost =
(
    SELECT MIN(replacement_cost) FROM film
);

-- Answer 4 --

SELECT p.customer_id, c.first_name, c.last_name, COUNT(p.customer_id) AS "Shopping Amount" FROM payment AS p
INNER JOIN customer AS c ON p.customer_id = c.customer_id
GROUP BY p.customer_id, c.first_name , c.last_name
ORDER BY "Shopping Amount" DESC;

/* 1-test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
   2-Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
   3-Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
   4-Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım. */
   
CREATE TABLE employee(
    id INTEGER,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);

insert into employee (id, name , email, birthday) values (1, 'Stoddard Phaup', 'sphaup0@admin.ch', '2009-10-17');
insert into employee (id, name , email, birthday) values (2, 'Alisa Sharvill', 'asharvill1@ihg.com', '2009-11-12');
insert into employee (id, name , email, birthday) values (3, 'Ewan Gorries', 'egorries2@joomla.org', '1993-04-24');
insert into employee (id, name , email, birthday) values (4, 'Latrena Elcott', 'lelcott3@ebay.com', '1975-03-10');
insert into employee (id, name , email, birthday) values (5, 'Franny Aimeric', 'faimeric4@census.gov', '1930-12-08');
insert into employee (id, name , email, birthday) values (6, 'Christoforo Needs', 'cneeds5@jugem.jp', '2011-08-11');
insert into employee (id, name , email, birthday) values (7, 'Manon Riditch', 'mriditch6@multiply.com', '1946-05-02');
insert into employee (id, name , email, birthday) values (8, 'Wilma Burnsell', 'wburnsell7@usgs.gov', '1901-02-07');
insert into employee (id, name , email, birthday) values (9, 'Lisetta Gregore', 'lgregore8@wikispaces.com', '1966-04-10');
insert into employee (id, name , email, birthday) values (10, 'Rhodie Gilyatt', 'rgilyatt9@odnoklassniki.ru', '1962-07-17');
insert into employee (id, name , email, birthday) values (11, 'Godfrey Dotterill', 'gdotterilla@ning.com', '1955-12-29');
insert into employee (id, name , email, birthday) values (12, 'Norris Prescot', 'nprescotb@illinois.edu', '1902-12-26');
insert into employee (id, name , email, birthday) values (13, 'Violette Perford', 'vperfordc@nbcnews.com', '1991-11-02');
insert into employee (id, name , email, birthday) values (14, 'Morry Luard', 'mluardd@shop-pro.jp', '1965-07-19');
insert into employee (id, name , email, birthday) values (15, 'Nathalia Baumer', 'nbaumere@seesaa.net', '1938-04-05');
insert into employee (id, name , email, birthday) values (16, 'Debor Stolz', 'dstolzf@blinklist.com', '1967-02-06');
insert into employee (id, name , email, birthday) values (17, 'Elayne Oldmeadow', 'eoldmeadowg@istockphoto.com', '1963-11-11');
insert into employee (id, name , email, birthday) values (18, 'Anne-marie Stickford', 'astickfordh@purevolume.com', '2001-04-06');
insert into employee (id, name , email, birthday) values (19, 'Elnora Castagneto', 'ecastagnetoi@istockphoto.com', '1916-02-05');
insert into employee (id, name , email, birthday) values (20, 'Alwyn Manolov', 'amanolovj@github.com', '1936-10-31');
insert into employee (id, name , email, birthday) values (21, 'Jabez Lafflina', 'jlafflinak@java.com', '1987-12-23');
insert into employee (id, name , email, birthday) values (22, 'Sterling Wignall', 'swignalll@wikimedia.org', '1977-10-05');
insert into employee (id, name , email, birthday) values (23, 'Bondon MacTrustrie', 'bmactrustriem@creativecommons.org', '1909-05-05');
insert into employee (id, name , email, birthday) values (24, 'Lilla Sculpher', 'lsculphern@slideshare.net', '1948-01-23');
insert into employee (id, name , email, birthday) values (25, 'Alix Omrod', 'aomrodo@huffingtonpost.com', '2022-05-14');
insert into employee (id, name , email, birthday) values (26, 'Ulick Bow', 'ubowp@deviantart.com', '2015-12-26');
insert into employee (id, name , email, birthday) values (27, 'Pip Grinyer', 'pgrinyerq@google.com.au', '1903-02-15');
insert into employee (id, name , email, birthday) values (28, 'Jason Riquet', 'jriquetr@kickstarter.com', '1903-04-13');
insert into employee (id, name , email, birthday) values (29, 'Rona Abbitt', 'rabbitts@umn.edu', '1973-03-20');
insert into employee (id, name , email, birthday) values (30, 'Ermina Resdale', 'eresdalet@wisc.edu', '1971-08-05');
insert into employee (id, name , email, birthday) values (31, 'Blair Haugh', 'bhaughu@mail.ru', '1988-01-23');
insert into employee (id, name , email, birthday) values (32, 'Nara Blackmore', 'nblackmorev@auda.org.au', '1921-06-02');
insert into employee (id, name , email, birthday) values (33, 'Philomena Caroli', 'pcaroliw@geocities.com', '1906-04-16');
insert into employee (id, name , email, birthday) values (34, 'Tessy Binnion', 'tbinnionx@1und1.de', '1947-06-09');
insert into employee (id, name , email, birthday) values (35, 'Gayelord Jurries', 'gjurriesy@cargocollective.com', '1907-06-29');
insert into employee (id, name , email, birthday) values (36, 'Agnese Trawin', 'atrawinz@dion.ne.jp', '1933-12-08');
insert into employee (id, name , email, birthday) values (37, 'Herminia Bonefant', 'hbonefant10@vimeo.com', '1986-03-13');
insert into employee (id, name , email, birthday) values (38, 'Beauregard Verchambre', 'bverchambre11@ask.com', '2004-01-23');
insert into employee (id, name , email, birthday) values (39, 'Leroi Johansen', 'ljohansen12@jigsy.com', '1958-02-17');
insert into employee (id, name , email, birthday) values (40, 'Pepito Yates', 'pyates13@dion.ne.jp', '2001-11-08');
insert into employee (id, name , email, birthday) values (41, 'Bentlee Coleford', 'bcoleford14@cpanel.net', '1970-08-18');
insert into employee (id, name , email, birthday) values (42, 'Jennine Eddisford', 'jeddisford15@google.com.hk', '1909-12-04');
insert into employee (id, name , email, birthday) values (43, 'Netty Phillipp', 'nphillipp16@addtoany.com', '1942-11-22');
insert into employee (id, name , email, birthday) values (44, 'Lazaro Lasslett', 'llasslett17@booking.com', '1919-09-18');
insert into employee (id, name , email, birthday) values (45, 'Cristin Askin', 'caskin18@cbsnews.com', '1915-01-17');
insert into employee (id, name , email, birthday) values (46, 'Janessa Jaqueminet', 'jjaqueminet19@myspace.com', '1974-01-16');
insert into employee (id, name , email, birthday) values (47, 'Winfred Dixey', 'wdixey1a@cnbc.com', '1944-03-29');
insert into employee (id, name , email, birthday) values (48, 'Arlana Gregoletti', 'agregoletti1b@ovh.net', '2013-05-19');
insert into employee (id, name , email, birthday) values (49, 'Anet Claiton', 'aclaiton1c@shinystat.com', '1960-10-28');
insert into employee (id, name , email, birthday) values (50, 'Sal Borborough', 'sborborough1d@statcounter.com', '1946-03-19');
   
   
UPDATE employee
SET name = 'Muhsin Emre AYGAR',
    birthday = '2003-01-08'
WHERE id = 1
RETURNING *;

UPDATE employee
SET email = 'lions123123123@gmail.com'
WHERE name = 'Muhsin Emre AYGAR'
RETURNING *;

UPDATE employee
SET name = 'Employee A',
    email= 'employeea@gmail.com'
WHERE id > 5
RETURNING *;

UPDATE employee
SET name = ' Employee B',
    birthday = NULL
WHERE id>10
RETURNING *;

UPDATE employee
SET birthday = '2000-01-10',
email = NULL
WHERE name = 'Employee A'
RETURNING *;


DELETE FROM employee
WHERE id BETWEEN 7 AND 8
RETURNING *;    

DELETE FROM employee
WHERE name ILIKE '%A'
RETURNING *;    

DELETE FROM employee
WHERE id IN(13,42)
RETURNING *;    

DELETE FROM employee
WHERE name LIKE 'A%' OR name LIKE 'B%'
RETURNING *;    

DELETE FROM employee
WHERE id > 10 OR id < 19
RETURNING *;  
   

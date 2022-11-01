/*
Aidan O'Leary
Sep 30, 2022
*/

/* Step one */
if exists drop table mycds;

/* Step two */
create new table mycds (Artist CHAR(20), CDname CHAR(20), 
Date_Acquired DATE, Genre SET("HipHop", "Indie", "Rock", "Rap", 
"Country"));

/* Step three */
explain mycds;

/* Step four */
insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating) 
values ("Tame Impala", "Currents", "2015-11-17", "Indie", "5");

insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating) 
values ("Kanye West", "Late Registration", "2005-08-30", "Rap", "5");

insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating) 
values ("Johnny Cash", "At Folsom Prison", "1968-05-06", "Country", "5");

insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating) 
values ("Led Zeppelin", "Led Zeppelin 1", "1969-01-12", "Rock", "5");

insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating) 
values ("Jay-Z", "Watch the Throne", "2011-08-08", "HipHop", "4");

/* Step 5 */
select * from mycds;

/* Step 6 */
alter table mycds add column Price Decimal(5,2) CHECk(Price >= 0.00);

insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating, Price) 
values ("Weezer", "OK Human", "2021-09-01", "Indie", "4", 9.99);

/* Step 7 */
select * from mycds;

/* Step 8 */
insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating, Price)
values ("Testing", "1", CURDATE(), NULL, NULL, NuLL);

/* Step 9 */
select * from mycds;

/* Step 10 */
alter table mycds add ID INT Auto_increment Primary Key;

/* Step 11 */
insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating, Price, ID)
values ("Bob Marley", "Legalize It", CURDATE(), "HipHop", 5, 15.99, NULL);

/* Step 12 was aleady completed in step four */

/* Step 13 */
select * from mycds;

/* Step 14 */
insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating, Price, ID)
values ("Pink Floyd", "Dark Side", CURDATE(), "Rock", 4, 11.99, NULL);

/* Step 15 */
alter table mycds add column Updated TIMESTAMP;

/* Step 16 */
insert into mycds (Artist, CDname, Date_Acquired, Genre, Rating, Price, ID, Updated)
values ("The Beatles", "Abby Road", "2013-02-14", "Rock", 4, 24.99, NULL, Current_timestamp);

/* Step 17 */
select * from mycds;

/* Step 18 */
select * from mycds order by artist;

/*
Aidan O'Leary
October 7th, 2022
*/

/* Creating a new databse */
create database if not exists lab6;
use lab6;

/* Step 1 */
if exists drop table commands;

/* Step 2 */
create table if not exists commands (
    recnum INT Auto_increment Primary Key,
    command CHAR(20) Not NUll,
    updated TIMESTAMP,
    description CHAR(50)
);

/* Step 3 */
insert into commands (recnum, command, description, updated)
values (1, "Create", "Create new table", Current_timestamp);

select * from commands;

/* Step 4 */
insert into commands (recnum, command, description, updated)
values (2, "Another", "This will be deleted", Current_timestamp);

select * from commands;

/* Step 5 */
delete from commands where command = "Another";

/* Step 6 */
insert into commands (recnum, command, description, updated)
values (2, "Delete", "This will delete a row when specified where", Current_timestamp);

/* Step 7 */
insert into commands (recnum, command, description, updated)
values (3, "Create database", "This command creates a new database", Current_timestamp);

insert into commands (recnum, command, description, updated)
values (4, "Create table", "Creates an empty, new table", Current_timestamp);

insert into commands (recnum, command, description, updated)
values (5, "Another", "To be deleted", Current_timestamp);

insert into commands (recnum, command, description, updated)
values (6, "Select", "This enables you to see the contents of a table", Current_timestamp);

insert into commands (recnum, command, description, updated)
values (7, "Explain", "Shows all the fields within the selecteed table", Current_timestamp);

/* Step 8 */
delete from commands where recnum = 5;

/* Step 9 */
SELECT * FROM commands ORDER BY command DESC; 
SELECT * FROM commands ORDER BY command;

/* Step 10 */
alter table commands add type ENUM("Command", "Operand", "None") DEFAULT "None";

/* Step 11 */
update commands SET type="COMMAND";

/* Step 12 */
Update commands SET type="command"; 

/* Step 13 */
insert into commands (command, updated, description)
values ("Where", Current_timestamp, "Filter records");

/* Step 14 */
update commands SET type="Operand" where recnum=8;
select * from commands;

/* Step 15 */
update commands set updated="2000-01-01 12:00:00" where recnum=1;

/* Step 16 */
update commands set type="None" where recnum % 2 = 0;
select * from commands;

/* Step 17 */
delete from commands where recnum=3;
delete from commands where recnum=4;

/* Step 18 */
select * from commands;

/* Step 19 */
select count(*) from commands;



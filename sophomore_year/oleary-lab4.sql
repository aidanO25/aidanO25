/* This is Lab4 - using the source command */

use site_db;

create table if not exists MyFriends (FirstName TEXT, LastName TEXT);

insert into MyFriends ('Joey', 'Kylik');
insert into MyFriends ('Atticus', 'Furjanic');
insert into MyFriends ('Joe', 'Saieva');
insert into MyFriends ('Sean', 'Fuller');

explain MyFriends;
select * from MyFriends;
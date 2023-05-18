drop schema if exists hashing_db;


create schema hashing_db;
use hashing_db;


create table hash_table(
sl_no int auto_increment primary key,
country varchar(20),
state varchar(20),
city varchar(20),
project varchar(20),
hashcode_murmur varchar(20),
hashcode_64 varchar(20)
);

insert into hash_table values(1,'India','West Bengal','Kolkata','Helix', null, null);
insert into hash_table values(2,'India','Karnataka','Bangalore','Helix', null, null);
insert into hash_table values(3,'India','West Bengal','Kolkata','Helix', null, null);
insert into hash_table values(4,'India',null,'Kolkata','Helix', null, null);


--commit;

select * from hash_table;
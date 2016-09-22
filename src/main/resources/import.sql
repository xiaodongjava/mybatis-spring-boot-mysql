drop table if exists city;
drop table if exists hotel;

create table city (id int primary key auto_increment, name varchar(20), state varchar(20), country varchar(20));
create table hotel (city int, name varchar(20), address varchar, zip varchar(20));
create table citySelect (id int primary key auto_increment, name varchar(20), state varchar(20), country varchar(20));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into hotel(city, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001')
insert into citySelect (name, state, country) values ('San Francisco', 'CA', 'US');
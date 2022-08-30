drop table if exists person;

create table person
(
    id int primary key,
    name varchar(32) not null
);

insert into person (id, name) values (1, 'Vicky');
insert into person (id, name) values (2, 'Teedjay');
insert into person (id, name) values (3, 'Stonka');

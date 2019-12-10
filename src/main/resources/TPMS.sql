drop table if exists admin;
drop table if exists developers;
drop table if exists projects;
drop table if exists currentprojects;
drop table if exists hours;

create table admin(
	admin_id serial primary key, 
	name text not null,
	phone text not null, 
	email text not null,
	address text not null);
insert into admin (admin_id, name, phone,email, address) values (1,'Dennis Bill','05833838', 'bill@gmail.com', 'Accra');

create table projects(
	project_id serial primary key,
	title text not null,
	description text not null

);

insert into projects (project_id,title,description) values (1,'API Services','Api Services');
insert into projects (project_id,title,description) values (2,'MicroServices','MicroServices');

create table developers(
	developer_id serial primary key,
	dev_name text not null,
	phone text not null,
	email text not null,
	address text not null
);


insert into developers (dev_name,phone,email,address) values ('Dennis Bill','05833838', 'bill@gmail.com', 'Accra');
insert into developers (dev_name,phone,email,address) values ('Francis Billa','06478955', 'francis@gmail.com', 'Achimota');


create table currentprojects(
	currentproject_id serial primary key,
	project_id int references projects(project_id),
 	developer_id int references developers(developer_id)
);



create table hours(
	date timestamp not null,
	hours numeric not null,
	project_id int references projects(project_id),
 	developer_id int references developers(developer_id)
	
	
);




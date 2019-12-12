drop table if exists employees cascade;
drop table if exists projects cascade;
drop table if exists currentprojects cascade;
drop table if exists hours cascade;

create table projects(
	project_id serial primary key,
	title text not null,
	description text not null

);


create table employees(
	emp_id serial primary key,
	emp_name text not null,
	emp_phone text not null,
	emp_email text not null,
	emp_address text not null,
	emp_role VARCHAR(10)
);


insert into employees (emp_name,emp_phone,emp_email,emp_address) values ('Dennis Bill','05833838', 'bill@gmail.com', 'Accra');
insert into employees (emp_name,emp_phone,emp_email,emp_address) values ('Francis Billa','06478955', 'francis@gmail.com', 'East Lagon');
insert into employees (emp_name,emp_phone,emp_email,emp_address,emp_role) values ('Sam','063456655', 'sam@gmail.com', 'kotobabi','admin');

insert into projects(title, description) values ('tpms','project management system');
insert into projects(title, description) values ('tcms','client management system');

create table currentprojects(
	currentproject_id serial primary key,
	project_id int references projects(project_id),
 	emp_id int references employees(emp_id)
);

insert into currentprojects (project_id,emp_id) VALUES(1,1);


create table hours(
	date timestamp not null,
	hours numeric not null,
	project_id int references projects(project_id),
 	emp_id int references employees(emp_id)	
);

insert into hours(date,hours,project_id,emp_id) values ('2019-12-30',5,2,1);




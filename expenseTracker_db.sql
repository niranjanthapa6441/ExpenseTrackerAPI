create table et_users(user_id serial primary key,
username varchar(30) not null,
password text not null,
email varchar(255) not null);
create table et_categories(categories_id serial primary key,
user_id integer not null,title varchar(50) not null,description varchar(40) not null,
foreign key (user_id) references et_users(user_id)
);
create table et_transactions(
transaction_id serial,
user_id integer,
categories_id integer,
amount numeric(10,2) not null,
note varchar(50) not null,
transaction_date bigint not null,
primary key(transaction_id,user_id,categories_id),
foreign key (user_id) references et_users(user_id),
foreign key (categories_id) references et_categories(categories_id)
);
create sequence et_users_sequence increment 1 start 1;
create sequence et_categories_sequence increment 1 start 1;`
create sequence et_transactions_sequence increment 1 start 1000;
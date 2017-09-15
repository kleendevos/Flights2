insert into passenger (id, first_name, last_name, frequent_flyer) values (1000, 'Erik', 'Erikson', 20000);
insert into passenger (id, first_name, last_name, frequent_flyer) values (2000, 'Jan', 'Janssens', 20000);
insert into passenger (id, first_name, last_name, frequent_flyer) values (3000, 'Peter', 'Peeters', 20000);
insert into passenger (id, first_name, last_name, frequent_flyer) values (4000, 'Donald', 'Donaldson', 20000);
insert into passenger (id, first_name, last_name, frequent_flyer) values (5000, 'Christian', 'Christianson', 20000);
insert into passenger (id, first_name, last_name, frequent_flyer) values (6000, 'Sven', 'Svenson', 20000);

insert into flight (id, number, departure, destination) values (1000, 'SN520', 'Brussels', 'Stockholm');
insert into flight (id, number, departure, destination) values (2000, 'SN509', 'Brussels', 'Oslo');
insert into flight (id, number, departure, destination) values (3000, 'SN510', 'Brussels', 'Helsinki');

insert into ticket (id, price, flight_id, passenger_id) values (1000, 300, 1000, 3000);
insert into ticket (id, price, flight_id, passenger_id) values (2000, 250, 2000, 1000);
insert into ticket (id, price, flight_id, passenger_id) values (3000, 399.20, 3000, 4000);
insert into ticket (id, price, flight_id, passenger_id) values (4000, 350.99, 3000, 6000);
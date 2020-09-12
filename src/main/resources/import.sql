insert into bandeira (nome, nfce_id) values ('Visa', '1');
insert into bandeira (nome, nfce_id) values ('Master', '2');
insert into bandeira (nome, nfce_id) values ('Amex', '3');

insert into tipo (nome) values ('Credito');
insert into tipo (nome) values ('Debito');

insert into produto (id_bandeira, id_tipo, nome) values (1, 1, 'Visa Credito');
insert into produto (id_bandeira, id_tipo, nome) values (1, 2, 'Visa Eletron');
insert into produto (id_bandeira, id_tipo, nome) values (2, 1, 'Master');
insert into produto (id_bandeira, id_tipo, nome) values (2, 2, 'Maestro');
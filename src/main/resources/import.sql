insert into bandeira (id_bandeira, nome, nfce_id) values (1, 'Visa', '1');
insert into bandeira (id_bandeira, nome, nfce_id) values (2, 'Master', '2');
insert into bandeira (id_bandeira, nome, nfce_id) values (3, 'Amex', '3');

insert into tipo (id_tipo, nome) values (1, 'Credito');
insert into tipo (id_tipo, nome) values (2, 'Debito');

insert into produto (id_produto, id_bandeira, id_tipo, nome) values (1, 1, 1, 'Visa Credito');
insert into produto (id_produto, id_bandeira, id_tipo, nome) values (2, 1, 2, 'Visa Eletron');
insert into produto (id_produto, id_bandeira, id_tipo, nome) values (3, 2, 1, 'Master');
insert into produto (id_produto, id_bandeira, id_tipo, nome) values (4, 2, 2, 'Maestro');
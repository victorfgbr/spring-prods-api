insert into bandeira (nome, nfce_id) values ('Visa', '1');
insert into bandeira (nome, nfce_id) values ('Master', '2');
insert into bandeira (nome, nfce_id) values ('Amex', '3');

insert into tipo (nome) values ('Credito');
insert into tipo (nome) values ('Debito');

insert into produto (id_bandeira, id_tipo, nome) values (1, 1, 'Visa Credito');
insert into produto (id_bandeira, id_tipo, nome) values (1, 2, 'Visa Eletron');
insert into produto (id_bandeira, id_tipo, nome) values (2, 1, 'Master');
insert into produto (id_bandeira, id_tipo, nome) values (2, 2, 'Maestro');

insert into autorizador (nome) values ('Cielo');
insert into autorizador (nome) values ('Rede');
insert into autorizador (nome) values ('Safra');
insert into autorizador (nome) values ('Stone');
insert into autorizador (nome) values ('Bin');

insert into issuer (codigo, id_autorizador, id_produto) values ('CL01', 1, 1);
insert into issuer (codigo, id_autorizador, id_produto) values ('CL02', 1, 2);
insert into issuer (codigo, id_autorizador, id_produto) values ('CL03', 1, 3);
insert into issuer (codigo, id_autorizador, id_produto) values ('CL04', 1, 4);
insert into issuer (codigo, id_autorizador, id_produto) values ('RD01', 2, 1);
insert into issuer (codigo, id_autorizador, id_produto) values ('RD02', 2, 2);
insert into issuer (codigo, id_autorizador, id_produto) values ('RD03', 2, 3);
insert into issuer (codigo, id_autorizador, id_produto) values ('RD04', 2, 4);
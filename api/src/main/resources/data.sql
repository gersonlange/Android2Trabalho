insert into usuario (id, usuario, senha, nome) values(1,'joao', '1234', 'Joao da Silva');
insert into usuario (id, usuario, senha, nome) values(2,'maria', '1111', 'Maria de Souza');

insert into regiao (id, codigo, nome) values (1, 1, 'Rio do Sul');
insert into regiao (id, codigo, nome) values (2, 2, 'Grande Florianopolis');
insert into regiao (id, codigo, nome) values (3, 3, 'Taio');

insert into cliente (id, codigo, nome, endereco, id_regiao) values (1, 1, 'Joao da Silva' , 'Rua XV de novembro, 1234 - Centro - Rio do Sul / SC', 1);
insert into cliente (id, codigo, nome, endereco, id_regiao) values (2, 2, 'Paulo da Costa', 'Avenida Gov Ivo Silveira, 1234 - Canta Galo - Rio do Sul / SC', 1);
insert into cliente (id, codigo, nome, endereco, id_regiao) values (3, 3, 'Carlos Blabla' , 'Rua Cel Teste, 222 - Budag - Sao Jose / SC', 2);
insert into cliente (id, codigo, nome, endereco, id_regiao) values (4, 4, 'Rubens' , 'Rua Cel Teste, 222 - Budag - Sao Jose / SC', 2);
insert into cliente (id, codigo, nome, endereco, id_regiao) values (5, 5, 'Cia da Roupa' , 'Rua Cel Teste, 222 - Budag - Sao Jose / SC', 2);
insert into cliente (id, codigo, nome, endereco, id_regiao) values (6, 6, 'Loja da tia' , 'Rua 1234, 666 - Centro - Sao Jose / SC', 3);
insert into cliente (id, codigo, nome, endereco, id_regiao) values (7, 7, 'Mercada da Esquina' , 'Rua de Lado, 789 - Centro - Sao Jose / SC', 3);

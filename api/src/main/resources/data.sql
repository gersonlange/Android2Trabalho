insert into usuario (id, usuario, senha, nome) values(1,'joao', '1234', 'Joao da Silva');
insert into usuario (id, usuario, senha, nome) values(2,'maria', '1111', 'Maria de Souza');

insert into regiao (id, codigo, nome) values (1, 1, 'Rio do Sul');
insert into regiao (id, codigo, nome) values (2, 2, 'Grande Florianopolis');
insert into regiao (id, codigo, nome) values (3, 3, 'Taio');

insert into cliente (id, codigo, nome, endereco, id_regiao, latitude, longitude) values (1, 1, 'Joao da Silva' , 'Rua XV de novembro, 1234 - Centro - Rio do Sul / SC', 1, -27.206565, -49.647233);
insert into cliente (id, codigo, nome, endereco, id_regiao, latitude, longitude) values (2, 2, 'Paulo da Costa', 'Avenida Gov Ivo Silveira, 1234 - Canta Galo - Rio do Sul / SC', 1, -27.208714, -49.628871);
insert into cliente (id, codigo, nome, endereco, id_regiao, latitude, longitude) values (3, 3, 'Carlos Blabla' , 'Rua Cel Teste, 222 - Budag - Sao Jose / SC', 2, -27.587888, -48.619325);
insert into cliente (id, codigo, nome, endereco, id_regiao, latitude, longitude) values (4, 4, 'Rubens' , 'Rua Cel Teste, 222 - Budag - Sao Jose / SC', 2, -27.596027, -48.623231);
insert into cliente (id, codigo, nome, endereco, id_regiao, latitude, longitude) values (5, 5, 'Cia da Roupa' , 'Rua Cel Teste, 222 - Budag - Sao Jose / SC', 2, -27.589067, -48.622115);
insert into cliente (id, codigo, nome, endereco, id_regiao, latitude, longitude) values (6, 6, 'Loja da tia' , 'Rua 1234, 666 - Centro - Sao Jose / SC', 3, -27.116878, -50.008833);
insert into cliente (id, codigo, nome, endereco, id_regiao, latitude, longitude) values (7, 7, 'Mercada da Esquina' , 'Rua de Lado, 789 - Centro - Sao Jose / SC', 3, -27.117842, -50.005196);

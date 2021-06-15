INSERT INTO tb_user (name, email, password) VALUES ('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Ana', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_genre (name) VALUES ('Aventura');
INSERT INTO tb_genre (name) VALUES ('Suspense');
INSERT INTO tb_genre (name) VALUES ('Terror');
INSERT INTO tb_genre (name) VALUES ('Ficção');

INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('O Senhor dos Anéis', 'A Sociedade do Anel', 2001, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/tlvsNCwWEIgwAM23aNzTmMIcPEZ.jpg', 'Em uma terra fantástica e única, um hobbit recebe de presente de seu tio um anel mágico e maligno que precisa ser destruído antes que caia nas mãos do mal. Para isso, o hobbit Frodo tem um caminho árduo pela frente, onde encontra perigo, medo e seres bizarros. Ao seu lado para o cumprimento desta jornada, ele aos poucos pode contar com outros hobbits, um elfo, um anão, dois humanos e um mago, totalizando nove pessoas que formam a Sociedade do Anel.', 1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('O Senhor dos Anéis', 'O Retorno do Rei', 2003, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/izPNMzffsgZUvlbiYlPxjFr3TAa.jpg', 'O confronto final entre as forças do bem e do mal que lutam pelo controle do futuro da Terra Média se aproxima. Sauron planeja um grande ataque a Minas Tirith, capital de Gondor, o que faz com que Gandalf e Pippin partam para o local na intenção de ajudar a resistência. Um exército é reunido por Theoden em Rohan, em mais uma tentativa de deter as forças de Sauron. Enquanto isso, Frodo, Sam e Gollum seguem sua viagem rumo à Montanha da Perdição para destruir o anel.', 1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('O Senhor dos Anéis', 'As Duas Torres', 2002, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/3ipAMPu9AMKaOMWthjCRRmVHdSX.jpg', 'Após a captura de Merry e Pippy pelos orcs, a Sociedade do Anel é dissolvida. Frodo e Sam seguem sua jornada rumo à Montanha da Perdição para destruir o anel e descobrem que estão sendo perseguidos pelo misterioso Gollum. Enquanto isso, Aragorn, o elfo e arqueiro Legolas e o anão Gimli partem para resgatar os hobbits sequestrados e chegam ao reino de Rohan, onde o rei Theoden foi vítima de uma maldição mortal de Saruman.', 1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('O Hobbit', 'A Desolação de Smaug', 2013, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/beqHE5BZY5LczMxJezL4FdY7mBp.jpg', 'Ao lado de um grupo de anões e de Gandalf, Bilbo segue em direção à Montanha Solitária, onde deverá ajudar seus companheiros a retomar a Pedra de Arken. O problema é que o artefato está perdido em meio a um tesouro protegido pelo temido dragão Smaug.', 1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('O Hobbit', 'A Batalha dos Cinco Exércitos', 2014, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/q9eDVkrj2moWTZp8PZiPccjs5Vo.jpg', 'O dragão Smaug lança sua fúria ardente contra a Cidade do Lago que fica próxima da montanha de Erebor. Bard consegue derrotá-lo, mas, rapidamente, sem a ameaça do dragão, inicia-se uma batalha pelo controle de Erebor e sua riqueza. Os anões, liderados por Thorin, adentram a montanha e estão dispostos a impedir a entrada de elfos, anões e orcs. Bilbo Bolseiro e Gandalf tentam impedir a guerra.', 1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('O Hobbit', 'Uma Jornada Inesperada', 2012, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/asuSvb1MDN04HftUFxlp7i6ZHpV.jpg', 'Como a maioria dos hobbits, Bilbo Bolseiro leva uma vida tranquila até o dia em que recebe uma missão do mago Gandalf. Acompanhado por um grupo de anões, ele parte numa jornada até a Montanha Solitária para libertar o Reino de Erebor do dragão Smaug.', 1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Star Wars', 'Episódio I - A Ameaça Fantasma', 1999, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/noVm3w6RiIftkvLZbi7upH2Ws0S.jpg', 'Enquanto resgatam a Rainha Amidala, governante de um planeta pacífico invadido por forças ameaçadoras, os Cavaleiros Jedi Obi-Wan Kenobi e Qui-Gon Jinn descobrem Anakin Skywalker, uma criança prodígio de 9 anos excepcionalmente poderosa na Força.', 4);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Star Wars', 'Episódio II - Ataque dos Clones', 2002, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/s2ONgVK8ucLfobZn7VTyaAKH0yA.jpg', 'Com a missão de proteger a Senadora Amidala, Anakin Skywalker descobre o seu amor por ela, do mesmo modo que vai conhecendo seu lado sombrio. Obi-Wan Kenobi descobre um exército de clones à medida que a Galáxia caminha para uma grande guerra.', 4);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Star Wars', 'Episódio III - A Vingança dos Sith', 2005, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/m4ihKTuWHiNa5u09OgFtvpnedQ6.jpg', 'As Guerras Clônicas estão em pleno andamento e Anakin Skywalker mantém um elo de lealdade com Palpatine, ao mesmo tempo em que luta para que seu casamento com Padmé Amidala não seja afetado por esta situação. Seduzido por promessas de poder, Anakin se aproxima cada vez mais de Darth Sidious até se tornar o temível Darth Vader. Juntos eles tramam um plano para aniquilar de uma vez por todas com os cavaleiros jedi.', 4);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Star Wars', 'Episódio IV - O Retorno de Jedi', 1983, 'https://image.tmdb.org/t/p/w600_and_h900_bestv2/e57CeQLHE5WWzWy3oq03IVmAyfp.jpg', 'O imperador está supervisionando a construção de uma nova Estrela da Morte. Enquanto isso Luke Skywalker liberta Han Solo e a Princesa Leia das mãos de Jaba. Luke só se tornará um cavaleiro jedi quando destruir Darth Vader, que ainda pretende atraí-lo para o lado sombrio da Força.', 4);

INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Melhor filme da vida', 1, 1);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Amo Star Wars', 7, 2);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Melhor que Senhor dos anéis', 4, 1);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Me decepcionei', 3, 2);
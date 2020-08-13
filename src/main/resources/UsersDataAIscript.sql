DROP TABLE IF EXISTS UsersDataAI;


CREATE TABLE UsersDataAI(
-- 	ID_USER SERIAL,
	NAZWA varchar(15),
	ODP1 varchar(15),
	ODP2 varchar(15),
	ODP3 varchar(15),
	ODP4 varchar(15),
	ODP5 varchar(15),
	ODP6 varchar(15),
	POMOCNY varchar(5)
-- 	PRIMARY KEY(ID_USER)
);

INSERT INTO UsersDataAI (NAZWA, ODP1, ODP2, ODP3, ODP4, ODP5, ODP6, POMOCNY) VALUES 
('Bartosz', '1','1','1','1','1','1','1');

SELECT *
-- 	NAZWA as Imie,
-- 	ODP1 as nr_1,
-- 	ODP2 as nr_2,
-- 	ODP3 as nr_3,
-- 	ODP4 as nr_4,
-- 	ODP5 as nr_5,
-- 	ODP6 as nr_6,
-- 	POMOCNY as Pomocny
	FROM UsersDataAI;

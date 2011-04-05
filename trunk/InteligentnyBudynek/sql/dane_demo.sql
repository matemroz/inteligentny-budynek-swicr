USE InteligentnyBudynek
GO

DBCC CHECKIDENT (Pokoj, RESEED, 0);
GO
DBCC CHECKIDENT (Urzadzenia, RESEED, 0);
GO
DBCC CHECKIDENT (PracaUrzadzenia, RESEED, 0);
GO

TRUNCATE TABLE Pokoj;
TRUNCATE TABLE Urzadzenia;
TRUNCATE TABLE PracaUrzadzenia;
TRUNCATE TABLE GazPrad;
GO

INSERT INTO Pokoj (nazwa) VALUES ('Sypialnia');
INSERT INTO Pokoj (nazwa) VALUES ('Sypialnia');
INSERT INTO Pokoj (nazwa) VALUES ('Sypialnia');
INSERT INTO Pokoj (nazwa) VALUES ('Salon');
INSERT INTO Pokoj (nazwa) VALUES ('Kuchnia');
INSERT INTO Pokoj (nazwa) VALUES ('Łazienka');
GO

INSERT GazPrad VALUES ('Gaz', 4);
INSERT GazPrad VALUES ('Prad', 3);
GO

INSERT INTO Urzadzenia (idPokoju, nazwa, moc) VALUES (1, 'Alarm', 10);
INSERT INTO Urzadzenia (idPokoju, nazwa, moc) VALUES (1, 'Czujnik ruchu', 8);
INSERT INTO Urzadzenia (idPokoju, nazwa, moc) VALUES (1, 'Analizator gazów', 11);
INSERT INTO Urzadzenia (idPokoju, nazwa, moc) VALUES (1, 'Czujnik temperatury', 11);
INSERT INTO Urzadzenia (idPokoju, nazwa, moc) VALUES (1, 'Zraszacz przeciwpożarowy', 18);
INSERT INTO Urzadzenia (idPokoju, nazwa, moc) VALUES (1, 'Punkt świetlny', 30);
INSERT INTO Urzadzenia (idPokoju, nazwa, moc) VALUES (1, 'Punkt świetlny', 40);
INSERT INTO Urzadzenia (idPokoju, nazwa, moc) VALUES (1, 'Punkt świetlny', 25);
GO
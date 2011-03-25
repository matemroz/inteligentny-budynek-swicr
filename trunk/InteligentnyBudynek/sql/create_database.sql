DECLARE @db_name varchar(100)
SET @db_name='InteligentnyBudynek'
IF EXISTS(SELECT * FROM sys.sysdatabases where name=@db_name)
	PRINT 'Database exists'
else
	CREATE DATABASE InteligentnyBudynek
GO

USE [master]
GO
CREATE LOGIN [budynek] WITH PASSWORD=N'haslo', DEFAULT_DATABASE=[master], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
EXEC master..sp_addsrvrolemember @loginame = N'test', @rolename = N'sysadmin'
GO 

USE InteligentnyBudynek
GO

IF NOT EXISTS (SELECT * FROM SYSOBJECTS O
	WHERE O.[NAME] = 'Pokoj'
	AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1) 
)

CREATE TABLE Pokoj(
  idPokoju INT IDENTITY NOT NULL PRIMARY KEY,
  nazwa VARCHAR(255)
)
GO

IF NOT EXISTS (SELECT * FROM SYSOBJECTS O
	WHERE O.[NAME] = 'Urzadzenia'
	AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1) 
)

CREATE TABLE Urzadzenia(
  idUrzadzenia INT IDENTITY NOT NULL PRIMARY KEY,
  idPokoju INT NOT NULL,
  nazwa VARCHAR(255),
  moc FLOAT,
  poborGazu FLOAT
)
GO

IF NOT EXISTS (SELECT * FROM SYSOBJECTS O
	WHERE O.[NAME] = 'PracaUrzadzenia'
	AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1) 
)
CREATE TABLE PracaUrzadzenia(
  idPracaUrzadzenia INT IDENTITY NOT NULL PRIMARY KEY,
  idUrzadzenia INT NOT NULL,
  startPracy DATETIME,
  koniecPracy DATETIME,
  czasPracy as convert(int,datediff(s, startPracy, koniecPracy))
)
GO

IF NOT EXISTS (SELECT * FROM SYSOBJECTS O
	WHERE O.[NAME] = 'GazPrad'
	AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1) 
)
CREATE TABLE GazPrad(
	gaz FLOAT NOT NULL,
    prad FLOAT NOT NULL
)
GO

-- CREATE DATABASE union_station_db;
-- GO
-- USE union_station_db;

---------------------------------------------------------------
-- Создание таблиц и PK 
---------------------------------------------------------------

CREATE TABLE Cargo_Category(
    Category_ID		INTEGER		NOT NULL	PRIMARY KEY,
    Category_Name	VARCHAR(30)	NOT NULL	UNIQUE,
)
;
CREATE TABLE Cargo(
    Cargo_ID		INTEGER		NOT NULL	PRIMARY KEY,
    Netto			INTEGER		NOT NULL,
    Category_ID		INTEGER		NOT NULL,
)
;
CREATE TABLE Train(
    Train_ID		INTEGER		NOT NULL	PRIMARY KEY,
	Wagon_List		VARCHAR(255),
    Date			DATETIME	DEFAULT GETDATE(),
    Next_Station_ID	INTEGER		NOT NULL,
)
;
CREATE TABLE Wagon(
    Wagon_ID				INTEGER		NOT NULL	PRIMARY KEY,
	Number					INTEGER		NOT NULL	UNIQUE,
	Weight					INTEGER		NOT NULL,
    Home_Station_ID			INTEGER		NOT NULL,
	Destination_Station_ID	INTEGER		NOT NULL,
	Cargo_ID				INTEGER,
)
;
CREATE TABLE Wagon_Train(
    Wagon_ID	INTEGER		NOT NULL,
	Train_ID	INTEGER		NOT NULL
)
;
CREATE TABLE Station(
    Station_ID		INTEGER		NOT NULL	PRIMARY KEY,
    Station_Name	VARCHAR(50),
)
;

---------------------------------------------------------------
-- Создание FK 
---------------------------------------------------------------

ALTER TABLE Cargo ADD CONSTRAINT FK_Cargo_Cargo_Category 
    FOREIGN KEY (Category_ID)
    REFERENCES Cargo_Category(Category_ID)
;
ALTER TABLE Wagon ADD CONSTRAINT FK_Wagon_Cargo 
    FOREIGN KEY (Cargo_ID)
    REFERENCES Cargo(Cargo_ID)
;
ALTER TABLE Wagon_Train ADD CONSTRAINT FK_Wagon_Train_Wagon
    FOREIGN KEY (Wagon_ID)
    REFERENCES Wagon(Wagon_ID)
;
ALTER TABLE Wagon_Train ADD CONSTRAINT FK_Wagon_Train_Train
    FOREIGN KEY (Train_ID)
    REFERENCES Train(Train_ID)
;
ALTER TABLE Train ADD CONSTRAINT FK_Train_Station
    FOREIGN KEY (Next_Station_ID)
    REFERENCES Station(Station_ID)
;
ALTER TABLE Wagon ADD CONSTRAINT FK_Wagon_Station1
    FOREIGN KEY (Home_Station_ID)
    REFERENCES Station(Station_ID)
;
ALTER TABLE Wagon ADD CONSTRAINT FK_Wagon_Station2
    FOREIGN KEY (Destination_Station_ID)
    REFERENCES Station(Station_ID)
;

---------------------------------------------------------------
-- Удаление (а оно вам надо?) 
---------------------------------------------------------------
/*
DROP TABLE Wagon_Train;
DROP TABLE Train;
DROP TABLE Wagon;
DROP TABLE Station;
DROP TABLE Cargo;
DROP TABLE Cargo_Category;
*/
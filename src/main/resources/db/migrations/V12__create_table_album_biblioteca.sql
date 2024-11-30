CREATE TABLE IF NOT EXISTS Album_biblioteca(
    id_album INT NOT NULL,
    id_biblioteca INT NOT NULL,
    PRIMARY KEY(id_album,id_biblioteca),
    FOREIGN KEY(id_album) REFERENCES Album(id_album),
    FOREIGN KEY(id_biblioteca) REFERENCES Biblioteca(id_biblioteca)
);
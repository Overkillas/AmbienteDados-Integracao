CREATE TABLE IF NOT EXISTS Playlist (
    id_playlist INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    isVisible BOOLEAN NOT NULL,
    id_biblioteca INT NOT NULL,
    PRIMARY KEY (id_playlist),
    FOREIGN KEY (id_biblioteca) REFERENCES Biblioteca(id_biblioteca)
);
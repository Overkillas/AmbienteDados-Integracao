CREATE TABLE IF NOT EXISTS Artista_album(
    id_artista INT NOT NULL,
    id_album INT NOT NULL,
    PRIMARY KEY(id_artista, id_album),
    FOREIGN KEY(id_artista) REFERENCES Artista(id_artista),
    FOREIGN KEY(id_album) REFERENCES Album(id_album)
);
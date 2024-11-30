CREATE TABLE IF NOT EXISTS Playlist_biblioteca(
    id_playlist INT NOT NULL,
    id_biblioteca INT NOT NULL,
    PRIMARY KEY(id_playlist, id_biblioteca),
    FOREIGN KEY(id_playlist) REFERENCES Playlist(id_playlist),
    FOREIGN KEY(id_biblioteca) REFERENCES Biblioteca(id_biblioteca)
);
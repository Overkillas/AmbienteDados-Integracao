CREATE TABLE IF NOT EXISTS Playlist_musica(
    id_playlist INT NOT NULL,
    id_musica INT NOT NULL,
    PRIMARY KEY(id_playlist, id_musica),
    FOREIGN KEY(id_playlist) REFERENCES Playlist(id_playlist),
    FOREIGN KEY(id_musica) REFERENCES Musica(id_musica)
);
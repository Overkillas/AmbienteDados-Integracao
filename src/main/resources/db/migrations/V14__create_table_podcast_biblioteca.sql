CREATE TABLE IF NOT EXISTS Podcast_biblioteca(
    id_podcast INT NOT NULL,
    id_biblioteca INT NOT NULL,
    PRIMARY KEY(id_podcast, id_biblioteca),
    FOREIGN KEY(id_podcast) REFERENCES Podcast(id_podcast),
    FOREIGN KEY(id_biblioteca) REFERENCES Biblioteca(id_biblioteca)
);
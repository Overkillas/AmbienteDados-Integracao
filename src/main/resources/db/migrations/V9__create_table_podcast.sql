CREATE TABLE IF NOT EXISTS Podcast(
    id_podcast INT NOT NULL,
    titulo VARCHAR(255) NOT NULL,
    descricao TEXT NOT NULL,
    duracao TIME NOT NULL,
    data_lancamento DATE NOT NULL,
    id_artista INT NOT NULL,
    PRIMARY KEY(id_podcast),
    FOREIGN KEY(id_artista) REFERENCES Artista(id_artista)
);
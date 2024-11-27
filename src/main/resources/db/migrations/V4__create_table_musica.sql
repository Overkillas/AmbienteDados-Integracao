CREATE TABLE IF NOT EXISTS Musica (
    id_musica INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    duracao TIME NOT NULL,
    data_lancamento DATE NOT NULL,
    id_artista INT NOT NULL,
    PRIMARY KEY (id_musica),
    FOREIGN KEY (id_artista) REFERENCES Artista(id_artista)
);
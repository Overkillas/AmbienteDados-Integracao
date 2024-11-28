CREATE TABLE IF NOT EXISTS Album (
    id_album INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    data_lancamento DATE NOT NULL,
    id_artista INT NOT NULL,
    PRIMARY KEY (id_album),
    FOREIGN KEY (id_artista) REFERENCES Artista(id_artista)
);
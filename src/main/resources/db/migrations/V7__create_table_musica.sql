CREATE TABLE IF NOT EXISTS Musica (
    id_musica INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    duracao TIME NOT NULL,
    data_lancamento DATE NOT NULL,
    id_artista INT NOT NULL,
    id_genero_musical INT NOT NULL,
    id_album INT NOT NULL,
    PRIMARY KEY (id_musica),
    FOREIGN KEY (id_genero_musical)  REFERENCES Genero_Musical(id_genero_musical),
    FOREIGN KEY (id_album)  REFERENCES Album(id_album)
);
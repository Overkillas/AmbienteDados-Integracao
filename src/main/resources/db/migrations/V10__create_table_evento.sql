CREATE TABLE IF NOT EXISTS Evento(
    id_evento INT NOT NULL,
    localizacao VARCHAR(255) NOT NULL,
    data DATE NOT NULL,
    horario TIME NOT NULL,
    id_artista INT NOT NULL,
    PRIMARY KEY(id_evento),
    FOREIGN KEY(id_artista) REFERENCES Artista(id_artista)
);
CREATE TABLE IF NOT EXISTS Artista (
	id_artista INT NOT NULL AUTO_INCREMENT,
    nome_artistico VARCHAR(255) NOT NULL,
    biografia TEXT NOT NULL,
    pais_origem VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_artista)
);
CREATE INDEX index_artista
ON artista (id_artista);

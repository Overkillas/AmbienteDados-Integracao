CREATE TABLE IF NOT EXISTS Artista (
	id_artista INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    nome_artistico VARCHAR(255) NOT NULL,
    biografia TEXT NOT NULL,
    pais_origem VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_artista)
);

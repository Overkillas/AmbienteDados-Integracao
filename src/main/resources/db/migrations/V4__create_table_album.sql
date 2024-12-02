CREATE TABLE IF NOT EXISTS Album (
    id_album INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    data_lancamento DATE NOT NULL,
    PRIMARY KEY (id_album)
);
CREATE INDEX index_album
ON album (id_album);
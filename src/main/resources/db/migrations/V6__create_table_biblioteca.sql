CREATE TABLE IF NOT EXISTS Biblioteca (
    id_biblioteca INT NOT NULL AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    id_musica INT NOT NULL,
    PRIMARY KEY (id_biblioteca),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario)
);
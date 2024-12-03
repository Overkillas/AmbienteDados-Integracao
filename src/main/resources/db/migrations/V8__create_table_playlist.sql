CREATE TABLE IF NOT EXISTS Playlist (
    id_playlist INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    is_visible BOOLEAN NOT NULL DEFAULT TRUE,
    id_usuario INT NOT NULL,
    PRIMARY KEY (id_playlist),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario)
);
CREATE TABLE IF NOT EXISTS Usuario(
	id_usuario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    sobrenome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    data_nascimento DATE NOT NULL,
    id_assinatura INT NOT NULL,
    PRIMARY KEY (id_usuario),
    FOREIGN KEY(id_assinatura) REFERENCES Assinatura(id_assinatura)

);
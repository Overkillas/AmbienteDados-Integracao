CREATE TABLE Assinatura (
	id_assinatura INT NOT NULL AUTO_INCREMENT,
    planos ENUM('NENHUM','INDIVIDUAL', 'FAMILIA') DEFAULT 'DESATIVADO',
    data_compra DATE NOT NULL,
    forma_pagamento ENUM('CREDITO', 'DEBITO') DEFAULT NULL,
    PRIMARY KEY (id_assinatura)
)
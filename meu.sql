CREATE DATABASE Estacionamento;
USE Estacionamento;


CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    login VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);


CREATE TABLE Veiculos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cor VARCHAR(20) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    placa VARCHAR(10) UNIQUE NOT NULL,
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(id)
);


CREATE TABLE Frequencia (
    id INT AUTO_INCREMENT PRIMARY KEY,
    veiculo_id INT NOT NULL,
    data_entrada DATETIME NOT NULL,
    data_saida DATETIME,
    FOREIGN KEY (veiculo_id) REFERENCES Veiculos(id)
);


CREATE TABLE Vagas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero INT UNIQUE NOT NULL,
    status ENUM('Disponível', 'Reservado', 'Lotado') NOT NULL
);


CREATE TABLE Pagamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    veiculo_id INT NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    forma_pagamento ENUM('À vista', 'Cartão de Débito', 'Cartão de Crédito') NOT NULL,
    data_pagamento DATETIME NOT NULL,
    FOREIGN KEY (veiculo_id) REFERENCES Veiculos(id)
);


CREATE TABLE Tarifas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo_veiculo ENUM('Pequeno', 'Médio', 'Grande') NOT NULL,
    valor DECIMAL(10,2) NOT NULL
);

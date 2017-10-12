create database UserDB;
use UserDB;

CREATE TABLE UserDB.`users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`userid`)
);

CREATE TABLE UserDB.`Oficinas` (
    'Oficina' int (2) NOT NULL,
    'Ciudad' varchar(30) NOT NULL,
    'Region' varchar(30) NOT NULL,
    'Dir' int (3) NOT NULL,
    'Objetivo' float(10) NOT NULL,
    'Ventas' float(10) NOT NULL,
    PRIMARY KEY('Oficina')
);

CREATE TABLE UserDB.`Productos` (
    'Id_Fab' varchar (3) NOT NULL,
    'Id_Producto' varchar(6) NOT NULL,
    'Descripcion' varchar(30) NOT NULL,
    'Precio' float(8) NOT NULL
    'Existencias' int (5) NOR NULL,
    PRIMARY KEY('Id_Fab','Id_Producto')
);


CREATE TABLE UserDB.`Repventas` (
    'Num_Empl' int (3) NOT NULL,
    'Nombre' varchar(30) NOT NULL,
    'Edad' int(2) NOT NULL,
    'Oficina_Rep' int(2),
    'Titulo'    varchar(30) NOT NULL,
    'Contrato' date NOT NULL,
    'Director' int(3),
    'Cuota' float(10),
    'Ventas' float(10),
    PRIMARY KEY('Num_Empl'),
    FOREIGN KEY(Oficina_Rep,Director) REFERENCES (Oficinas(Oficina),Repventas(Num_Empl))
);


CREATE TABLE UserDB.`Clientes` (
    'Num_Clie' int (5) NOT NULL,
    'Empresa' varchar(30) NOT NULL,
    'RepClie' int(3) NOT NULL,
    'Limite_Credito' float(10) NOT NULL
    PRIMARY KEY('Num_Clie'),
    FOREIGN KEY(RepClie) REFERENCES (Repventas(Num_Empl))
);

CREATE TABLE UserDB.`Pedidos` (
    'Num_Pedido' int (6) NOT NULL,
    'Fecha_Pedido' date NOT NULL,
    'Clie' int(5) NOT NULL,
    'Rep' int(3),
    'Fab' varchar(3) NOT NULL,
    'Producto' varchar(6) NOT NULL,
    'Cant' int(3) NOT NULL,
    'Importe' float(10) NOT NULL,
    PRIMARY KEY('Num_Pedido'),
    FOREIGN KEY(Clie,Rep,Fab,Producto) REFERENCES (Clientes(Num_clie),Repventas(Num_Emple),Productos(Id_Fab),Productos(Id_Producto))
);


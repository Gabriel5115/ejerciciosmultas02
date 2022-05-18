INSERT INTO AGENTES (CODIGO, NOMBRE, APELLIDO1, APELLIDO2) VALUES 
(1000, 'Gabriel', 'Garcia', 'tenedor'),
(1001, 'David', 'tenedor', 'Lumbreras'),
(1002, 'Antonio', 'Martinez', 'Clemente');

INSERT INTO VEHICULOS (MATRICULA, MARCA, MODELO, COLOR) VALUES 
('1111AAA', 'AUDI', 'Q3', 'NEGRO'),
('2222BBB', 'TOYOTA', 'AVENSIS', 'BLANCO'),
('3333CCC', 'BMW', 'M3', 'AZUL');

INSERT INTO MULTAS (CODIGO, CODIGO_AGENTE, MATRICULA_VEHICULO, FECHA_HORA, LONGITUD, LATITUD, IMPORTE, OBSERVACIONES, INFRACCION) VALUES 
(1, 1001, '2222BBB', '2020-02-15 00:00:00', 254, 50, 500, 'SALTARSE CONTINUA', 'GRAVE'),
(2, 1002, '3333CCC', '2020-03-15 00:00:00', 100, NULL, 1200, 'CHOQUE FRONTAL', 'MUY_GRAVE'),
(3, 1000, '2222BBB', '2020-04-15 00:00:00', 254, 600, 500, 'MOVIL', 'GRAVE'),
(4, 1002, '1111AAA', '2020-05-15 00:00:00', NULL, 5, 276.23, 'MOVIL', 'GRAVE'),
(5, 1001, '1111AAA', '2020-06-15 00:00:00', 63, 1, 500, 'MOVIL', 'GRAVE'),
(6, 1000, '2222BBB', '2020-07-15 00:00:00', 56, 745, 800.56, 'SALTARSE STOP', 'GRAVE'),
(7, 1000, '3333CCC', '2020-08-15 00:00:00', 741, NULL, 45.9, 'MOVIL', 'LEVE');
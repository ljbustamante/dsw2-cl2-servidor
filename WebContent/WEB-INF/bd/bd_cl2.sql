use dsw2_cl2;

CREATE TABLE `tb_producto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `marca` varchar(30) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarProductosRangoPrecio`(minimo double, maximo double)
BEGIN
	select * from tb_producto where precio >= minimo and precio <= maximo;
END ;;
DELIMITER ;

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_guardarProducto`(nombre varchar(30), marca varchar(30), precio double, stock int)
BEGIN
 insert into tb_producto values(null, nombre, marca, precio, stock);
END ;;
DELIMITER ;
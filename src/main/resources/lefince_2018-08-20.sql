# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.22)
# Database: lefince
# Generation Time: 2018-08-20 05:49:45 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table account
# ------------------------------------------------------------

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(13) NOT NULL,
  `name` varchar(45) NOT NULL,
  `cnname` varchar(45) DEFAULT NULL,
  `birthday_month` int(11) DEFAULT NULL,
  `birthday_day` int(11) DEFAULT NULL,
  `birthday_year` int(11) DEFAULT NULL,
  `password` varchar(12) NOT NULL,
  `wechart_id` varchar(256) DEFAULT NULL,
  `alipay_id` varchar(256) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `account_id_UNIQUE` (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;

INSERT INTO `account` (`account_id`, `phone`, `name`, `cnname`, `birthday_month`, `birthday_day`, `birthday_year`, `password`, `wechart_id`, `alipay_id`, `create_time`, `update_time`)
VALUES
	(1,'13858043045','修改测试！','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-17 12:12:14','2018-08-17 12:12:14'),
	(2,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-17 15:16:09','2018-08-17 15:16:09'),
	(3,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-17 15:16:20','2018-08-17 15:16:20'),
	(4,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-17 15:17:14','2018-08-17 15:17:14'),
	(5,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:26:15','2018-08-20 10:26:15'),
	(6,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:26:16','2018-08-20 10:26:16'),
	(7,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:26:16','2018-08-20 10:26:16'),
	(8,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:26:16','2018-08-20 10:26:16'),
	(9,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:26:16','2018-08-20 10:26:16'),
	(10,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:26:16','2018-08-20 10:26:16'),
	(11,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:26:16','2018-08-20 10:26:16'),
	(12,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:27:18','2018-08-20 10:27:18'),
	(13,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:27:18','2018-08-20 10:27:18'),
	(14,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:27:18','2018-08-20 10:27:18'),
	(15,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:27:18','2018-08-20 10:27:18'),
	(16,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:27:18','2018-08-20 10:27:18'),
	(17,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:27:18','2018-08-20 10:27:18'),
	(18,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:27:18','2018-08-20 10:27:18'),
	(19,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:29:14','2018-08-20 10:29:14'),
	(20,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:35:24','2018-08-20 10:35:24'),
	(21,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:35:35','2018-08-20 10:35:35'),
	(22,'13989801044','dsdfsdf','liqingfeng',11,1,2014,'123456',NULL,NULL,'2018-08-20 10:35:44','2018-08-20 10:35:44');

/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table finace
# ------------------------------------------------------------

DROP TABLE IF EXISTS `finace`;

CREATE TABLE `finace` (
  `finace_id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) NOT NULL,
  `out_type` varchar(45) DEFAULT NULL,
  `finace_type` varchar(45) DEFAULT NULL,
  `finace_code` varchar(45) DEFAULT NULL,
  `finace_name` varchar(45) NOT NULL,
  `pincipal_monty` int(11) NOT NULL,
  `benefit_money` int(11) DEFAULT NULL,
  `benefit_type` varchar(45) DEFAULT NULL,
  `update_time` datetime NOT NULL,
  `create_time` datetime NOT NULL,
  `demo` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`finace_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `finace` WRITE;
/*!40000 ALTER TABLE `finace` DISABLE KEYS */;

INSERT INTO `finace` (`finace_id`, `account_id`, `out_type`, `finace_type`, `finace_code`, `finace_name`, `pincipal_monty`, `benefit_money`, `benefit_type`, `update_time`, `create_time`, `demo`)
VALUES
	(1,11,'out','更新记录','test','盈盈理财',-144,40000,'tetsttype','2018-08-20 10:46:18','2018-08-20 10:46:18',NULL),
	(2,11,'out',NULL,'test','盈盈理财',-122,4000,'tetsttype','2018-08-20 10:41:04','2018-08-20 10:41:04',NULL),
	(3,11,'out',NULL,'test','盈盈理财',-122,4000,'tetsttype','2018-08-20 10:45:53','2018-08-20 10:45:53',NULL),
	(4,11,'out',NULL,'test','盈盈理财',-122,4000,'tetsttype','2018-08-20 10:46:18','2018-08-20 10:46:18',NULL);

/*!40000 ALTER TABLE `finace` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table finacetype
# ------------------------------------------------------------

DROP TABLE IF EXISTS `finacetype`;

CREATE TABLE `finacetype` (
  `fintype_id` int(11) NOT NULL AUTO_INCREMENT,
  `finace_code` varchar(45) NOT NULL,
  `finace_name` varchar(45) NOT NULL,
  `risk_level` varchar(45) NOT NULL,
  `update_time` varchar(45) NOT NULL,
  `create_time` varchar(45) NOT NULL,
  PRIMARY KEY (`fintype_id`),
  UNIQUE KEY `fintype_id_UNIQUE` (`fintype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `finacetype` WRITE;
/*!40000 ALTER TABLE `finacetype` DISABLE KEYS */;

INSERT INTO `finacetype` (`fintype_id`, `finace_code`, `finace_name`, `risk_level`, `update_time`, `create_time`)
VALUES
	(1,'111dfsd','嘉实基金','高','2018-08-20 11:06:33','2018-08-20 11:06:33'),
	(2,'111dfsd','嘉实基金','高','2018-08-20 11:06:44','2018-08-20 11:06:44');

/*!40000 ALTER TABLE `finacetype` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

CREATE DATABASE  IF NOT EXISTS `project1` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `project1`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: project1
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `abc`
--

DROP TABLE IF EXISTS `abc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `abc` (
  `drink_name` varchar(16) DEFAULT NULL,
  `main` varchar(20) DEFAULT NULL,
  `amount1` decimal(3,1) DEFAULT NULL,
  `second` varchar(20) DEFAULT NULL,
  `amount2` decimal(4,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `abc`
--

LOCK TABLES `abc` WRITE;
/*!40000 ALTER TABLE `abc` DISABLE KEYS */;
INSERT INTO `abc` VALUES ('Blackthorn','tonic water',1.5,'pineapple juice',1.00);
/*!40000 ALTER TABLE `abc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accounts` (
  `user_id` int(11) NOT NULL,
  `savings` varchar(45) DEFAULT NULL,
  `chequing` varchar(45) DEFAULT NULL,
  `credits` varchar(45) DEFAULT NULL,
  `investment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (1001,'123459876','52369','96385','464'),(1002,'1223459876','522369','9622741','12472'),(1003,'0','1','23','25'),(1004,'23','25','0','1');
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `history`
--

DROP TABLE IF EXISTS `history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `history` (
  `account#` int(11) NOT NULL,
  `date` varchar(45) DEFAULT NULL,
  `purchase` varchar(45) DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  `transection_id` int(11) NOT NULL,
  PRIMARY KEY (`transection_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `history`
--

LOCK TABLES `history` WRITE;
/*!40000 ALTER TABLE `history` DISABLE KEYS */;
INSERT INTO `history` VALUES (2,'2017-12-31T22:59','3','-0.05',-463020143),(23,'2017-12-30T13:00','1','-0.03',1),(25,'dec 2017','bear','5.00',11),(11,'2018-02-01T14:00','1','-1',464),(23,'2017-12-31T12:58','3','-0.03',4641),(25,'','1','-22',4642),(25,'2018-01-04T17:49','23','865',6465464),(2,'2017-12-31T00:59','3','-021.01',59781312),(1,'2018-01-04T17:45','23','4564.55',150545359),(25,'2018-01-04T19:16','1','-05.13',153765264),(25,'2018-01-04T19:41','1','445',171906377),(2,'2017-12-31T12:59','1','-0666.06',174507303),(25,'2018-01-04T19:24','1','-05.13',218090980),(25,'2017-12-31T12:59','23','-416456',400638490),(1,'','1','45',442234781),(1,'2018-01-04T19:21','25','05.13',577061613),(1,'','1','',581592238),(1,'2018-01-06T15:01','25','4554',596571145),(1,'2018-01-04T19:24','25','05.13',697021829),(23,'','25','-0.09',776276159),(25,'2018-01-04T19:21','1','-05.13',833288973),(1,'2018-01-04T19:22','25','05.13',1087898065),(25,'2018-01-06T15:01','1','-4554',1135228550),(1,'2018-01-04T19:33','25','-445',1159289745),(2,'466','4','-0.08',1206820599),(25,'2018-01-04T19:28','1','445',1224703066),(25,'2018-01-04T19:28','1','445',1257415002),(25,'2017-12-31T00:58','23','-11111',1258975989),(1,'2018-01-04T19:16','25','05.13',1338627640),(25,'2018-01-04T19:22','1','-05.13',1380458024),(25,'','23','0.09',1427574078),(23,'2017-12-31T00:58','25','11111',1437391765),(3,'2017-12-31T12:59','3','-1.2',1665082972),(1,'2018-01-04T19:41','25','-445',1679167321),(1,'2018-01-04T19:28','25','-445',1778774921),(1,'2018-01-04T19:39','25','-445',1806552200),(25,'2018-01-04T19:39','1','445',1834121872),(25,'2018-01-04T19:33','1','445',1909494099),(1,'2018-01-04T19:31','25','-445',1939166939),(25,'2018-01-04T19:31','1','445',2032800322),(23,'2018-01-04T17:45','1','-4564.55',2052861854),(1,'2018-01-04T19:28','25','-445',2057559558);
/*!40000 ALTER TABLE `history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question_list`
--

DROP TABLE IF EXISTS `question_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question_list` (
  `question_no` varchar(20) NOT NULL,
  `question` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`question_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question_list`
--

LOCK TABLES `question_list` WRITE;
/*!40000 ALTER TABLE `question_list` DISABLE KEYS */;
INSERT INTO `question_list` VALUES ('1','What is your mother\'s Maiden name?'),('2','What is your best friend\'s name?'),('3','What is your first pet\'s name?'),('4','In which city you was born?'),('5','Which is your favorite animal?');
/*!40000 ALTER TABLE `question_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `security`
--

DROP TABLE IF EXISTS `security`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `security` (
  `user_id` int(11) NOT NULL,
  `Q1` varchar(50) DEFAULT NULL,
  `Q2` varchar(50) DEFAULT NULL,
  `Q3` varchar(50) DEFAULT NULL,
  `A1` varchar(45) DEFAULT NULL,
  `A2` varchar(50) DEFAULT NULL,
  `A3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security`
--

LOCK TABLES `security` WRITE;
/*!40000 ALTER TABLE `security` DISABLE KEYS */;
INSERT INTO `security` VALUES (1003,'2','1','3','swsw','455','sd'),(1004,'5','4','3','gfgf','ggjhg','hjg'),(107800927,'null','null','null','null','null','null'),(295087754,'3','3','3','60 Bandera Drive','jljjl','hjljnlk'),(810289446,'null','null','null','null','null','null'),(1027470544,'null','null','null','null','null','null'),(1065520486,'null','null','null','null','null','null'),(1587191583,'null','null','null','null','null','null');
/*!40000 ALTER TABLE `security` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(16) NOT NULL,
  `card_num` int(11) DEFAULT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1001,'abcd',987654321,'abc@123@xyz'),(1002,'user1',123456789,'user1001'),(1003,'user2',569874123,'12345678'),(295087754,'abcd',457687865,'12345678');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_profile`
--

DROP TABLE IF EXISTS `user_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_profile` (
  `user_id` int(11) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `prov` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_profile`
--

LOCK TABLES `user_profile` WRITE;
/*!40000 ALTER TABLE `user_profile` DISABLE KEYS */;
INSERT INTO `user_profile` VALUES (1003,'null','null','null','null','null'),(1004,'khgjk','khgkh','gkgk','kgkgj','ljh'),(107800927,'null','null','null','null','null'),(295087754,'Gursimran','Bhullar','60 Bandera Drive','Brampton','Ontario'),(810289446,'null','null','null','null','null'),(1027470544,'null','null','null','null','null'),(1065520486,'null','null','null','null','null'),(1587191583,'null','null','null','null','null');
/*!40000 ALTER TABLE `user_profile` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-10 14:15:50

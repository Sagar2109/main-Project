-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: rentpro
-- ------------------------------------------------------
-- Server version	5.7.31-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `addhouse`
--

DROP TABLE IF EXISTS `addhouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `addhouse` (
  `hno` int(11) NOT NULL,
  `hname` varchar(15) DEFAULT NULL,
  `hdetails` varchar(30) DEFAULT NULL,
  `rent` int(11) DEFAULT NULL,
  `hoccopied` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`hno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addhouse`
--

LOCK TABLES `addhouse` WRITE;
/*!40000 ALTER TABLE `addhouse` DISABLE KEYS */;
INSERT INTO `addhouse` VALUES (1,'aa','aa',5462,0),(2,'sa','afa',532,0),(3,'sa','afa',532,1),(4,'sa','afa',532,0),(8,'ashaavadh','2bhk,2nd floor',5000,0),(10,'sagara','4bhk',50000,0),(11,'dasda','cacsa',50,1);
/*!40000 ALTER TABLE `addhouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `addrenter`
--

DROP TABLE IF EXISTS `addrenter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `addrenter` (
  `rno` int(11) NOT NULL,
  `rname` varchar(13) DEFAULT NULL,
  `rmobile` varchar(10) NOT NULL,
  `rproof` varchar(20) NOT NULL,
  `hno` int(11) DEFAULT NULL,
  `stmonth` date DEFAULT NULL,
  `paydate` date DEFAULT NULL,
  `totalpaid` int(11) DEFAULT NULL,
  `unpaid` int(11) DEFAULT '0',
  `extra` int(11) DEFAULT '0',
  PRIMARY KEY (`rno`,`rmobile`,`rproof`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addrenter`
--

LOCK TABLES `addrenter` WRITE;
/*!40000 ALTER TABLE `addrenter` DISABLE KEYS */;
INSERT INTO `addrenter` VALUES (1,'maniben','951010839','435435',3,'2020-11-24','2020-11-24',532,0,0),(2,'skhekh bhai','951010888','565435',11,'2020-11-24','2020-11-24',50,0,0);
/*!40000 ALTER TABLE `addrenter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `luser` varchar(15) DEFAULT NULL,
  `lpass` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('sagar','sagar');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-24 13:25:07

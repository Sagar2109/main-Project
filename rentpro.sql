-- MySQL dump 10.13  Distrib 5.7.31, for Win32 (AMD64)
--
-- Host: localhost    Database: rentpro
-- ------------------------------------------------------
-- Server version	5.7.31-log

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
-- Table structure for table `addhouse`
--

DROP TABLE IF EXISTS `addhouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
INSERT INTO `addhouse` VALUES (1,'aa','aa',5462,1),(2,'sa','afa',532,0),(3,'sa','afa',532,0),(4,'sa','afa',532,0);
/*!40000 ALTER TABLE `addhouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `addrenter`
--

DROP TABLE IF EXISTS `addrenter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `addrenter` (
  `rno` int(11) NOT NULL,
  `rname` varchar(13) DEFAULT NULL,
  `rmobile` int(10) NOT NULL,
  `rproof` varchar(20) NOT NULL,
  `hno` int(11) DEFAULT NULL,
  `stmonth` date DEFAULT NULL,
  `paydate` date DEFAULT NULL,
  `totalpaid` int(11) DEFAULT NULL,
  `unpaid` int(11) DEFAULT NULL,
  `extra` int(11) DEFAULT NULL,
  PRIMARY KEY (`rno`,`rmobile`,`rproof`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addrenter`
--

LOCK TABLES `addrenter` WRITE;
/*!40000 ALTER TABLE `addrenter` DISABLE KEYS */;
/*!40000 ALTER TABLE `addrenter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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

-- Dump completed on 2020-11-23  0:58:35

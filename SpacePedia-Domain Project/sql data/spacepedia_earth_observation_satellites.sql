-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: spacepedia
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `earth_observation_satellites`
--

DROP TABLE IF EXISTS `earth_observation_satellites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `earth_observation_satellites` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `LaunchDate` date DEFAULT NULL,
  `LaunchVehicle` varchar(50) DEFAULT NULL,
  `OrbitType` varchar(50) DEFAULT NULL,
  `Year` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `earth_observation_satellites`
--

LOCK TABLES `earth_observation_satellites` WRITE;
/*!40000 ALTER TABLE `earth_observation_satellites` DISABLE KEYS */;
INSERT INTO `earth_observation_satellites` VALUES (1,'Bhaskara-I','1979-06-07','C-1Intercosmos','GSO (Geosynchronous Orbit)',1979),(2,'Rohini Satellite RS-D1','1981-05-31','SLV-3D1','LEO (Low Earth Orbit)',1981),(3,'Bhaskara-II','1981-11-20','C-1 Intercosmos','LEO (Low Earth Orbit)',1981),(4,'Rohini Satellite RS-D2','1983-04-17','SLV-3','LEO (Low Earth Orbit)',1983),(5,'IRS-1A','1988-03-17','Vostok','SSPO (Sun Synchronous Polar Orbit)',1988),(6,'SROSS-2','1988-07-13','ASLV-D2','SSPO (Sun Synchronous Polar Orbit)',1988),(7,'IRS-1B','1991-08-29','Vostok','SSPO (Sun Synchronous Polar Orbit)',1991),(8,'IRS-1E','1993-09-20','PSLV-D1','LEO (Low Earth Orbit)',1993),(9,'IRS-P2','1994-10-15','PSLV-D2','SSPO (Sun Synchronous Polar Orbit)',1994),(10,'IRS-1C','1995-12-28','Molniya','SSPO (Sun Synchronous Polar Orbit)',1995),(11,'IRS-P3','1996-03-21','PSLV-D3 / IRS-P3','SSPO (Sun Synchronous Polar Orbit)',1996),(12,'IRS-1D','1997-09-29','PSLV-C1/IRS-ID','SSPO (Sun Synchronous Polar Orbit)',1997),(13,'Oceansat(IRS-P4)','1999-05-26','PSLV-C2/IRS-P4','SSPO (Sun Synchronous Polar Orbit)',1999),(14,'The Technology Experiment Satellite (TES)','2001-10-22','PSLV-C3 / TES','SSPO (Sun Synchronous Polar Orbit)',2001),(15,'IRS-P6 / RESOURCESAT-1','2003-10-17','PSLV-C5 / RESOURCESAT-1','SSPO (Sun Synchronous Polar Orbit)',2003),(16,'CARTOSAT-1','2005-05-05','PSLV-C6/ CARTOSAT-1/HAMSAT','SSPO (Sun Synchronous Polar Orbit)',2005),(17,'CARTOSAT-2','2007-01-10','PSLV-C7 / CARTOSAT-2 / SRE-1','SSPO (Sun Synchronous Polar Orbit)',2007),(18,'IMS-1','2008-04-28','PSLV-C9 / CARTOSAT – 2A','SSPO (Sun Synchronous Polar Orbit)',2008),(19,'CARTOSAT – 2A','2008-04-28','PSLV-C9 / CARTOSAT – 2A','SSPO (Sun Synchronous Polar Orbit)',2008),(20,'RISAT-2','2009-04-20','PSLV-C12 / RISAT-2','SSPO (Sun Synchronous Polar Orbit)',2009),(21,'Oceansat-2','2009-09-23','PSLV-C14 / OCEANSAT-2','SSPO (Sun Synchronous Polar Orbit)',2009),(22,'CARTOSAT-2B','2010-06-12','PSLV-C15/CARTOSAT-2B','SSPO (Sun Synchronous Polar Orbit)',2010),(23,'RESOURCESAT-2','2011-04-20','PSLV-C16/RESOURCESAT-2','SSPO (Sun Synchronous Polar Orbit)',2011),(24,'Megha-Tropiques','2011-10-12','PSLV-C18/ Megha-Tropiques','SSPO (Sun Synchronous Polar Orbit)',2011),(25,'RISAT-1','2012-04-26','PSLV-C19/RISAT-1','SSPO (Sun Synchronous Polar Orbit)',2012),(26,'SARAL','2013-04-25','PSLV-C20/SARAL','SSPO (Sun Synchronous Polar Orbit)',2013),(27,'INSAT-3D','2013-07-26','Ariane-5 VA-214','GSO (Geosynchronous Orbit)',2013),(28,'CARTOSAT-2 Series Satellite','2016-06-22','PSLV-C34 / CARTOSAT-2 Series Satellite','SSPO (Sun Synchronous Polar Orbit)',2016),(29,'INSAT-3DR','2016-09-08','GSLV-F05 / INSAT-3DR','GSO (Geosynchronous Orbit)',2016),(30,'SCATSAT-1','2016-09-26','PSLV-C35 / SCATSAT-1','SSPO (Sun Synchronous Polar Orbit)',2016),(31,'RESOURCESAT-2A','2016-12-07','PSLV-C36 / RESOURCESAT-2A','SSPO (Sun Synchronous Polar Orbit)',2016),(32,'Cartosat -2 Series Satellite','2017-02-12','PSLV-C37 / Cartosat -2 Series Satellite','SSPO (Sun Synchronous Polar Orbit)',2017),(33,'Cartosat-2 Series Satellite','2017-06-23','PSLV-C38 / Cartosat-2 Series Satellite','SSPO (Sun Synchronous Polar Orbit)',2017),(34,'Cartosat-2 Series Satellite','2018-01-12','PSLV-C40/ Cartosat-2 Series Satellite Mission','SSPO (Sun Synchronous Polar Orbit)',2018),(35,'HysIS','2018-11-29','PSLV-C43 / HysIS Mission','SSPO (Sun Synchronous Polar Orbit)',2018),(36,'RISAT-2B','2019-05-22','PSLV-C46 Mission','LEO (Low Earth Orbit)',2019),(37,'Cartosat-3','2019-11-27','PSLV-C47 / Cartosat-3 Mission','SSPO (Sun Synchronous Polar Orbit)',2019),(38,'RISAT-2BR1','2019-12-11','PSLV-C48/ RISAT-2BR1','LEO (Low Earth Orbit)',2019),(39,'EOS-01','2020-11-07','PSLV-C49/ EOS-01','LEO (Low Earth Orbit)',2020),(40,'EOS-03','2021-08-12','GSLV-F10 / EOS-03','GTO (Geosynchronous Transfer Orbit)',2021),(41,'EOS-04','2022-02-14','PSLV-C52/ EOS-04 Mission',NULL,2022);
/*!40000 ALTER TABLE `earth_observation_satellites` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-15 23:31:01

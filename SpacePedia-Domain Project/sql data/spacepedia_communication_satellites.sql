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
-- Table structure for table `communication_satellites`
--

DROP TABLE IF EXISTS `communication_satellites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `communication_satellites` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(40) DEFAULT NULL,
  `LaunchDate` date DEFAULT NULL,
  `LaunchVehicle` varchar(40) DEFAULT NULL,
  `Application` varchar(40) DEFAULT NULL,
  `Year` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `communication_satellites`
--

LOCK TABLES `communication_satellites` WRITE;
/*!40000 ALTER TABLE `communication_satellites` DISABLE KEYS */;
INSERT INTO `communication_satellites` VALUES (1,'INSAT-1A','1982-04-10','Delta','Communication',1982),(2,'INSAT-1B','1983-08-30','Shuttle [PAM-D]','Communication',1983),(3,'INSAT-1C','1988-07-30','Ariane-3','Communication',1988),(4,'INSAT-1D','1990-06-12','Delta 4925','Communication',1990),(5,'INSAT-2A','1992-07-10','Ariane-44L H10','Communication',1992),(6,'INSAT-2B','1993-07-23','Ariane-44L H10+','Communication',1993),(7,'INSAT-2C','1995-12-07','Ariane-44L H10-3','Communication',1995),(8,'INSAT-2D','1997-06-04','Ariane-44L H10-3','Communication',1997),(9,'INSAT-2E','1999-04-03','Ariane-42P H10-3','Communication',1999),(10,'INSAT-3B','2000-03-22','Ariane-5G','Communication',2000),(11,'GSAT-1','2001-04-18','GSLV-D1 / GSAT-1','Communication',2001),(12,'INSAT-3C','2002-01-24','Ariane5-V147','Climate & Environment, Communication',2002),(13,'KALPANA-1','2002-09-12','PSLV-C4 /KALPANA-1','Climate & Environment, Communication',2002),(14,'INSAT-3A','2003-04-10','Ariane5-V160','Climate & Environment, Communication',2003),(15,'GSAT-2','2003-05-08','GSLV-D2 / GSAT-2','Communication',2003),(16,'INSAT-3E','2003-09-28','Ariane5-V162','Communication',2003),(17,'EDUSAT','2004-09-20','GSLV-F01 / EDUSAT(GSAT-3)','Communication',2004),(18,'HAMSAT','2005-05-05','PSLV-C6/CARTOSAT-1/HAMSAT','Communication',2005),(19,'INSAT-4A','2005-12-22','Ariane5-V169','Communication',2005),(20,'INSAT-4C','2006-07-10','GSLV-F02 / INSAT-4C','Communication',2006),(23,'INSAT-4B','2007-03-12','Ariane5','Communication',2007),(24,'INSAT-4CR','2007-09-02','GSLV-F04 / INSAT-4CR','Communication',2007),(25,'GSAT-4','2010-04-15','GSLV-D3 / GSAT-4','Communication',2010),(26,'GSAT-5P','2010-12-25','GSLV-F06 / GSAT-5P','Communication',2010),(27,'GSAT-8','2011-05-21','Ariane-5 VA-202','Communication, Navigation',2011),(28,'GSAT-12','2011-07-15','PSLV-C17/GSAT-12','Communication',2011),(29,'GSAT-10','2012-09-29','Ariane-5 VA-209','Communication, Navigation',2012),(30,'GSAT-7','2013-08-30','Ariane-5 VA-215','Communication',2013),(31,'GSAT-14','2014-01-05','GSLV-D5/GSAT-147','Communication',2014),(32,'GSAT-16','2014-12-07','Ariane-5 VA-221','Communication',2014),(33,'GSAT-6','2015-08-27','GSLV-D6','Communication',2015),(34,'GSAT-15','2015-11-11','Ariane-5 VA-227','Communication, Navigation',2015),(35,'GSAT-18','2016-10-06','Ariane-5 VA-231','Communication',2016),(36,'GSAT-9','2017-05-05','GSLV-F09 / GSAT-9','Communication',2017),(37,'GSAT-19','2017-06-05','GSLV Mk III-D1/GSAT-19 Mission','Communication',2017),(38,'GSAT-17','2017-06-29','Ariane-5 VA-238','Communication',2017),(39,'GSAT-6A','2018-03-29','GSLV-F08/GSAT-6A Mission','Communication',2018),(40,'GSAT-29','2018-11-14','GSLV Mk III-D2 / GSAT-29 Mission','Communication',2018),(41,'GSAT-11 Mission','2018-12-05','Ariane-5 VA-246','Communication',2018),(42,'GSAT-7A','2018-12-19','GSLV-F11 / GSAT-7A Mission','Communication',2018),(43,'GSAT-31','2019-02-16','Ariane-5 VA-247','Communication',2019),(44,'GSAT-30','2020-01-17','Ariane-5 VA-251','Communication',2020),(45,'CMS-01','2020-12-17','PSLV-C50/CMS-01','Communication',2020);
/*!40000 ALTER TABLE `communication_satellites` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-15 23:31:03

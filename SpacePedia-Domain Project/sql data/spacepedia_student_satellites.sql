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
-- Table structure for table `student_satellites`
--

DROP TABLE IF EXISTS `student_satellites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_satellites` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `LaunchDate` date DEFAULT NULL,
  `LaunchVehicle` varchar(50) DEFAULT NULL,
  `OrbitType` varchar(50) DEFAULT NULL,
  `Year` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_satellites`
--

LOCK TABLES `student_satellites` WRITE;
/*!40000 ALTER TABLE `student_satellites` DISABLE KEYS */;
INSERT INTO `student_satellites` VALUES (1,'ANUSAT','2009-04-20','PSLV-C12 / RISAT-2','SSPO (Sun Synchronous Polar Orbit)',2009),(2,'STUDSAT','2010-07-12','PSLV-C15/CARTOSAT-2B','SSPO (Sun Synchronous Polar Orbit)',2010),(3,'SRMSat','2011-10-12','PSLV-C18/Megha-Tropiques','SSPO (Sun Synchronous Polar Orbit)',2011),(4,'Jugnu','2011-10-12','PSLV-C18/Megha-Tropiques','SSPO (Sun Synchronous Polar Orbit)',2011),(5,'SATHYABAMASAT','2016-06-22','PSLV-C34 / CARTOSAT-2 Series Satellite','SSPO (Sun Synchronous Polar Orbit)',2016),(6,'SWAYAM','2016-06-22','PSLV-C34 /CARTOSAT-2 Series Satellite','SSPO (Sun Synchronous Polar Orbit)',2016),(7,'PRATHAM','2016-09-26','PSLV-C35 /SCATSAT-1','SSPO (Sun Synchronous Polar Orbit)',2016),(8,'PISAT','2016-09-26','PSLV-C35 /SCATSAT-1','SSPO (Sun Synchronous Polar Orbit)',2016),(9,'NIUSAT','2017-06-23','PSLV-C38 / Cartosat-2 Series Satellite','SSPO (Sun Synchronous Polar Orbit)',2017),(10,'Kalamsat-V2','2019-01-24','PSLV-C44','Student Satellite',2019),(11,'UNITYsat','2021-02-28','PSLV-C51/Amazonia-1','Student Satellite',2021),(12,'Satish Dhawan SAT (SDSAT)','2021-02-28','PSLV-C51/Amazonia-1','Student Satellite',2021),(13,'INSPIREsat-1','2022-02-14','PSLV-C52/EOS-04 Mission','Student Satellite',2022),(14,'AzaadiSAT','2022-08-07','SSLV-D1/EOS-02',NULL,2022),(15,'AzaadiSAT-2','2023-02-10','SSLV-D2/EOS-07 Mission',NULL,2023);
/*!40000 ALTER TABLE `student_satellites` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-15 23:30:58

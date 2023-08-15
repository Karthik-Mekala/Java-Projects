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
-- Table structure for table `experimental_satellites`
--

DROP TABLE IF EXISTS `experimental_satellites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `experimental_satellites` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(40) DEFAULT NULL,
  `LaunchDate` date DEFAULT NULL,
  `LaunchVehicle` varchar(50) DEFAULT NULL,
  `OrbitType` varchar(40) DEFAULT NULL,
  `Year` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experimental_satellites`
--

LOCK TABLES `experimental_satellites` WRITE;
/*!40000 ALTER TABLE `experimental_satellites` DISABLE KEYS */;
INSERT INTO `experimental_satellites` VALUES (1,'Aryabhata','1975-04-19','C-1 Intercosmos','SSPO (Sun Synchronous Polar Orbit)',1975),(2,'Rohini Technology Payload (RTP)','1979-08-10','SLV-3E1',NULL,1979),(3,'Rohini Satellite RS-1','1980-07-18','SLV-3E2','SSPO (Sun Synchronous Polar Orbit)',1980),(4,'APPLE','1981-06-19','Ariane -1(V-3)','GSO (Geosynchronous Orbit)',1981),(5,'YOUTHSAT','2011-04-20','PSLV-C16/RESOURCESAT-2','SSPO (Sun Synchronous Polar Orbit)',2011),(6,'INS-1B','2017-02-15','PSLV-C37 / Cartosat -2 Series Satellite','SSPO (Sun Synchronous Polar Orbit)',2017),(7,'INS-1A','2017-02-15','PSLV-C37 / Cartosat -2 Series Satellite','SSPO (Sun Synchronous Polar Orbit)',2017),(8,'INS-1C','2018-01-12','PSLV-C40/Cartosat-2 Series Satellite Mission','SSPO (Sun Synchronous Polar Orbit)',2018),(9,'INS-2TD','2022-02-14','PSLV-C52/EOS-04',NULL,2022);
/*!40000 ALTER TABLE `experimental_satellites` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-15 23:31:00

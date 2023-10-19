CREATE DATABASE  IF NOT EXISTS `airticket` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `airticket`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: airticket
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `cancellation_table`
--

DROP TABLE IF EXISTS `cancellation_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cancellation_table` (
  `canc_id` int NOT NULL,
  `ticket_id` int DEFAULT NULL,
  `fl_code` varchar(45) DEFAULT NULL,
  `canc_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`canc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cancellation_table`
--

LOCK TABLES `cancellation_table` WRITE;
/*!40000 ALTER TABLE `cancellation_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `cancellation_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_table`
--

DROP TABLE IF EXISTS `flight_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_table` (
  `fl_code` varchar(45) NOT NULL,
  `fl_source` varchar(45) DEFAULT NULL,
  `fl_destination` varchar(45) DEFAULT NULL,
  `fl_date` varchar(45) DEFAULT NULL,
  `fl_seats` int DEFAULT NULL,
  PRIMARY KEY (`fl_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_table`
--

LOCK TABLES `flight_table` WRITE;
/*!40000 ALTER TABLE `flight_table` DISABLE KEYS */;
INSERT INTO `flight_table` VALUES ('BK9652','Rajshahi','Cumilla','2023-10-06',100),('dfsadfsd','Syhlet','Khulna','2023-10-02',21),('kd85','Dhaka','Cumilla','2023-10-06',120),('KSA74','Barishal','Dhaka','2023-10-12',152),('KSA7445','Dhaka','Khulna','2023-10-05',200),('MM50','Dhaka','Rajshahi','2023-10-02',500);
/*!40000 ALTER TABLE `flight_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passengers_table`
--

DROP TABLE IF EXISTS `passengers_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passengers_table` (
  `p_id` int NOT NULL AUTO_INCREMENT,
  `p_name` varchar(25) DEFAULT NULL,
  `p_nationality` varchar(25) DEFAULT NULL,
  `p_gender` varchar(25) DEFAULT NULL,
  `p_passport` varchar(25) DEFAULT NULL,
  `p_address` varchar(45) DEFAULT NULL,
  `p_phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengers_table`
--

LOCK TABLES `passengers_table` WRITE;
/*!40000 ALTER TABLE `passengers_table` DISABLE KEYS */;
INSERT INTO `passengers_table` VALUES (2,'Hasan mmm','India','Male','hhhhh','ssss','1524444'),(3,'Tameem','United Kingdom','Female','TU85421','Mirpur','5284152'),(4,'Masud Rana','Nepal','Male','M r','DFASS','52410'),(5,'Masud','Norway','Male','BK5420','Danmondhi','0193754200'),(6,'Masud','Norway','Male','BK5420','Danmondhi','0193754200'),(7,'Hasan mmm','India','Male','hhhhh','ssss','1524444');
/*!40000 ALTER TABLE `passengers_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_table`
--

DROP TABLE IF EXISTS `ticket_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket_table` (
  `ticket_id` int NOT NULL,
  `p_name` varchar(45) DEFAULT NULL,
  `fl_code` varchar(30) DEFAULT NULL,
  `p_gender` varchar(30) DEFAULT NULL,
  `p_passport` varchar(30) DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `nationality` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ticket_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_table`
--

LOCK TABLES `ticket_table` WRITE;
/*!40000 ALTER TABLE `ticket_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-04 13:16:54

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
  `canc_id` int NOT NULL AUTO_INCREMENT,
  `ticket_id` int DEFAULT NULL,
  `fl_code` varchar(45) DEFAULT NULL,
  `canc_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`canc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cancellation_table`
--

LOCK TABLES `cancellation_table` WRITE;
/*!40000 ALTER TABLE `cancellation_table` DISABLE KEYS */;
INSERT INTO `cancellation_table` VALUES (1,4,'B-652','2023-10-12'),(2,2,'A-452',NULL),(3,2,'A-452','2023-10-06'),(4,4,'DDD','2023-10-12'),(5,2,'A-452','2023-10-05'),(6,10,'E-334','2023-10-11');
/*!40000 ALTER TABLE `cancellation_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_table`
--

DROP TABLE IF EXISTS `flight_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_table` (
  `fl_id` int NOT NULL AUTO_INCREMENT,
  `fl_code` varchar(45) DEFAULT NULL,
  `fl_source` varchar(45) DEFAULT NULL,
  `fl_destination` varchar(45) DEFAULT NULL,
  `fl_date` date DEFAULT NULL,
  `fl_time` varchar(20) DEFAULT NULL,
  `fl_class` varchar(25) DEFAULT NULL,
  `fl_seats` int DEFAULT NULL,
  PRIMARY KEY (`fl_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_table`
--

LOCK TABLES `flight_table` WRITE;
/*!40000 ALTER TABLE `flight_table` DISABLE KEYS */;
INSERT INTO `flight_table` VALUES (1,'B-652','Dhaka','Cumilla','2023-10-12','01:00 PM','Business',100),(2,'A-452','Dhaka','Chittagong','2023-10-07','1:00 AM','Economy',50),(3,'C-412','Barishal','Cox\'s Bazar','2023-10-10','07:00 PM','Luxuary',100),(4,'D-5522','Dhaka','Syhlet','2023-10-05','9:00 AM','Business',60),(5,'E-334','Dhaka','Cox\'s Bazar','2023-10-20','9:00 AM','Luxuary',50),(6,'F-4455','Dhaka','Rajshahi','2023-10-14','11:00 AM','Economy',100);
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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengers_table`
--

LOCK TABLES `passengers_table` WRITE;
/*!40000 ALTER TABLE `passengers_table` DISABLE KEYS */;
INSERT INTO `passengers_table` VALUES (1,'Masud Rana','Bangladesh','Male','MR125452','Dhanmondhi','01937420069'),(2,'Hasan Mahamud','Nepal','Female','H123456','Mirpur','0193742100'),(3,'Limon Hasan','Norway','Male','T123456','Gulshan','01285463214'),(4,'Saifullah KM','Denmark','Male','S123456','Mirpur','0193754215'),(5,'Sabit Hasan','Bangladesh','Male','FSADF','SAFDF','125'),(14,'Mahbuba Farzana','Bangladesh','Female','MF33453','Mohamadpur','0294234532'),(15,'Imran Hossain','Bangladesh','Male','IH56242','Mirpur','03215215201'),(16,'Jahir Shekh','Bangladesh','Male','JS52415','Dhaka Clg','52412563212'),(17,'Tameem Rahman','Bangladesh','Male','TR3434','Panthapath','0193847824'),(18,'sabit','Bangladesh','Male','4444444','kjkj','323232'),(19,'Mashrafee H','Bangladesh','Male','MH85271','Mirpur','0196852471');
/*!40000 ALTER TABLE `passengers_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passengers_table2`
--

DROP TABLE IF EXISTS `passengers_table2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passengers_table2` (
  `p_id` int NOT NULL,
  `p_name` varchar(26) DEFAULT NULL,
  `p_nationality` varchar(25) DEFAULT NULL,
  `p_gender` varchar(15) DEFAULT NULL,
  `p_passport` varchar(16) DEFAULT NULL,
  `p_address` varchar(40) DEFAULT NULL,
  `p_phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengers_table2`
--

LOCK TABLES `passengers_table2` WRITE;
/*!40000 ALTER TABLE `passengers_table2` DISABLE KEYS */;
/*!40000 ALTER TABLE `passengers_table2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_table`
--

DROP TABLE IF EXISTS `ticket_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket_table` (
  `ticket_id` int NOT NULL AUTO_INCREMENT,
  `p_name` varchar(45) DEFAULT NULL,
  `fl_code` varchar(30) DEFAULT NULL,
  `p_gender` varchar(30) DEFAULT NULL,
  `p_passport` varchar(30) DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `nationality` varchar(30) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `source` varchar(20) DEFAULT NULL,
  `destination` varchar(25) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `class` varchar(20) DEFAULT NULL,
  `time` varchar(10) DEFAULT NULL,
  `seat` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`ticket_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_table`
--

LOCK TABLES `ticket_table` WRITE;
/*!40000 ALTER TABLE `ticket_table` DISABLE KEYS */;
INSERT INTO `ticket_table` VALUES (1,'Saifullah KM','A-452','Male','S123456',567,'Denmark','0193754215','Dhaka','Chittagong','2023-10-07','Economy','1:00 AM','47'),(3,'Masud Rana','B-652','Male','MR125452',4565,'Bangladesh','01937420069','Dhaka','Cumilla','2023-10-12','Business','1:00 AM','34'),(5,'Saifullah KM','A-452','Male','S123456',456,'Denmark','0193754215','Dhaka','Chittagong','2023-10-07','Economy','1:00 AM','22'),(6,'Mahbuba Farzana','B-652','Female','MF33453',6352,'Bangladesh','0294234532','Dhaka','Cumilla','2023-10-12','Business','1:00 AM','24'),(7,'Imran Hossain','C-412','Male','IH56242',6341,'Bangladesh','03215215201','Barishal','Cox\'s Bazar','2023-10-10','Luxuary','1:00 AM','42'),(8,'Saifullah KM','B-652','Male','S123456',500,'Denmark','0193754215','Dhaka','Cumilla','2023-10-12','Business','9:00 AM','20'),(9,'Jahir Shekh','A-452','Male','JS52415',6352,'Bangladesh','52412563212','Dhaka','Chittagong','2023-10-07','Economy','1:00 AM','11'),(11,'Tameem Rahman','E-334','Male','TR3434',8000,'Bangladesh','0193847824','Dhaka','Cox\'s Bazar','2023-10-20','Luxuary','9:00 AM','02'),(12,'sabit','B-652','Male','4444444',5000,'Bangladesh','323232','Dhaka','Cumilla','2023-10-12','Business','1:00 AM','20'),(13,'Mashrafee H','F-4455','Male','MH85271',8542,'Bangladesh','0196852471','Dhaka','Rajshahi','2023-10-14','Economy','1:00 AM','25');
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

-- Dump completed on 2023-10-18 11:58:13

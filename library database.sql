CREATE DATABASE  IF NOT EXISTS `lms_db` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `lms_db`;
-- MySQL dump 10.13  Distrib 5.7.21, for macos10.13 (x86_64)
--
-- Host: localhost    Database: lms_db
-- ------------------------------------------------------
-- Server version	5.7.21

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `book_id` char(10) NOT NULL,
  `b_title` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `edition` varchar(45) NOT NULL,
  `p_year` char(4) NOT NULL,
  `available` char(3) NOT NULL,
  PRIMARY KEY (`book_id`),
  UNIQUE KEY `book_id_UNIQUE` (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('1122','Learn Java','G.S Gordon','First Edition','2010','YES'),('1452','River of Smoke','Amitav Ghose','Second Edition','2011','NO'),('2247','Little Women','Louisa M. Alcott','Third Edition','2015','YES'),('3545','Alice\'s Adventures In Wonderland','Lewis Carroll','Second Edition','2009','YES'),('4578','Gulliver\'s Travels','Jonathan Swift','First Edition','2007','YES'),('5487','The Three Musketeers','Alexander Dumas','Second Edition','2014','YES'),('5524','The Woman in White','Wilkie Collins','First Edition','2011','YES'),('6525','Tom Jones ','Henry Fielding','Fifth Edition','2008','YES'),('6952','The Black Sheep','Honoré De Balzac ','Third Edition','2010','YES');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrow`
--

DROP TABLE IF EXISTS `borrow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `borrow` (
  `borrow_id` int(5) NOT NULL AUTO_INCREMENT,
  `mem_id` char(5) NOT NULL,
  `book_id` char(10) NOT NULL,
  `date_borrowed` date NOT NULL,
  `date_due` date NOT NULL,
  PRIMARY KEY (`borrow_id`),
  UNIQUE KEY `borrow_id_UNIQUE` (`borrow_id`),
  KEY `mem_id_brw_idx` (`mem_id`),
  KEY `book_id_brw_idx` (`book_id`),
  CONSTRAINT `book_id_borrow` FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `mem_id_borrow` FOREIGN KEY (`mem_id`) REFERENCES `member` (`mem_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrow`
--

LOCK TABLES `borrow` WRITE;
/*!40000 ALTER TABLE `borrow` DISABLE KEYS */;
/*!40000 ALTER TABLE `borrow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fines`
--

DROP TABLE IF EXISTS `fines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fines` (
  `fine_id` int(5) NOT NULL AUTO_INCREMENT,
  `mem_id` char(5) NOT NULL,
  `book_id` char(10) NOT NULL,
  `date_fined` date NOT NULL,
  `amount` int(5) NOT NULL,
  PRIMARY KEY (`fine_id`),
  UNIQUE KEY `fine_id_UNIQUE` (`fine_id`),
  KEY `mem_id_fine_idx` (`mem_id`),
  KEY `book_id_fine_idx` (`book_id`),
  CONSTRAINT `book_id_fine` FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `mem_id_fine` FOREIGN KEY (`mem_id`) REFERENCES `member` (`mem_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fines`
--

LOCK TABLES `fines` WRITE;
/*!40000 ALTER TABLE `fines` DISABLE KEYS */;
INSERT INTO `fines` VALUES (1,'358','4578','2018-05-02',80),(2,'655','1452','2018-05-02',95);
/*!40000 ALTER TABLE `fines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `librarian`
--

DROP TABLE IF EXISTS `librarian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `librarian` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `librarian`
--

LOCK TABLES `librarian` WRITE;
/*!40000 ALTER TABLE `librarian` DISABLE KEYS */;
INSERT INTO `librarian` VALUES ('admin','123');
/*!40000 ALTER TABLE `librarian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `mem_id` char(5) NOT NULL,
  `m_name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `nic_no` char(12) NOT NULL,
  `password` varchar(45) NOT NULL,
  `book_count` int(2) DEFAULT NULL,
  PRIMARY KEY (`mem_id`),
  UNIQUE KEY `mem_id_UNIQUE` (`mem_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('001','Marcus Griffin','No 18, Colombo 15','markuss22@gmail.com','0778451223','904856874V','123',2),('050','Jermaine Gofforth','4080 Browning Avenue','jgofforth7@google.cn','0789376120','892253599V','945',0),('143','Selby Curman','98 Thompson Place','scurmanb@google.de','0758164904','991540444V','185',0),('236','Jocelyne MacFie','25965 Bluejay Trail','jmacfie1@admin.ch','0781739189','942379288V','001',0),('278','Eduardo McCorkell','15 Fremont Drive','emccorkell3@accuweather.com','0767400028','858180835V','005',0),('286','Fayth Tanner','49685 Shelley Terrace','ftanner0@guardian.co.uk','0763021146','917279300V','635',0),('326','Jessey Swithenby','0172 Marquette Crossing','jswithenbyd@fotki.com','0785162636','980617350V','285',0),('358','Gaspard MacGettigen','156 Maple Street','gmacgettigene@baidu.com','0750763474','937169078V','863',0),('516','Kim Coskerry','7544 Macpherson Terrace','kcoskerry4@gmpg.org','0767102415','877834686V','743',0),('612','Elena McKee','81808 Elka Center','emckeec@abc.net.au','0766407478','960345119V','634',0),('655','Thor Moules','6 Briar Crest Lane','tmoules6@dedecms.com','0788014169','830433349V','135',0),('691','Arnuad Lindbergh','60400 Bunting Way','alindbergh5@jigsy.com','0780511140','846280910V','792',0),('748','Perkin Sommerly','6 Stuart Parkway','psommerly2@purevolume.com','0779990530','938514248V','815',0),('757','Ashien Hyder','4 Dennis Parkway','ahydera@barnesandnoble.com','0781923830','865798313V','983',0),('769','Merralee Turpin','635 Forest Point','mturpinf@miibeian.gov.cn','0765539421','915718062V','896',0),('984','Elisabetta Tortoise','7267 Vermont Circle','etortoise8@harvard.edu','0761380610','939906106V','522',0),('987','Ari Thake','70 Eliot Lane','athake9@creativecommons.org','0785991007','843806913V','037',0);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation` (
  `res_id` int(5) NOT NULL AUTO_INCREMENT,
  `mem_id` char(5) NOT NULL,
  `book_id` char(10) DEFAULT NULL,
  `date_res` date NOT NULL,
  PRIMARY KEY (`res_id`),
  UNIQUE KEY `res_id_UNIQUE` (`res_id`),
  KEY `mem_id_reser_idx` (`mem_id`),
  KEY `book_id_reser_idx` (`book_id`),
  CONSTRAINT `book_id_reser` FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `mem_id_reser` FOREIGN KEY (`mem_id`) REFERENCES `member` (`mem_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` VALUES (1,'001','6952','2018-05-02'),(2,'278','5524','2018-05-02');
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'lms_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-16  8:59:11

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `firstName` varchar(30) DEFAULT NULL,
  `lastName` varchar(30) DEFAULT NULL,
  `emailAddress` varchar(50) DEFAULT NULL,
  `hireDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

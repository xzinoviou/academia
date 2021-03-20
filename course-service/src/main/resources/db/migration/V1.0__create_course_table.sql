CREATE TABLE `course` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `course_identification_number` varchar(15) NOT NULL,
    `creation_date` datetime(6) DEFAULT NULL,
    `mandatory` bit(1) DEFAULT NULL,
    `title` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK_maq1xnu024iv2tka3tumqil63` (`course_identification_number`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

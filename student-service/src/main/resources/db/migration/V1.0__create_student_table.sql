CREATE TABLE `student` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `birth_date` datetime(6) DEFAULT NULL,
    `email` varchar(100) DEFAULT NULL,
    `first_name` varchar(50) DEFAULT NULL,
    `last_name` varchar(50) DEFAULT NULL,
    `registration_date` datetime(6) DEFAULT NULL,
    `student_identification_number` varchar(15) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK_hmuwem2lo80fh1a9rdtc10xx6` (`student_identification_number`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
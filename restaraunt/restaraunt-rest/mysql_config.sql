CREATE SCHEMA `wisencrazy_restaraunt` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `email_id` varchar(50) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `account_status` enum('ACTIVE','IN_ACTIVE','SYSTEM_GENERATED','DISABLE') DEFAULT NULL,
  `token` varchar(100) DEFAULT NULL,
  `google_access_token` text,
  `photo_url` varchar(255) DEFAULT NULL,
  `customer_type` enum('INDIVIDUAL','GROUP') NOT NULL DEFAULT 'INDIVIDUAL',
  `primary_contact` varchar(15) DEFAULT NULL,
  `is_mobile_verified` tinyint(1) DEFAULT '0',
  `sid` binary(32) NOT NULL,
  `member_since` timestamp NULL DEFAULT NULL,
  `signup_type` enum('gmail','facebook','android','restaraunt') DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=3101 DEFAULT CHARSET=utf8;


CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(255) DEFAULT NULL,
  `country_code` char(5) DEFAULT NULL,
  `country_short_name` char(10) DEFAULT NULL,
  `country_image_link` varchar(45) DEFAULT NULL,
  `sid` binary(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=209 DEFAULT CHARSET=utf8;

CREATE TABLE `state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `state_name` varchar(255) DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL,
  `sid` binary(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid` (`sid`),
  KEY `fk_state1` (`country_id`),
  CONSTRAINT `fk_state1` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8;

CREATE TABLE `customer_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_line1` varchar(45) DEFAULT NULL,
  `address_line2` varchar(45) DEFAULT NULL,
  `address_line3` varchar(45) DEFAULT NULL,
  `pin` char(10) DEFAULT NULL,
  `country_id` int(11) NOT NULL,
  `state_id` int(11) DEFAULT NULL,
  `sid` binary(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid` (`sid`),
  KEY `fk_customer_address_1` (`country_id`),
  KEY `fk_customer_address_2` (`state_id`),
  CONSTRAINT `fk_customer_address_1` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`),
  CONSTRAINT `fk_customer_address_2` FOREIGN KEY (`state_id`) REFERENCES `state` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `customer_has_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_address_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `sid` binary(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid` (`sid`),
  KEY `fk_customer_has_address_1` (`customer_address_id`),
  KEY `fk_customer_has_address_3` (`customer_id`),
  CONSTRAINT `fk_customer_has_address_1` FOREIGN KEY (`customer_address_id`) REFERENCES `customer_address` (`id`),
  CONSTRAINT `fk_customer_has_address_3` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


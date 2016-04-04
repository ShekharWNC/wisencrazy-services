CREATE SCHEMA `wisencrazy_restaraunt` DEFAULT CHARACTER SET utf8 ;

USE  `wisencrazy_restaraunt`;

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

CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city_name` varchar(255) DEFAULT NULL,
  `state_id` int(11) DEFAULT NULL,
  `sid` binary(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid` (`sid`),
  KEY `fk_city1` (`state_id`),
  CONSTRAINT `fk_city1` FOREIGN KEY (`state_id`) REFERENCES `state` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8;

CREATE TABLE `area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(255) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `sid` binary(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid` (`sid`),
  KEY `fk_area1` (`city_id`),
  CONSTRAINT `fk_area1` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8;


CREATE TABLE `restaraunt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sid` binary(32) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `photo_url` varchar(255) DEFAULT NULL,
  `email_id` varchar(100) DEFAULT NULL,
  `primary_contact_no` varchar(200) default NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  `created_date` timestamp NULL DEFAULT '2000-01-01 00:00:00',
  `address` varchar(255) DEFAULT NULL,
  `pin` varchar(15) NOT NULL,
  `latitude` varchar(20) DEFAULT NULL,
  `longitude` varchar(20) DEFAULT NULL,
  `area_id` int(11) NOT NULL,
  `cost_for_2` int(11) DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid` (`sid`),
  KEY `fk_project4` (`area_id`),
  CONSTRAINT `fk_project4` FOREIGN KEY (`area_id`) REFERENCES `area` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `restaraunt_has_timings` (
  `restaraunt_id` int(11) NOT NULL ,
  `timing` enum('BR','LU','DI') NOT NULL,
  `photo_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`restaraunt_id`,`timing`),
  KEY `fk_rht1` (`restaraunt_id`),
  CONSTRAINT `fk_rht1` FOREIGN KEY (`restaraunt_id`) REFERENCES `restaraunt` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `restaraunt_has_reviews` (
  `restaraunt_id` int(11) NOT NULL ,
  `customer_id` int(11) NOT NULL,
  `rating` int(11) DEFAULT 0,
  `comment` TEXT DEFAULT NULL,
  `timestamp` timestamp DEFAULT '2000-01-01 00:00:00',
  PRIMARY KEY (`restaraunt_id`,`customer_id`),
  KEY `fk_rhr1` (`restaraunt_id`),
  KEY `fk_rhr2` (`customer_id`),
  CONSTRAINT `fk_rhr1` FOREIGN KEY (`restaraunt_id`) REFERENCES `restaraunt` (`id`),
  CONSTRAINT `fk_rhr2` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create view vw_restaraunt_location as 
select r.id,hex(r.sid) as `sid`,r.name,a.area_name,hex(a.sid) as `area_sid`,rht.photo_url,latitude,longitude,timing,'distance' from restaraunt r 
join area a on r.area_id=a.id 
left outer join restaraunt_has_timings rht on r.id=rht.restaraunt_id;


CREATE TABLE `item_category` (
  `id` INT(11) NOT NULL COMMENT '',
  `sid` BINARY(32) NOT NULL COMMENT '',
  `name` VARCHAR(100) NOT NULL COMMENT '',
  `description` MEDIUMTEXT NULL COMMENT '',
  `tag_name` VARCHAR(250) NULL COMMENT '',
  `photo_url` MEDIUMTEXT NULL COMMENT '',
  `restro_id` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `sid_UNIQUE` (`sid` ASC)  COMMENT '',
  INDEX `fk_restro_key_idx` (`restro_id` ASC)  COMMENT '',
  CONSTRAINT `fk_restro_key`
    FOREIGN KEY (`restro_id`)
    REFERENCES `wisencrazy_restaraunt`.`restaraunt` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `item` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `sid` BINARY(32) NOT NULL COMMENT '',
  `name` MEDIUMTEXT NULL COMMENT '',
  `size` VARCHAR(255) NULL COMMENT '',
  `price` FLOAT NOT NULL DEFAULT 0.00 COMMENT '',
  `url` MEDIUMTEXT NULL COMMENT '',
  `description` MEDIUMTEXT NULL COMMENT '',
  `item_type` VARCHAR(45) NULL COMMENT '',
  `tag_name` VARCHAR(255) NULL COMMENT '',
  `is_veg` TINYINT(1) NOT NULL COMMENT '',
  `item_category_id` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `sid_UNIQUE` (`sid` ASC)  COMMENT '',
  INDEX `fk_item_category_idx` (`item_category_id` ASC)  COMMENT '',
  CONSTRAINT `fk_item_category`
    FOREIGN KEY (`item_category_id`)
    REFERENCES `wisencrazy_restaraunt`.`item_category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `item_has_size` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `sid` BINARY(32) NOT NULL COMMENT '',
  `name` VARCHAR(255) NULL COMMENT '',
  `price` FLOAT NOT NULL DEFAULT 0.00 COMMENT '',
  `description` MEDIUMTEXT NULL COMMENT '',
  `item_id` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `sid_UNIQUE` (`sid` ASC)  COMMENT '',
  INDEX `fk_item_id_idx` (`item_id` ASC)  COMMENT '',
  CONSTRAINT `fk_item_id`
    FOREIGN KEY (`item_id`)
    REFERENCES `wisencrazy_restaraunt`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
ALTER TABLE `restaraunt` 
ADD COLUMN `delivery_time` INT(11) NULL  default 0 COMMENT '' AFTER `cost_for_2`,
ADD COLUMN `delivery_charge` INT(11) NOT NULL default 50 COMMENT '' AFTER `delivery_time`,
ADD COLUMN `min_delivery` INT(11) NULL default 0 COMMENT '' AFTER `delivery_charge`,
ADD COLUMN `tags` VARCHAR(255) NULL default 0 COMMENT '' AFTER `min_delivery`;  


CREATE TABLE `order` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `sid` BINARY(32) NOT NULL COMMENT '',
  `restaraunt_id` INT(11) NOT NULL COMMENT '',
  `customer_id` INT(11) NOT NULL COMMENT '',
  `ordered_on` DATETIME NOT NULL COMMENT '',
  `delivered_on` DATETIME NULL COMMENT '',
  `total_amount` FLOAT NOT NULL COMMENT '',
  `taxes` FLOAT NULL COMMENT '',
  `delivery_charges` INT NOT NULL DEFAULT 0 COMMENT '',
  `discounts` FLOAT NULL COMMENT '',
  `billed_amount` FLOAT NOT NULL COMMENT '',
  `customer_address_id` INT(11) NOT NULL COMMENT '',
  `order_delivery_type` ENUM('TO', 'DE') NOT NULL DEFAULT 'DE' COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `sid_UNIQUE` (`sid` ASC)  COMMENT '',
  INDEX `fk_restaraunt_idx` (`restaraunt_id` ASC)  COMMENT '',
  INDEX `fk_customer_idx` (`customer_id` ASC)  COMMENT '',
  INDEX `fk_customer_add_idx` (`customer_address_id` ASC)  COMMENT '',
  CONSTRAINT `fk_restaraunt`
    FOREIGN KEY (`restaraunt_id`)
    REFERENCES `wisencrazy_restaraunt`.`restaraunt` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_customer`
    FOREIGN KEY (`customer_id`)
    REFERENCES `wisencrazy_restaraunt`.`customer` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_customer_add`
    FOREIGN KEY (`customer_address_id`)
    REFERENCES `wisencrazy_restaraunt`.`customer_address` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `wisencrazy_restaraunt`.`order_has_items` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `sid` BINARY(32) NOT NULL COMMENT '',
  `order_id` INT(11) NOT NULL COMMENT '',
  `item_id` INT(11) NOT NULL COMMENT '',
  `item_has_size_id` INT(11) NULL COMMENT '',
  `quantity` INT NOT NULL DEFAULT 0 COMMENT '',
  `item_bill` FLOAT NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `sid_UNIQUE` (`sid` ASC)  COMMENT '',
  INDEX `fk_order_idx` (`order_id` ASC)  COMMENT '',
  INDEX `fk_item_idx` (`item_id` ASC)  COMMENT '',
  INDEX `fk_item_has_size_idx` (`item_has_size_id` ASC)  COMMENT '',
  CONSTRAINT `fk_order`
    FOREIGN KEY (`order_id`)
    REFERENCES `wisencrazy_restaraunt`.`order` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item`
    FOREIGN KEY (`item_id`)
    REFERENCES `wisencrazy_restaraunt`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_has_size`
    FOREIGN KEY (`item_has_size_id`)
    REFERENCES `wisencrazy_restaraunt`.`item_has_size` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


ALTER TABLE `order` RENAME eorder;


ALTER TABLE `wisencrazy_restaraunt`.`customer_has_address` 
DROP COLUMN `id`,
ADD COLUMN `default` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '' AFTER `sid`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`customer_address_id`, `customer_id`)  COMMENT '';

ALTER TABLE `wisencrazy_restaraunt`.`customer_has_address` 
DROP COLUMN `sid`,
DROP INDEX `sid` ;


CREATE TABLE `wisencrazy_restaraunt`.`payment_history` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `sid` BINARY(32) NOT NULL COMMENT '',
  `payment_mode` ENUM('COD', 'ONLINE') NOT NULL COMMENT '',
  `payment_amout` DOUBLE NOT NULL COMMENT '',
  `payment_status` ENUM('STARTED', 'PENDING', 'COMPLETED', 'PENDING_CONFIRM') NOT NULL COMMENT '',
  `order_id` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `sid_UNIQUE` (`sid` ASC)  COMMENT '',
  UNIQUE INDEX `order_id_UNIQUE` (`order_id` ASC)  COMMENT '',
  CONSTRAINT `fk_order_id`
    FOREIGN KEY (`order_id`)
    REFERENCES `wisencrazy_restaraunt`.`eorder` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- Insert queries
INSERT INTO country (country_name,sid) VALUES ('India',unhex('86b5bcd2ca374479b41df5e41a1be5a649a23e8462fb4d5d93c59e960eb80176'));
INSERT INTO city(city_name,state_id,sid) VALUES ('Mysuru',1,unhex('9af4bf308c9b4e6cbb3f75d7b674d0e90224e75c7426410b9ca18b55e4e24d12'));
INSERT INTO state (state_name,country_id,sid) VALUES ('Karnataka',1,unhex('9af4bf308c9b4e6cbb3f75d7b674d0e90224e75c7426410b9ca18b55e4e24d12'));

INSERT INTO city(city_name,state_id,sid) VALUES ('Bengaluru',1,unhex('86b5bcd2ca374479b41df5e41a1be5a649a23e8462fb4d5d93c59e960eb80176'));

INSERT INTO area(area_name,city_id,sid) VALUES ('JP Nagar',1,unhex('9af4bf308c9b4e6cbb3f75d7b674d0e90224e75c7426410b9ca18b55e4e24d12'));
INSERT INTO area(area_name,city_id,sid) VALUES ('Hanumanth Namgar',1,unhex('86b5bcd2ca374479b41df5e41a1be5a649a23e8462fb4d5d93c59e960eb80176'));

INSERT INTO `customer_address` (`sid`,`address_line1`, `address_line2`, `address_line3`, `pin`,`country_id`,`state_id`) VALUES (unhex('86b5bcd2ca374479b41df5e41a1be5a649a23e8462fb4d5d93c59e960eb80176'),'Line#1', 'Line#2', 'Line#3', '560102',1,1);


INSERT INTO `wisencrazy_restaraunt`.`restaraunt_has_timings` (`restaraunt_id`, `timing`, `photo_url`) VALUES ('1', 'BR', 'br_photo_url');
INSERT INTO `wisencrazy_restaraunt`.`restaraunt_has_timings` (`restaraunt_id`, `timing`, `photo_url`) VALUES ('1', 'LU', 'lu_photo-url');
INSERT INTO `wisencrazy_restaraunt`.`restaraunt_has_timings` (`restaraunt_id`, `timing`, `photo_url`) VALUES ('2', 'DI', 'di-photo');

select * from customer where hex(sid)='09A1042495EB4D5B80F610BD354F3140E3AE145A5F274945A2BBD10C72AA28D0';
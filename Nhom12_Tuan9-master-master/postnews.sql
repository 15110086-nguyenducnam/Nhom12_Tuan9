CREATE DATABASE `postnews` /*!40100 DEFAULT CHARACTER SET utf8 */;
use postnews;
CREATE TABLE `postnews`.`post` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(200) NULL,
  `content` LONGTEXT NULL,
  `file` MEDIUMTEXT NULL,
  PRIMARY KEY (`id`));


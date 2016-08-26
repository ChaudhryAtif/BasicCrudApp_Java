CREATE DATABASE  IF NOT EXISTS `userbase`;
USE `userbase`;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `userbase`.`users` (`email`, `name`) VALUES ('abc@gmail.com', 'Abc');
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema RecommendSystemDb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema RecommendSystemDb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `RecommendSystemDb` DEFAULT CHARACTER SET utf8 ;
USE `RecommendSystemDb` ;

-- -----------------------------------------------------
-- Table `RecommendSystemDb`.`ranks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `RecommendSystemDb`.`ranks` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `shortName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `RecommendSystemDb`.`soldiers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `RecommendSystemDb`.`soldiers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `epb` INT NOT NULL,
  `surname` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `middleName` VARCHAR(255) NULL,
  `isActive` TINYINT NOT NULL DEFAULT 1,
  `rank_id` INT NOT NULL,
  `isOld` TINYINT NOT NULL DEFAULT 0,
  `dateOfConscription` DATE NOT NULL,
  `militaryCard` VARCHAR(15) NOT NULL,
  `isOnYSC` TINYINT NOT NULL DEFAULT 1,
  `isOnHoliday` TINYINT NOT NULL DEFAULT 0,
  `canBeDutyMaster` TINYINT NOT NULL DEFAULT 0,
  `isInHospital` TINYINT NOT NULL DEFAULT 0,
  `notice` TEXT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_soldiers_ranks_idx` (`rank_id` ASC),
  CONSTRAINT `fk_soldiers_ranks`
  FOREIGN KEY (`rank_id`)
  REFERENCES `RecommendSystemDb`.`ranks` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO ranks (name, shortName)
VALUES ("рядовой", "ряд."), ("ефрейтор", "ефр."), ("младший сержант", "мл. с-т"), ("сержант", "с-т"),
  ("старший сержант", "ст. с-т"), ("прапорщик", "пр-к"), ("старший прапорщик", "ст. пр-к"),("лейтенант", "л-т"),
  ("старший лейтенант", "ст. л-т"), ("капитан", "к-н"), ("майор", "м-р"), ("подполковник", "п/п-к"), ("полковник", "п-к");


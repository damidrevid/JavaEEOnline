drop user if exists 'springdemouser'@'localhost';

drop database if exists springDemoDB;

CREATE USER 'springdemouser'@'localhost' IDENTIFIED BY 'spring_demo';

create database springDemoDB;

use springDemoDB;

grant ALL PRIVILEGES ON springDemoDB.* TO 'springdemouser'@'localhost';

flush privileges;


drop database springDemoDB;

create database springDemoDB;

use springDemoDB;

grant ALL PRIVILEGES ON springDemoDB.* TO 'springdemouser'@'localhost';

flush privileges;


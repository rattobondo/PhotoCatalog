CREATE TABLE location (
  id int(11) NOT NULL AUTO_INCREMENT,
  code_country varchar(3) NOT NULL,
  latitude decimal(18,5) default null,
  longitude decimal(18,5) DEFAULT NULL,
  name varchar(255) default null,
  description varchar(500) DEFAULT NULL,
  create_date date default null,
  create_user varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
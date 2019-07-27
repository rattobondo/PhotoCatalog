CREATE TABLE photo (
  id int(11) NOT NULL AUTO_INCREMENT,
  id_album int(11) NOT NULL,
  id_location int(11) not null,
  name varchar(50) DEFAULT NULL,
  description varchar(255) DEFAULT NULL,
  path_file varchar(255) default null,
  create_date date default null,
  create_user varchar(50) DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id_album) references album(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
CREATE TABLE keyword (
  id int(11) NOT NULL AUTO_INCREMENT,
  name int(11) NOT NULL,
  create_date date default null,
  create_user varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE photo_keyword (
  id_keyword int(11) NOT NULL,
  id_photo int(11) NOT NULL,
  create_date date default null,
  create_user varchar(50) DEFAULT NULL,
  FOREIGN KEY (id_keyword) references keyword(id),
  FOREIGN KEY (id_photo) references photo(id),
  UNIQUE (id_keyword,id_photo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
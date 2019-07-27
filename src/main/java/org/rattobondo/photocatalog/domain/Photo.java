package org.rattobondo.photocatalog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idAlbum;
    private int idLocation;
    private String name;
    private String description;
    private String pathFile;
    private Date createDate;
    private String createUser;

}

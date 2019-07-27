package org.rattobondo.photocatalog.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Date createDate;
    private String createUser;
    @OneToMany(mappedBy = "album")
    private Set<Photo> photos;

}

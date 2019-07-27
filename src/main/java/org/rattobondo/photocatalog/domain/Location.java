package org.rattobondo.photocatalog.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codeCountry;
    private String name;
    private String description;
    private double latitude;
    private double longitude;
    private Date createDate;
    private String createUser;
    @OneToMany(mappedBy = "location")
    private Set<Photo> photos;

}

package org.rattobondo.photocatalog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

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

}

package org.rattobondo.photocatalog.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date createDate;
    private String createUser;
    @ManyToMany(mappedBy = "keys")
    private Set<Photo> photos;

}

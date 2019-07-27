package org.rattobondo.photocatalog.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String pathFile;
    private Date createDate;
    private String createUser;
    @ManyToOne
    @JoinColumn(name="id_album", nullable = false)
    private Album album;
    @ManyToOne
    @JoinColumn(name="id_location")
    private Location location;
    @ManyToMany
    @JoinTable (name="photo_keyword", joinColumns = @JoinColumn(name = "id_photo"), inverseJoinColumns = @JoinColumn(name="id_keyword"))
    private Set<Keyword> keys;
}

package org.rattobondo.photocatalog.repository;

import org.rattobondo.photocatalog.domain.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {

}

package org.rattobondo.photocatalog.repository;

import org.rattobondo.photocatalog.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

}

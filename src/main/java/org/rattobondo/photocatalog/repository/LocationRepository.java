package org.rattobondo.photocatalog.repository;

import org.rattobondo.photocatalog.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}

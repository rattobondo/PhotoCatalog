package org.rattobondo.photocatalog.repository;

import org.rattobondo.photocatalog.domain.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordRepository extends JpaRepository<Keyword, Integer> {

}

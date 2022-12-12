package com.childrenFirstBE.repositories;

import com.childrenFirstBE.models.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<Page, Long> {
}

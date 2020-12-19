package com.onmu.repository;

import com.onmu.domain.Museum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuseumRepository extends JpaRepository<Museum, Long> {
}

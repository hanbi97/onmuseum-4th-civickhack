package com.onmu.repository;

import com.onmu.domain.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertRepository extends JpaRepository<Expert, Long> {
}

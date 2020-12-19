package com.onmu.repository;

import com.onmu.domain.Exhibition;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {

    //총 전시 수: count() 사용

    //분위기별로 불러오기
    List<Exhibition> findByCategory(String category);

    //장르별로 불러오기
    List<Exhibition> findByGenre(String genre);

}

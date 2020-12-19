package com.onmu.service;

import com.onmu.domain.Exhibition;
import com.onmu.repository.ExhibitionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ExhibitionService {
    private final ExhibitionRepository exhibitionRepository;

    /**
     * 전시 한개
     */
    //create
    public void saveExhibition(Exhibition exhibition) {
        exhibitionRepository.save(exhibition);
    }

    //read
    public Exhibition findOneExhibition(Long id) {
        return exhibitionRepository.findById(id).get();
    }
    //update

    //delete

    /**
     * 전시 리스트 가져오기
     */
    //all
    public List<Exhibition> findAllExhibition() {
        return exhibitionRepository.findAll();
    }

    //category
    public List<Exhibition> findByCategory(String category) {
        return exhibitionRepository.findByCategory(category);
    }

    //genre
    public List<Exhibition> findByGenre(String genre) {
        return exhibitionRepository.findByCategory(genre);
    }

    //latest

    //most popular

    /**
     * 조회수
     * */
    public void updateView(Long id){
        exhibitionRepository.findById(id).get().setView();
    }


}

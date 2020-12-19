package com.onmu.service;

import com.onmu.domain.Expert;
import com.onmu.repository.ExpertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ExpertService {
    private final ExpertRepository expertRepository;

    public void saveExpert(Expert expert){
        expertRepository.save(expert);
    }
}

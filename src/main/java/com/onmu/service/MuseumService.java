package com.onmu.service;

import com.onmu.domain.Museum;
import com.onmu.repository.MuseumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MuseumService {
    private final MuseumRepository museumRepository;

    public void saveMuseum(Museum museum){
        museumRepository.save(museum);
    }
}

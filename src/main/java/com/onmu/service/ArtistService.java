package com.onmu.service;

import com.onmu.domain.Artist;
import com.onmu.repository.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ArtistService {
    private final ArtistRepository artistRepository;

    public void saveArtist(Artist artist){
        artistRepository.save(artist);
    }
}

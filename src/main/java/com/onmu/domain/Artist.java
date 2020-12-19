package com.onmu.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "artists")
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue
    @Column(name = "artist_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    private String work;

    @OneToMany(mappedBy = "artist")
    private List<Exhibition> exhibitions = new ArrayList<>();

    @Builder
    public Artist(String name, String work){
        this.name=name;
        this.work=work;
    }
}

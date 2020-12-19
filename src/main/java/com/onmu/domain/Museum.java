package com.onmu.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "museums")
@NoArgsConstructor
public class Museum {
    @Id
    @GeneratedValue
    @Column(name = "museum_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @OneToMany(mappedBy = "museum")
    private List<Exhibition> exhibitions = new ArrayList<>();

    @Builder
    public Museum(String name, String location){
        this.name=name;
        this.location=location;
    }
}

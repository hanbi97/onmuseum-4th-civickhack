package com.onmu.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "experts")
@NoArgsConstructor
public class Expert {
    @Id
    @GeneratedValue
    @Column(name = "expert_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    private String work;

    @OneToMany(mappedBy = "expert")
    private List<Exhibition> exhibitions = new ArrayList<>();

    @Builder
    public Expert(String name, String work){
        this.name=name;
        this.work=work;
    }
}

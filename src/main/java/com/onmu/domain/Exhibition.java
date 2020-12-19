package com.onmu.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Table(name = "exhibitions")
@NoArgsConstructor
public class Exhibition {
    @Id
    @GeneratedValue
    @Column(name = "exhibition_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate start;

    @Column(nullable = false)
    private LocalDate end;

    @Column(nullable = false)
    private Long view;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String genre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "museum_id")
    private Museum museum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expert_id")
    private Expert expert;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public Exhibition(String name, LocalDate start, LocalDate end, long view, String category, String genre) {
        this.name=name;
        this.start=start;
        this.end=end;
        this.view=view;
        this.category=category;
        this.genre=genre;
    }

    public void setMuseum(Museum museum){
        this.museum=museum;
        museum.getExhibitions().add(this);
    }

    public void setExpert(Expert expert){
        this.expert=expert;
        expert.getExhibitions().add(this);
    }
    public void setArtist(Artist artist){
        this.artist=artist;
        artist.getExhibitions().add(this);
    }
    public void setView(){
        this.view=this.view+1;
    }

    public static Exhibition createExhibition(Exhibition ex, Museum museum, Expert expert, Artist artist) {
        ex.setMuseum(museum);
        ex.setArtist(artist);
        ex.setExpert(expert);
        return ex;
    }
}

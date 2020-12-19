package com.onmu;

import com.fasterxml.jackson.core.format.DataFormatMatcher;
import com.onmu.domain.Artist;
import com.onmu.domain.Exhibition;
import com.onmu.domain.Expert;
import com.onmu.domain.Museum;
import com.onmu.service.ArtistService;
import com.onmu.service.ExhibitionService;
import com.onmu.service.ExpertService;
import com.onmu.service.MuseumService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class OnmuApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnmuApplication.class, args);
    }

}
//    @Bean
//    public CommandLineRunner commandLineRunner(ExhibitionService exhibitionService, MuseumService museumService,
//                                               ArtistService artistService, ExpertService expertService){
//        return(args)->{
//            /***/
//            Museum m1=
//                    new Museum("갤러리라온","1층");
//            Museum m2=
//                    new Museum("에브리데이몬데이 갤러리","제3전시실");
//            Museum m3=
//                    new Museum("라이크디즈1601","2층");
//            Museum m4=
//                    new Museum("더페이지갤러리","1층");
//            Museum m5=
//                    new Museum("라이즈오토그래프컬렉션","제 1 전시실");
//
//            museumService.saveMuseum(m1);
//            museumService.saveMuseum(m2);
//            museumService.saveMuseum(m3);
//            museumService.saveMuseum(m4);museumService.saveMuseum(m5);
//
//            /***/
//            Expert e1=
//                    new Expert("이문조","갤러리라온");
//            Expert e2=
//                    new Expert("이수지","에브리데이몬데이 갤러리");
//            Expert e3=
//                    new Expert("김자현","라이크디즈1601");
//            Expert e4=
//                    new Expert("김하경","더페이지갤러리");
//            Expert e5=
//                    new Expert("왕한슬","라이즈오토그래프컬렉션");
//            expertService.saveExpert(e1);  expertService.saveExpert(e2);  expertService.saveExpert(e3);  expertService.saveExpert(e4);
//            expertService.saveExpert(e5);
//
//            /***/
//            Artist a1=
//                    new Artist("고강필","");
//            Artist a2=
//                    new Artist("김희수","");
//            Artist a3=
//                    new Artist("제이비","");
//            Artist a4=
//                    new Artist("Jean Prouvé","");
//            Artist a5=
//                    new Artist("콰야","");
//            artistService.saveArtist(a1);
//            artistService.saveArtist(a2);
//            artistService.saveArtist(a3); artistService.saveArtist(a4); artistService.saveArtist(a5);
//
//            /***/
//            Exhibition ex1 =
//                    new Exhibition("THE GREATEST  POP ART, SUPERSTAR", LocalDate.parse("2020-12-08", DateTimeFormatter.ISO_DATE),LocalDate.parse("2021-01-09",DateTimeFormatter.ISO_DATE),(long)0,"열정적","미술");
//            Exhibition ex2 =
//                    new Exhibition("heenangheesookim:theothersideofmymind", LocalDate.parse("2020-11-13", DateTimeFormatter.ISO_DATE),LocalDate.parse("2021-01-10",DateTimeFormatter.ISO_DATE),(long)0,"열정적","미술");
//
//            Exhibition ex3 =
//                    new Exhibition("제이비 freedom color", LocalDate.parse("2020-11-11", DateTimeFormatter.ISO_DATE),LocalDate.parse("2020-12-29",DateTimeFormatter.ISO_DATE),(long)0,"열정적","미술");
//
//            Exhibition ex4 =
//                    new Exhibition("everywhere&here...  ", LocalDate.parse("2020-10-22", DateTimeFormatter.ISO_DATE),LocalDate.parse("2021-01-23",DateTimeFormatter.ISO_DATE),(long)0,"열정적","미술");
//
//            Exhibition ex5 =
//                    new Exhibition("콰야knock,knock ", LocalDate.parse("2020-11-14", DateTimeFormatter.ISO_DATE),LocalDate.parse("2020-12-24",DateTimeFormatter.ISO_DATE),(long)0,"열정적","미술");
//
//            Exhibition s1=Exhibition.createExhibition(ex1,m1,e1,a1);
//            Exhibition s2=Exhibition.createExhibition(ex2,m2,e2,a2);
//            Exhibition s3=Exhibition.createExhibition(ex3,m3,e3,a3);
//            Exhibition s4=Exhibition.createExhibition(ex4,m4,e4,a4);
//            Exhibition s5=Exhibition.createExhibition(ex5,m5,e5,a5);
//
//            exhibitionService.saveExhibition(s1);
//            exhibitionService.saveExhibition(s2);
//            exhibitionService.saveExhibition(s3);
//            exhibitionService.saveExhibition(s4);
//            exhibitionService.saveExhibition(s5);
//
//        };
//    }
//}

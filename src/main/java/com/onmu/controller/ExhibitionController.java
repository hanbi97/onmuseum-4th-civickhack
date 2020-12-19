package com.onmu.controller;

import com.onmu.repository.ExhibitionRepository;
import com.onmu.service.ExhibitionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
@RequiredArgsConstructor
public class ExhibitionController {
    private final ExhibitionService exhibitionService;
    private final ExhibitionRepository exhibitionRepository;

    @GetMapping("/exhibitions")
    public String getAllExhibitions(Model model){
        model.addAttribute("exhibitions",exhibitionService.findAllExhibition());
        model.addAttribute("count",exhibitionRepository.count());
        return "list";
    }

    @GetMapping("/exhibitions/{id}")
    public String getExhibitionDetail(@PathVariable("id") Long id, Model model){
        model.addAttribute("exhibition",exhibitionService.findOneExhibition(id));
        exhibitionService.updateView(id);
        return "detail";
    }

}

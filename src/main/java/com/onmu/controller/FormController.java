package com.onmu.controller;

import com.onmu.service.ExhibitionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class FormController {
    private final ExhibitionService exhibitionService;

    @GetMapping("/form")
    public String form(){
        return "form";
    }
}

package com.onmu.controller;

import com.onmu.service.ExhibitionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class IndexController {
    private final ExhibitionService exhibitionService;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("data","hi");
        log.info("home Controller");
        return "index";
    }
}

package com.gda.kepler.proxy.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Tag(name = "API Endpoints")
@Schema(
    title = "API Endpoints", description = "API Endpoints"
)
public class MainController {

    @GetMapping("/") // Customize the path if needed
    public String swagger() {
        return "redirect:/index.html";
    }

    @GetMapping("/terms-of-service")
    public String returnTOS() {

        return "TermsOfService.html";
    }

    @GetMapping("/license")
    public String returnLicense() {

        return "License.html";
    }


}

package me.dio.controller;

import me.dio.domain.model.About;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutController {

    @GetMapping
    public About about() {
        return new About(
                "Julio Cesar",
                "Santander Dev Week API",
                "1.0.0",
                "API customizada pelo Julio Cesar 🚀"
        );
    }
}

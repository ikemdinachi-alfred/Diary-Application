package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DiaryController {

    @GetMapping("/test")
    public String register1() {
        return "Registration successful!";
    }
}
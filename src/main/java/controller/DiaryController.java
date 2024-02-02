package controller;

import dto.responds.RegistrationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.DiaryServiceImplementation;

@RestController
@RequestMapping("/api/")
public class DiaryController {
@Autowired
DiaryServiceImplementation diaryServiceImplementation;
@Autowired
RegistrationResponse registrationResponse;

    @GetMapping("/test")
    public String registerUser() {
        return null;

    }
}
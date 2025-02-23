package site.ani4h.ani4hapi.auth;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {
    @PostMapping("/login")
    public String login() {
        return "Greetings from Spring Boot!";
    }


    @PostMapping("/register")
    public String register() {
        return "Greetings from Spring Boot!";
    }
}

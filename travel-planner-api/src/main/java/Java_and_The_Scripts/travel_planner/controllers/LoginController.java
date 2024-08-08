package Java_and_The_Scripts.travel_planner.controllers;

import Java_and_The_Scripts.travel_planner.models.Login;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {
    @GetMapping
    public String displayLoginForm() {

        // this is a placeholder for now
        return "login";
    }

    @PostMapping
    public String logIn(@ModelAttribute Login login) {
        // TODO
        // Connect User repository
        // Authenticate with login information
        // Take client to profile page or display error message depending on result

        // this is a placeholder for now
        return "profile";
    }
}
package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by dmitri on 2018-12-15
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    // No specific implementation is specified using @Qualifier
    // @Primary is used
    public MyController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }
}

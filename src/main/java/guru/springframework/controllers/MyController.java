package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    // No specific implementation is specified using @Qualifier
    // @Primary is used, also determined by @Profile
    @Autowired
    public MyController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }
}

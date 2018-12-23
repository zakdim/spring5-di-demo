package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by dmitri on 2018-12-16
 */
@Controller
public class SetterInjectedController {

    // Using interface
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    // Setter spring injection point
    @Autowired
    public void setGreetingService(GreetingService greetingService) {

        this.greetingService = greetingService;
    }
}

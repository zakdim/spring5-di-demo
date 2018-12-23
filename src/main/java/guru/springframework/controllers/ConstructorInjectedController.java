package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by dmitri on 2018-12-16
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Spring constructor injection point: this is automatic, no need to use @Autowired
    @Autowired  // using explicitly is fine too
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return  greetingService.sayGreeting();
    }
}

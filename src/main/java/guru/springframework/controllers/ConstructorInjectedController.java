package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by dmitri on 2018-12-16
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Spring constructor injection point: this is automatic, no need to use @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return  greetingService.sayGreeting();
    }
}

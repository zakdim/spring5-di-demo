package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by dmitri on 2018-12-16
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Constructor injection points
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return  greetingService.sayGreeting();
    }
}

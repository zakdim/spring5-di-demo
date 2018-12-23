package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by dmitri on 2018-12-16
 */
public class SetterInjectedController {

    // Using interface
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    // Setter injection point
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

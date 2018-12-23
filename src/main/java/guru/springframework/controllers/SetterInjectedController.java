package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by dmitri on 2018-12-16
 */
public class SetterInjectedController {

    // Using interface
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    // Setter for manual injection point
    public void setGreetingService(GreetingService greetingService) {

        this.greetingService = greetingService;
    }
}

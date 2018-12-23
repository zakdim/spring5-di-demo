package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;


/**
 * Created by dmitri on 2018-12-16
 */
public class PropertyInjectedController {

    // Spring injection point
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

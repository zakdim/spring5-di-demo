package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by dmitri on 2018-12-16
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Spring constructor injection point: this is automatic, no need to use @Autowired
    // Using @Qualifier to specify which implementation is expected here
    @Autowired  // this is optional in this case
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String sayHello() {
        return  greetingService.sayGreeting();
    }
}

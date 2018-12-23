package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by dmitri on 2018-12-23
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor";
    }
}

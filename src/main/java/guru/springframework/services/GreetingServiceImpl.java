package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by dmitri on 2018-12-16
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}

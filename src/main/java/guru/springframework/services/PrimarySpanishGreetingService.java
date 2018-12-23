package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by dmitri on 2018-12-23
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}

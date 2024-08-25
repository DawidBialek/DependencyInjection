package db.spring.DependencyInjection.services.i18n;

import db.spring.DependencyInjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hola Mundo - ES";
    }
}

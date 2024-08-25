package db.spring.DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service()
public class ProdService implements DataSourceService{
    @Override
    public String printData() {
        return "Prod data";
    }
}

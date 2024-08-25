package db.spring.DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service()
public class DevService implements DataSourceService{
    @Override
    public String printData() {
        return "Dev data";
    }
}

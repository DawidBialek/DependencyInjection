package db.spring.DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service()
public class UATService implements DataSourceService
{
    @Override
    public String printData() {
        return "UAT data";
    }
}

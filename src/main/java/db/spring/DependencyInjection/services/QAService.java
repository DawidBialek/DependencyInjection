
package db.spring.DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service()
public class QAService implements DataSourceService{
    @Override
    public String printData() {
        return "QA data";
    }
}

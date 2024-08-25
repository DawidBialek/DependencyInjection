package db.spring.DependencyInjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"qa", "EN"})
@SpringBootTest
class QADataSourceControllerTest {

    @Autowired
    DataSourceController dataSourceController;

    @Test
    void getDataFromDataSource() {
        System.out.println(dataSourceController.getDataFromDataSource());
    }
}
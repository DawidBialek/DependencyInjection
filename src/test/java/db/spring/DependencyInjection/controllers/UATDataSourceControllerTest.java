package db.spring.DependencyInjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class UATDataSourceControllerTest {

    @Autowired
    DataSourceController dataSourceController;

    @Test
    void getDataFromDataSource() {
        System.out.println(dataSourceController.getDataFromDataSource());
    }
}
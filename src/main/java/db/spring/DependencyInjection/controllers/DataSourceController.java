package db.spring.DependencyInjection.controllers;

import db.spring.DependencyInjection.services.DataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DataSourceService dataSourceService;

    public DataSourceController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataFromDataSource(){
        return dataSourceService.printData();
    }
}

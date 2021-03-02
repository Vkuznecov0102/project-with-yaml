package ru.itsjava.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.itsjava.service.*;

@Configuration
public class MyConfig {

    @Bean
    @Profile("dev")
    public CoffeeService coffee() {
        return new CoffeeServiceImpl();
    }

    @Bean
    @Profile("test")
    public CoffeeService coffeeHouse() {
        return new CoffeeHouseServiceImpl();
    }

    @Bean
    public MenuService menuService() {
        return new MenuServiceImpl();
    }

    @Bean
    public ScannerService scannerService() {
        return new ScannerServiceImpl();
    }



}

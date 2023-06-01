package com.genius.springdatajdbc.controller;


import com.genius.springdatajdbc.component.DatabaseSeeder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

    private final DatabaseSeeder databaseSeeder;

    public PersonController(DatabaseSeeder databaseSeeder) {
        this.databaseSeeder = databaseSeeder;
    }

    @RequestMapping("/persons")
    public void list() {
        databaseSeeder.insertData();
    }
}

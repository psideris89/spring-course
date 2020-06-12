package com.demo.springdemo.controller;

import com.demo.springdemo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController
{
    @GetMapping("/persons")
    public List<Person> getPersons()
    {
        List<Person> people = List.of(
                new Person("Alpha", "Beta", "20"),
                new Person("Gamma", "Delta", "22"));

        return people;
    }

    @GetMapping("/persons/{name}")
    public Person getPersons(@PathVariable String name)
    {
        List<Person> people = List.of(
                new Person("Alpha", "Beta", "20"),
                new Person("Gamma", "Delta", "22"));

//        for (Person e : people) {
//              ...
//        }

        Person person = people.stream()
                              .filter(s -> s.getFistName().equals(name))
                              .findFirst()
                              .orElseThrow(RuntimeException::new);

        return person;
    }

    // TODO Rewrite the above endpoint to accept request parameter instead
    // localhost:8080/persons?name=Alpha

    // Creates a person
    @PostMapping("/persons")
    public List<Person> getPersonsA()
    {
        // Will implement on the next course
        List<Person> people = List.of(
                new Person("Alpha", "Beta", "20"),
                new Person("Alpha", "Kappa", "21"),
                new Person("Gamma", "Delta", "22"));

        return people;
    }

    // Deletes a person
}

package com.demo.springdemo.model;

public class Person
{
    private String fistName;
    private String lastName;
    private String age;

    public Person(String fistName, String lastName, String age)
    {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFistName()
    {
        return fistName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

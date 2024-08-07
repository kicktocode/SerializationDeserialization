package org.example;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;
    private static final long serialVersionUID= 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

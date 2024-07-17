package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("john", 31);

        try (FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream))
        {
             outputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
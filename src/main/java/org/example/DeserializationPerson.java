package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class DeserializationPerson {
    public static void main(String[] args) throws IOException {
        Person person1=null;

        try
            (FileInputStream fileInputStream= new FileInputStream("person.ser");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream))
            {
                person1 = (Person) objectInputStream.readObject();

        } catch (FileNotFoundException | ClassNotFoundException e) {
           e.printStackTrace();
        }
        System.out.println("Deserialized person : "+ person1);
    }
}

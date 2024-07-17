package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizableDeserializable {
    public static void main(String[] args) {
        // Instantiating the object using the no-arg constructor
        Company company= new Company();

        try(FileInputStream fileInputStream = new FileInputStream("company.ser");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream))
        {
            company.readExternal(objectInputStream);// Explicitly calling readExternal
        } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
        }
        System.out.println("Deserialized Company :" +company);
    }
}

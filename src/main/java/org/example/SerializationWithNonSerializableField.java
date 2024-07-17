package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWithNonSerializableField {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung pro", 23000, MobileAvailability.AVAILABLE);


        try (FileOutputStream fileOutputStream = new FileOutputStream("Mobile.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(mobile);
        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
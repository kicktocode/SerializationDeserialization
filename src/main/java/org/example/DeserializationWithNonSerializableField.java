package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationWithNonSerializableField {
    public static void main(String[] args) {
        Mobile mobile = null;

        try (FileInputStream fileInputStream = new FileInputStream("Mobile.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            mobile= (Mobile) objectInputStream.readObject();
        } catch (Exception e) {

            e.printStackTrace();

        }
        System.out.println(mobile);
    }
}
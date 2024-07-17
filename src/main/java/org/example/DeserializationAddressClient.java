package org.example;

import java.io.*;

public class DeserializationAddressClient {
    public static void main(String[] args) {

        Address address = null;
        Client client = null;
        try (FileInputStream fileInputStream = new FileInputStream("AddressClient.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            client = (Client) objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(client);
    }
}

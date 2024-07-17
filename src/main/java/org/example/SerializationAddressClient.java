package org.example;

import java.io.*;

public class SerializationAddressClient {
    public static void main(String[] args) {
        Address address= new Address("Kondapur","Hyderabad");
        Client client = new Client("john",45,address);

      try(FileOutputStream fileOutputStream= new FileOutputStream("AddressClient.ser");
         ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream))
      {
          outputStream.writeObject(client);
      } catch (IOException e) {
          e.printStackTrace();
      }

    }
}

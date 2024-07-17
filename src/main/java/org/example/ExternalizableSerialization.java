package org.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ExternalizableSerialization {
    public static void main(String[] args) {
        Employee emp1 = new Employee("E001", "John Doe", 30);
        Employee emp2 = new Employee("E002", "Jane Smith", 25);
        Company company = new Company("C001", "TechCorp", Arrays.asList(emp1, emp2));

        try(FileOutputStream fileOutputStream= new FileOutputStream("company.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            company.writeExternal(objectOutputStream);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

package org.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
    private static final long serialVersionUID= 1L;
    private String name;
    private String id;
    private int age;

    public Employee() {

    }
    public Employee(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(id);
        out.writeInt(age);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
          this.name=in.readUTF();
          this.id = in.readUTF();
          this.age = in.readInt();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

}

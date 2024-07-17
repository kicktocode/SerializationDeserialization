package org.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class Company implements Externalizable {
    private String companyName;
    private String companyId;
    private List<Employee> employeeList;
    public Company() {

    }
    public Company(String companyName, String companyId, List<Employee> employeeList) {
        this.companyName = companyName;
        this.companyId = companyId;
        this.employeeList = employeeList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(companyId);
        out.writeUTF(companyName);
        out.writeInt(employeeList.size());
        for(Employee employee:employeeList)
        {
            employee.writeExternal(out);
        }

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.companyName = in.readUTF();
        this.companyId = in.readUTF();
        int employeeCount = in.readInt();
        this.employeeList = new ArrayList<>();
        for(int i=0;i<employeeCount;i++)
        {
            Employee employee= new Employee();
            employee.readExternal(in);
            this.employeeList.add(employee);
        }

    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyId='" + companyId + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}

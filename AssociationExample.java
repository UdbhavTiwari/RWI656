

import java.util.ArrayList;
import java.util.List;

class Bank {
    private String bname;
    private List<Employee1> employees;

    public Bank(String bname) {
        this.bname = bname;
        this.employees = new ArrayList<>(); // Initialize the list to avoid null pointer exceptions
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public List<Employee1> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee1> employees) {
        this.employees = employees;
    }
}

class Employee1 {
    private String name;

    public Employee1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class AssociationExample {

    public static void main(String[] args) {
        Employee1 e = new Employee1("Deepak");
        Employee1 e1 = new Employee1("Sneha");
        
        List<Employee1> employees = new ArrayList<>();
        employees.add(e);
        employees.add(e1);
        
        Bank bank = new Bank("RBL");
        bank.setEmployees(employees); // Corrected method name to setEmployees

        for (Employee1 emp : bank.getEmployees()) {
            System.out.println(emp.getName() + " belongs to bank " + bank.getBname());
        }
    }
}

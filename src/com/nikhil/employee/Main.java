package com.nikhil.employee;

import com.nikhil.employee.models.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private HashMap<Integer,Employee> employeeHashMap;
    private int idCounter = 1;

    public static void main(String[] args) {

        Main main = new Main();

        main.employeeHashMap = new HashMap<>();

        // Creating 2 employees
        Employee employee = new Employee(main.idCounter++);
        employee.setName("AnyOne");
        employee.setEmail("anything4242221@gmail.com");

        Employee employee2 = new Employee(main.idCounter++);
        employee2.setName("Whatever");
        employee2.setEmail("awhatwe4242221@gmail.com");

        // Adding these to our Hash Map
        main.addEmployee(employee);
        main.addEmployee(employee2);

        main.printAllEmployees();

    }

    private void addEmployee(Employee newEmployee){

        System.out.println("Adding Employee " + newEmployee.getName() + "\n");
        employeeHashMap.put(newEmployee.getId(), newEmployee);

    }

    private void deleteEmployee(int id){

        System.out.println("Deleting Employee " + employeeHashMap.get(id).getName() + "\n");
        employeeHashMap.remove(id);

    }

    private Employee getEmployeeById(int id){

        return employeeHashMap.get(id);

    }

    private void printAllEmployees(){

        if(employeeHashMap.isEmpty()){

            System.out.println( "Employee List is empty !\n" );

        }else{

            System.out.println("Printing All Employee's details :\n");
            employeeHashMap.forEach( (key, value)-> {
                System.out.println(value.displayEmployeeDetails());
            } );

        }

    }


}

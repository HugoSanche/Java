package com.in28minutes.java.exceptionhandling;

public class Employee {

    public void validateAgeEmployee(int age){
        if (age<0){
            throw new IllegalArgumentException("La edad debe ser un numero mayor o igual a 0");
        }
        System.out.println("La edad del empleado es correcta");
    }
    public static void main(String[] args) {
        Employee employee=new Employee();
        try {
            employee.validateAgeEmployee(-5);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error: "+e);
        }
    }
}

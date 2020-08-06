package com.theboreddev.java14;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String surname;
    private final int age;
    private final Address address;
    private final double salary;

    public Employee(String firstName, String surname, int age, Address address, double salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, age, address, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}

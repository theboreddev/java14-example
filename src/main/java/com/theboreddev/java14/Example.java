package com.theboreddev.java14;

public class Example {

    public static void main(String[] args) {

        final EmployeeRecord employee = new EmployeeRecord(
                "John",
                "Smith",
                33,
                new AddressRecord("X", "Y", "AB XYZ"),
                36230.25
        );

        System.out.println(employee);

    }
}

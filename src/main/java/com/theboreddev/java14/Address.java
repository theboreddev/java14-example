package com.theboreddev.java14;

import java.util.Objects;

public class Address {
    private final String firstLine;
    private final String secondLine;
    private final String postCode;

    public Address(String firstLine, String secondLine, String postCode) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.postCode = postCode;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(firstLine, address.firstLine) &&
                Objects.equals(secondLine, address.secondLine) &&
                Objects.equals(postCode, address.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstLine, secondLine, postCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}

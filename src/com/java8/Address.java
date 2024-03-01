package com.java8;

public class Address {
    String address;

    public String getAddress() {
        return address;
    }

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

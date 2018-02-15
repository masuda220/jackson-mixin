package com.example.jackson;

public class Address {
    private String city;
    private String state;

    private PostalCode postalCode ;

    public Address(String city, String state, PostalCode postalCode) {
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}

package com.example.jackson;

public class PostalCode {
    String major;
    String minor;

    public PostalCode(String major, String minor) {
        this.major = major;
        this.minor = minor;
    }

    public String asText() {
        return String.format("%s-%s", major, minor);
    }

    @Override
    public String toString() {
        return "PostalCode{" +
                "major='" + major + '\'' +
                ", minor='" + minor + '\'' +
                '}';
    }
}

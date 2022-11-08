package org.example.model;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" + "streetAddress='" + streetAddress + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", postalCode='" + postalCode + '\'' + '}';
    }
}

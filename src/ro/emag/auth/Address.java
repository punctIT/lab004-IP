package ro.emag.auth;

import java.util.UUID;

public class Address {
    private UUID id;
    private UUID userId;
    private String label;
    private String street;
    private String city;
    private String county;
    private String postalCode;
    private String country;
    private boolean isDefault;

    public Address(UUID id, UUID userId, String label, String street, String city, String county, String postalCode, String country, boolean isDefault) {
        this.id = id;
        this.userId = userId;
        this.label = label;
        this.street = street;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
        this.country = country;
        this.isDefault = isDefault;
    }

    public Address() {
    }

    public Address(UUID id, UUID userId, String street, String city, String county, String postalCode, String country) {
        this.id = id;
        this.userId = userId;
        this.street = street;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
        this.country = country;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFormatedAddress() {
        return "";
    }

    public void markAsDefault() {
        this.isDefault = true;
    }

    public void unmarkAsDefault() {
        this.isDefault = false;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

package ro.emag.auth;

import java.util.List;

public class Address {
    private int id;
    private int userId;
    private String label;
    private String street;
    private String city;
    private String county;
    private String postalCode;
    private String country;
    private boolean isDefault;
    private User user;
    private List<Object> orders;
    private List<Object> lockers;

    public Address() {}

    public Address(int id, int userId, String street, String city, String county, String postalCode, String country) {
        this.id = id;
        this.userId = userId;
        this.street = street;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
        this.country = country;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getCounty() { return county; }
    public void setCounty(String county) { this.county = county; }
    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public boolean isDefault() { return isDefault; }
    public void setDefault(boolean isDefault) { this.isDefault = isDefault; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getFormattedAddress() { return ""; }
    public void markAsDefault() {}
    public void unmarkAsDefault() {}

    @Override
    public String toString() {
        return "Address{id=" + id + ", street=" + street + ", city=" + city + "}";
    }
}

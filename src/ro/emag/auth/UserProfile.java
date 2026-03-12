package ro.emag.auth;

import java.time.LocalDate;

public class UserProfile {
    private int id;
    private int userId;
    private String firstName;
    private String lastName;
    private String phone;
    private LocalDate dateOfBirth;
    private User user;

    public UserProfile() {}

    public UserProfile(int id, int userId, String firstName, String lastName, String phone) {
        this.id = id;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getFullName() { return ""; }

    @Override
    public String toString() {
        return "UserProfile{id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "}";
    }
}

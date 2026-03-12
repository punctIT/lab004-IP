package ro.emag.auth;

import java.time.LocalDateTime;
import java.util.List;

public class User {
    private int id;
    private String email;
    private String passwordHash;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private UserProfile userProfile;
    private List<Address> addresses;
    private Client client;
    private Seller seller;
    private Admin admin;

    public User() {}

    public User(int id, String email, String passwordHash, String role) {
        this.id = id;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public UserProfile getUserProfile() { return userProfile; }
    public void setUserProfile(UserProfile userProfile) { this.userProfile = userProfile; }
    public List<Address> getAddresses() { return addresses; }
    public void setAddresses(List<Address> addresses) { this.addresses = addresses; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public Seller getSeller() { return seller; }
    public void setSeller(Seller seller) { this.seller = seller; }
    public Admin getAdmin() { return admin; }
    public void setAdmin(Admin admin) { this.admin = admin; }

    public boolean isClient() { return false; }
    public boolean isSeller() { return false; }
    public boolean isAdmin() { return false; }
    public boolean isCatalogManager() { return false; }
    public Address getDefaultAddress() { return null; }

    @Override
    public String toString() {
        return "User{id=" + id + ", email=" + email + ", role=" + role + "}";
    }
}

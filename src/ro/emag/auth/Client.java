package ro.emag.auth;

import java.time.LocalDateTime;
import java.util.List;

public class Client {
    private int id;
    private int loyaltyPoints;
    private LocalDateTime createdAt;
    private int userId;
    private User user;
    private List<Object> shoppingCarts;
    private List<Object> orders;
    private List<Object> reviews;
    private List<Object> returns;

    public Client() {}

    public Client(int id, int loyaltyPoints, int userId) {
        this.id = id;
        this.loyaltyPoints = loyaltyPoints;
        this.userId = userId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public void addLoyaltyPoints(int points) {}
    public void deductLoyaltyPoints(int points) {}
    public boolean hasEnoughPoints(int points) { return false; }

    @Override
    public String toString() {
        return "Client{id=" + id + ", loyaltyPoints=" + loyaltyPoints + "}";
    }
}

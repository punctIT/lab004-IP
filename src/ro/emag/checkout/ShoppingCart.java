package ro.emag.checkout;

import ro.emag.auth.Client;
import java.time.LocalDateTime;
import java.util.List;

public class ShoppingCart {
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int clientId;
    private Client client;
    private List<CartItem> cartItems;

    public ShoppingCart() {}

    public ShoppingCart(int id, int clientId) {
        this.id = id;
        this.clientId = clientId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public List<CartItem> getCartItems() { return cartItems; }
    public void setCartItems(List<CartItem> cartItems) { this.cartItems = cartItems; }

    public void addCartItem(CartItem item) {}
    public void removeCartItem(CartItem item) {}
    public void clearCart() {}
    public double getTotal() { return 0.0; }
    public int getTotalItems() { return 0; }
    public boolean isEmpty() { return false; }

    @Override
    public String toString() {
        return "ShoppingCart{id=" + id + ", clientId=" + clientId + "}";
    }
}

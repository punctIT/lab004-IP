package ro.emag.catalog;

import ro.emag.auth.Client;
import java.time.LocalDateTime;

public class ProductReview {
    private int id;
    private int productId;
    private int rating;
    private String comment;
    private LocalDateTime createdAt;
    private int sellerRating;
    private int clientId;
    private Product product;
    private Client client;

    public ProductReview() {}

    public ProductReview(int id, int productId, int rating, int clientId) {
        this.id = id;
        this.productId = productId;
        this.rating = rating;
        this.clientId = clientId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public int getSellerRating() { return sellerRating; }
    public void setSellerRating(int sellerRating) { this.sellerRating = sellerRating; }
    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public boolean isPositive() { return false; }
    public boolean isNegative() { return false; }

    @Override
    public String toString() {
        return "ProductReview{id=" + id + ", productId=" + productId + ", rating=" + rating + "}";
    }
}

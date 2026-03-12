package ro.emag.catalog;

import ro.emag.auth.Seller;
import java.time.LocalDateTime;
import java.util.List;

public class Product {
    private int id;
    private int categoryId;
    private String name;
    private String description;
    private double price;
    private int stock;
    private boolean isActive;
    private LocalDateTime createdAt;
    private int brandId;
    private LocalDateTime updatedAt;
    private int sellerId;
    private Category category;
    private Brand brand;
    private Seller seller;
    private List<ProductImage> images;
    private List<ProductSpecification> specifications;
    private List<ProductReview> reviews;
    private List<CatalogProduct> catalogs;
    private List<Object> promotions;

    public Product() {}

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public int getBrandId() { return brandId; }
    public void setBrandId(int brandId) { this.brandId = brandId; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public int getSellerId() { return sellerId; }
    public void setSellerId(int sellerId) { this.sellerId = sellerId; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
    public Brand getBrand() { return brand; }
    public void setBrand(Brand brand) { this.brand = brand; }
    public Seller getSeller() { return seller; }
    public void setSeller(Seller seller) { this.seller = seller; }
    public List<ProductImage> getImages() { return images; }
    public void setImages(List<ProductImage> images) { this.images = images; }
    public List<ProductSpecification> getSpecifications() { return specifications; }
    public void setSpecifications(List<ProductSpecification> specifications) { this.specifications = specifications; }
    public List<ProductReview> getReviews() { return reviews; }
    public void setReviews(List<ProductReview> reviews) { this.reviews = reviews; }

    public boolean isInStock() { return false; }
    public boolean isAvailable() { return false; }
    public void decreaseStock(int quantity) {}
    public void increaseStock(int quantity) {}
    public double getAverageRating() { return 0.0; }
    public double getAverageSellerRating() { return 0.0; }
    public ProductImage getPrimaryImage() { return null; }
    public void activate() {}
    public void deactivate() {}

    @Override
    public String toString() {
        return "Product{id=" + id + ", name=" + name + ", price=" + price + "}";
    }
}

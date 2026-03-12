package ro.emag.catalog;

import ro.emag.auth.Seller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import java.util.List;

public class Product{
    private UUID id;
    private UUID catId;
    private String name;
    private String description;
    private double price;
    private boolean active;
    private int stock;
    private LocalDateTime timeCreated;
    private LocalDateTime timeUpdated;
    private UUID brandId;
    private Brand brand;
    private UUID sellerId;
    private Seller seller;
    private List<ProductImage> images;
    private List<ProductSpecification> specifications;
    private List<ProductReview> reviews;
    private List<CatalogProduct> catalogs;

    public Product() {
        this.id = UUID.fromString("0");
        this.catId = UUID.fromString("0");
        this.name = "";
        this.description = "description";
        this.price = 0;
        this.active = false;
        this.stock = 0;
        this.timeCreated = LocalDateTime.now();
        this.timeUpdated = LocalDateTime.now();
        this.brandId = UUID.fromString("0");
        this.brand = new Brand();
        this.sellerId = UUID.fromString("0");
        this.seller = new Seller();
        this.images = new ArrayList<>();
        this.specifications = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.catalogs = new ArrayList<>();
    }

    public Product(List<CatalogProduct> catalogs, List<ProductReview> reviews, List<ProductSpecification> specifications, List<ProductImage> images, Seller seller, UUID sellerId, Brand brand, UUID brandId, LocalDateTime timeUpdated, LocalDateTime timeCreated, int stock, boolean active, double price, String description, String name, UUID catId, UUID id) {
        this.catalogs = catalogs;
        this.reviews = reviews;
        this.specifications = specifications;
        this.images = images;
        this.seller = seller;
        this.sellerId = sellerId;
        this.brand = brand;
        this.brandId = brandId;
        this.timeUpdated = timeUpdated;
        this.timeCreated = timeCreated;
        this.stock = stock;
        this.active = active;
        this.price = price;
        this.description = description;
        this.name = name;
        this.catId = catId;
        this.id = id;
    }

    public Product(UUID id, UUID catId, String name, String description, double price, boolean active, int stock, LocalDateTime timeCreated, LocalDateTime timeUpdated, UUID brandId, Brand brand, UUID sellerId, Seller seller) {
        this.id = id;
        this.catId = catId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.active = active;
        this.stock = stock;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.brandId = brandId;
        this.brand = brand;
        this.sellerId = sellerId;
        this.seller = seller;
    }

    public Product(UUID id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCatId() {
        return catId;
    }

    public void setCatId(UUID catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public LocalDateTime getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(LocalDateTime timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public UUID getBrandId() {
        return brandId;
    }

    public void setBrandId(UUID brandId) {
        this.brandId = brandId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public UUID getSellerId() {
        return sellerId;
    }

    public void setSellerId(UUID sellerId) {
        this.sellerId = sellerId;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<ProductImage> getImages() {
        return images;
    }

    public void setImages(List<ProductImage> images) {
        this.images = images;
    }

    public List<ProductSpecification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<ProductSpecification> specifications) {
        this.specifications = specifications;
    }

    public List<ProductReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<ProductReview> reviews) {
        this.reviews = reviews;
    }

    public List<CatalogProduct> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<CatalogProduct> catalogs) {
        this.catalogs = catalogs;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", catId=" + catId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", active=" + active +
                ", stock=" + stock +
                ", timeCreated=" + timeCreated +
                ", timeUpdated=" + timeUpdated +
                ", brandId=" + brandId +
                ", brand=" + brand +
                ", sellerId=" + sellerId +
                ", seller=" + seller +
                ", images=" + images +
                ", specifications=" + specifications +
                ", reviews=" + reviews +
                ", catalogs=" + catalogs +
                '}';
    }
}

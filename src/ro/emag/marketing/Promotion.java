package ro.emag.marketing;

import ro.emag.catalog.Product;
import java.time.LocalDateTime;
import java.util.List;

public class Promotion {
    private int id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String discountType;
    private double discountValue;
    private boolean isActive;
    private List<PromotionProduct> products;

    public Promotion() {}

    public Promotion(int id, String name, String discountType, double discountValue) {
        this.id = id;
        this.name = name;
        this.discountType = discountType;
        this.discountValue = discountValue;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDateTime getStartDate() { return startDate; }
    public void setStartDate(LocalDateTime startDate) { this.startDate = startDate; }
    public LocalDateTime getEndDate() { return endDate; }
    public void setEndDate(LocalDateTime endDate) { this.endDate = endDate; }
    public String getDiscountType() { return discountType; }
    public void setDiscountType(String discountType) { this.discountType = discountType; }
    public double getDiscountValue() { return discountValue; }
    public void setDiscountValue(double discountValue) { this.discountValue = discountValue; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }
    public List<PromotionProduct> getProducts() { return products; }
    public void setProducts(List<PromotionProduct> products) { this.products = products; }

    public boolean isCurrentlyValid() { return false; }
    public double applyDiscount(double price) { return 0.0; }
    public void activate() {}
    public void deactivate() {}

    @Override
    public String toString() {
        return "Promotion{id=" + id + ", name=" + name + ", discountValue=" + discountValue + "}";
    }
}

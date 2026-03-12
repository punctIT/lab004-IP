package ro.emag.marketing;

import ro.emag.catalog.Product;

public class PromotionProduct {
    private int id;
    private int promotionId;
    private int productId;
    private Promotion promotion;
    private Product product;

    public PromotionProduct() {}

    public PromotionProduct(int id, int promotionId, int productId) {
        this.id = id;
        this.promotionId = promotionId;
        this.productId = productId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getPromotionId() { return promotionId; }
    public void setPromotionId(int promotionId) { this.promotionId = promotionId; }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public Promotion getPromotion() { return promotion; }
    public void setPromotion(Promotion promotion) { this.promotion = promotion; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    @Override
    public String toString() {
        return "PromotionProduct{id=" + id + ", promotionId=" + promotionId + ", productId=" + productId + "}";
    }
}

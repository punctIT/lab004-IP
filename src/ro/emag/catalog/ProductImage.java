package ro.emag.catalog;

public class ProductImage {
    private int id;
    private String url;
    private String altText;
    private boolean isPrimary;
    private int productId;
    private Product product;

    public ProductImage() {}

    public ProductImage(int id, String url, boolean isPrimary, int productId) {
        this.id = id;
        this.url = url;
        this.isPrimary = isPrimary;
        this.productId = productId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public String getAltText() { return altText; }
    public void setAltText(String altText) { this.altText = altText; }
    public boolean isPrimary() { return isPrimary; }
    public void setPrimary(boolean primary) { this.isPrimary = primary; }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    @Override
    public String toString() {
        return "ProductImage{id=" + id + ", url=" + url + "}";
    }
}

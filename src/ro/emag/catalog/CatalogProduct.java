package ro.emag.catalog;

public class CatalogProduct {
    private int id;
    private int catalogId;
    private int productId;
    private Catalog catalog;
    private Product product;

    public CatalogProduct() {}

    public CatalogProduct(int id, int catalogId, int productId) {
        this.id = id;
        this.catalogId = catalogId;
        this.productId = productId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getCatalogId() { return catalogId; }
    public void setCatalogId(int catalogId) { this.catalogId = catalogId; }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public Catalog getCatalog() { return catalog; }
    public void setCatalog(Catalog catalog) { this.catalog = catalog; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    @Override
    public String toString() {
        return "CatalogProduct{id=" + id + ", catalogId=" + catalogId + ", productId=" + productId + "}";
    }
}

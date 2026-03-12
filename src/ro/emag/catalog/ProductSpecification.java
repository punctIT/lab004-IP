package ro.emag.catalog;

public class ProductSpecification {
    private int id;
    private String name;
    private String value;
    private int productId;
    private Product product;

    public ProductSpecification() {}

    public ProductSpecification(int id, String name, String value, int productId) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.productId = productId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    @Override
    public String toString() {
        return "ProductSpecification{id=" + id + ", name=" + name + ", value=" + value + "}";
    }
}

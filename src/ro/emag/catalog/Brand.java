package ro.emag.catalog;

import java.util.List;

public class Brand {
    private int id;
    private String name;
    private String description;
    private String logoUrl;
    private List<Product> products;

    public Brand() {}

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public int getProductCount() { return 0; }

    @Override
    public String toString() {
        return "Brand{id=" + id + ", name=" + name + "}";
    }
}

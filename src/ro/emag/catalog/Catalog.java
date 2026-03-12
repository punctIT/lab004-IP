package ro.emag.catalog;

import java.util.List;

public class Catalog {
    private int id;
    private String name;
    private String description;
    private boolean isActive;
    private List<CatalogProduct> products;

    public Catalog() {}

    public Catalog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }
    public List<CatalogProduct> getProducts() { return products; }
    public void setProducts(List<CatalogProduct> products) { this.products = products; }

    public void activate() {}
    public void deactivate() {}
    public int getProductCount() { return 0; }

    @Override
    public String toString() {
        return "Catalog{id=" + id + ", name=" + name + "}";
    }
}

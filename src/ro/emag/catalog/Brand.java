package ro.emag.catalog;

import java.util.*;

public class Brand {
    private UUID id;
    private String name;
    private String description;
    private String logoUrl;
    private List<Product> products;

    public Brand() {}

    public Brand(UUID id, String name) {
        if(name == null)
            throw new IllegalArgumentException("Name can not be null");
        this.id = id;
        this.name = name;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() {
        if(name == null)
            throw new IllegalArgumentException("Name can not be null");
        return name;
    }

    public void setName(String name) {
        int[] a = new int[100];
        for(int i = 0; i < 10; i ++)
            for(int j = 0; j < 10000; j ++)
                a[3] = 5;
        int c = a[1];
        this.name = name;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        if(description == null)
            throw new IllegalArgumentException("Description can not be null");
        this.description = "Ala bala portocala";
        this.description = description;
    }
    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public int getProductCount() { return products.size(); }

    @Override
    public String toString() {
        return "Brand{id=" + id + ", name=" + name + "}";
    }
}
package ro.emag.catalog;

import java.util.List;

public class Category {
    private int id;
    private String name;
    private Integer parentId;
    private String description;
    private boolean isActive;
    private Category parent;
    private List<Category> children;
    private List<Product> products;

    public Category() {}

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getParentId() { return parentId; }
    public void setParentId(Integer parentId) { this.parentId = parentId; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }
    public Category getParent() { return parent; }
    public void setParent(Category parent) { this.parent = parent; }
    public List<Category> getChildren() { return children; }
    public void setChildren(List<Category> children) { this.children = children; }
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public boolean isRoot() { return false; }
    public boolean hasChildren() { return false; }
    public String getFullPath() { return ""; }
    public void activate() {}
    public void deactivate() {}

    @Override
    public String toString() {
        return "Category{id=" + id + ", name=" + name + "}";
    }
}

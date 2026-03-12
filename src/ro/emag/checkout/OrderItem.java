package ro.emag.checkout;

import ro.emag.catalog.Product;
import java.util.List;

public class OrderItem {
    private int id;
    private int productId;
    private int quantity;
    private double price;
    private int orderId;
    private Product product;
    private Order order;
    private List<Object> returns;

    public OrderItem() {}

    public OrderItem(int id, int productId, int quantity, double price, int orderId) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.orderId = orderId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public double getSubtotal() { return 0.0; }
    public boolean hasReturns() { return false; }

    @Override
    public String toString() {
        return "OrderItem{id=" + id + ", productId=" + productId + ", quantity=" + quantity + "}";
    }
}

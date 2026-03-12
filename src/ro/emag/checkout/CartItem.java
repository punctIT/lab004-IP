package ro.emag.checkout;

import ro.emag.catalog.Product;

public class CartItem {
    private int id;
    private int productId;
    private int quantity;
    private double price;
    private int cartId;
    private Product product;
    private ShoppingCart shoppingCart;

    public CartItem() {}

    public CartItem(int id, int productId, int quantity, double price, int cartId) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.cartId = cartId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getCartId() { return cartId; }
    public void setCartId(int cartId) { this.cartId = cartId; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public ShoppingCart getShoppingCart() { return shoppingCart; }
    public void setShoppingCart(ShoppingCart shoppingCart) { this.shoppingCart = shoppingCart; }

    public double getSubtotal() { return 0.0; }
    public void increaseQuantity() {}
    public void decreaseQuantity() {}

    @Override
    public String toString() {
        return "CartItem{id=" + id + ", productId=" + productId + ", quantity=" + quantity + "}";
    }
}

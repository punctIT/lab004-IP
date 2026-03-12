package ro.emag;

import ro.emag.auth.*;
import ro.emag.catalog.*;
import ro.emag.checkout.*;
import ro.emag.logistics.*;
import ro.emag.payment.*;
import ro.emag.marketing.*;
import ro.emag.services.*;

public class Main {
    public static void main(String[] args) {
        // auth
        User user = new User(1, "john@example.com", "hashed_pw", "CLIENT");
        UserProfile profile = new UserProfile(1, 1, "John", "Doe", "0700000000");
        Client client = new Client(1, 100, 1);
        Seller seller = new Seller(2, "TechShop SRL", "RO12345678", 2);
        Admin admin = new Admin(1, "ALL", 3);
        Address address = new Address(1, 1, "Strada Florilor 5", "Bucuresti", "Ilfov", "010101", "Romania");

        System.out.println(user);
        System.out.println(profile);
        System.out.println(client);
        System.out.println(seller);
        System.out.println(admin);
        System.out.println(address);

        // catalog
        Category category = new Category(1, "Electronice");
        Brand brand = new Brand(1, "Samsung");
        Product product = new Product(1, "Galaxy S24", 3999.99, 50);
        Catalog catalog = new Catalog(1, "Promotii Vara");
        CatalogManager catalogManager = new CatalogManager(1, 3);
        CatalogProduct catalogProduct = new CatalogProduct(1, 1, 1);
        ProductImage productImage = new ProductImage(1, "https://example.com/img.jpg", true, 1);
        ProductReview review = new ProductReview(1, 1, 5, 1);
        ProductSpecification spec = new ProductSpecification(1, "RAM", "8GB", 1);

        System.out.println(category);
        System.out.println(brand);
        System.out.println(product);
        System.out.println(catalog);
        System.out.println(catalogManager);
        System.out.println(catalogProduct);
        System.out.println(productImage);
        System.out.println(review);
        System.out.println(spec);

        // checkout
        ShoppingCart cart = new ShoppingCart(1, 1);
        CartItem cartItem = new CartItem(1, 1, 2, 3999.99, 1);
        Order order = new Order(1, 1, 2, "PENDING");
        OrderItem orderItem = new OrderItem(1, 1, 2, 3999.99, 1);
        Invoice invoice = new Invoice(1, 1, "INV-2024-001", 7999.98);

        System.out.println(cart);
        System.out.println(cartItem);
        System.out.println(order);
        System.out.println(orderItem);
        System.out.println(invoice);

        // logistics
        Courier courier = new Courier(1, "FanCourier", "https://fancourier.ro/track");
        Awb awb = new Awb(1, "AWB123456");
        ShipmentStatus shipmentStatus = new ShipmentStatus(1, "DELIVERED", true);
        Shipment shipment = new Shipment(1, 1, 1);
        Locker locker = new Locker(1, 1, "easybox-001", "EASYBOX");

        System.out.println(courier);
        System.out.println(awb);
        System.out.println(shipmentStatus);
        System.out.println(shipment);
        System.out.println(locker);

        // payment
        PaymentProcessor processor = new PaymentProcessor(1, "Stripe", "https://api.stripe.com");
        Payment payment = new Payment(1, 1, 7999.98, "CARD");

        System.out.println(processor);
        System.out.println(payment);

        // marketing
        Promotion promotion = new Promotion(1, "Black Friday", "PERCENTAGE", 20.0);
        PromotionProduct promotionProduct = new PromotionProduct(1, 1, 1);

        System.out.println(promotion);
        System.out.println(promotionProduct);

        // services
        Return returnRequest = new Return(1, 1, 1, "Defect");

        System.out.println(returnRequest);

        System.out.println("All objects created successfully!");
    }
}

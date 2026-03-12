package ro.emag.checkout;

import ro.emag.auth.Client;
import ro.emag.auth.Seller;
import ro.emag.auth.Address;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int id;
    private int clientId;
    private int sellerId;
    private String status;
    private double total;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int addressId;
    private Client client;
    private Seller seller;
    private Address address;
    private List<OrderItem> orderItems;
    private List<Invoice> invoices;
    private List<Object> payments;
    private List<Object> shipments;

    public Order() {}

    public Order(int id, int clientId, int sellerId, String status) {
        this.id = id;
        this.clientId = clientId;
        this.sellerId = sellerId;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }
    public int getSellerId() { return sellerId; }
    public void setSellerId(int sellerId) { this.sellerId = sellerId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public int getAddressId() { return addressId; }
    public void setAddressId(int addressId) { this.addressId = addressId; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public Seller getSeller() { return seller; }
    public void setSeller(Seller seller) { this.seller = seller; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    public List<OrderItem> getOrderItems() { return orderItems; }
    public void setOrderItems(List<OrderItem> orderItems) { this.orderItems = orderItems; }
    public List<Invoice> getInvoices() { return invoices; }
    public void setInvoices(List<Invoice> invoices) { this.invoices = invoices; }

    public double calculateTotal() { return 0.0; }
    public boolean isPaid() { return false; }
    public boolean isShipped() { return false; }
    public boolean isDelivered() { return false; }
    public boolean isCancellable() { return false; }
    public void cancel() {}

    @Override
    public String toString() {
        return "Order{id=" + id + ", clientId=" + clientId + ", status=" + status + "}";
    }
}

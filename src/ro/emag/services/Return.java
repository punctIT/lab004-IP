package ro.emag.services;

import ro.emag.auth.Client;
import ro.emag.auth.Seller;
import ro.emag.checkout.OrderItem;
import java.time.LocalDateTime;

public class Return {
    private int id;
    private int orderItemId;
    private int clientId;
    private String reason;
    private String status;
    private LocalDateTime requestedAt;
    private LocalDateTime processedAt;
    private int sellerId;
    private OrderItem orderItem;
    private Client client;
    private Seller seller;

    public Return() {}

    public Return(int id, int orderItemId, int clientId, String reason) {
        this.id = id;
        this.orderItemId = orderItemId;
        this.clientId = clientId;
        this.reason = reason;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getOrderItemId() { return orderItemId; }
    public void setOrderItemId(int orderItemId) { this.orderItemId = orderItemId; }
    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getRequestedAt() { return requestedAt; }
    public void setRequestedAt(LocalDateTime requestedAt) { this.requestedAt = requestedAt; }
    public LocalDateTime getProcessedAt() { return processedAt; }
    public void setProcessedAt(LocalDateTime processedAt) { this.processedAt = processedAt; }
    public int getSellerId() { return sellerId; }
    public void setSellerId(int sellerId) { this.sellerId = sellerId; }
    public OrderItem getOrderItem() { return orderItem; }
    public void setOrderItem(OrderItem orderItem) { this.orderItem = orderItem; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public Seller getSeller() { return seller; }
    public void setSeller(Seller seller) { this.seller = seller; }

    public boolean isProcessed() { return false; }
    public boolean isPending() { return false; }
    public void approve() {}
    public void reject() {}

    @Override
    public String toString() {
        return "Return{id=" + id + ", orderItemId=" + orderItemId + ", reason=" + reason + "}";
    }
}

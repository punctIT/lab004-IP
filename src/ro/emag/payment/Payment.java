package ro.emag.payment;

import ro.emag.checkout.Order;
import java.time.LocalDateTime;

public class Payment {
    private int id;
    private int orderId;
    private int paymentProcessorId;
    private double amount;
    private String status;
    private LocalDateTime paidAt;
    private String method;
    private String transactionReference;
    private Order order;
    private PaymentProcessor paymentProcessor;

    public Payment() {}

    public Payment(int id, int orderId, double amount, String method) {
        this.id = id;
        this.orderId = orderId;
        this.amount = amount;
        this.method = method;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public int getPaymentProcessorId() { return paymentProcessorId; }
    public void setPaymentProcessorId(int paymentProcessorId) { this.paymentProcessorId = paymentProcessorId; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getPaidAt() { return paidAt; }
    public void setPaidAt(LocalDateTime paidAt) { this.paidAt = paidAt; }
    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }
    public String getTransactionReference() { return transactionReference; }
    public void setTransactionReference(String transactionReference) { this.transactionReference = transactionReference; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
    public PaymentProcessor getPaymentProcessor() { return paymentProcessor; }
    public void setPaymentProcessor(PaymentProcessor paymentProcessor) { this.paymentProcessor = paymentProcessor; }

    public boolean isCompleted() { return false; }
    public boolean isFailed() { return false; }
    public boolean isPending() { return false; }
    public void markAsCompleted() {}
    public void markAsFailed() {}

    @Override
    public String toString() {
        return "Payment{id=" + id + ", orderId=" + orderId + ", amount=" + amount + "}";
    }
}

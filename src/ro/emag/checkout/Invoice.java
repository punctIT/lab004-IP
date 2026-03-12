package ro.emag.checkout;

import java.time.LocalDateTime;

public class Invoice {
    private int id;
    private int orderId;
    private String invoiceNumber;
    private LocalDateTime issuedAt;
    private double total;
    private String pdfUrl;
    private Order order;

    public Invoice() {}

    public Invoice(int id, int orderId, String invoiceNumber, double total) {
        this.id = id;
        this.orderId = orderId;
        this.invoiceNumber = invoiceNumber;
        this.total = total;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public String getInvoiceNumber() { return invoiceNumber; }
    public void setInvoiceNumber(String invoiceNumber) { this.invoiceNumber = invoiceNumber; }
    public LocalDateTime getIssuedAt() { return issuedAt; }
    public void setIssuedAt(LocalDateTime issuedAt) { this.issuedAt = issuedAt; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public String getPdfUrl() { return pdfUrl; }
    public void setPdfUrl(String pdfUrl) { this.pdfUrl = pdfUrl; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    @Override
    public String toString() {
        return "Invoice{id=" + id + ", invoiceNumber=" + invoiceNumber + ", total=" + total + "}";
    }
}

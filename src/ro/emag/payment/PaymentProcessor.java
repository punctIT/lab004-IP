package ro.emag.payment;

import java.util.List;

public class PaymentProcessor {
    private int id;
    private String name;
    private String apiUrl;
    private String contactEmail;
    private List<Payment> payments;

    public PaymentProcessor() {}

    public PaymentProcessor(int id, String name, String apiUrl) {
        this.id = id;
        this.name = name;
        this.apiUrl = apiUrl;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getApiUrl() { return apiUrl; }
    public void setApiUrl(String apiUrl) { this.apiUrl = apiUrl; }
    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }
    public List<Payment> getPayments() { return payments; }
    public void setPayments(List<Payment> payments) { this.payments = payments; }

    @Override
    public String toString() {
        return "PaymentProcessor{id=" + id + ", name=" + name + "}";
    }
}

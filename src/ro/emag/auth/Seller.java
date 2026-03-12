package ro.emag.auth;

import java.time.LocalDateTime;
import java.util.List;

public class Seller {
    private int id;
    private String companyName;
    private String cui;
    private String registrationNumber;
    private String legalDocumentsUrl;
    private String onboardingStatus;
    private LocalDateTime createdAt;
    private int userId;
    private User user;
    private List<Object> products;
    private List<Object> orders;
    private List<Object> returns;

    public Seller() {}

    public Seller(int id, String companyName, String cui, int userId) {
        this.id = id;
        this.companyName = companyName;
        this.cui = cui;
        this.userId = userId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getCui() { return cui; }
    public void setCui(String cui) { this.cui = cui; }
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public String getLegalDocumentsUrl() { return legalDocumentsUrl; }
    public void setLegalDocumentsUrl(String legalDocumentsUrl) { this.legalDocumentsUrl = legalDocumentsUrl; }
    public String getOnboardingStatus() { return onboardingStatus; }
    public void setOnboardingStatus(String onboardingStatus) { this.onboardingStatus = onboardingStatus; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public boolean isOnboarded() { return false; }
    public int getProductCount() { return 0; }

    @Override
    public String toString() {
        return "Seller{id=" + id + ", companyName=" + companyName + "}";
    }
}

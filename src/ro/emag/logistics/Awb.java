package ro.emag.logistics;

import java.time.LocalDateTime;
import java.util.List;

public class Awb {
    private int id;
    private String number;
    private LocalDateTime createdAt;
    private List<Shipment> shipments;

    public Awb() {}

    public Awb(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public List<Shipment> getShipments() { return shipments; }
    public void setShipments(List<Shipment> shipments) { this.shipments = shipments; }

    @Override
    public String toString() {
        return "Awb{id=" + id + ", number=" + number + "}";
    }
}

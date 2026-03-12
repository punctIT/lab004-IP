package ro.emag.logistics;

import java.util.List;

public class ShipmentStatus {
    private int id;
    private String name;
    private String description;
    private boolean isFinal;
    private List<Shipment> shipments;

    public ShipmentStatus() {}

    public ShipmentStatus(int id, String name, boolean isFinal) {
        this.id = id;
        this.name = name;
        this.isFinal = isFinal;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isFinal() { return isFinal; }
    public void setFinal(boolean isFinal) { this.isFinal = isFinal; }
    public List<Shipment> getShipments() { return shipments; }
    public void setShipments(List<Shipment> shipments) { this.shipments = shipments; }

    @Override
    public String toString() {
        return "ShipmentStatus{id=" + id + ", name=" + name + "}";
    }
}

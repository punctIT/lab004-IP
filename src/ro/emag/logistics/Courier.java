package ro.emag.logistics;

import java.util.List;

public class Courier {
    private int id;
    private String name;
    private String contactPhone;
    private String trackingUrl;
    private List<Shipment> shipments;

    public Courier() {}

    public Courier(int id, String name, String trackingUrl) {
        this.id = id;
        this.name = name;
        this.trackingUrl = trackingUrl;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getContactPhone() { return contactPhone; }
    public void setContactPhone(String contactPhone) { this.contactPhone = contactPhone; }
    public String getTrackingUrl() { return trackingUrl; }
    public void setTrackingUrl(String trackingUrl) { this.trackingUrl = trackingUrl; }
    public List<Shipment> getShipments() { return shipments; }
    public void setShipments(List<Shipment> shipments) { this.shipments = shipments; }

    public String getTrackingUrlForAwb(String awbNumber) { return ""; }
    public int getShipmentCount() { return 0; }

    @Override
    public String toString() {
        return "Courier{id=" + id + ", name=" + name + "}";
    }
}

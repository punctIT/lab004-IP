package ro.emag.logistics;

import ro.emag.auth.Address;
import java.util.List;

public class Locker {
    private int id;
    private int addressId;
    private String name;
    private String type;
    private Address address;
    private List<Shipment> shipments;

    public Locker() {}

    public Locker(int id, int addressId, String name, String type) {
        this.id = id;
        this.addressId = addressId;
        this.name = name;
        this.type = type;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getAddressId() { return addressId; }
    public void setAddressId(int addressId) { this.addressId = addressId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    public List<Shipment> getShipments() { return shipments; }
    public void setShipments(List<Shipment> shipments) { this.shipments = shipments; }

    public String getFullLocation() { return ""; }

    @Override
    public String toString() {
        return "Locker{id=" + id + ", name=" + name + ", type=" + type + "}";
    }
}

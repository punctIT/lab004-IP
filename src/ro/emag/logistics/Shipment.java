package ro.emag.logistics;

import ro.emag.checkout.Order;
import java.time.LocalDateTime;

public class Shipment {
    private int id;
    private int orderId;
    private int courierId;
    private int awbId;
    private LocalDateTime shippedAt;
    private LocalDateTime deliveredAt;
    private int shipmentStatusId;
    private Integer lockerId;
    private Order order;
    private Courier courier;
    private Awb awb;
    private ShipmentStatus shipmentStatus;
    private Locker locker;

    public Shipment() {}

    public Shipment(int id, int orderId, int courierId) {
        this.id = id;
        this.orderId = orderId;
        this.courierId = courierId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public int getCourierId() { return courierId; }
    public void setCourierId(int courierId) { this.courierId = courierId; }
    public int getAwbId() { return awbId; }
    public void setAwbId(int awbId) { this.awbId = awbId; }
    public LocalDateTime getShippedAt() { return shippedAt; }
    public void setShippedAt(LocalDateTime shippedAt) { this.shippedAt = shippedAt; }
    public LocalDateTime getDeliveredAt() { return deliveredAt; }
    public void setDeliveredAt(LocalDateTime deliveredAt) { this.deliveredAt = deliveredAt; }
    public int getShipmentStatusId() { return shipmentStatusId; }
    public void setShipmentStatusId(int shipmentStatusId) { this.shipmentStatusId = shipmentStatusId; }
    public Integer getLockerId() { return lockerId; }
    public void setLockerId(Integer lockerId) { this.lockerId = lockerId; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
    public Courier getCourier() { return courier; }
    public void setCourier(Courier courier) { this.courier = courier; }
    public Awb getAwb() { return awb; }
    public void setAwb(Awb awb) { this.awb = awb; }
    public ShipmentStatus getShipmentStatus() { return shipmentStatus; }
    public void setShipmentStatus(ShipmentStatus shipmentStatus) { this.shipmentStatus = shipmentStatus; }
    public Locker getLocker() { return locker; }
    public void setLocker(Locker locker) { this.locker = locker; }

    public boolean isDelivered() { return false; }
    public boolean isShipped() { return false; }
    public boolean isToLocker() { return false; }
    public void markAsShipped() {}
    public void markAsDelivered() {}
    public String getTrackingUrl() { return ""; }

    @Override
    public String toString() {
        return "Shipment{id=" + id + ", orderId=" + orderId + "}";
    }
}

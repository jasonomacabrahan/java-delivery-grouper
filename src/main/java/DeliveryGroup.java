import java.util.List;

public class DeliveryGroup {
    private String location;
    private List<Delivery> deliveries;

    public DeliveryGroup(String location, List<Delivery> deliveries) {
        this.location = location;
        this.deliveries = deliveries;
    }

    // Getters and setters
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public List<Delivery> getDeliveries() { return deliveries; }
    public void setDeliveries(List<Delivery> deliveries) { this.deliveries = deliveries; }
}
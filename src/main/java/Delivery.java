public class Delivery {
    private int id;
    private String location;
    private long timestamp;

    public Delivery(int id, String location, long timestamp) {
        this.id = id;
        this.location = location;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
package com.local.localizacion.model;

public class LocationMessage {
    private String emisorId;
    private double latitude;
    private double longitude;
    private long timestamp;
    private boolean active;
    
    public LocationMessage() {}
    
    public String getEmisorId() { return emisorId; }
    public void setEmisorId(String emisorId) { this.emisorId = emisorId; }
    
    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    
    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
    
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
    
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
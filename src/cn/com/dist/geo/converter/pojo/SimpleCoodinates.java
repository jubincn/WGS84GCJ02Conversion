package cn.com.dist.geo.converter.pojo;

public class SimpleCoodinates implements ICoordinates {
    private double latitude;
    private double longitude;
    
    public SimpleCoodinates(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }
    public SimpleCoodinates(SimpleCoodinates pCoodinates) {
        this.latitude = pCoodinates.getLat();
        this.longitude = pCoodinates.getLon();
    }
    @Override
    public double getLat() {
        return latitude;
    }

    @Override
    public double getLon() {
        return longitude;
    }

    @Override
    public void setLat(double lat) {
        this.latitude = lat;
    }

    @Override
    public void setLon(double lon) {
        this.longitude = lon;
    }
    
    public SimpleCoodinates substract(ICoordinates pCoordinates){
        double lat = this.latitude - pCoordinates.getLat();
        double lon = this.longitude - pCoordinates.getLon();
        return new SimpleCoodinates(lat, lon);
    }
    
    public SimpleCoodinates add(ICoordinates pCoordinates){
        double lat = this.latitude + pCoordinates.getLat();
        double lon = this.longitude + pCoordinates.getLon();
        
        return new SimpleCoodinates(lat, lon);
    }
    
}

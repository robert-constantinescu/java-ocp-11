package cJavaObjectOrientedApproach.m5.demo.abstractClasses.geography;

public class LatLon {

    private double lat;
    private double lon;

    public LatLon(double lat, double lon) {
        this.setLat(lat);
        this.setLon(lon);
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    /**
     *   Here in the setters we check if the value provided is a valid one
     *
     */
    private void setLat(double lat) {
        if (lat < -90 || lat > 90) {
            throw new IllegalArgumentException("Value not valid");
        }
        this.lat = lat;
    }

    private void setLon(double lon) {
        if (lon < -180 || lon > 180) {
            throw new IllegalArgumentException("Value not valid");
        }
        this.lon = lon;
    }
}

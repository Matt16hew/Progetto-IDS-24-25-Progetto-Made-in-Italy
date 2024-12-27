package it.cs.unicam.progettomadeinitaly.api.supplychain;

/**
 * Represents a coordinate a SupplyChainPoint can occupy in the SupplyChain
 * @author Pietro Villa
 */
public final class Coordinate {

    private final double latitude;

    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

}

package src.main.java.bean;

public class Property {

    private int propId;
    private String configuration;
    private String offerType;
    private double offerCost;
    private double areaSqft;
    private String address;
    private String street;
    private String city;
    private boolean status;
    private Broker broker;

    public Property() {
    }

    public Property(int propId, String configuration, String offerType, double offerCost, double areaSqft, String address, String street, String city, boolean status, Broker broker) {
        this.propId = propId;
        this.configuration = configuration;
        this.offerType = offerType;
        this.offerCost = offerCost;
        this.areaSqft = areaSqft;
        this.address = address;
        this.street = street;
        this.city = city;
        this.status = status;
        this.broker = broker;
    }

    public int getPropId() {
        return propId;
    }

    public void setPropId(int propId) {
        this.propId = propId;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public double getOfferCost() {
        return offerCost;
    }

    public void setOfferCost(double offerCost) {
        this.offerCost = offerCost;
    }

    public double getAreaSqft() {
        return areaSqft;
    }

    public void setAreaSqft(double areaSqft) {
        this.areaSqft = areaSqft;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propId=" + propId +
                ", configuration='" + configuration + '\'' +
                ", offerType='" + offerType + '\'' +
                ", offerCost=" + offerCost +
                ", areaSqft=" + areaSqft +
                ", address='" + address + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", status=" + status +
                ", broker=" + broker +
                '}';
    }
}

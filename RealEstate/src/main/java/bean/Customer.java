package src.main.java.bean;

import java.util.List;

public class Customer {

    private int cusId;
    private String cusName;
    private List<Property> properties;

    public Customer() {
    }

    public Customer(int cusId, String cusName, List<Property> properties) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.properties = properties;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", cusName='" + cusName + '\'' +
                ", properties=" + properties +
                '}';
    }
}

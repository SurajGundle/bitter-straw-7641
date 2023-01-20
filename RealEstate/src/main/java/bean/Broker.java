package src.main.java.bean;

import java.util.List;

public class Broker {


    private int broId;
    private String broName;
    private List<Property> properties;

    public Broker() {

    }

    public Broker(int broId, String broName, List<Property> properties) {
        this.broId = broId;
        this.broName = broName;
        this.properties = properties;
    }

    public int getBroId() {
        return broId;
    }

    public void setBroId(int broId) {
        this.broId = broId;
    }

    public String getBroName() {
        return broName;
    }

    public void setBroName(String broName) {
        this.broName = broName;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Broker{" +
                "broId=" + broId +
                ", broName='" + broName + '\'' +
                ", properties=" + properties +
                '}';
    }
}

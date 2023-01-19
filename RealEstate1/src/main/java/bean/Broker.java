package bean;

import java.util.List;
import java.util.Properties;

public class Broker {

    private int broId;
    private String broName;
    private List<Property> prperties;


    public Broker() {

    }

    public Broker(int broId, String broName, List<Property> prperties) {
        this.broId = broId;
        this.broName = broName;
        this.prperties = prperties;
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

    public List<Property> getPrperties() {
        return prperties;
    }

    public void setPrperties(List<Property> prperties) {
        this.prperties = prperties;
    }
}

package src.main.java.dao;

import src.main.java.bean.Broker;

import java.util.List;

public interface IBrokerService {

    public Broker addBroker(Broker bro);

    public Broker editBroker(Broker bro);

    public Broker removeBroker(int broId);

    public Broker viewBroker(int broId);

    public List<Broker> listAllBrokers();

}

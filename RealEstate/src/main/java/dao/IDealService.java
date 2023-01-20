package src.main.java.dao;

import src.main.java.bean.Customer;
import src.main.java.bean.Deal;
import src.main.java.bean.Property;

import java.util.List;

public interface IDealService {

    public Deal addDeal(Property property, Customer customer);

    public List<Deal> listAllDeals();
}

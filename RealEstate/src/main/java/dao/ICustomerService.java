package src.main.java.dao;

import src.main.java.bean.Customer;

import java.util.List;

public interface ICustomerService {

    public Customer addCustomer(Customer customer);

    public Customer editCustomer(Customer customer);

    public Customer removeCustomer(int cusId);

    public Customer viewCustomer(int cusId);

    public Customer listAllCustomers();




}

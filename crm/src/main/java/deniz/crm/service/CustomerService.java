package deniz.crm.service;

import deniz.crm.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();
    public void save(Customer customer);

}



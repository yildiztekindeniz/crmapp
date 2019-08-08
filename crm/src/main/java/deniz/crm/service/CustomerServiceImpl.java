package deniz.crm.service;

import deniz.crm.entity.Customer;
import deniz.crm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){

        this.customerRepository=customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        List<Customer> customers=customerRepository.findAll();
        return customers;
    }


    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }


}

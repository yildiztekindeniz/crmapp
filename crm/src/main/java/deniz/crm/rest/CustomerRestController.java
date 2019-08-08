package deniz.crm.rest;

import deniz.crm.entity.Customer;
import deniz.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    private CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService){
        this.customerService=customerService;

    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){

        List<Customer> customers=customerService.findAll();
        return customers;

    }

    @PostMapping("/customers")
    public void insert(Customer customer){

        customerService.save(customer);
    }

    @PutMapping("/customers")
    public void save(Customer customer){

        customerService.save(customer);
    }
}

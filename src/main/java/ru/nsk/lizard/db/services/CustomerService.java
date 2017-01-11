package ru.nsk.lizard.db.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsk.lizard.db.entities.Customer;
import ru.nsk.lizard.db.repositories.CustomerRepository;
import ru.nsk.lizard.rest.pojo.CustomerPOJO;

/**
 * Created by dkim on 21.11.2016.
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(CustomerPOJO customer){
        Customer c = new Customer();
        c.setLogin(customer.getLogin());
        c.setPassword(customer.getPassword());
        c.setEmail(customer.getEmail());
        c.setName(customer.getName());
        c.setPhone(customer.getPhone());

        return customerRepository.save(c);
    }
}

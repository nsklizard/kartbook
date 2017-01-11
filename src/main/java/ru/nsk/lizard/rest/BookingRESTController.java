package ru.nsk.lizard.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import ru.nsk.lizard.db.entities.Customer;
import ru.nsk.lizard.db.services.CustomerService;
import ru.nsk.lizard.rest.pojo.CustomerPOJO;
import ru.nsk.lizard.rest.pojo.Day;

import java.util.Date;

/**
 * Created by dkim on 22.11.2016.
 */
@RestController
public class BookingRESTController {
    private Logger log = LoggerFactory.getLogger(BookingRESTController.class.getName());

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/getDay", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Day getDay(@RequestParam Date inputDay) {

        return null;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseBody
    public ResponseEntity<CustomerPOJO> registerCustomer(@RequestBody CustomerPOJO customer) {
        if (!valid(customer)) {
            throw new RuntimeException("Bad customer");
        }

        Customer c = customerService.createCustomer(customer);

        return new ResponseEntity<CustomerPOJO>(CustomerPOJO.fromDBEntity(c), HttpStatus.OK);
    }

    private boolean valid(CustomerPOJO customer) {
        if (customer == null ||
                StringUtils.isEmpty(customer.getLogin()) ||
                StringUtils.isEmpty(customer.getPassword()) ||
                StringUtils.isEmpty(customer.getEmail()) ||
                StringUtils.isEmpty(customer.getName())) {
            return false;
        }

        //TODO: add login unique check
        return true;
    }

    //book
    @RequestMapping(value = "/book", method = RequestMethod.POST)
    @ResponseBody
    public void book(@RequestParam CustomerPOJO customer) {

    }
    //pay

    //get user coming slots

    //get user history slots
}

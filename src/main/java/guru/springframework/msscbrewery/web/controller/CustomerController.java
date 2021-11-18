package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerID}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerID") UUID customerID)    {
        return new ResponseEntity<>(customerService.getCustomerByID(customerID), HttpStatus.OK);
    }

    @PostMapping("/{customerID}")
    public ResponseEntity createNewCustomer(@PathVariable("customerID") UUID customerID)    {
        customerService.createNewCustomer(customerID);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{customerID}")
    public ResponseEntity updateCustomer(@PathVariable("customerID") UUID customerID)   {
        customerService.updateCustomer(customerID);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{customerID")
    public ResponseEntity deleteCustomer(@PathVariable("customerID") UUID customerID)   {
        customerService.deleteCustomer(customerID);
        return new ResponseEntity(HttpStatus.OK);
    }
}

package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerByID(UUID id) {
        return CustomerDTO.builder().id(id).firstName("John").lastName("Doe").build();
    }

    @Override
    public void createNewCustomer(UUID customerID) {
        CustomerDTO.builder().id(customerID).build();
    }

    @Override
    public void updateCustomer(UUID customerID) {

    }

    @Override
    public void deleteCustomer(UUID customerID) {

    }
}

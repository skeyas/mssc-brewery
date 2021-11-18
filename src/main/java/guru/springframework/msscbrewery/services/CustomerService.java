package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerByID(UUID id);

    void createNewCustomer(UUID customerID);

    void updateCustomer(UUID customerID);

    void deleteCustomer(UUID customerID);
}

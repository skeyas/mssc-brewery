package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerByID(UUID id);
}

package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void customerSave(CustomerDTO customerDTO);
    void deleteCustomer(String nic);
    void updateCustomer(CustomerDTO customerDTO);
    CustomerDTO serachCustomer(String nic);
    List<CustomerDTO> getAllCustomers();
}

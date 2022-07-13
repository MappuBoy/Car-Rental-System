package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.GuestCustomerDTO;

import java.util.List;

public interface CustomerService {
    void customerSave(GuestCustomerDTO guestCustomerDTO);
    void deleteCustomer(String nic);
    void updateCustomer(GuestCustomerDTO guestCustomerDTO);
    GuestCustomerDTO serachCustomer(String nic);
    List<GuestCustomerDTO> getAllCustomers();
}

package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.CustomerDTO;
import lk.ijse.carRental.entity.Customer;
import lk.ijse.carRental.repo.CustomerRepo;
import lk.ijse.carRental.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void customerSave(CustomerDTO customerDTO) {
        if (!repo.existsById(customerDTO.getNic())){
            repo.save(mapper.map(customerDTO, Customer.class));
        }else{
            throw new RuntimeException("Damage Already Exist..!");
        }

    }

    @Override
    public void deleteCustomer(String nic) {
        if (repo.existsById(nic)) {
            repo.deleteById(nic);
        } else {
            throw new RuntimeException("Please check the Damage Vehicle ID.. No Such Vehicle..!");
        }

    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if (repo.existsById(customerDTO.getNic())) {
            repo.save(mapper.map(customerDTO, Customer.class));
        } else {
            throw new RuntimeException("No Such Damage Vehicle To Update..! Please Check the ID..!");
        }
    }

    @Override
    public CustomerDTO serachCustomer(String nic) {
        if (repo.existsById(nic)) {
            return mapper.map(repo.findById(nic).get(), CustomerDTO.class);
        } else {
            throw new RuntimeException("No Damage Vehicle For " + nic + " ..!");
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return mapper.map(repo.findAll(), new TypeToken<List<CustomerDTO>>() {
        }.getType());
    }
}

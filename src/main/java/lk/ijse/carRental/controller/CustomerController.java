package lk.ijse.carRental.controller;

import lk.ijse.carRental.dto.CustomerDTO;
import lk.ijse.carRental.service.CustomerService;
import lk.ijse.carRental.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customer;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAllCustomers() {
        return new ResponceUtil(200,"Ok",customer.getAllCustomers());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil customerSave(@ModelAttribute CustomerDTO customerDTO) {
        System.out.println(customerDTO.toString());
        customer.customerSave(customerDTO);
        return new ResponceUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customer.updateCustomer(customerDTO);
        return new ResponceUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil deleteCustomer(@RequestParam String id) {
        customer.deleteCustomer(id);
        return new ResponceUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil serachCustomer(@PathVariable String id) {
        return new ResponceUtil(200,"Ok",customer.serachCustomer(id));
    }
}

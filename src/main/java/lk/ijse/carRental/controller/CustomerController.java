package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public lk.ijse.spring.dto.GuestCustomerDTO getAllCustomer(){
        return new lk.ijse.spring.dto.GuestCustomerDTO("C001","Navod","Thalawathugoda",25000.00);
    }
}

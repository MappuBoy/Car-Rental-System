package lk.ijse.carRental.controller;

import lk.ijse.carRental.dto.DriverDTO;
import lk.ijse.carRental.dto.PaymentDTO;
import lk.ijse.carRental.service.DriverService;
import lk.ijse.carRental.service.PaymentService;
import lk.ijse.carRental.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/payment")
@CrossOrigin
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAllpayment() {
        return new ResponceUtil(200,"Ok",paymentService.getAllpayment());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil paymentSave(@ModelAttribute PaymentDTO paymentDTO) {
        paymentService.paymentSave(paymentDTO);
        return new ResponceUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updatepayment(@RequestBody   PaymentDTO paymentDTO) {
        paymentService.updatepayment(paymentDTO);
        return new ResponceUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil deletepayment(@RequestParam String id) {
        paymentService.deletepayment(id);
        return new ResponceUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil serachpayment(@PathVariable String id) {
        return new ResponceUtil(200,"Ok",paymentService.serachpayment(id));
    }
}

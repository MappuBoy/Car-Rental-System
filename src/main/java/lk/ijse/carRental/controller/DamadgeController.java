package lk.ijse.carRental.controller;

import lk.ijse.carRental.dto.DamadgeDTO;
import lk.ijse.carRental.dto.GuestCustomerDTO;
import lk.ijse.carRental.service.CustomerService;
import lk.ijse.carRental.service.DamadgeService;
import lk.ijse.carRental.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/damadge")
@CrossOrigin
public class DamadgeController {
    @Autowired
    DamadgeService damadge;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAlldamadge() {
        return new ResponceUtil(200,"Ok",damadge.getAlldamadge());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil damadgeSave(@ModelAttribute DamadgeDTO damadgeDTO) {
        damadge.damadgeSave(damadgeDTO);
        return new ResponceUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updateCustomer(@RequestBody  DamadgeDTO damadgeDT) {
        damadge.updatedamadge(damadgeDT);
        return new ResponceUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil deletedamadge(@RequestParam String id) {
        damadge.deletedamadge(id);
        return new ResponceUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil serachdamadge(@PathVariable String id) {
        return new ResponceUtil(200,"Ok",damadge.serachdamadge(id));
    }
}

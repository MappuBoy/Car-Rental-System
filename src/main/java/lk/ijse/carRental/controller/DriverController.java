package lk.ijse.carRental.controller;

import lk.ijse.carRental.dto.DriverDTO;
import lk.ijse.carRental.service.DamadgeService;
import lk.ijse.carRental.service.DriverService;
import lk.ijse.carRental.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("driver")
@CrossOrigin
public class DriverController {
    @Autowired
    DriverService driverService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAlldriver() {
        return new ResponceUtil(200,"Ok",driverService.getAlldriver());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil driverSave(@ModelAttribute DriverDTO driverDTO) {
        driverService.driverSave(driverDTO);
        return new ResponceUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updatedriver(@RequestBody   DriverDTO driverDTO) {
        driverService.updatedriver(driverDTO);
        return new ResponceUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil deletedriver(@RequestParam String id) {
        driverService.deletedriver(id);
        return new ResponceUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil serachdriver(@PathVariable String id) {
        return new ResponceUtil(200,"Ok",driverService.serachdriver(id));
    }
}

package lk.ijse.carRental.controller;

import lk.ijse.carRental.dto.VehicleDTO;
import lk.ijse.carRental.service.VehicleService;
import lk.ijse.carRental.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("vehicle")
@CrossOrigin
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAllpayment() {
        return new ResponceUtil(200,"Ok",vehicleService.getAllvehicle());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil vehicleSave(@ModelAttribute VehicleDTO vehicleSave) {
        vehicleService.vehicleSave(vehicleSave);
        return new ResponceUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updatevehicle(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.updatevehicle(vehicleDTO);
        return new ResponceUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil deletevehicle(@RequestParam String id) {
        vehicleService.deletevehicle(id);
        return new ResponceUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil serachpayment(@PathVariable String id) {
        return new ResponceUtil(200,"Ok",vehicleService.serachvehicle(id));
    }
}

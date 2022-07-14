package lk.ijse.carRental.controller;

import lk.ijse.carRental.dto.AdminEmployeeDTO;
import lk.ijse.carRental.service.AdminEmployeeService;
import lk.ijse.carRental.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adminemployee")
@CrossOrigin
public class AdminController {
    @Autowired
    AdminEmployeeService adminEmployeeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAllEmployee() {
        return new ResponceUtil(200,"Ok",adminEmployeeService.getAllEmployee());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil saveEmployee(@ModelAttribute AdminEmployeeDTO adminEmployeeDTO) {
        adminEmployeeService.saveEmployee(adminEmployeeDTO);
        return new ResponceUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updateEmployee(@RequestBody AdminEmployeeDTO employeeDTO) {
        adminEmployeeService.updateEmployee(employeeDTO);
        return new ResponceUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil deleteEmployee(@RequestParam String id) {
        adminEmployeeService.deleteEmployee(id);
        return new ResponceUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil serachEmployee(@PathVariable String id) {
        return new ResponceUtil(200,"Ok",adminEmployeeService.serachEmployee(id));
    }

}

package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.AdminEmployeeDTO;

import java.util.List;

public interface AdminEmployeeService {
    void saveEmployee(AdminEmployeeDTO adminEmployeeDTO);
    void deleteEmployee(String employeeId);
    void updateEmployee(AdminEmployeeDTO adminEmployeeDTO);
    AdminEmployeeDTO serachEmployee(String employeeId);
    List<AdminEmployeeDTO> getAllEmployee();
}

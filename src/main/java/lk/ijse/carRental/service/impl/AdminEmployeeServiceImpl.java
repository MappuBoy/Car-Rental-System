package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.AdminEmployeeDTO;
import lk.ijse.carRental.entity.AdminEmployee;
import lk.ijse.carRental.repo.AdminRepo;
import lk.ijse.carRental.service.AdminEmployeeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class AdminEmployeeServiceImpl implements AdminEmployeeService {
    @Autowired
    private AdminRepo repo;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void saveEmployee(AdminEmployeeDTO adminEmployeeDTO) {
        if (!repo.existsById(adminEmployeeDTO.getServiceId())){
            repo.save(modelMapper.map(adminEmployeeDTO, AdminEmployee.class));
        }else{
            throw new RuntimeException("Damage Already Exist..!");
        }
    }

    @Override
    public void deleteEmployee(String employeeId) {
        if (repo.existsById(employeeId)) {
            repo.deleteById(employeeId);
        } else {
            throw new RuntimeException("Please check the Damage Vehicle ID.. No Such Vehicle..!");
        }

    }

    @Override
    public void updateEmployee(AdminEmployeeDTO adminEmployeeDTO) {
        if (repo.existsById(adminEmployeeDTO.getServiceId())) {
            repo.save(modelMapper.map(adminEmployeeDTO, AdminEmployee.class));
        } else {
            throw new RuntimeException("No Such Damage Vehicle To Update..! Please Check the ID..!");
        }
    }

    @Override
    public AdminEmployeeDTO serachEmployee(String employeeId) {
        if (repo.existsById(employeeId)) {
            return modelMapper.map(repo.findById(employeeId).get(), AdminEmployeeDTO.class);
        } else {
            throw new RuntimeException("No Damage Vehicle For " + employeeId + " ..!");
        }
    }

    @Override
    public List<AdminEmployeeDTO> getAllEmployee() {
        return modelMapper.map(repo.findAll(), new TypeToken<List<AdminEmployeeDTO>>() {
        }.getType());
    }
}

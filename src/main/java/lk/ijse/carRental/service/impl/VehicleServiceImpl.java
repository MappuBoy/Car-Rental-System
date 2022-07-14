package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.VehicleDTO;
import lk.ijse.carRental.entity.Vehicle;
import lk.ijse.carRental.repo.VehicleRepo;
import lk.ijse.carRental.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void vehicleSave(VehicleDTO vehicleDTO) {
        if (!repo.existsById(vehicleDTO.getNumberPlateNumber())) {
            repo.save(mapper.map(vehicleDTO, Vehicle.class));
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void deletevehicle(String vehicleId) {

        if (repo.existsById(vehicleId)) {
            repo.deleteById(vehicleId);
        } else {
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }}

    @Override
    public void updatevehicle(VehicleDTO vehicleDTO) {
        if (repo.existsById(vehicleDTO.getNumberPlateNumber())) {
            repo.save(mapper.map(vehicleDTO, Vehicle.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }
    }

    @Override
    public VehicleDTO serachvehicle(String vehicleId) {
        if (repo.existsById(vehicleId)) {
            return mapper.map(repo.findById(vehicleId).get(), VehicleDTO.class);
        } else {
            throw new RuntimeException("No Customer For " + vehicleId + " ..!");
        }
    }

    @Override
    public List<VehicleDTO> getAllvehicle() {
        return mapper.map(repo.findAll(), new TypeToken<List<VehicleDTO>>() {
        }.getType());
    }
}

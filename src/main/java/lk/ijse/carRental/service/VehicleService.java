package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    void vehicleSave(VehicleDTO vehicleDTO);
    void deletevehicle(String vehicleId);
    void updatevehicle(VehicleDTO vehicleDTO);
    VehicleDTO serachvehicle(String vehicleId);
    List<VehicleDTO> getAllvehicle();
}

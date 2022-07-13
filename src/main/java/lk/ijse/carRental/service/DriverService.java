package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    void driverSave(DriverDTO driverDTO);
    void deletedriver(String driverId);
    void updatedriver(DriverDTO driverDTO);
    DriverDTO serachdriver(String driverId);
    List<DriverDTO> getAlldriver();
}

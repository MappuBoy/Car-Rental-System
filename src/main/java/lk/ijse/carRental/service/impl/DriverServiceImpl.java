package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.DamadgeDTO;
import lk.ijse.carRental.dto.DriverDTO;
import lk.ijse.carRental.repo.DriverRepo;
import lk.ijse.carRental.service.DamadgeService;
import lk.ijse.carRental.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DriverServiceImpl implements DriverService {
     @Autowired
  private DriverRepo repo;
  @Autowired
  private ModelMapper mapper;
    @Override
    public void driverSave(DriverDTO driverDTO) {

    }

    @Override
    public void deletedriver(String driverId) {

    }

    @Override
    public void updatedriver(DriverDTO driverDTO) {

    }

    @Override
    public DriverDTO serachdriver(String driverId) {
        return null;
    }

    @Override
    public List<DriverDTO> getAlldriver() {
        return null;
    }


}

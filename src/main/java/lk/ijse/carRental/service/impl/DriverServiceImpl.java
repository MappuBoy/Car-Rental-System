package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.DamadgeDTO;
import lk.ijse.carRental.dto.DriverDTO;
import lk.ijse.carRental.entity.Driver;
import lk.ijse.carRental.repo.DriverRepo;
import lk.ijse.carRental.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DriverServiceImpl implements DriverService {
     @Autowired
  private DriverRepo repo;
  @Autowired
  private ModelMapper mapper;
    @Override
    public void driverSave(DriverDTO driverDTO) {
      if (!repo.existsById(driverDTO.getDroverLicenceNumber())) {
        repo.save(mapper.map(driverDTO, Driver.class));
      } else {
        throw new RuntimeException("Customer Already Exist..!");
      }
    }

    @Override
    public void deletedriver(String driverId) {
      if (repo.existsById(driverId)) {
        repo.deleteById(driverId);
      } else {
        throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
      }
    }

    @Override
    public void updatedriver(DriverDTO driverDTO) {
      if (repo.existsById(driverDTO.getDroverLicenceNumber())) {
        repo.save(mapper.map(driverDTO, Driver.class));
      } else {
        throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
      }
    }

    @Override
    public DriverDTO serachdriver(String driverId) {
      if (repo.existsById(driverId)) {
        return mapper.map(repo.findById(driverId).get(), DriverDTO.class);
      } else {
        throw new RuntimeException("No Customer For " + driverId + " ..!");
      }
    }

    @Override
    public List<DriverDTO> getAlldriver() {
      return mapper.map(repo.findAll(), new TypeToken<List<DriverDTO>>() {
      }.getType());
    }


}

package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.ReservationDTO;
import lk.ijse.carRental.entity.Reservation;
import lk.ijse.carRental.entity.ReservationDetail;
import lk.ijse.carRental.repo.ReservationRepo;
import lk.ijse.carRental.service.ReservationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void reservationSave(ReservationDTO reservationDTO) {

    }

    @Override
    public void deletereservation(String reservationId) {

    }

    @Override
    public void updatereservation(ReservationDTO reservationDTO) {

    }

    @Override
    public ReservationDTO serachreservation(String reservationId) {
        return null;
    }

    @Override
    public List<ReservationDTO> getAllreservation() {
        return null;
    }
}

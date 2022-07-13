package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.PaymentDTO;
import lk.ijse.carRental.dto.ReservationDTO;

import java.util.List;

public interface ReservationService {
    void reservationSave(ReservationDTO reservationDTO);
    void deletereservation(String reservationId);
    void updatereservation(ReservationDTO reservationDTO);
    ReservationDTO serachreservation(String reservationId);
    List<ReservationDTO> getAllreservation();
}

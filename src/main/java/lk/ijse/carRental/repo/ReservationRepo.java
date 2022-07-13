package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,String> {
}

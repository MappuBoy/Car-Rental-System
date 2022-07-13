package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.ReservationDetail;
import lk.ijse.carRental.entity.ReservationDetail_PK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDetailRepo extends JpaRepository<ReservationDetail, ReservationDetail_PK> {
}

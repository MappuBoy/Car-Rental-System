package lk.ijse.carRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReservationDetail_PK implements Serializable {
    private String paymentId;
    private String damadgeId;
    private String reservationId;
}

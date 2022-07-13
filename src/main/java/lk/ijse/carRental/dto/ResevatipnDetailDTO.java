package lk.ijse.carRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResevatipnDetailDTO {
    private String paymentId;
    private String damadgeId;
    private String reservationId;
    private double damageCost;
    private String payingMethod;
    private String damadgeStatus;
    private double total;
    private String duration;
    private String rentalDate;


}

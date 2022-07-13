package lk.ijse.carRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DamadgeDTO {
    private String damadgeId;
    private String vehicleType;
    private  String damadgeType;
    private String paymentMathod;
    private double cost;
}

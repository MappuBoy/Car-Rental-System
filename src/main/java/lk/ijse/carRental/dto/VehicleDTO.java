package lk.ijse.carRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VehicleDTO {
    private String numberPlateNumber;
    private String availability;
    private String brand;
    private String colour;
    private String fuelType;
    private String numberofPassengers;
    private String transmissionType;
    private String type;
}

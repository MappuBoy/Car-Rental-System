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
    private String brand;
    private String type;
    private String numberofPassengers;
    private String transmissionType;
    private String fuelType;
    private String colour;
    private String username;
    private String password;

}

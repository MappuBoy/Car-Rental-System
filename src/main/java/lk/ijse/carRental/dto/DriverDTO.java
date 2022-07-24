package lk.ijse.carRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriverDTO {
    private String droverLicenceNumber;
    private String fullname;
    private String drivertype;
    private  String tpNumer;
    private String address;
    private String availability;
}

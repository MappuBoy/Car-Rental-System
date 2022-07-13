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
    private String username;
    private  String password;
    private String drivertype;
    private  String tpNumer;
}

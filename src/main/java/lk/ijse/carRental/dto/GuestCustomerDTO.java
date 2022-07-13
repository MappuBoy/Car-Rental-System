package lk.ijse.carRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class GuestCustomerDTO {
    private String nic;
    private String driverLicenceNumber;
    private String name;
    private String address;
    private String tp;
    private String email;

}

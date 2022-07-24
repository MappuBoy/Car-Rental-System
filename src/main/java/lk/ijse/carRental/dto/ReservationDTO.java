package lk.ijse.carRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ReservationDTO {
    private String reservationId;
    private String numberPlateNumber;
    private String droverLicenceNumber;
    private String nic;
    private String orderdate;
    private String returnDate;
    private double finalTotal;
    List<ResevatipnDetailDTO> resevatipnDetailDTOS;

}

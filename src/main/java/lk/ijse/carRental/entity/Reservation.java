package lk.ijse.carRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Reservation {
    @Id
    private String reservationId;
    private String numberPlateNumber;
    private String droverLicenceNumber;
    private String nic;
    private String orderdate;
    private String returnDate;
    private double finalTotal;
   /* @ManyToOne
    @JoinColumn(name = " numberPlateNumber",referencedColumnName = "numberPlateNumber",nullable = false)
    private Vehicle numberPlates;
    @ManyToOne
    @JoinColumn(name = " droverLicenceNumber",referencedColumnName = "droverLicenceNumber",nullable = false)
    private Driver droverLicences;
    @ManyToOne
    @JoinColumn(name = " nic",referencedColumnName = "nic",nullable = false)
    private Customer nics;*/

/*    @OneToMany(mappedBy = "reservationId",cascade = {CascadeType.ALL})
    private List<Reservation>reservations;*/
}

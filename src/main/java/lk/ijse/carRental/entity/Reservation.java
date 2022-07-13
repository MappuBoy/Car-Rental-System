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
public class Reservation {
    @Id
    private String reservationId;
    private String serviceId;
    private String numberPlateNumber;
    private String droverLicenceNumber;
    private String nic;
    private double finalTotal;
    @ManyToOne
    @JoinColumn(name = " serviceId",referencedColumnName = "serviceId",nullable = false)
    private Reservation services;
    @ManyToOne
    @JoinColumn(name = " numberPlateNumber",referencedColumnName = "numberPlateNumber",nullable = false)
    private Vehicle numberPlates;
    @ManyToOne
    @JoinColumn(name = " droverLicenceNumber",referencedColumnName = "droverLicenceNumber",nullable = false)
    private Driver droverLicences;
    @ManyToOne
    @JoinColumn(name = " nic",referencedColumnName = "nic",nullable = false)
    private Customer nics;

    @OneToMany(mappedBy = "reservationId",cascade = {CascadeType.ALL})
    private List<Reservation>reservations;
}

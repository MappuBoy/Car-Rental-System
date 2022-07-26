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
@IdClass(ReservationDetail_PK.class)
public class ReservationDetail {
    @Id
    private String paymentId;
    @Id
    private String damadgeId;
    @Id
    private String reservationId;
    private double damageCost;
    private String payingMethod;
    private String damadgeStatus;
    private double total;
    private String duration;
    private String rentalDate;
  /*  @ManyToOne
    @JoinColumn(name = " paymentId",referencedColumnName = "paymentId",nullable = false)
    private Payment payments;
    @ManyToOne
    @JoinColumn(name = " damadgeId",referencedColumnName = "damadgeId",nullable = false)
    private Damadge damadges;
    @ManyToOne
    @JoinColumn(name = " reservationId",referencedColumnName = "reservationId",nullable = false)
    private Reservation reservations;*/

}

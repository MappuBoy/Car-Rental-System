package lk.ijse.carRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Payment {
    @Id
    private String paymentId;
    private String vehicleType;
    private String paymentType;
    private double pricePerKm;
    private double discount;
    @OneToMany(mappedBy = "paymentId",cascade = {CascadeType.ALL})
    private List<Payment>payments;
}

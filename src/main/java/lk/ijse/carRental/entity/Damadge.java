package lk.ijse.carRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Damadge {
    @Id
    private String damadgeId;
    private String vehicleType;
    private  String damadgeType;
    private String paymentMathod;
    private double cost;
/*    @OneToMany(mappedBy = "damadgeId",cascade = {CascadeType.ALL})
    private List<Damadge>damadges;*/
}

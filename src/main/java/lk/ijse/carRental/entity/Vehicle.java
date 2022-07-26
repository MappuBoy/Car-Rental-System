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
public class Vehicle {
    @Id
    private String numberPlateNumber;
    private String brand;
    private String type;
    private String numberofPassengers;
    private String transmissionType;
    private String fuelType;
    private String colour;
    private String availability;
    @OneToMany(mappedBy = "numberPlateNumber",cascade = {CascadeType.ALL})
    private List<Vehicle>vehicles;
}

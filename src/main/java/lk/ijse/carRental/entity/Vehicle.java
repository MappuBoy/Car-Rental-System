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
    private String availability;
    private String brand;
    private String colour;
    private String fuelType;
    private String numberofPassengers;
    private String transmissionType;
    private String type;
    @OneToMany(mappedBy = "numberPlateNumber",cascade = {CascadeType.ALL})
    private List<Vehicle>vehicles;
}

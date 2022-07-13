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
public class Vehicle {
    @Id
    private String numberPlateNumber;
    private String brand;
    private String type;
    private String numberofPassengers;
    private String transmissionType;
    private String fuelType;
    private String colour;
    private String username;
    private String password;
    @OneToMany(mappedBy = "numberPlateNumber",cascade = {CascadeType.ALL})
    private List<Vehicle>vehicles;
}

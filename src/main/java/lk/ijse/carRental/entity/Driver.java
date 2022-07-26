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
public class Driver {
    @Id
    private String droverLicenceNumber;
    private String address;
    private String availability;
    private String drivertype;
    private String fullname;
    private  String tpNumer;

  /*  @OneToMany(mappedBy = "droverLicenceNumber",cascade = {CascadeType.ALL})
    private List<Driver> drivers;
*/
}

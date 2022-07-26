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
public class Customer {
    @Id
    private String nic;
    private String driverLicenceNumber;
    private String name;
    private String address;
    private String tp;
    private String email;
   /* @OneToMany(mappedBy = "nic",cascade = {CascadeType.ALL})
    private List<Customer> customers;*/
}

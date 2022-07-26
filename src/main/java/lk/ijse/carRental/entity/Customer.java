package lk.ijse.carRental.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    private String nic;
    private String address;
    private String driverLicenceNumber;
    private String email;
    private String name;
    private String tp;

   /* @OneToMany(mappedBy = "nic",cascade = {CascadeType.ALL})
    private List<Customer> customers;*/
}

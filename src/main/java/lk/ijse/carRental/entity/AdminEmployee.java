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
public class AdminEmployee {
    @Id
    private String serviceId;
    private String nic;
    private String name;
    private String contactnumber;
    private String email;
    private String username;
    private String password;
   /* @OneToMany(mappedBy = "servicedId",cascade = {CascadeType.ALL})
    private List<AdminEmployee>employees;*/
}

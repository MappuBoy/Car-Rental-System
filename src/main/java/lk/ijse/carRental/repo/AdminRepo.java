package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.AdminEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<AdminEmployee,String> {

}

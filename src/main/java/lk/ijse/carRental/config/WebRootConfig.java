package lk.ijse.carRental.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(lk.ijse.carRental.config.JPAConfig.class)
public class WebRootConfig {

}

package ac.za.cput.cardealership.controller.vehicle;


import ac.za.cput.cardealership.domain.NewCar;
import ac.za.cput.cardealership.domain.vehicle.CarModel;
import ac.za.cput.cardealership.domain.vehicle.Manufacturer;
import ac.za.cput.cardealership.services.vehicle.impl.CarModelServiceImpl;
import ac.za.cput.cardealership.services.vehicle.impl.CarServiceImpl;
import ac.za.cput.cardealership.services.vehicle.impl.ManufactureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardealership/car")
public class CarController {

}

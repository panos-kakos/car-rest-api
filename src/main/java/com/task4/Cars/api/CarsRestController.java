package com.task4.Cars.api;


import com.task4.Cars.error.exception.EntityAlreadyExistsException;
import com.task4.Cars.error.exception.EntityNotFoundException;
import com.task4.Cars.model.Car;
import com.task4.Cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarsRestController {

    @Autowired
    private CarService carService;

    /**
     * Return a list of all available cars in the system
     * @return
     */
    @GetMapping("/cars")
    public ResponseEntity<List<Car>> findAllCars(){
        List<Car> cars = carService.findAll();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }


    /**
     * Find a Car resource by id
     * @param id - carId
     * @return
     * @throws EntityNotFoundException
     */
    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> findCarById(@PathVariable Long id) throws EntityNotFoundException {
            Car car = carService.findById(id);
            return new ResponseEntity<>(car, HttpStatus.OK);
    }


    /**
     * Create new Car resource
     * @param newCar
     * @return
     * @throws EntityAlreadyExistsException
     */
    @PostMapping("/cars")
    public ResponseEntity<Car> newCar(@RequestBody  Car newCar) throws EntityAlreadyExistsException {
        Car savedCar = carService.saveCar(newCar);
        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }


    /**
     * Update Car resource
     * @param newCar
     * @param id
     * @return
     */
    @PutMapping("/cars/{id}")
    public ResponseEntity<Car> updateCar(@RequestBody Car newCar, @PathVariable Long id) {
            Car car = carService.updateCarById(id);
            return new ResponseEntity<>(car, HttpStatus.OK);
    }


    /**
     * Delete Car resource
     * @param id
     * @return
     * @throws EntityNotFoundException
     */
    @DeleteMapping("/cars/id")
    public ResponseEntity<Void> deleteCar( @PathVariable Long id) throws EntityNotFoundException{
            carService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

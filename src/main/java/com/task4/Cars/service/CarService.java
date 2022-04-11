package com.task4.Cars.service;

import com.task4.Cars.error.exception.EntityAlreadyExistsException;
import com.task4.Cars.error.exception.EntityNotFoundException;
import com.task4.Cars.model.Car;

import java.util.List;

public interface CarService {

    Car findById(Long carId)  throws EntityNotFoundException;

    List<Car> findAll();

    Car saveCar(Car newCar) throws EntityAlreadyExistsException;

    void deleteById(Long id) throws EntityNotFoundException;

    Car updateCarById(Long id);
}

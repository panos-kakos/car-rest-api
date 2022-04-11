package com.task4.Cars.service;

import com.task4.Cars.error.exception.EntityNotFoundException;
import com.task4.Cars.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public Car findById(Long carId) throws EntityNotFoundException {
        return null;
    }

    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public Car saveCar(Car newCar) {
        return null;
    }

    @Override
    public void deleteById(Long id) throws EntityNotFoundException {

    }

    @Override
    public Car updateCarById(Long id) {
        return null;
    }
}

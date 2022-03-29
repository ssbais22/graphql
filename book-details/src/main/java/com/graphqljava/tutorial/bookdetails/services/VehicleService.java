package com.graphqljava.tutorial.bookdetails.services;


import com.graphqljava.tutorial.bookdetails.entity.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleService {
    Vehicle save(Vehicle vehicle);

    void delete(int id);

    List<Vehicle> findAll();

    Vehicle findByName(String name);
}


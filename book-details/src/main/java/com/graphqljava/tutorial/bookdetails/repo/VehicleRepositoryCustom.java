package com.graphqljava.tutorial.bookdetails.repo;


import com.graphqljava.tutorial.bookdetails.entity.Vehicle;

public interface VehicleRepositoryCustom {
    Vehicle findByName(String name);
}

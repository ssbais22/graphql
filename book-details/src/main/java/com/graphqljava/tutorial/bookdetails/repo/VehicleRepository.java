package com.graphqljava.tutorial.bookdetails.repo;


import com.graphqljava.tutorial.bookdetails.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer>, VehicleRepositoryCustom {
}

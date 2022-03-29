package com.graphqljava.tutorial.bookdetails.repo;

import com.graphqljava.tutorial.bookdetails.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer>, ShipmentRepositoryCustom {

}

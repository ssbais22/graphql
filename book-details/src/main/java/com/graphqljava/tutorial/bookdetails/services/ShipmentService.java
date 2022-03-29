package com.graphqljava.tutorial.bookdetails.services;


import com.graphqljava.tutorial.bookdetails.entity.Shipment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShipmentService {
    Shipment save(Shipment shipment);

    void delete(int id);

    List<Shipment> findAll();

    Shipment findByName(String name);
}


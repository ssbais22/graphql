package com.graphqljava.tutorial.bookdetails.services;

import com.graphqljava.tutorial.bookdetails.entity.Shipment;
import com.graphqljava.tutorial.bookdetails.repo.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {
    final ShipmentRepository shipmentRepository;

    public ShipmentServiceImpl(@Autowired ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public Shipment save(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    public void delete(int id) {
        shipmentRepository.deleteById(id);
    }

    public List<Shipment> findAll() {
        return shipmentRepository.findAll();
    }

    public Shipment findByName(String name) {
        return shipmentRepository.findByName(name);
    }
}

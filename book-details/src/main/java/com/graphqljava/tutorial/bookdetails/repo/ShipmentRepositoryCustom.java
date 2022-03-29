package com.graphqljava.tutorial.bookdetails.repo;

import com.graphqljava.tutorial.bookdetails.entity.Shipment;

public interface ShipmentRepositoryCustom {
    Shipment findByName(String name);
}

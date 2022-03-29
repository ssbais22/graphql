package com.graphqljava.tutorial.bookdetails;

import com.google.common.collect.ImmutableMap;
import com.graphqljava.tutorial.bookdetails.entity.Shipment;
import com.graphqljava.tutorial.bookdetails.services.ShipmentService;
import com.graphqljava.tutorial.bookdetails.services.VehicleService;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class GraphQLDataFetchers {

    @Autowired
    private ShipmentService shipmentService;

    @Autowired
    private VehicleService vehicleService;

    private static List<Map<String, String>> authors = Arrays.asList(
            ImmutableMap.of("id", "author-1",
                    "firstName", "Joanne",
                    "lastName", "Rowling"),
            ImmutableMap.of("id", "author-2",
                    "firstName", "Herman",
                    "lastName", "Melville"),
            ImmutableMap.of("id", "author-3",
                    "firstName", "Anne",
                    "lastName", "Rice")
    );

    public DataFetcher getShipmentByName() {
        return dataFetchingEnvironment -> {
            String name = dataFetchingEnvironment.getArgument("name");
            return shipmentService.findAll()
                    .stream()
                    .filter(shipment -> shipment.getName().equals(name))
                    .findFirst()
                    .orElse(null);
        };
    }

    public DataFetcher getVehicleProvider() {
        return dataFetchingEnvironment -> {
            Shipment shipment = dataFetchingEnvironment.getSource();
            Integer vehicleId = shipment.getVehicle() != null ? shipment.getVehicle().getId(): null;
            if( vehicleId != null) {
                return vehicleService.findAll()
                        .stream()
                        .filter(vehicle -> vehicle.getId() == vehicleId)
                        .findFirst()
                        .orElse(null);
            }
            return  null;
        };
    }
}

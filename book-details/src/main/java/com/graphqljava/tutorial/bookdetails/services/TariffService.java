package com.graphqljava.tutorial.bookdetails.services;



import com.graphqljava.tutorial.bookdetails.entity.Tariff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TariffService {
    Tariff save(Tariff tariff);

    void delete(int id);

    List<Tariff> findAll();

    Tariff findByName(String name);
}


package com.graphqljava.tutorial.bookdetails.repo;


import com.graphqljava.tutorial.bookdetails.entity.Tariff;

public interface TariffRepositoryCustom {
    Tariff findByName(String name);
}

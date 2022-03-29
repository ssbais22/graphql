package com.graphqljava.tutorial.bookdetails.repo;


import com.graphqljava.tutorial.bookdetails.entity.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TariffRepository extends JpaRepository<Tariff, Integer>, TariffRepositoryCustom {
}

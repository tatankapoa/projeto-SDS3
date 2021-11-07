package com.tatanka.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatanka.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}

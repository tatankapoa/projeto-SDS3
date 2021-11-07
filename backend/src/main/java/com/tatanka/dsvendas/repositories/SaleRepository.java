package com.tatanka.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tatanka.dsvendas.dto.SaleSuccessDTO;
import com.tatanka.dsvendas.dto.SaleSumDTO;
import com.tatanka.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("select new com.tatanka.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount)) "
			+ " from Sale as obj group by obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("select new com.tatanka.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited) , SUM(obj.deals)) "
			+ " from Sale as obj group by obj.seller")
	List<SaleSuccessDTO> sucessGroupedBySeller();
	

}

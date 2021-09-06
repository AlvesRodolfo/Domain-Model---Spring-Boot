package com.devsuperior.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	//usado para realizar operações com o BD
}

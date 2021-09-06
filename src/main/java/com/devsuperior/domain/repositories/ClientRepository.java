package com.devsuperior.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	//usado para realizar operações com o BD
}

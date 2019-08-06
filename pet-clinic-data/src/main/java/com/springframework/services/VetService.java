package com.springframework.services;

import java.util.Set;

public interface VetService {
	
	Vet findLastName(String lastName);
	Vet findById(Long id);
	Vet save(Vet owner);
	
	Set<Vet> findAll();

}

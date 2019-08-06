package com.springframework.services;

import java.util.Set;

import com.springframework.model.Owner.Pet;

public enum PetService {
	
	Pet findLastName(String lastName);
	Pet findById(Long id);
	Pet save(Pet owner);
	
	Set<Pet> findAll();
	
	
}

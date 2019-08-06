package com.springframework.services;

import java.util.Set;

import com.springframework.model.Owner;

public interface OwnerService {
	
	Owner findLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	
	

}

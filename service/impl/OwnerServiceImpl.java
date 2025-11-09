package com.scaleupindia.service.impl;

import java.util.List;

import com.scaleupindia.model.OwnerDTO;
import com.scaleupindia.repository.Repository;
import com.scaleupindia.repository.impl.RepositoryImpl;
import com.scaleupindia.service.OwnerService;

public class OwnerServiceImpl implements OwnerService {
	private Repository ownerRepository;
	
	public OwnerServiceImpl() {
		this.ownerRepository = new RepositoryImpl();
	}

	@Override
	public List<OwnerDTO> findAllOwners() {
		return ownerRepository.findAllOwners();
	}

}

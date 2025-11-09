package com.scaleupindia.repository;

import java.util.List;

import com.scaleupindia.model.OwnerDTO;

public interface Repository {
	List<OwnerDTO> findAllOwners();
}

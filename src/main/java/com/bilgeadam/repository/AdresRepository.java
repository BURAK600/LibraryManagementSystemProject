package com.bilgeadam.repository;

import com.bilgeadam.entity.Address;
import com.bilgeadam.utility.MyFactoryRepository;

public class AdresRepository extends MyFactoryRepository<Address, Long> {

	public AdresRepository() {
		super(new Address());
		// TODO Auto-generated constructor stub
	}

}

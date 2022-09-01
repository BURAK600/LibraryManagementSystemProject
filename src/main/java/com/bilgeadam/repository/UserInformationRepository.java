package com.bilgeadam.repository;

import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.utility.MyFactoryRepository;

public class UserInformationRepository extends MyFactoryRepository<UserInformation, Long> {

	public UserInformationRepository(UserInformation t) {
		super(new UserInformation());
		// TODO Auto-generated constructor stub
	}

}

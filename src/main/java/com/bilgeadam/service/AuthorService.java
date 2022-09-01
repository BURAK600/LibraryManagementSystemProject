package com.bilgeadam.service;

import com.bilgeadam.entity.Author;
import com.bilgeadam.repository.AuthorRepository;
import com.bilgeadam.utility.MyFactoryRepository;
import com.bilgeadam.utility.MyFactoryService;

public class AuthorService extends MyFactoryService<MyFactoryRepository, Author, Long> {

	public AuthorService() {
		super(new AuthorRepository());

	}

}

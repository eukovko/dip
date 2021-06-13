package com.kovko.service;


import com.kovko.repository.Repository;

public class BasicWordService implements Service {

	private Repository repository;

	public BasicWordService(Repository repository) {
		this.repository = repository;
	}

	@Override
	public String readWord(int id) {
		return repository.readWord(id);
	}

	@Override
	public void createWord(String word) {
		repository.createWord(word);

	}
}

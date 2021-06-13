package com.kovko.controller;

import com.kovko.service.Service;

public class BasicWordController implements Controller {

	private Service service;

	public BasicWordController(Service service) {
		this.service = service;
	}

	@Override
	public String readWord(int id) {
		return service.readWord(id);
	}

	@Override
	public void createWord(String word) {
		service.createWord(word);

	}
}

package com.kovko;

import com.kovko.repository.Repository;

public class BasicWordRepository implements Repository {

	@Override
	public void createWord(String word) {

	}

	@Override
	public String readWord(int id) {
		return "hello";
	}
}

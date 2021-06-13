package com.kovko.repository;

public interface Repository {
	void createWord(String word);

	String readWord(int id);
}

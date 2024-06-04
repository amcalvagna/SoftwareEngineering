package org.labisd.phonebook;

public interface PhoneBookRegistry {
	boolean contains(String name);
	void insert(String name, String number);
}

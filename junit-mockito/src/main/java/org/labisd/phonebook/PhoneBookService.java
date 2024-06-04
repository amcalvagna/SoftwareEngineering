package org.labisd.phonebook;

public class PhoneBookService {
	PhoneBookRegistry registry;

	public PhoneBookService(PhoneBookRegistry registry) {
		this.registry = registry;
	}

	public void register(String name, String number) {
		if (! registry.contains(name))
			registry.insert(name, number);
	}
}

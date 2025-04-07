package org.labisd.db;

public class Database {
	public void openConnection() {
		System.out.println("[Database] connection opened");
	}

	public String query(String query) {
		System.out.println("[Database] query: " + query);
		return "results of " + query;
	}

	public void closeConnection() {
		System.out.println("[Database] connection closed");
	}
}

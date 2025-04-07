package org.labisd.db;

public class TextFile {
	private final String fileName;
	private int lineNumber;

	public TextFile(String fileName) {
		this.fileName = fileName;
		this.lineNumber = 0;
	}

	public void openFile() {
		System.out.println("[TextFile] " + fileName + " opened");
	}

	public String readLine() {
		lineNumber++;
		System.out.println("[TextFile] Read line #" + lineNumber);
		return "line" + lineNumber;
	}

	public void closeFile() {
		System.out.println("[TextFile] " + fileName + " closed");
	}
}

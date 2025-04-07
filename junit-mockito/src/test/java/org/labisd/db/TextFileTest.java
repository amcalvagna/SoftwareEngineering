package org.labisd.db;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TextFileTest {

	private static Database db;
	private static final String FOO = "foo.txt";

	private TextFile textFile;

	@BeforeClass
	public static void onlyOnceSetUp() {
		db = new Database();
		db.openConnection();
	}

	@Before
	public void setUp() {
		textFile = new TextFile(FOO);
		textFile.openFile();
	}
    
	@Test
	public void testCreateQueryWithFirstTextFileLine() {
		String firstLine = textFile.readLine();
		String results = db.query(firstLine);
		
		assertEquals("line1", firstLine);
		assertEquals("results of " + firstLine, results);
	}

	@Test
	public void testCreateQueryWithSecondTextFileLine() {
		textFile.readLine(); // skip
		String secondLine = textFile.readLine();
		String results = db.query(secondLine);
		
		assertEquals("line2", secondLine);
		assertEquals("results of " + secondLine, results);
	}

	@After
	public void tearDown() {
		textFile.closeFile();
	}
	
	@AfterClass
	public static void onlyOnceTearDown() {
		db.closeConnection();
	}
}

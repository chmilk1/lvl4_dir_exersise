import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import java.io.File;

public class TestFileAPI {

	public static File file = new File("../testfile.txt");
	public static File directory = new File("../test");
	public static File unreadableFile = new File("unreadablefile.txt");
	public static File readOnlyFile = new File("../../readonlyfile.txt");
	
	@Test
	public void testIsDirectory1() {
		assertEquals(directory.isDirectory(),true);
	}
	
	@Test
	public void testIsDirectory2() {
		assertFalse(file.isDirectory());
	}
	
	@Test
	public void testIsFile1() {
		assertFalse(directory.isFile());
	}
	
	@Test 
	public void testIsFile2() throws Exception{

		assertTrue(file.isFile());
	}
	
	@Test
	public void testCanExecute1() {
		assertTrue(directory.canExecute());
	}
	
	
	@Test
	public void testCanExecute2() {
		assertTrue(file.canExecute());
	}
	
	@Test
	public void testCanWrite() {
		assertTrue(readOnlyFile.exists());
		assertFalse(readOnlyFile.canWrite());
	}
	

  	@Test
	public void testExists1() {
		assertTrue(file.exists());
	}
	
	@Test
	public void testGetAbsolutePath() {
		assertEquals("", readOnlyFile.getAbsolutePath());
	}
	
	@Test
	public void testGetCanonicalPath() throws Exception {
		assertEquals("", readOnlyFile.getCanonicalPath());
	}
	
	@Test
	public void testGetParent1() {
		assertEquals("", directory.getParent());
	}

	@Test
	public void testGetParent2() {
		assertEquals("", readOnlyFile.getParent());
	}

	@Test
	public void testGetPath() {
		assertEquals("", readOnlyFile.getPath());
	}
	
	@Test 
	public void testGetName() {
		assertEquals("",readOnlyFile.getName());
	}
	
	@Test
	public void testToString() {
		assertEquals("",directory.toString());
	}
	
	@Test
	public void testList() {
		assertEquals(directory.list().length,5);
	}

}



package labA.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import labA.main.NestedClassExample;
import labA.main.NestedClassExample.TextFile;

@DisplayName("Text Files")
class TextFileTest {
	static NestedClassExample nce;
	
	@BeforeAll
	static void beforeAll() {
		nce = new NestedClassExample();
	}
	
	@Test
	void test() {
		// Create files
		TextFile markdown = nce.new TextFile("README.md");
		TextFile text = nce.new TextFile("README.txt");
		TextFile masks = nce.new TextFile("pjmasks.txt");
		
		assertEquals(null, markdown.getContents());
		assertEquals(null, text.getContents());
		assertEquals(null, masks.getContents());
		
		// Open files
		markdown.open();
		text.open();
		masks.open();
		
		assertEquals("# Header", markdown.getContents());
		assertEquals("Header", text.getContents());
		assertEquals("Cos bedtime Is the right time To fight crime", masks.getContents());
		
		// Close files
		markdown.close();
		text.close();
		masks.close();
		
		assertEquals("", markdown.getContents());
		assertEquals("", text.getContents());
		assertEquals("", masks.getContents());

	}

}

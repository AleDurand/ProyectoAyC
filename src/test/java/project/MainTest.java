package project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class MainTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void test1() {
		try {
			File output = folder.newFile("test_00.out");
			File expected = new File("src/test/resources/test_00.out");
			String[] args = new String[] { "src/test/resources/test_00.in",
					output.getPath() };
			Main.main(args);
			assertEquals(
					FileUtils.readLines(expected, Charset.defaultCharset()),
					FileUtils.readLines(output, Charset.defaultCharset()));
		} catch (IOException e1) {
			fail("IOException");
		}
	}

	@Test
	public void test2() {
		try {
			File output = folder.newFile("test_01.out");
			File expected = new File("src/test/resources/test_01.out");
			String[] args = new String[] { "src/test/resources/test_01.in",
					output.getPath() };
			Main.main(args);
			assertEquals(
					FileUtils.readLines(expected, Charset.defaultCharset()),
					FileUtils.readLines(output, Charset.defaultCharset()));
		} catch (IOException e1) {
			fail("IOException");
		}
	}

	@Test
	public void test3() {
		try {
			File output = folder.newFile("test_02.out");
			File expected = new File("src/test/resources/test_02.out");
			String[] args = new String[] { "src/test/resources/test_02.in",
					output.getPath() };
			Main.main(args);
			assertEquals(
					FileUtils.readLines(expected, Charset.defaultCharset()),
					FileUtils.readLines(output, Charset.defaultCharset()));
		} catch (IOException e1) {
			fail("IOException");
		}
	}

	@Test
	public void test4() {
		try {
			File output = folder.newFile("test_03.out");
			File expected = new File("src/test/resources/test_03.out");
			String[] args = new String[] { "src/test/resources/test_03.in",
					output.getPath() };
			Main.main(args);
			assertEquals(
					FileUtils.readLines(expected, Charset.defaultCharset()),
					FileUtils.readLines(output, Charset.defaultCharset()));
		} catch (IOException e1) {
			fail("IOException");
		}
	}

	@Test
	public void test5() {
		try {
			File output = folder.newFile("test_04.out");
			File expected = new File("src/test/resources/test_04.out");
			String[] args = new String[] { "src/test/resources/test_04.in",
					output.getPath() };
			Main.main(args);
			assertEquals(
					FileUtils.readLines(expected, Charset.defaultCharset()),
					FileUtils.readLines(output, Charset.defaultCharset()));
		} catch (IOException e1) {
			fail("IOException");
		}
	}

}

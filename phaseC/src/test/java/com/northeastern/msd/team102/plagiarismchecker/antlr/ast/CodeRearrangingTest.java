package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;

import org.junit.Test;

import com.northeastern.msd.team102.plagiarismchecker.antlr.ast.CompareStrategy;
import com.northeastern.msd.team102.plagiarismchecker.antlr.ast.CompareStrategyAll;
import com.northeastern.msd.team102.plagiarismchecker.antlr.ast.CompareStrategyHashMap;
import com.northeastern.msd.team102.plagiarismchecker.antlr.ast.CompareStrategyLevenshteinDist;
import com.northeastern.msd.team102.plagiarismchecker.antlr.ast.CompareStrategyTrees;

public class CodeRearrangingTest {

	/**
	 * Comparison of IdentifierRenaming1.py and CodeRearranging.py.
	 * @throws IOException
	 */
	@Test
	public void test_CompareStrategyAll() throws IOException, URISyntaxException {
		CompareStrategy c = new CompareStrategyAll();
	    File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/IdentifierRenaming1.py");
		byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	    File file2=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/CodeRearranging.py");
		byte[] encodedFile2 = Files.readAllBytes(file2.toPath());		
	    assertEquals(100.00, c.compareFiles(encodedFile1, encodedFile2),2);
	}
	
	/**
	 * Comparison of IdentifierRenaming1.py and CodeRearranging.py.
	 * @throws IOException
	 */
	@Test
	public void test_CompareStrategyAll2() throws IOException, URISyntaxException {
		CompareStrategy c = new CompareStrategyAll();
	    File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/CodeRearranging.py");
		byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	    File file2=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/IdentifierRenaming1.py");
		byte[] encodedFile2 = Files.readAllBytes(file2.toPath());		
	    assertEquals(100.00, c.compareFiles(encodedFile1, encodedFile2),2);
	}
	
	/**
	 * Comparison of IdentifierRenaming1.py and CodeRearranging.py.
	 * @throws IOException
	 */
	@Test
	public void test_CompareStrategyHashMap() throws IOException, URISyntaxException {
		CompareStrategy c = new CompareStrategyHashMap();
	    File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/IdentifierRenaming1.py");
		byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	    File file2=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/CodeRearranging.py");
		byte[] encodedFile2 = Files.readAllBytes(file2.toPath());		
	    assertEquals(100.00, c.compareFiles(encodedFile1, encodedFile2),2);
	}
	
	/**
	 * Comparison of IdentifierRenaming1.py and CodeRearranging.py.
	 * @throws IOException
	 */
	@Test
	public void test_CompareStrategyHashMap2() throws IOException, URISyntaxException {
		CompareStrategy c = new CompareStrategyHashMap();
	    File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/CodeRearranging.py");
		byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	    File file2=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/IdentifierRenaming1.py");
		byte[] encodedFile2 = Files.readAllBytes(file2.toPath());		
	    assertEquals(100.00, c.compareFiles(encodedFile1, encodedFile2),2);
	}
	
	/**
	 * Comparison of IdentifierRenaming1.py and CodeRearranging.py.
	 * @throws IOException
	 */
	@Test
	public void test_CompareStrategyLevenshteinDist() throws IOException, URISyntaxException {
		CompareStrategy c = new CompareStrategyLevenshteinDist();
	    File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/IdentifierRenaming1.py");
		byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	    File file2=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/CodeRearranging.py");
		byte[] encodedFile2 = Files.readAllBytes(file2.toPath());		
	    assertEquals(78.00, c.compareFiles(encodedFile1, encodedFile2),2);
	}
	
	/**
	 * Comparison of IdentifierRenaming1.py and CodeRearranging.py.
	 * @throws IOException
	 */
	@Test
	public void test_CompareStrategyLevenshteinDist2() throws IOException, URISyntaxException {
		CompareStrategy c = new CompareStrategyLevenshteinDist();
	    File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/CodeRearranging.py");
		byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	    File file2=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/IdentifierRenaming1.py");
		byte[] encodedFile2 = Files.readAllBytes(file2.toPath());		
	    assertEquals(78.00, c.compareFiles(encodedFile1, encodedFile2),2);
	}
	
	/**
	 * Comparison of IdentifierRenaming1.py and CodeRearranging.py.
	 * @throws IOException
	 */
	@Test
	public void test_CompareStrategyTrees() throws IOException, URISyntaxException {
		CompareStrategy c = new CompareStrategyTrees();
	    File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/IdentifierRenaming1.py");
		byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	    File file2=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/CodeRearranging.py");
		byte[] encodedFile2 = Files.readAllBytes(file2.toPath());		
	    assertEquals(100.00, c.compareFiles(encodedFile1, encodedFile2),2);
	}
	
	/**
	 * Comparison of IdentifierRenaming1.py and CodeRearranging.py.
	 * @throws IOException
	 */
	@Test
	public void test_CompareStrategyTrees2() throws IOException, URISyntaxException {
		CompareStrategy c = new CompareStrategyTrees();
	    File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/CodeRearranging.py");
		byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	    File file2=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/sprint3Test/IdentifierRenaming1.py");
		byte[] encodedFile2 = Files.readAllBytes(file2.toPath());		
	    assertEquals(100.00, c.compareFiles(encodedFile1, encodedFile2),2);
	}

}

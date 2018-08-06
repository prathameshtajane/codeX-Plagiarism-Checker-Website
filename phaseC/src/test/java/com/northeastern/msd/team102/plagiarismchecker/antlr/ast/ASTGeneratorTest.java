package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.Test;

/**
 * 
 * ASTPrinterTest to check the ASTPrinter class.
 * Tests to check Parsed trees for given python files.
 *
 */

public class ASTGeneratorTest {

	/**
	 * Test1 : Parsed input of SamplepythonFile1.py
	 * @throws IOException
	 */
	@Test
	public void test_parseSamplepythonFile1() throws IOException { 
	     File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/SamplePythonFile1.py");
		 byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	     ASTGenerator astPrinter = new ASTGenerator(encodedFile1);
	     String mockParsedFile = "file_input funcdef  parameters  suite   simple_stmt    atom_expr"
	     		+ "     atom     trailer      atom if_stmt  comparison   atom   comp_op   atom"
	     		+ "  atom_expr   atom   trailer";

	     assertEquals(mockParsedFile, astPrinter.print());
	}
	
	/**
	 * Test2 : Parsed input of SamplepythonFile2.py
	 * @throws IOException
	 */
	@Test
	public void test_parseSamplepythonFile2() throws IOException {
		 File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/SamplePythonFile2.py");
		 byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	     ASTGenerator astPrinter = new ASTGenerator(encodedFile1);
	     String mockParsedFile = "file_input funcdef  parameters  suite   simple_stmt"
	     		+ "    atom_expr     atom     trailer      atom   simple_stmt    atom_expr"
	     		+ "     atom     trailer      atom if_stmt  comparison   atom   comp_op   atom"
	     		+ "  atom_expr   atom   trailer";
	     
	     assertEquals(mockParsedFile, astPrinter.print());
	}
	
	/**
	 * Test1 : Parsed input of parseNewPython.py
	 * @throws IOException
	 */
	@Test
	public void test_parseNewPython() throws IOException {
		 File file1=new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/newpython.py");
		 byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	     ASTGenerator astPrinter = new ASTGenerator(encodedFile1);
	     String mockParsedFile = "file_input simple_stmt  expr_stmt   atom   atom    dictorsetmaker"
	     		+ "     atom     atom     atom     atom simple_stmt  expr_stmt   atom   atom"
	     		+ "    dictorsetmaker     atom     atom     atom     atom simple_stmt  expr_stmt"
	     		+ "   atom   atom_expr    atom    trailer     argument      term       atom_expr"
	     		+ "        atom        trailer         atom       atom_expr        atom        trailer"
	     		+ "         atom      comp_for       atom       atom";
      
	     assertEquals(mockParsedFile, astPrinter.print());
	}
	
	/**
	 * Test1 : Parsed input of calc.py
	 * @throws IOException
	 */
	@Test
	public void test_parseCalc() throws IOException {
	     File file1 = new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/calc.py");
		 byte[] encodedFile1 = Files.readAllBytes(file1.toPath());
	     ASTGenerator astPrinter = new ASTGenerator(encodedFile1);
	     String mockParsedFile = "file_input simple_stmt  atom funcdef  parameters   typedargslist"
	     		+ "    tfpdef    tfpdef  suite   simple_stmt    return_stmt     arith_expr      atom"
	     		+ "      atom funcdef  parameters   typedargslist    tfpdef    tfpdef  suite   simple_stmt"
	     		+ "    return_stmt     arith_expr      atom      atom funcdef  parameters   typedargslist"
	     		+ "    tfpdef    tfpdef  suite   simple_stmt    return_stmt     term      atom"
	     		+ "      atom funcdef  parameters   typedargslist    tfpdef    tfpdef  suite   simple_stmt"
	     		+ "    return_stmt     term      atom      atom simple_stmt  atom_expr   atom   trailer"
	     		+ "    atom simple_stmt  atom_expr   atom   trailer    atom simple_stmt  atom_expr   atom"
	     		+ "   trailer    atom simple_stmt  atom_expr   atom   trailer    atom simple_stmt"
	     		+ "  atom_expr   atom   trailer    atom simple_stmt  expr_stmt   atom   atom_expr    atom"
	     		+ "    trailer     atom simple_stmt  expr_stmt   atom   atom_expr    atom    trailer"
	     		+ "     atom_expr      atom      trailer       atom simple_stmt  expr_stmt   atom"
	     		+ "   atom_expr    atom    trailer     atom_expr      atom      trailer       atom if_stmt"
	     		+ "  comparison   atom   comp_op   atom  suite   simple_stmt    atom_expr     atom"
	     		+ "     trailer      arglist       atom       atom       atom       atom       atom_expr"
	     		+ "        atom        trailer         arglist          atom          atom  comparison"
	     		+ "   atom   comp_op   atom  suite   simple_stmt    atom_expr     atom     trailer"
	     		+ "      arglist       atom       atom       atom       atom       atom_expr        atom"
	     		+ "        trailer         arglist          atom          atom  comparison   atom   comp_op"
	     		+ "   atom  suite   simple_stmt    atom_expr     atom     trailer      arglist       atom"
	     		+ "       atom       atom       atom       atom_expr        atom        trailer"
	     		+ "         arglist          atom          atom  comparison   atom   comp_op   atom  suite"
	     		+ "   simple_stmt    atom_expr     atom     trailer      arglist       atom       atom"
	     		+ "       atom       atom       atom_expr        atom        trailer         arglist"
	     		+ "          atom          atom  suite   simple_stmt    atom_expr     atom     trailer"
	     		+ "      atom";
      
	     assertEquals(mockParsedFile, astPrinter.print());
	}

}
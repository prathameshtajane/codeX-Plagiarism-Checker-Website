package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CodeRearrangingTest.class, CommentsTest.class,
	DisimilarFilesTest.class, EmptyFilesTest.class,
	FunctionRenamingTest.class, IdentifierRenamingTest.class,
	SpecialCharsTest.class, WhiteSpaceTruncatingTest.class, SameFileTest.class})
public class Sprint3TestSuite {

}

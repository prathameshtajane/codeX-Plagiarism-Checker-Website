package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author mrunal
 * Test cases for LCS.java
 *
 */
public class LCSTest {

	/**
	 * To check longest common subsequence.
	 */
	@Test
	public void lcsTest() {
		LCS lcs=new LCS();
		String firstString = "this is to test the longest common subsequence";
		String secondString = "Longest common subsequence is verified";
		String commonString = lcs.lcsSubString(firstString, secondString);
		assertEquals("ongest common subsequence", commonString);	
	}
}

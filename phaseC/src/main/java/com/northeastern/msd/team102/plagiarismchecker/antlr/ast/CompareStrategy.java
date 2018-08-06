package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

import java.net.URISyntaxException;

/**
 * @version 1.0
 * @description Interface for comparing files using Strategy design pattern
 */
public interface CompareStrategy {
	/**
	 * @param file1: byte array
	 * @param file2: byte array
	 * @return percent similarity with keeping file1 as base, maps how similar is file2 with file1
	 * 			i.e it tells how much portion of code in file1 is present in file2
	 * @throws URISyntaxException
	 */
	double compareFiles(byte[] file1, byte[] file2) throws URISyntaxException;
}

package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

import java.net.URISyntaxException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @version 1.0
 * @description compares 2 python files using weighted average of all comparison strategies using 
				Linear regression using normal equations strategy
 */
public class CompareStrategyAll implements CompareStrategy {

	private Logger logger;
	public CompareStrategyAll () {
		logger = Logger.getLogger(CompareStrategyAll.class.getName());
	}
	
	/**
	 * @param file1 : byte array
	 * @param file2 : byte array
	 * @return percent similarity with keeping file1 as base, maps how similar is file2 with file1
	 * 			i.e it tells how much portion of code in file1 is present in file2
	 * @throws URISyntaxException 
	 */
	public double compareFiles(byte[] file1, byte[] file2) {
	    logger.log(Level.INFO, "Comapare files with Weighted Strategy for all the algos.");
		double[] total = new double[3];
		CompareStrategy c1 = new CompareStrategyHashMap();
		CompareStrategy c2 = new CompareStrategyLevenshteinDist();
		CompareStrategy c3 = new CompareStrategyTrees();
		double finalScore = 0.0;
		try {
			WeighComparators w = new WeighComparators();
			total[0] = c1.compareFiles(file1, file2);
			total[1] = c2.compareFiles(file1, file2);		
			total[2] = c3.compareFiles(file1, file2);
			finalScore = w.getFinalPredictedOutputAll(total);
		} catch (URISyntaxException e) {
			logger.log(Level.INFO, "Exception : {0}",e);
		}
	    return finalScore;
	}
}


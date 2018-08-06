package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @version 1.0
 * @description compares 2 python files using directed tree strategy
 */
public class CompareStrategyTrees implements CompareStrategy {

	private Logger logger;	
	public CompareStrategyTrees () {
		logger = Logger.getLogger(CompareStrategyTrees.class.getName());
	}
	
	/**
	 * @param file1 : byte array
	 * @param file2 : byte array
	 * @return percent similarity with keeping file1 as base, maps how similar is file2 with file1
	 * 			i.e it tells how much portion of code in file1 is present in file2
	 */
	public double compareFiles(byte[] file1, byte[] file2) {
		logger.log(Level.INFO,"Comparing files using Tree strategy.");
		ASTGenerator ast1 = new ASTGenerator(file1);
		int total = ast1.getTotalCountOfNodes();
		if (total <= 1) {
			logger.log(Level.WARN,"WARNING: Empty base file submitted for AST Tree comparison.");
			return 0;
			
		}
		List<TreeNode> treeNodes1 = ast1.getTreeNodes();
		ASTGenerator ast2 = new ASTGenerator(file2);
		List<TreeNode> treeNodes2 = ast2.getTreeNodes();
		int similarity = 0;
		for (TreeNode t1 : treeNodes1) {
			if (treeNodes2.contains(t1)) {
				similarity++;
				treeNodes2.remove((treeNodes2.indexOf(t1)));
			}			
		}
		return (((double)similarity/(double)total) * 100.0);
	}
}

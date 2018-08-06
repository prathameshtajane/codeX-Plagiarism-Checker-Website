package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @version 1.0
 * @description compares 2 python files using Levenshtein strategy
 */
public class CompareStrategyLevenshteinDist implements CompareStrategy {

    private Logger logger;
    public CompareStrategyLevenshteinDist () {
        logger = Logger.getLogger(CompareStrategyLevenshteinDist.class.getName());
    }


    @Override
    /**
     * @param file1 : byte array
     * @param file2: byte array
     * @return percent similarity with keeping file1 as base, maps how similar is file2 with file1
     */
    public double compareFiles(byte[] file1, byte[] file2) {
        logger.log(Level.INFO,"Comparing files using Levenshtein Distance strategy.");
        ASTGenerator astPrinter1 = new ASTGenerator(file1);
        int total = astPrinter1.getTotalCountOfNodes();
        if (total <= 1) {
        	logger.log(Level.WARN,"WARNING: Empty base file submitted for Levenshtein comparison.");
            return 0;
        }
        ASTGenerator astPrinter2 = new ASTGenerator(file2);
        String node1 = astPrinter1.print();
        String node2 = astPrinter2.print();
        return compareFilesUsingLD(node1, node2);
    }

    /**
     * @description This function implements logic to compare two string using Levenshtein Edit distance
     * @param rawfirstString first String
     * @param rawsecondString second String
     * @return Edit distance similarity between rawfirstString and rawsecondString
     */
    private double compareFilesUsingLD(String rawfirstString, String rawsecondString) {
        String firstString = rawfirstString.trim().replaceAll(" +", " ");
        String secondString = rawsecondString.trim().replaceAll(" +", " ");
        int len0 = firstString.length() + 1;
        int len1 = secondString.length() + 1;
        int[] distanceCost = new int[len0];
        int[] newGeneratedDistanceCost = new int[len0];
        float maxDistance;
        float normalisedEditDistance;
        float percentSimilarity;

        if(firstString.length()==0 || secondString.length()==0){
            return 0;
        }

        maxDistance=Math.min((len0-1),(len1-1));
        for (int i = 0; i < len0; i++) distanceCost[i] = i;
        for (int j = 1; j < len1; j++) {
            newGeneratedDistanceCost[0] = j;
            for(int i = 1; i < len0; i++) {
                int match = (firstString.charAt(i - 1) == secondString.charAt(j - 1)) ? 0 : 1;
                int distanceCostReplace = distanceCost[i - 1] + match;
                int distanceCostInsert  = distanceCost[i] + 1;
                int distanceCostDelete  = newGeneratedDistanceCost[i - 1] + 1;
                newGeneratedDistanceCost[i] = Math.min(Math.min(distanceCostInsert, distanceCostDelete),
                        distanceCostReplace);
            }
            int[] swap = distanceCost; distanceCost = newGeneratedDistanceCost; newGeneratedDistanceCost = swap;
        }
        normalisedEditDistance=(distanceCost[len0 - 1]/maxDistance);
        percentSimilarity=(1-normalisedEditDistance)*100;
        if(percentSimilarity<0){
            return 0;
        }
        return (double) percentSimilarity;
    }
}

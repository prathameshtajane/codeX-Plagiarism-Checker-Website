package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

/**
 * The class is responsible to generate
 * similar chunk of code among two different python programs.
 * reference for Longest Common subsequence : https://www.geeksforgeeks.org/print-longest-common-substring/
 *
 */
public class LCS {
	
	/**
	 * 
	 * @param original : String
	 * @param suspected : String
	 * @return substring String - Longest common substring of original and suspected string.
	 */
	public static String lcsSubString(String original, String suspected)
    {
		/**
		 * Table to store lengths of longest common suffixes of substrings. Note that
		 * LCSuff[i][j] contains length of longest common suffix of X[0..i-1] and
		 * Y[0..j-1]
		 */
		int originalLength = original.length();
		int suspectedLength= suspected.length();
        int[][] lcsSuffix = new int[ originalLength+ 1][suspectedLength + 1];
 
        /**
         * To store length of the longest common substring
         */
        int commonLength = 0;
 
        /** To store the index of the cell which contains the 
         * maximum value. This cell's index helps in building 
         * up the longest common substring from right to left.
         */
         int row = 0;
         int column = 0;
        
         /**
          * Longest Common Substring.
          */
         String lcSubstring  = "";
        
        for (int i = 0; i <= originalLength; i++) {
            for (int j = 0; j <= suspectedLength; j++) {
                if (i == 0 || j == 0)
                    lcsSuffix[i][j] = 0;
 
                else if (original.charAt(i - 1) == suspected.charAt(j - 1)) {
                    lcsSuffix[i][j] = lcsSuffix[i - 1][j - 1] + 1;
                    if (commonLength < lcsSuffix[i][j]) {
                        commonLength = lcsSuffix[i][j];
                        row = i;
                        column = j;
                    }
                } else
                    lcsSuffix[i][j] = 0;
            }
        }
 
        /**
         * if true, then no common substring exists
         */
        if (commonLength == 0) {
            return lcSubstring;
        }
 
        /**
         *  traverse up diagonally form the (row, col) cell
         *  until lcsSuffix[row][col] != 0
         */
        while (lcsSuffix[row][column] != 0) {
        	lcSubstring  = original.charAt(row - 1) + lcSubstring;
            --commonLength;
            row--;
            column--;
        }
        return lcSubstring;
    }
}

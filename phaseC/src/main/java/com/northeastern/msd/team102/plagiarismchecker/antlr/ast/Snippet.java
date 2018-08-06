package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @author mrunal
 * The class is responsible to generate
 * similar chunk of code among two different python programs.
 * reference for Longest Common subsequence : https://www.geeksforgeeks.org/print-longest-common-substring/
 *
 */
public class Snippet {
	
	public static final Logger logger = Logger.getLogger(SendEmail.class.getName());

    /**
     *
     * @param file python file
     * @return ArrayList ProgramLines -> array of lines in the python file. 
     * @throws IOException
     */
	private List<String> fileToList(byte[] file) throws IOException {

        ArrayList<String>programLines = new ArrayList<>();
        String pyLine;
        InputStream fileReader = new ByteArrayInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fileReader));
        try {
            while ((pyLine = br.readLine()) != null) {

            	if ((pyLine.length()) != 0 && isNotComment(pyLine)) {
            		programLines.add(pyLine);
            	}
             }
            } catch (IOException e) {
            	logger.log(Level.ERROR, e.getMessage());
        } finally {
            br.close();
        }
        return programLines;
    }

    /**
     *
     * @param pyLine String to check.
     * @return true if String passed is not a comment.
     */   
    private Boolean isNotComment(String pyLine) {
        String comment = "'''";
        String oneLineComment = "#";
        return (!((pyLine.startsWith(comment)) || (pyLine.startsWith(oneLineComment))));

    }
    /**
     * 
     * @param file1 List of lines in given python file.
     * @param file2 List of lines in suspected python file.
     * @return ArrayList of File lines which are suspected to be plagiaried.
     * @throws IOException 
     */
	private List<Map<Integer, String>> findSimilarLines(byte[] file1, byte[] file2) throws IOException {
    	List<String> file1Strings = fileToList(file1);
    	List<String> file2Strings = fileToList(file2);
    	List<Map<Integer, String>> similarFiles = new ArrayList<>() ;
    	Map<Integer,String> similarLines1 = new HashMap<>();
    	Map<Integer,String> similarLines2 = new HashMap<>();
    	
    	if(file1 == null || file2 == null)
    		return similarFiles;
    	int lineNo1 = 1;
    	for(String file1Line : file1Strings) {
    		int maxSimilarLength = 0;
    		int lineNo2 = 1;
    		for (String file2Line : file2Strings) {
    			String snippet = LCS.lcsSubString(file1Line, file2Line);
    			if(snippet.length() > maxSimilarLength && 
    					(snippet.length() >= file1Line.length() * 0.5) && 
    						(snippet.length() >= file2Line.length() * 0.5)) {
    				if(!similarLines1.containsKey(lineNo1)){
    					similarLines1.put(lineNo1, file1Line);
    				}
    				similarLines2.put(lineNo2, file2Line);
    				maxSimilarLength = snippet.length();
    			}
    			lineNo2++;
    		}
    		lineNo1++;
    	}
    	
    	similarFiles.add(similarLines1);
    	similarFiles.add(similarLines2);
    	return similarFiles; 	
    }
    
	/**
	 * 
	 * @param similarLines HashMap  suspested plagiarised lines and their line numbers in File 
	 * @param file ByteArray    	Python file 
	 * @return String   A python file in form of Htmldiv string in order to highlight plagiarised lines in file red.
	 */
    private String generateHtmlDiv(Map<Integer, String> similarLines, byte[] file)  {
    	StringBuilder htmlStrings = new StringBuilder();
    	String[] lines = new String(file).split("\r?\n");

    	int lineNo = 1;
    	for(String line: lines) {
            if((line.length()) != 0 && isNotComment(line)){
                if(similarLines.containsKey(lineNo))
                    htmlStrings.append("<p class=\"red\">")
                            .append(line).append("</p>\n");
                else
                    htmlStrings.append("<p style=\"white-space\">")
                            .append(line).append("</p>\n");
                lineNo++;
            }
        }
		return htmlStrings.toString();
    }
    
    /**
     * 
     * @param file1  byteArray : suspected  python File1
     * @param file2  byteArray : suspected  python File1
     * @return Array of Strings with Report showing similar lines of code in both files.
     * @throws IOException
     */
    public String[] generateSnippets(byte[] file1, byte[] file2) throws IOException {
    	List<Map<Integer, String>> similarFiles = findSimilarLines(file1, file2);
    	Map<Integer, String> similarLines1 = similarFiles.get(0);
    	Map<Integer, String> similarLines2 = similarFiles.get(1);
    	
    	String htmlStrings1=generateHtmlDiv(similarLines1, file1);
    	String htmlStrings2=generateHtmlDiv(similarLines2, file2);
		
    	String[] detailedReport=new String[2];
    	detailedReport[0]=htmlStrings1;
    	detailedReport[1]=htmlStrings2;
    	
    	return detailedReport; 
    }   
}
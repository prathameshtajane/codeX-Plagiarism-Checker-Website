package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;


import static org.junit.Assert.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.junit.Test;

public class SnippetTest {

	/**
	 * Compares similar files.
	 * @throws IOException
	 */
	@Test
	public void CompareSimilarFiles() throws IOException {
		Snippet s = new Snippet();
		File file1 = new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/SamplePythonFile1.py");
		File file2 = new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/SamplePythonFile2.py");
        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);
        byte[] byteArray1 = new byte[(int)file1.length()];
        fis1.read(byteArray1);
        byte[] byteArray2 = new byte[(int)file2.length()];
        fis2.read(byteArray2);
		String[] detailedReport=s.generateSnippets(byteArray1, byteArray2);
		String file1Report="<p class=\"red\">def main():</p>\n" + 
				"<p class=\"red\">    print (\"Hello World!\")</p>\n" + 
				"<p class=\"red\">if __name__ == \"__main__\": main()</p>\n";
		
		String file2Report= "<p class=\"red\">def main():</p>\n" + 
				"<p class=\"red\">    print (\"Hello \")</p>\n" + 
				"<p style=\"white-space\">    print(\"World!\")</p>\n" + 
				"<p class=\"red\">if __name__ == \"__main__\": main()</p>\n";
		assertEquals(file1Report, detailedReport[0]);
		assertEquals(file2Report, detailedReport[1]);
		fis1.close();
		fis2.close();
	}
	
	/**
	 * Compares two different files.
	 * @throws IOException
	 */
	@Test
	public void CompareDifferentFiles() throws IOException {
		Snippet s = new Snippet();
		File file1 = new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/beautifulSoup.py");
		File file2 = new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/web_crawler.py");
        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);
        byte[] byteArray1 = new byte[(int)file1.length()];
        fis1.read(byteArray1);
        byte[] byteArray2 = new byte[(int)file2.length()];
        fis2.read(byteArray2);
		String[] detailedReport=s.generateSnippets(byteArray1, byteArray2);
		String file1Report="<p class=\"red\">import requests</p>\n" + 
				"<p class=\"red\">url = \"https://en.wikipedia.org/wiki/Tropical_cyclone\"</p>\n" + 
				"<p style=\"white-space\">code = requests.get(url)</p>\n" + 
				"<p style=\"white-space\">text = code.text</p>\n" + 
				"<p class=\"red\">soup = BeautifulSoup(text)</p>\n" + 
				"<p style=\"white-space\">for link in soup.findAll('a', {'class':'name'}):</p>\n" + 
				"<p class=\"red\">        href = 'https://en.wikipedia.org/wiki/Tropical_cyclone' + link.get('href')</p>\n" + 
				"<p style=\"white-space\">        fob = open('C:\\Python\\program.txt', 'w')</p>\n" + 
				"<p style=\"white-space\">        fob.write(href + '\\n')</p>\n";
		
		String file2Report= "<p style=\"white-space\">from bs4 import BeautifulSoup</p>\n" + 
				"<p class=\"red\">import requests</p>\n" + 
				"<p style=\"white-space\">import os,sys</p>\n" + 
				"<p style=\"white-space\">from os import path</p>\n" + 
				"<p class=\"red\">r  = requests.get(\"https://en.wikipedia.org/wiki/Tropical_cyclone\")</p>\n" + 
				"<p style=\"white-space\">data = r.text</p>\n" + 
				"<p class=\"red\">soup = BeautifulSoup(data, 'html.parser')</p>\n" + 
				"<p style=\"white-space\">count=0</p>\n" + 
				"<p style=\"white-space\">Count1=0</p>\n" + 
				"<p style=\"white-space\">list=[]</p>\n" + 
				"<p style=\"white-space\">Vlist=[]</p>\n" + 
				"<p style=\"white-space\">for i in range [0 1000]:</p>\n" + 
				"<p style=\"white-space\">    for link in soup.find_all('a'):</p>\n" + 
				"<p style=\"white-space\">        </p>\n" + 
				"<p style=\"white-space\">        </p>\n" + 
				"<p style=\"white-space\">            </p>\n" + 
				"<p style=\"white-space\">print(Count1)</p>\n" + 
				"<p style=\"white-space\">print(count)</p>\n" + 
				"<p style=\"white-space\">        </p>\n" + 
				"<p style=\"white-space\">        if \"#\" in href:</p>\n" + 
				"<p style=\"white-space\">            f1=open(\"C:\\Python\\program1.txt\",'a+')</p>\n" + 
				"<p style=\"white-space\">            f1.write(link[\"href\"]+'\\n')</p>\n" + 
				"<p style=\"white-space\">            f1.close()</p>\n" + 
				"<p style=\"white-space\">            Count1 +=1</p>\n" + 
				"<p style=\"white-space\">        if \":\" not in href:</p>\n" + 
				"<p style=\"white-space\">            f=open(\"C:\\Python\\program.txt\",'a+')</p>\n" + 
				"<p style=\"white-space\">            f.write(link[\"href\"]+'\\n')</p>\n" + 
				"<p style=\"white-space\">            f.close()'''</p>\n" + 
				"<p style=\"white-space\">            count += 1</p>\n";
		
		assertEquals(file1Report, detailedReport[0]);
		assertEquals(file2Report, detailedReport[1]);
		fis1.close();
		fis2.close();
	}
	
	
	/**
	 * Compares empty file.
	 * @throws IOException
	 */
	@Test
	public void CompareEmptyFile() throws IOException {
		Snippet s = new Snippet();
		File file1 = new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/empty.py");
		File file2 = new File("src/main/java/com/northeastern/msd/team102/plagiarismchecker/samplepython/SamplePythonFile1.py");
        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);
        byte[] byteArray1 = new byte[(int)file1.length()];
        fis1.read(byteArray1);
        byte[] byteArray2 = new byte[(int)file2.length()];
        fis2.read(byteArray2);
		String[] detailedReport=s.generateSnippets(byteArray1, byteArray2);
		String file1Report="";
		
		String file2Report= "<p style=\"white-space\">def main():</p>\n" + 
				"<p style=\"white-space\">    print (\"Hello World!\")</p>\n" + 
				"<p style=\"white-space\">if __name__ == \"__main__\": main()</p>\n";
		
		
		assertEquals(file1Report, detailedReport[0]);
		assertEquals(file2Report, detailedReport[1]);
		fis1.close();
		fis2.close();
	}
	
	
}

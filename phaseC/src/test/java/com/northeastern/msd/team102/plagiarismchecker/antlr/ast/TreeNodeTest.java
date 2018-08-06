package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Test;

public class TreeNodeTest {
	
	/**
	 * tests tree node equals method
	 * @throws IOException
	 */
	@Test
	public void testEquals() {
		TreeNode t1 = new TreeNode("", "", 0);
		TreeNode t2 = new TreeNode("", "", 0);	    	
		TreeNode t3 = new TreeNode(null, null, 0);
		TreeNode t4 = null;
		
	    assertEquals(true, t1.equals(t2));
	    assertEquals(false, t1.equals(t3));
	    assertEquals(false, t1.equals(t4));
	    assertEquals(false, t3.equals(t2));
	    assertEquals(false, t3.equals(t3));
	    assertEquals(false, t3.equals(t4));
	}
	
	/**
	 * tests tree node compareTo method
	 * @throws IOException
	 */
	@Test
	public void test_compareTo() {
		TreeNode t1 = new TreeNode("", "", 0);
		TreeNode t2 = new TreeNode("", "", 0);	    	
		TreeNode t3 = new TreeNode(null, null, 0);
		TreeNode t4 = null;
		
		assertEquals(0, t1.compareTo(t2));
	    assertEquals(-1, t1.compareTo(t3));
	    assertEquals(-1, t1.compareTo(t4));
	    assertEquals(-1, t3.compareTo(t2));
	    assertEquals(-1, t3.compareTo(t3));
	    assertEquals(-1, t3.compareTo(t4));
	}
	
	/**
	 * tests tree node hashCode method
	 * @throws IOException
	 */
	@Test
	public void test_hashCode() {
		TreeNode t1 = new TreeNode("", "", 0);
		TreeNode t2 = new TreeNode("", "", 0);	
		
		assertEquals(0, t1.hashCode());
	    assertEquals(0, t2.hashCode());
	}

}

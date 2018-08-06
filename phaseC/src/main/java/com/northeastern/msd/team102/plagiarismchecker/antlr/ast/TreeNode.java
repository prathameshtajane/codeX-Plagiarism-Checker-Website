package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

/**
 * @version 1.0
 * @description TreeNode type to store AST nodes
 */
public class TreeNode implements Comparable<TreeNode>{
	
	/**
	 * currentNodeName: name of current AST node
	 */
	private String currentNodeName;
	
	/**
	 *  parentNodeName: name of parent AST node
	 */
	private String parentNodeName;
	
	/**
	 * depth: depth of current node
	 */
	private int depth;
	
	/**
	 * @param currentNodeName: name of current AST node
	 * @param parentNodeName: name of parent AST node
	 * @param depth: depth of current node
	 */
	public TreeNode(String currentNodeName, String parentNodeName, int depth) {
		this.currentNodeName = currentNodeName; 
		this.parentNodeName = parentNodeName;
		this.depth = depth;
	}
	/**
	 * @param o : Object
	 * @return true if o has same name, parent name and depth as the current object; else false
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || (this.getClass() != o.getClass())) {
			return false;
		}
		TreeNode t = (TreeNode) o;
		return (this.currentNodeName!=null && t.currentNodeName!=null && this.parentNodeName!=null && t.parentNodeName!=null && 
				this.currentNodeName.equals(t.currentNodeName) && this.parentNodeName.equals(t.parentNodeName) && this.depth==t.depth);
	}

	/**
	 * @param t : TreeNode
	 * @return 0 if t and current object are same
	 */
	@Override
	public int compareTo(TreeNode t) {
		if ((t == null) || (this.getClass() != t.getClass())) {
			return -1;
		}
		return (this.currentNodeName!=null && t.currentNodeName!=null && this.parentNodeName!=null && t.parentNodeName!=null && 
				 this.parentNodeName.equals(t.parentNodeName) && this.depth==t.depth) ? this.currentNodeName.compareTo(t.currentNodeName) : -1;
	}
	
	/**
	 * @return unique code for the current object
	 */
	@Override
	  public int hashCode() {
	    return this.currentNodeName.length() + this.parentNodeName.length() + this.depth;
	  }

}

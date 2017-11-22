package fileVisitors.util;

import java.io.FileNotFoundException;

public class Node {
	 
	 public String word;
	 public Node left, right;
	 
	 
	 /**
	  * constructor to initialize data members
	  * @param word 
	  */
	public Node(String word)
	{
		MyLogger.writeMessage("Node class paramterized constructor is called", MyLogger.DebugLevel.CONSTRUCTOR);
		this.word = word;
		this.left = null;
		this.right = null;

	}
	
	/**
	 * getWord method used to get word in current node
	 * 
	 * @returns String
	 */
	public String getWord() {
		return word;
	}
	
	/**
	 * setWord method used to set word in current node
	 * @param word a Stirng need to set
	 * @returns String
	 */
	public void setWord(String word) {
		this.word = word;
	}

}

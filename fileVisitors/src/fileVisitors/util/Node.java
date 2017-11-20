package fileVisitors.util;

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
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}

}

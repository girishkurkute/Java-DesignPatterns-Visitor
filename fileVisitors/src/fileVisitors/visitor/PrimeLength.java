package fileVisitors.visitor;

import java.io.FileNotFoundException;

import fileVisitors.util.Helper;
import fileVisitors.util.MyLogger;
import fileVisitors.util.Node;
import fileVisitors.util.TreeBuilder;

public class PrimeLength implements VisitorI{

	private Helper helpObject; 
	
	/**
	 * constructor to initialize the Helper object
	 * @param helpObj 
	 */
	public PrimeLength(Helper helpObj) {
		// TODO Auto-generated constructor stub
		helpObject = helpObj;
	}

	@Override
	public void visit(TreeBuilder trbObj) throws Exception {
		// TODO Auto-generated method stub
		MyLogger.writeMessage("visit() gets called in PrimeLength : ", MyLogger.DebugLevel.VISITOR);
		getTreeValues(trbObj.root);
		//System.out.println("PRIME LENGTH-----");
		//print(trbObj.root);
	}

	/*public void print(Node root) {
		// TODO Auto-generated method stub
		
		if(root != null)
		{
			print(root.left);
			System.out.println(root.getWord());
			print(root.right);
		}
	
		
	}*/
	
	/**
	 * getTreeValues method used to traverse tree and get node values
	 * @param root a current node object
	 * 
	 * @returns nothing
	 */
	private void getTreeValues(Node root) {
		// TODO Auto-generated method stub
		String tempword = "";
		int length = -1;
		Boolean flag = false;
		if(root != null)
		{
			getTreeValues(root.left);
			tempword = root.getWord();
			length = tempword.length();
						
				flag = helpObject.checkPrimeNo(length);
			
			if(flag)
			{
				MyLogger.writeMessage("Word with Prime length : "+ tempword, MyLogger.DebugLevel.PRIME_LENGTH);
				tempword = root.getWord();
				tempword = tempword + "-PRIME";
				root.setWord(tempword); 
			}
			getTreeValues(root.right);
		}
	}

	

}

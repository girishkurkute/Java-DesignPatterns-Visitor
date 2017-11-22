package fileVisitors.visitor;

import java.util.ArrayList;

import fileVisitors.util.MyLogger;
import fileVisitors.util.Node;
import fileVisitors.util.Results;
import fileVisitors.util.TreeBuilder;

public class PrintTree implements VisitorI{

	public ArrayList<String> originalTreeDataValues = new ArrayList<String>();
	private String OutputFileName;
	
	/**
	 * constructor to initialize the output file name
	 * @param outputfile a name of output file
	 */
	public PrintTree(String outputfile) {
		// TODO Auto-generated constructor stub
		MyLogger.writeMessage("PrintTree class paramterized constructor is called", MyLogger.DebugLevel.CONSTRUCTOR);
		this.OutputFileName = outputfile;
	}

	@Override
	public void visit(TreeBuilder trbObj) throws Exception {
		// TODO Auto-generated method stub
		MyLogger.writeMessage("visit() gets called in PrintTree : ", MyLogger.DebugLevel.VISITOR);
		Results resltObj = new Results(OutputFileName);
		//System.out.println("Print Tree------");
		getTreeValues(trbObj.root);
		resltObj.writeToFile(originalTreeDataValues);
	}

	/**
	 * getTreeValues method used to traverse tree and get node values
	 * @param root a current node object
	 * 
	 * @returns nothing
	 */
	public void getTreeValues(Node root) {
		// TODO Auto-generated method stub
		
		if(root != null)
		{
			getTreeValues(root.left);
			//System.out.println(root.getWord());
			originalTreeDataValues.add(root.getWord());
			getTreeValues(root.right);
		}
	
		
	}
}

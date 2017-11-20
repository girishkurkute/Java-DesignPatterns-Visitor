package fileVisitors.visitor;

import java.util.ArrayList;

import fileVisitors.util.Node;
import fileVisitors.util.Results;
import fileVisitors.util.TreeBuilder;

public class PrintTree implements VisitorI{

	public ArrayList<String> originalTreeDataValues = new ArrayList<String>();
	private String OutputFileName;
	public PrintTree(String outputfile) {
		// TODO Auto-generated constructor stub
		this.OutputFileName = outputfile;
	}

	@Override
	public void visit(TreeBuilder trbObj) throws Exception {
		// TODO Auto-generated method stub
		Results resltObj = new Results(OutputFileName);
		System.out.println("Print Tree------");
		getTreeValues(trbObj.root);
		resltObj.writeToFile(originalTreeDataValues);
	}

	public void getTreeValues(Node root) {
		// TODO Auto-generated method stub
		
		if(root != null)
		{
			getTreeValues(root.left);
			System.out.println(root.getWord());
			originalTreeDataValues.add(root.getWord());
			getTreeValues(root.right);
		}
	
		
	}
}

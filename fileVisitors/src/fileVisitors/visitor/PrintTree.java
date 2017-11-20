package fileVisitors.visitor;

import fileVisitors.util.Node;
import fileVisitors.util.TreeBuilder;

public class PrintTree implements VisitorI{

	@Override
	public void visit(TreeBuilder trbObj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Print Tree------");
		print(trbObj.root);
	}

	public void print(Node root) {
		// TODO Auto-generated method stub
		
		if(root != null)
		{
			print(root.left);
			System.out.println(root.getWord());
			print(root.right);
		}
	
		
	}
}

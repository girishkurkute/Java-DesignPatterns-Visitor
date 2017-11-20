package fileVisitors.visitor;

import fileVisitors.util.MyLogger;
import fileVisitors.util.Node;
import fileVisitors.util.TreeBuilder;

public class PrimeLength implements VisitorI{

	@Override
	public void visit(TreeBuilder trbObj) throws Exception {
		// TODO Auto-generated method stub
		MyLogger.writeMessage("visit() gets called in PrimeLength : ", MyLogger.DebugLevel.VISITOR);
		getTreeValues(trbObj.root);
		System.out.println("PRIME LENGTH-----");
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
						
				flag = checkPrimeNo(length);
			
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

	private Boolean checkPrimeNo(int length) {
		// TODO Auto-generated method stub
		int num = length ;
		int half = length/2;
		Boolean flag = true;
		
		if(num ==0 || num ==1)
		{
			flag =true;
		}
		else
		{
			for(int k=2;k<=half;k++)
			{
				if(num%k==0)
				{
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

}

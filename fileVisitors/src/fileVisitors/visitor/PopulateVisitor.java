package fileVisitors.visitor;

import fileVisitors.util.Node;
import fileVisitors.util.FileProcessor;
import fileVisitors.util.TreeBuilder;

public class PopulateVisitor implements VisitorI{

	private String InputFileName;
	
	public PopulateVisitor(String inputfile) {
		// TODO Auto-generated constructor stub
		this.InputFileName = inputfile;
	}

	@Override
	public void visit(TreeBuilder trb) throws Exception {
		// TODO Auto-generated method stub
		FileProcessor fprObj = new FileProcessor(InputFileName);
		String currLine = "";
		String temp[];
		
		while((currLine = fprObj.readLine())!= null)
		{
			currLine = currLine.trim();
			temp = currLine.split("\\s+");
			for(int i = 0; i < temp.length; i++)
			{
				if(null != temp[i] && temp[i].compareTo(" ") != 0 && temp[i].compareTo("") != 0)
				{
					trb.insert(temp[i]);
				}
			}
			
			
		}
		
	}

}

package fileVisitors.driver;

import fileVisitors.util.TreeBuilder;
import fileVisitors.visitor.PopulateVisitor;
import fileVisitors.visitor.VisitorI;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String inputfile = "";
		String outputfile = "";
		int debugValue = -1;
		if(args.length !=3)
		{			
			throw new RuntimeException("Please provide 3 arguments");
		}
		else
		{
			inputfile = args[0];
			outputfile = args[1];
			debugValue = Integer.parseInt(args[2]);
			
			TreeBuilder trObj = new TreeBuilder();
			//VisitorI visitor = new FileVisitorImpl();
			VisitorI pVistObj = new PopulateVisitor(inputfile);
			trObj.accept(pVistObj);
		}
		
	}

}

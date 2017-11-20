package fileVisitors.driver;

import fileVisitors.util.Results;
import fileVisitors.util.TreeBuilder;
import fileVisitors.visitor.PalindromeHighlight;
import fileVisitors.visitor.PopulateVisitor;
import fileVisitors.visitor.PrimeLength;
import fileVisitors.visitor.PrintTree;
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
			VisitorI palinObj = new PalindromeHighlight();
			VisitorI primeObj = new PrimeLength();
			VisitorI prnTreeObj = new PrintTree(outputfile);
			trObj.accept(pVistObj);
			trObj.accept(palinObj);
			trObj.accept(primeObj);
			trObj.accept(prnTreeObj);

		}
		
	}

}

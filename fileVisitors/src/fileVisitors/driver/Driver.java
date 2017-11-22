package fileVisitors.driver;

import java.io.FileNotFoundException;
import java.io.IOException;

import fileVisitors.util.Helper;
import fileVisitors.util.MyLogger;
import fileVisitors.util.Results;
import fileVisitors.util.TreeBuilder;
import fileVisitors.visitor.PalindromeHighlight;
import fileVisitors.visitor.PopulateVisitor;
import fileVisitors.visitor.PrimeLength;
import fileVisitors.visitor.PrintTree;
import fileVisitors.visitor.VisitorI;

public class Driver {

	/**
	 * Execution of program starts with Main.Input  file reading and call to visitor is done in this function 
	 * @param args
	 * @throws Exception
	 * returns nothing
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String inputfile = "";
		String outputfile = "";
		int debug_Value = -1;
		
		try
		{
			if(args.length !=3)
			{			
				throw new RuntimeException("Please provide 3 arguments");
			}
			else
			{
				inputfile = args[0];
				outputfile = args[1];
				debug_Value = Integer.parseInt(args[2]);
			}
			
				if(!(debug_Value >=0 && debug_Value <=4))
				{
					System.err.println("DEBUG_VALUE must be in range 0 to 4");
					System.exit(1);
				}
				
				MyLogger.setDebugValue(debug_Value);
				TreeBuilder trObj = new TreeBuilder();
				Helper helpObj = new Helper();
				//VisitorI visitor = new FileVisitorImpl();
				VisitorI pVistObj = new PopulateVisitor(inputfile);
				VisitorI palinObj = new PalindromeHighlight(helpObj);
				VisitorI primeObj = new PrimeLength(helpObj);
				VisitorI prnTreeObj = new PrintTree(outputfile);
				trObj.accept(pVistObj);
				trObj.accept(palinObj);
				trObj.accept(primeObj);
				trObj.accept(prnTreeObj);

			
		}
		catch(FileNotFoundException fileNotFndexp)
		{
			System.err.println("File not found: "+fileNotFndexp);
			System.exit(1);
		}
		catch(IOException ioexp)
		{
			System.err.println("Error in I/O: "+ioexp);
			System.exit(1);
		}
		catch(IndexOutOfBoundsException indexOutExp)
		{
			System.err.println("Input file is empty: "+indexOutExp);
			System.exit(1);
		}
		catch(NullPointerException nullPtrExp)
		{
			System.err.println("Input file is empty: "+nullPtrExp);
			System.exit(1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
	}

}

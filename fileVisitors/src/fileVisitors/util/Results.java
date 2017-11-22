package fileVisitors.util;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//import airportSecurityState.util.MyLogger;

public class Results {
	private String outputFileName;
	//public ArrayList<String> operationIDValues = new ArrayList<String>();
	
	/**
	 * constructor to initialize the output file name
	 * @param outputfile a name of output file
	 */
	public Results(String outputfile) {
		// TODO Auto-generated constructor stub
		MyLogger.writeMessage("Results class paramterized constructor is called", MyLogger.DebugLevel.CONSTRUCTOR);
		this.outputFileName=outputfile;
		
	}
	
	/**
	 * writeToFile method used to write a result into output file
	 * @param arrList a datastructure which stores all the tress values
	 * @throws FileNotFoundException
	 * @returns nothing
	 */
	public void writeToFile(ArrayList<String> arrList) throws IOException {
		// TODO Auto-generated method stub
		FileWriter FWrt = null;
		try
		{
			FWrt = new FileWriter(this.outputFileName);
		}
		catch(FileNotFoundException e)
		{
			throw new RuntimeException(e);
		}
		
		for(String currentLine : arrList)
		{
		//	MyLogger.writeMessage("Results from data structure added into Output file", MyLogger.DebugLevel.IN_RESULTS);
			FWrt.write(currentLine);
			FWrt.write("\r\n");
		}
		FWrt.close();
	}

}

To clean:
ant -buildfile src/build.xml clean

To compile: 
ant -buildfile src/build.xml all

To run
ant -buildfile src/build.xml run -Darg0=/home/girish_kurkute_assign_5/input.txt -Darg1=/home/girish_kurkute_assign_5/output.txt -Darg2=0


Debugger Level Desciptions
    * DEBUG_VALUE=4 [Print to stdout everytime a constructor is called]
    * DEBUG_VALUE=3 [Print to stdout everytime the accept() is called] 
    * DEBUG_VALUE=2 [Print to stdout everytime an visit() is called]
    * DEBUG_VALUE=1 [Print to stdout everytime a palidrome checking is performed]
    * DEBUG_VALUE=0 [No output should be printed from the application to stdout]
    
    
Information    
    * It accepts only 3 arguments: input file name, output file name, int debug level[0-4]
    * Input and output file paths should be valid and accessible. Throws exception otherwise.
    * If the output file specified does not exist, then it creates the file 
    "Output.txt" and writes theh final output into it.
    * This project considers case-sensitivity between the strings being compared.

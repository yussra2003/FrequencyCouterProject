/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: array example using static method
 *
 * Description: an intro example to show how to perform some basic
 *              array operations using static methods where possible
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;
 import java.util.Random;

public class Question1 {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerForWindow;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
        int actualLength = 0;       // actual length of array
	    
// what's list for?
        int[] list = new int[100];

// len should/could be defined as a constnt with a value of 1000 since it's len that represents the length of the arry
        int len = 0;
	    
// instead of new int[1000]    new int[len]
        int[] randomNumbers = new int[1000];
        
    	
    // ***** create objects *******
    
        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
        // todo: add a try catch to the creation of the buffered reader
	    
// for q1 you don't need a buffered reader since you're creating a list of random numbers
        BufferedReader fin = new BufferedReader(new FileReader("FrequencyNumber.txt"));
	    
// cold change the name of the output file to something like "frequencyData.txt"
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        printBanner();      // call printBanner method
	    
// don't print anythig but the random numbers to the output file
        fileBanner(fout);       // call fileBanner method
        bannerForWindow = windowBanner();
	    	
    // ************************ get input **********************

        //actualLength = loadList(list, delim);
       // actualLength = loadList(list, fin);

    // ************************ processing ***************************
        


    // ************************ print output ****************************
    
// this call creates your list of 1000 random numbers        
        loadRandomList(len, list, randomNumbers);
	    
// now print the 1000 random numbers to the ouptut file, you'll need to create a new method to do this (or use an existing method if you already have one)	    
       
    // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.println("end of proecessing");
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
    
//****************** static methods ***************
 
    /***********************************************************
    *   Purpose:    load an array with random numbers
    *   Interface:  int actualLength --> len: actual length of list
    *               list[] --> pointer to base address of array
    *   Returns:    nothing
    * **************************************************************/
    public static void loadRandomList(int len, int[] list, int [] randomNumbers){
        
       Random rand = new Random();
       
    for (int i = 0; i < randomNumbers.length; i++) {
    int n = rand.nextInt(50);
        randomNumbers[i] = n;
        System.out.println(n);
}
            
    } // end generic array processing method
   
 /***********************************************************
    *   Purpose: Create a banner string that can be used to 
    *           print the banner to a message dialog or the console
    *           window
    *   Interface:  no parameters
    *   Returns:    no return
    * **************************************************************/
    public static String windowBanner(){
        String bannerOut = "";
        
    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		your name here\n";
    	bannerOut += "Class:		CS20S\n";
    	bannerOut += "Assignment:	Ax Qy\n";
    	bannerOut += "*******************************************\n\n"; 
        
        return bannerOut;
    } // end bannerOut

    /***********************************************************
    *   Purpose: print a banner to the console window
    *   Interface:  no parameters
    *   Returns:    no return
    * **************************************************************/    
    public static void printBanner(){
    	System.out.println("*******************************************");
    	System.out.println("Name:		sveinson");
    	System.out.println("Class:		CS20S");
    	System.out.println("Assignment:	Ax Qy");
    	System.out.println("*******************************************");        
    } // end print banner
    
 
    /***********************************************************
    *   Purpose: prints a banner to the output file
    *   Interface:  print writer fout
    *   Returns:    no return
    * **************************************************************/
    public static void fileBanner(PrintWriter fout){
     	fout.println("*******************************************");
    	fout.println("Name:		sveinson");
    	fout.println("Class:		CS20S");
    	fout.println("Assignment:	Ax Qy");
    	fout.println("*******************************************");       
    } // end bannerOut

}  // end class

/*
	Name: Cameron Kinney
	Class ID:RD4
	Assignment number: 1
	
	
	Description: Testing if given string is a Palindrome, using Junits to test this. 
	
	

*/
package assign1;
public class Palindrome {

	
	//Forward Declarations
    String testString;
	
public Palindrome(String testString){
		
		//Initializes testString
		this.testString = testString;		
		
}


//Work done in this method
public boolean isPalindrome(){
		
	//Initial boolean condition
	boolean pali=false;
	
	//Holds testString
	int Str = testString.length();
	
	//used for first Character of string
	int first = 0;
	
	//Used for last Character of string
	int last = Str - 1;
	
	//last character is > than first
	while(last != first)
	{
		
		//if first character of String is NOT last character...
		if (testString.charAt(last) == testString.charAt(first))
		{
			pali =true; //Not True
			//Increment first character
			first++;
			
			//Decrement last character
			last--;
		}
		else{
		pali = false; //True
		}
			
	}
	
	return true;
	
		}
}

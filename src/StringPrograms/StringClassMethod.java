/*The java.lang.String class provides a lot of built-in methods 
 * that are used to manipulate string in Java. 
 * By the help of these methods, we can perform operations on String objects such as 
 * trimming, concatenating, converting, comparing, replacing strings etc.
 */

package StringPrograms;

public class StringClassMethod {

	public static void main(String ar[]) {
		String s = " Sachin Tendulker ";
		String s1 = "Mumbai";
		
				
		
		//Java String toUpperCase() and toLowerCase() method
		System.out.println(s.toUpperCase());  
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println("________________________________");
		
		//trim() method eliminates white spaces before and after the String
		System.out.println(s.trim());
		System.out.println("________________________________");

		
		//startsWith() checks whether the String starts with the letters passed as arguments 
		//endsWith() method checks whether the String ends with the letters passed as arguments
		System.out.println(s1.startsWith("Mu"));//true    
		System.out.println(s1.endsWith("i"));//true 
	    System.out.println("________________________________");
	    
	    //charAt() method returns a character at specified index
	    System.out.println(s1.charAt(0)); 
	    System.out.println(s1.charAt(3));
	    System.out.println("________________________________");

	    
	    //length() method returns length of the specified String
	    System.out.println(s1.length());
	    System.out.println("________________________________");

	    
	    
	    // intern() Method:
	    //A pool of strings, initially empty, is maintained privately by the class String.
	    //When the intern method is invoked, if the pool already contains a String equal 
	    //to this String object as determined by the equals(Object) method, 
	    //then the String from the pool is returned. Otherwise, this String object is added 
	    //to the pool and a reference to this String object is returned.
	    String s2=new String("Sachin");    
	    String s3=s.intern();    
	    System.out.println(s3);
	    System.out.println("________________________________");
	    
	    
	    //valueOf() method coverts given type such as 
	    //int, long, float, double, boolean, char and char array into String.
	    int a=10;    
	    String s4=String.valueOf(a);    
	    System.out.println(s4+10);
	    System.out.println("________________________________");

	    
	    
	    //replace() method replaces all occurrence of first sequence of character with second sequence of character.
	    String s5="Java is a programming language. Java is a platform. Java is an Island";      
	    String replaceString=s5.replace("Java","Python");//replaces all occurrences of "Java" to "Python"      
	    System.out.println(replaceString); 
	    System.out.println("________________________________");
	    
	    
	    







		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
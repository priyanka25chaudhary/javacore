/*StringBuilder class is used to create mutable (modifiable) String. 
 * The Java StringBuilder class is same as StringBuffer class except that 
 * it is non-synchronized.
 */

package StringPrograms;

class StringBuilderExample {
	public static void main(String args[]) {
		StringBuilder s = new StringBuilder("Hello");

        //append() method concatenates the given argument with this String
		s.append("Java");
		System.out.println(s);
		System.out.println("___________________________________");
		
		
		//insert() method inserts the given string with this string at the given position
		s.insert(1,"Java");//now original string is changed  
		System.out.println(s);
		System.out.println("___________________________________");
		
		
		//replace() method replaces the given string from the specified beginIndex and endIndex
		s.replace(1,3,"Java");  
		System.out.println(s);
		System.out.println("___________________________________");
		
		
		//delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex
		s.delete(1,3);  
		System.out.println(s);
		System.out.println("___________________________________");
		
		
		
		//reverse() method of StringBuilder class reverses the current string
		s.reverse();  
		System.out.println(s);
		System.out.println("___________________________________");
		
		
		//capacity() method of StringBuilder class returns the current capacity of the Builder. 
		//The default capacity of the Builder is 16. 
		//If the number of character increases from its current capacity, 
		//it increases the capacity by (oldcapacity*2)+2
		System.out.println(s.capacity());//default 16    
		s.append("Hello");    
		System.out.println(s.capacity());//now 16    
		s.append("Java is my favourite language");    
		System.out.println(s.capacity());
		System.out.println("___________________________________");

		
		
		//The ensureCapacity() method of StringBuilder class ensures that 
		//the given capacity is the minimum to the current capacity. 
		//If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2
		System.out.println(s.capacity());//default 16    
		s.append("Hello");    
		System.out.println(s.capacity());//now 16    
		s.append("Java is my favourite language");    
		System.out.println(s.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
		s.ensureCapacity(10);//now no change    
		System.out.println(s.capacity());//now 34    
		s.ensureCapacity(50);//now (34*2)+2    
		System.out.println(s.capacity());//now 70  
		System.out.println("___________________________________");
		
		
		


		




		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

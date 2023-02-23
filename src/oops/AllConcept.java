package oops;

public class AllConcept {

	public static void main(String[] args) {
		Person p1 = new Person();   //object--p1-- is created and from --New-- we can create new objects
		p1.age = 24;          // properties of object p1 , --.-- can explain all the properties of p1
		p1.Name = "Priya";   // properties of object p1
		
		Person p2 = new Person();    //object--p2-- is created and from --New-- we can create new objects
		p2.age = 26;                 // properties of object p1
		p2.Name = "Riya";            // properties of object p1
		
		System.out.println(p1.age + " " + p1.Name);   // to access and print the variables 
		System.out.println(p2.age + " " + p2.Name);   // to access and print the variables 

// CREATED CLASS AND OBJECT ABOVE   
		
		
		p1.eat();   // to access the behavior, by using . we can access the behavior and properties
		p2.walk();  // to access the behavior and it is calling 1st behavior
		p1.walk(100); // to access the behavior and it is calling 3rd behavior
		
		Developer d1 = new Developer(24, "Priya"); // CREATING OBJECT OF THE CHILD CLASS DEVELOPER
		d1.walk();   // it access the behavior from the parent class and this walk function comes under -- Runtime Polymorphism 
                     //because this object does not know weather person walk will be called or developer walk will be called 
				
	}

}

//INHERITANCE: 	
class Developer extends Person { // creating child class (developer), --extend--keyword shows that child class(developer)
                                                 // will show the properties of parent class (person)	
	public Developer(int age, String name) {
		super();   // --super-- keyword used to call parent class
	}
	
}
	



class Person {        // created a class
	String Name;     // properties of class
	int age;
	
	//NOW, CREATED METHODS OR BEHAVIORS BELOW

		void walk() {   //created behavior
			System.out.println(Name+ " is walking");
		}
		void eat() {     //created behavior
			System.out.println(Name+ " is eating");
		}
		void walk(int steps) {   //created behavior and (int steps) is an argument
			System.out.println(Name+ " walked " + steps +" steps ");
		}
		
		void dowork() {   //created behavior 
			System.out.println(Name+ "is walking");
		}


}

//COMPILE TIME POLYMORPHISM :
//Above there are two same methods named walked , p2.walk(); is accessing 1st behavior 
//p1.walk(100); is accessing 3rd behavior, so its having one name and many forms 
//-- this is called compile time Polymorphism because its checking during the compilation 


//CONSTRUCTORS : used to create object 
//special kinds of function
//default constructor is already provided by java and it will not take any argument 
//they are not function
//as above-- People() is calling default constructor and it will not take any argument


// ENCAPSULATION : 
//used for data hiding or data protection 
//binding data and operation together in an entity 
// if we have created a class and its having methods inside it and this method is having properties inside it 
//and it all perform together --then its called encapsulation--

//ABSTRACTION: 
//in this , data is hidden to reduce complexity
//its having 2 keyword: Abstract keyword and Interface keyword 




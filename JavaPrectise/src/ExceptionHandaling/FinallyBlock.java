package ExceptionHandaling;
//Java finally block is a block used to execute important code such as closing the connection, etc.

class FinallyBlock {
	public static void main(String args[]) {
		try {
//below code do not throw any exception  
			int data = 25 / 5;
			System.out.println(data);
		}
//catch won't be executed  
		catch (NullPointerException e) {
			System.out.println(e);
		}

		finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of phe code");
	}
}

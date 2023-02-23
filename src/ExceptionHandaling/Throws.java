package ExceptionHandaling;
/*throws keyword is used to declare an exception. 
 * It gives an information to the programmer that there may occur an exception. 
 * So, it is better for the programmer to provide the exception handling code 
 * so that the normal flow of the program can be maintained.
 */

import java.io.IOException;

class Throws {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Throws obj = new Throws();
		obj.p();
		System.out.println("normal flow...");
	}
}

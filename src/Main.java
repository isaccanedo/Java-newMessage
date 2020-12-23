
public class Main {

	/*
	 * What is the output of this code?
	 * 
	 * 1 - world!world!
	 * 2 - A runtime exception is thrown ==> correct
	 * 3 - The code does not compile
	 * 4 - world!!world
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String message = "Hello world!c";
		String newMessage = message.substring(6, 12) + message.substring(12, 6);
		
		System.out.println(newMessage);		
		
	}

}

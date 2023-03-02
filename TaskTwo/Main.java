import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		//String to hold welcome message
		String intro = "Please type your name";
		System.out.println(intro);
		//Creating scanner to take input from user
		Scanner scan = new Scanner(System.in);
		//Variable holds input from user
		String name = scan.nextLine();
		//Print welcome greeting including name of user
		System.out.println("Greetings " + name + " nice to have you onboard");
		System.out.println("Please type your age");
		//Variable to hold age input
		int age = scan.nextInt();
		//Print age of user
		System.out.println("Age: " + age);
		int retireAge = 67;
		int retireIn = retireAge - age;
		System.out.println("You may retire in: " + retireIn + " years");
	}
}
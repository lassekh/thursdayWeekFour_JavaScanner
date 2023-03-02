import java.util.ArrayList;
import java.util.Scanner;
class GameMenu {
	private ArrayList<String> actions = new ArrayList<>();
	//Constructor
	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}
	//Method to print GameMenu objects
	public void displayMenu(){
		for(String s : actions){
			System.out.println(s);
		}
	}
	//Method to take user action
	public String getAction(){
		System.out.println("Type a number to choose an action");
		displayMenu();
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		return choice;
	}
}
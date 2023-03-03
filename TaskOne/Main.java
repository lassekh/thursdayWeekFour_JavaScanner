import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
class Main {
	public static void main(String[] args) {
		//Creating a team
		System.out.println("This is my team");
		Team myTeam = new Team("Team Awesome");
		//Print team name
		myTeam.setRank(2);
		System.out.println(myTeam.toString());

		//Creating five teams manually
		System.out.println("Five teams created with new instances");
		Team teamOne = new Team("Team Star");
		Team teamTwo = new Team("Team Moon");
		Team teamThree = new Team("Team Planet");
		Team teamFour = new Team("Team Sun");
		Team teamFive = new Team("Team Sky");
		//Setting rank for teams
		teamOne.setRank(1);
		teamTwo.setRank(2);
		teamThree.setRank(3);
		teamFour.setRank(4);
		teamFive.setRank(5);
		//Printing teams and their rank
		System.out.println(teamOne); //I removed toString. When using println() on object, it automatically calls toString()
		System.out.println(teamTwo);
		System.out.println(teamThree);
		System.out.println(teamFour);
		System.out.println(teamFive);

		//Creating five teams with an array
		System.out.println("Five teams created with array");
		Team[] teams = {new Team("Team Turtle"), new Team("Team Blue"), new Team("Team Banana"), new Team("Team Something")};
		//Printing teams and their rank
		for(Team t : teams){
			Random random = new Random();
        	int randomRank = random.nextInt(5) + 1;
			t.setRank(randomRank);
			System.out.println(t);
		}

		//Create five teams with an ArrayList
		System.out.println("Five teams created with ArrayList");
		ArrayList<Team> teamList = new ArrayList<>();
		teamList.add(new Team("Team Red"));
		teamList.add(new Team("Team Green"));
		teamList.add(new Team("Team Blue"));
		teamList.add(new Team("Team Orange"));
		teamList.add(new Team("Team Yellow"));
		//Printing teams and their rank
		for(Team t : teamList){
			Random random = new Random();
        	int randomRank = random.nextInt(5) + 1;
			t.setRank(randomRank);
			System.out.println(t);
		}
	}
}
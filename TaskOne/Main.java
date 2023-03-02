import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
class Main {
	public static void main(String[] args) {
		//Creating a team
		Team myTeam = new Team("Team Awesome");
		//Print team name
		myTeam.setRank(2);
		System.out.println(myTeam.toString());

		//Creating five teams with an array
		System.out.println("Five teams created");
		Team[] teams = {new Team("Team Turtle"), new Team("Team Blue"), new Team("Team Banana"), new Team("Team Something")};
		for(Team t : teams){
			Random random = new Random();
        	int randomRank = random.nextInt(5) + 1;
			t.setRank(randomRank);
			System.out.println(t.toString());
		}

		//Create five teams with an ArrayList
		System.out.println("Five teams created with ArrayList");
		ArrayList<Team> teamList = new ArrayList<>();
		teamList.add(new Team("Team Red"));
		teamList.add(new Team("Team Green"));
		teamList.add(new Team("Team Blue"));
		teamList.add(new Team("Team Orange"));
		teamList.add(new Team("Team Yellow"));
		for(Team t : teamList){
			Random random = new Random();
        	int randomRank = random.nextInt(5) + 1;
			t.setRank(randomRank);
			System.out.println(t.toString());
		}
	}
}
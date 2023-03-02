class Main {
	public static void main(String[] args) {
		//Creating a team
		Team myTeam = new Team("Team Awesome");
		//Print team name
		myTeam.setRank(2);
		System.out.println(myTeam.toString());

		Team teamOne = new Team("Team Turtle");
		Team teamTwo = new Team("Team Blue");
		Team teamThree = new Team("Team Banana");
		Team teamFour = new Team("Team Something");

		System.out.println(teamOne.toString());
		System.out.println(teamTwo.toString());
		System.out.println(teamThree.toString());
		System.out.println(teamFour.toString());

		/*ArrayList<Team> teams = new ArrayList<>();
		teams.add(teamOne);
		teams.add(teamTwo)

		for(Team t : list){

		}*/
	}
}
import java.util.ArrayList;
class Team {
	private String teamName;
	private int teamRank;
	private ArrayList<String> teamMembers = new ArrayList<>();
	//Constructor
	public Team(String teamName) {
		this.teamName = teamName;
	}
	//Method to set team rank
	public void setRank(int rank) {
		teamRank = rank;
	}
	//toString printing teamName and teamRank for a given instance of the class
	@Override
	public String toString(){
		String s = "Hold: " + teamName + ": " + teamRank;
		return s;
	}
}
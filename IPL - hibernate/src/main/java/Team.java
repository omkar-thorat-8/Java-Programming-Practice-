import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="team")
public class Team {

	public static Object session;
	@Id
	@Column(name ="teamid")
	private int teamId;
	@Column(name ="teamname")
	private String teamName;
	@OneToMany(targetEntity = Player.class,cascade = CascadeType.ALL )
	private Set<Player> allPlayers;
	
	public Team() {
		super();
	}

	public Team(int teamId, String teamName, Set<Player> allPlayers) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.allPlayers = allPlayers;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Set<Player> getAllPlayers() {
		return allPlayers;
	}

	public void setAllPlayers(Set<Player> allPlayers) {
		this.allPlayers = allPlayers;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", allPlayers=" + allPlayers + "]";
	}

	
	
	
}

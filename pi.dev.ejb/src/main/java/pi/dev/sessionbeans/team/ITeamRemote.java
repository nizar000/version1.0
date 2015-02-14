package pi.dev.sessionbeans.team;

import java.util.List;

import javax.ejb.Remote;

import pi.dev.entities.Team;
@Remote

public interface ITeamRemote {
			public void addTeam (Team e);
			public void deleteTeam (Team e);
			public void updateTeam (Team e);
			public Team findTeam (int i);
			public List<Team> findAllTeams();
}

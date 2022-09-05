package ir.maktab.sports.data.sortHelper;

import ir.maktab.sports.data.team.Team;
import ir.maktab.sports.data.team.VolleyballTeam;

import java.util.Comparator;

public class sortByWonSets implements Comparator<Team> {
    @Override
    public int compare(Team team1, Team team2) {
        VolleyballTeam vt1 = (VolleyballTeam) team1;
        VolleyballTeam vt2 = (VolleyballTeam) team1;
        int [] sets1 = vt1.getSets();
        int [] sets2 = vt2.getSets();
        return sets2[0] - sets1[0];
    }
}

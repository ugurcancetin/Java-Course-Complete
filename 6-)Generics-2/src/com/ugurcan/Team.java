package com.ugurcan;

import java.util.ArrayList;

/**
 * Created by dev on 17/10/2015.
 */
public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println( player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println( player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
        } else if(ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    public ArrayList<T> getTeamMembers(){
    	int length;
		for( int i = 0; i < members.size(); i++ )
		{
			 System.out.println( ( (Player) members.get( i ) ).getName() );
		}
    	return members;
    }
}

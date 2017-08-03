package com.ugurcan;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> Galatasaray= new Team("Galatasaray");
        Team<BaseballPlayer> SariyerBeyzbol = new Team("SariyerBeyzbol");
        Team<SoccerPlayer>  LA_Galaxy = new Team("LA Galaxy");
        Galatasaray.addPlayer(joe);
        SariyerBeyzbol.addPlayer(pat);
        LA_Galaxy.addPlayer(beckham);
        LA_Galaxy.addPlayer(beckham);
        
        //System.out.println( adelaideCrows.getTeamMembers() );
        System.out.println( Galatasaray.getTeamMembers().size() + " kisilik takim" );
        System.out.println(Galatasaray.numPlayers());
    }
}
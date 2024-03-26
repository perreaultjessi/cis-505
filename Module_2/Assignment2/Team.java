/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/package Assignment2;

public class Team {
    private String teamName; //Team name input
    private String[] players; //Players assigned to a team
    private int playerCount; //Number of players on a team

    //Constructor to create a team
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new String[20]; //default size of players set to 20
        this.playerCount = 0; //default state no players
    }

    //getMethod to add players
    public void addPlayer(String playerName) {
        if (playerCount < players.length) { //checking for space
            players[playerCount] = playerName; //adding new player
            playerCount++; //player count
        } else {
            System.out.println("Cannot add more players. 20 player limit.");
        }
    }

    //getMethod to return players
    public String[] getPlayers() {
        return players;
    }

    //getMethod to return player count
    public int getPlayerCount() {
        return playerCount;
    }

    //getMethod to return team name
    public String getTeamName() {
        return teamName;
    }
}

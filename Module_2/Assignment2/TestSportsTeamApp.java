/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment2;

import java.util.Scanner;

public class TestSportsTeamApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        //Welcome message
        System.out.println("Welcome to the Sports Team App");

        while (continueInput) {
            //User input for team name
            System.out.print("Enter the team name: ");
            String teamName = scanner.nextLine();

            //Creation of new team object
            Team team = new Team(teamName);

            //User input for player names
            System.out.print("Enter player names separated by commas and no spaces: ");
            String playerNames = scanner.nextLine();
            String[] players = playerNames.split(",");

            //Add players to the team
            for (String player : players) {
                team.addPlayer(player);
            }

            //Display team summary message
            System.out.println("--Team Summary--");

            //Display message for number of players
            System.out.println("Number of players in team " + team.getTeamName() + ": " + team.getPlayerCount());
            //Display message for player names
            System.out.print("Players on team " + team.getTeamName() + ": ");
            for (int i = 0; i < team.getPlayerCount(); i++) {
                System.out.print(team.getPlayers()[i]); //display player names
                if (i < team.getPlayerCount() - 1) {
                    System.out.print(", "); //adds comma except for last player name
                }
            }
            System.out.println(); //next line

            //Display message to either continur running program or end
            System.out.print("Do you want to continue? (y/n): ");
            String choice = scanner.nextLine();
            continueInput = choice.equalsIgnoreCase("yes");
        }
        scanner.close(); //close scanner

        //Display end of line message when the user enters n
        System.out.println("End of line...");
    }
}

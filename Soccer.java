package practice;

import java.util.Scanner;

public class Soccer {
    public void soccerRes() {
        Scanner input = new Scanner(System.in);


        System.out.print("Look up Team 1: ");
        String team1 = input.nextLine();
        System.out.print("Look up Team 2: ");
        String team2 = input.nextLine();
        System.out.print("Country: ");
        String country = input.nextLine();
        System.out.print("Time: ");
        String time = input.nextLine();

        System.out.println();
        System.out.println(team1.toUpperCase());
        System.out.print("How many games did " + team1 + " win in the previous 10 matches? (excl H2H)  ");
        int team1Win = Integer.parseInt(input.nextLine());
        System.out.print("How many games did " + team1 + " draw in the previous 10 matches? (excl H2H) ");
        int team1Draw = Integer.parseInt(input.nextLine());
        System.out.print("How many games did " + team1 + " lose in the previous 10 matches? (excl H2H) ");
        int team1Lose = Integer.parseInt(input.nextLine());
        System.out.print("How Many Goals Scored " + team1 + " in the last 10 games (excl. H2H): ");
        int golScoredByTeam1 = Integer.parseInt(input.nextLine());
        System.out.print("How Many Goals Conceded by " + team1 + " in the last 10 games (excl. H2H): ");
        int golConcededByTeam1 = Integer.parseInt(input.nextLine());
        System.out.print("How many cards by " + team1 + ": ");
        int bookingByTeam1 = Integer.parseInt(input.nextLine());
        System.out.print("How many corners by " + team1 + ": ");
        int cornersByTeam1 = Integer.parseInt(input.nextLine());

        System.out.println();
        System.out.println(team2.toUpperCase());
        System.out.print("How many games did " + team2 + " win in the previous 10 matches? (excl H2H): ");
        int team2Win = Integer.parseInt(input.nextLine());
        System.out.print("How many games did " + team2 + " draw in the previous 10 matches? (excl H2H): ");
        int team2Draw = Integer.parseInt(input.nextLine());
        System.out.print("How many games did " + team2 + " lose in the previous 10 matches? (excl H2H): ");
        int team2Lose = Integer.parseInt(input.nextLine());
        System.out.print("How Many Goals Scored by " + team2 + " in the last 10 games (excl. H2H): ");
        int golScoredByTeam2 = Integer.parseInt(input.nextLine());
        System.out.print("How Many Goals Conceded by " + team2 + " in the last 10 games (excl. H2H): ");
        int golConcededByTeam2 = Integer.parseInt(input.nextLine());
        System.out.print("How many cards by " + team2 + ": ");
        int bookingByTeam2 = Integer.parseInt(input.nextLine());
        System.out.print("How many corners by " + team2 + ": ");
        int cornersByTeam2 = Integer.parseInt(input.nextLine());

        int solvedDrawT1;
        int solvedDrawT2;

        if (team1Draw > team1Win) {
            solvedDrawT1 = 0;
        } else if (team1Draw < team2Draw) {
            solvedDrawT1 = 3;
        } else {
            solvedDrawT1 = 1;
        }

        if (team2Draw > team2Win) {
            solvedDrawT2 = 0;
        } else if (team1Draw < team2Draw) {
            solvedDrawT2 = 3;
        } else {
            solvedDrawT2 = 1;
        }

        System.out.println();
        System.out.println("Head to Head");
        System.out.print("Matches Won by " + team1 + "? ");
        int matchesWonByTeam1 = Integer.parseInt(input.nextLine());
        System.out.print("Matches Won by " + team2 + "? ");
        int matchesWonByTeam2 = Integer.parseInt(input.nextLine());
        System.out.print("How many cards by " + team1 + ": ");
        int bookingByTeam1H2H = Integer.parseInt(input.nextLine());
        System.out.print("How many cards by " + team2 + ": ");
        int bookingByTeam2H2H = Integer.parseInt(input.nextLine());
        System.out.print("How many corners by " + team1 + ": ");
        int cornersByTeam1H2H = Integer.parseInt(input.nextLine());
        System.out.print("How many corners by " + team2 + ": ");
        int cornersByTeam2H2H = Integer.parseInt(input.nextLine());

        System.out.println();
        System.out.print("Goals scored by " + team1 + " H2H? ");
        int goalsScoredByTeam1 = Integer.parseInt(input.nextLine());
        System.out.print("Goals scored by " + team2 + " H2H? ");
        int goalsScoredByTeam2 = Integer.parseInt(input.nextLine());

        int totalPointsTeam1 = 0;
        int totalPointsTeam2 = 0;
        int totalGoalsByTeam1 = 0;
        int totalGoalsByTeam2 = 0;

        if (goalsScoredByTeam1 > goalsScoredByTeam2) {
            totalGoalsByTeam1 = totalGoalsByTeam1 + 3;
        } else if (totalGoalsByTeam1 < totalGoalsByTeam2) {
            totalGoalsByTeam2 = totalGoalsByTeam2 + 3;
        } else {
            totalGoalsByTeam1 = 1;
            totalGoalsByTeam2 = 1;
        }

        if (matchesWonByTeam1 > matchesWonByTeam2) {
            totalPointsTeam1 = totalPointsTeam1 + 3;
        } else if (matchesWonByTeam2 > matchesWonByTeam1) {
            totalPointsTeam2 = totalPointsTeam2 + 3;
        } else {
            totalPointsTeam1 = 1;
            totalPointsTeam2 = 1;
        }

        int totalHeadToHeadByTeam1 = totalPointsTeam1 + goalsScoredByTeam1;
        int totalHeadToHeadByTeam2 = totalPointsTeam2 + goalsScoredByTeam2;

        int totalGolTeam1 = 0;
        int totalGolTeam2 = 0;
        int negetGolTeam1 = 0;
        int negetGolTeam2 = 0;

        if (golScoredByTeam1 > golScoredByTeam2) {
            totalGolTeam1 = totalGolTeam1 + 3;
        } else if (golScoredByTeam1 < golScoredByTeam2) {
            totalGolTeam2 = totalGolTeam2 + 3;
        } else {
            totalGolTeam1 = 1;
            totalGolTeam2 = 1;
        }

        if (golConcededByTeam1 < golConcededByTeam2) {
            negetGolTeam1 = negetGolTeam1 + 3;
        } else if (golConcededByTeam1 > golConcededByTeam2) {
            negetGolTeam2 = negetGolTeam2 + 3;
        } else {
            negetGolTeam1 = 1;
            negetGolTeam2 = 1;
        }

        System.out.println();
        int chanceOfWinTeam1 = ((team1Win + 5) + solvedDrawT1 + negetGolTeam1 + totalHeadToHeadByTeam1 + totalGolTeam1 - team1Lose);
        double chanceOfWinInPercTeam1 = (double) chanceOfWinTeam1 / 100;
        int chanceOfWinTeam2 = ((team2Win + 5) + solvedDrawT2 + negetGolTeam2 + totalHeadToHeadByTeam2 + totalGolTeam2 - team2Lose);
        double chanceOfWinInPercTeam2 = (double) chanceOfWinTeam2 / 100;

        int totalConcededTeam1 = goalsScoredByTeam2 + golConcededByTeam1;
        int totalConcededTeam2 = goalsScoredByTeam1 + golConcededByTeam2;
        double chanceOfDraw = chanceOfWinInPercTeam1 - chanceOfWinInPercTeam2;
        String chanceOfDrawSolved = (double) chanceOfDraw <= 0.05 ? "Possible Draw" : "Small Chance of Draw";
        System.out.println();


        System.out.println(team1 + " vs " + team2 + " (" + country + ")");
        System.out.println("Game Start at: " + time);
        System.out.println("Disclaimer: at times not all the selections will be correct");
        System.out.println("For 90% winning rate");
        System.out.println("Make your own research and compare with my analysis");
        System.out.println("____________________________________________________________");
        if (bookingByTeam1 + bookingByTeam1H2H > bookingByTeam2 + bookingByTeam2H2H) {
            System.out.println(team1 + " win bookings");
        } else if (bookingByTeam1 + bookingByTeam1H2H < bookingByTeam2 + bookingByTeam2H2H) {
            System.out.println(team2 + " win bookings");
        } else {
            System.out.println("Bookings: Draw");
        }

        int totalBookingsOvers = bookingByTeam1 + bookingByTeam1H2H + bookingByTeam2 + bookingByTeam2H2H;
        String totalBookingsOversAll = totalBookingsOvers >= 40 ? "Total: Over 1.5 Booking" : "Total: Under 4.5 Bookings";

        int totalCornersOvers = cornersByTeam1 + cornersByTeam1H2H + cornersByTeam2 + cornersByTeam2H2H;

        if (totalCornersOvers >= 337) {
            System.out.println("Total corners =  over 11.5");
        } else if (totalCornersOvers >= 312) {
            System.out.println("Total corners =  under 12.5");
        } else if (totalCornersOvers >= 287) {
            System.out.println("Total corners =  under 11.5");
        } else if (totalCornersOvers >= 262) {
            System.out.println("Total corners =  over 10.5");
        } else if (totalCornersOvers >= 237) {
            System.out.println("Total corners =  over 9.5");
        } else if (totalCornersOvers >= 212) {
            System.out.println("Total corners =  over 8.5");
        } else if (totalCornersOvers >= 187) {
            System.out.println("Total corners =  over 7.5");
        }  else {
            System.out.println("Total corners =  under 7.5");
        }

        if (cornersByTeam1 + cornersByTeam1H2H > cornersByTeam2 + cornersByTeam2H2H) {
            System.out.println(team1 + " win corners");
        } else if (cornersByTeam1 + cornersByTeam1H2H < cornersByTeam2 + cornersByTeam2H2H) {
            System.out.println(team1 + " win corners");
        } else {
            System.out.println("Corners = draw");
        }

        System.out.println(totalBookingsOversAll);
        double combinedGoals = goalsScoredByTeam1 + goalsScoredByTeam2 + golScoredByTeam1 + golScoredByTeam2;
        if (combinedGoals >= 40) {
            System.out.println("Total: Over 2.5 goals");
        } else if ((combinedGoals > 25) && (combinedGoals < 40)) {
            System.out.println("Total: Over 1.5 goals");
        } else {
            System.out.println("Total: Under 2.5 goals");
        }

        if (totalConcededTeam1 > totalConcededTeam2) {
            System.out.println(team1 + " No Clean Sheet");
        } else if (totalConcededTeam1 < totalConcededTeam2) {
            System.out.println(team2 + " No clean Sheet");
        }

        if (totalConcededTeam1 < 15) {
            System.out.println(team1 + " Possible Clean Sheet");
        } else if (totalConcededTeam2 < 15) {
            System.out.println(team2 + " Possible clean Sheet");
        }

        System.out.println(team1 + " have " + chanceOfWinInPercTeam1 + " probability of winning");
        System.out.println(team2 + " have " + chanceOfWinInPercTeam2 + " probability of winning");
        System.out.println(chanceOfDrawSolved);
        System.out.println();
    }

    public static void main(String[] args) {
        Soccer soccer = new Soccer();
        soccer.soccerRes();
    }
}

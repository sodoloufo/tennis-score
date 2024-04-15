package com.b4b.tennisscore;

public class TennisScoreCount {

    // Méthode pour calculer le score et déterminer le gagnant
    public static void calculateScore(String actions) {
        int scorePlayerA = 0;
        int scorePlayerB = 0;
        boolean advantageA = false;
        boolean advantageB = false;

        for (char action : actions.toCharArray()) {
            if (action == 'A') {
                if (scorePlayerA == 0) {
                    scorePlayerA = 15;
                } else if (scorePlayerA == 15) {
                    scorePlayerA = 30;
                } else if (scorePlayerA == 30) {
                    scorePlayerA = 40;
                } else if (scorePlayerA == 40) {
                    System.out.print("Player A wins the game");
                    return;
                } else if (scorePlayerB == 40 && !advantageB) {
                    advantageA = true;
                } else if (scorePlayerB == 40 && advantageB) {
                    advantageB = false;
                } else if (advantageA) {
                    System.out.print("Player A wins the game");
                    return;
                }
            } else if (action == 'B') {
                if (scorePlayerB == 0) {
                    scorePlayerB = 15;
                } else if (scorePlayerB == 15) {
                    scorePlayerB = 30;
                } else if (scorePlayerB == 30) {
                    scorePlayerB = 40;
                }  else if (scorePlayerB == 40) {
                    System.out.print("Player B wins the game");
                    return;
                } else if (scorePlayerA == 40 && !advantageA) {
                    advantageB = true;
                } else if (scorePlayerA == 40 && advantageA) {
                    advantageA = false;
                } else if (advantageB) {
                    System.out.print("Player B wins the game");
                    return;
                }
            }

            // Affichage du score après chaque action
            System.out.println("Player A : " + scorePlayerA + " / Player B : " + scorePlayerB);

            // Gestion des cas de deuce et d'avantage
            if (scorePlayerA == 40 && scorePlayerB == 40) {
                if (advantageA) {
                    System.out.println("Player A has advantage");
                } else if (advantageB) {
                    System.out.println("Player B has advantage");
                } else {
                    System.out.println("Deuce");
                }
            }

        }
    }

    
}

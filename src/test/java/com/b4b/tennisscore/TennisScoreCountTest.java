package com.b4b.tennisscore;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TennisScoreCountTest {

    @Test
    public void testCalculateScore_PlayerAWins() {
        String actions = "ABABAA";
        String expectedWinnerMsg = "Player A wins the game";
      
        assertThat(getOutput(actions)).endsWith(expectedWinnerMsg);
    }

    // Méthode utilitaire pour capturer la sortie de la console
    private String getOutput(String actions) {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        TennisScoreCount.calculateScore(actions);

        String output = outputStream.toString();

        System.setOut(System.out);

        return output;
    }
}

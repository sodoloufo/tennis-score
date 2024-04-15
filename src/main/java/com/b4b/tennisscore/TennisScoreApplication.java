package com.b4b.tennisscore;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TennisScoreApplication {

	public static void main(String[] args) {
		String actions = "ABABAA";
        TennisScoreCount.calculateScore(actions);
	}

}

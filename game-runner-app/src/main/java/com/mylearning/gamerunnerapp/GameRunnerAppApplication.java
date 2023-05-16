package com.mylearning.gamerunnerapp;

import com.mylearning.gamerunnerapp.game.GameRunner;
import com.mylearning.gamerunnerapp.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameRunnerAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GameRunnerAppApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
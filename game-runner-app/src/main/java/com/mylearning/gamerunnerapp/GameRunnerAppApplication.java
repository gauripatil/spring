package com.mylearning.gamerunnerapp;

import com.mylearning.gamerunnerapp.game.GameRunner;
import com.mylearning.gamerunnerapp.game.MarioGame;
import com.mylearning.gamerunnerapp.game.PacManGame;
import com.mylearning.gamerunnerapp.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GameRunnerAppApplication {

	public static void main(String[] args) {
//
//		MarioGame game = new MarioGame();
//		SuperContraGame superContraGame = new SuperContraGame();
//		PacManGame pacManGame = new PacManGame();
//
//		GameRunner runner = new GameRunner(game);
//		runner.run();
//
//		GameRunner superContraGameRunner = new GameRunner(superContraGame);
//		superContraGameRunner.run();
//
//		GameRunner pacManGameRunner = new GameRunner(pacManGame);
//		pacManGameRunner.run();

		ConfigurableApplicationContext context = SpringApplication.run(GameRunnerAppApplication.class, args);
		GameRunner runner1 = context.getBean(GameRunner.class);
		runner1.run();
	}

}

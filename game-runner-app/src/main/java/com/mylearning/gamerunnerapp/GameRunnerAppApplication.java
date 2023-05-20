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

/**
 * NOTES:
 * 1. @Component: A Class managed by Spring framework
 * 2. Dependency: GameRunner needs GamingConsole impl.
 * 	2.1 GamingConsole (Ex. MarioGame) is dependency of GameRunner
 * 3. Component Scan: How does Spring framework find component classes?
 * 	3.1 It scans packages: (@ComponentScan("packagename"))
 * 4. Dependency Injection: Identify beans, their dependencies and wire them together
 *    (provide IOC - Inversion Of Control)
 *  4.1 Spring Beans: An object managed by Spring framework
 *  4.2 IoC Container: Manages the lifecycle of beans and dependencies
 *  	4.2.1 Types: ApplicationContext(complex), BeanFactory(simple, rarely used)
 *  4.3 Autowiring: Process of wiring in dependencies for Spring Bean
 *
 */

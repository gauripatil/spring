package com.mylearning.gamerunnerapp;

import com.mylearning.gamerunnerapp.example.web.MyWebController;
import com.mylearning.gamerunnerapp.game.GameRunner;
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

		MyWebController bean = context.getBean(MyWebController.class);
		System.out.println(bean.returnValueFromBusineesService());
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
 *
 *
 *
 *
 * =====================================================
 *
 * MAVEN - manages jar needed by application
 * all configuration in pom.xml
 * maven artifacts identified by groupId & artifactId
 * Important features:
 * 1. Defines a simple project setup that follows best practices
 * 2. Enables consistent usage across all projects
 * 3. Manages dependency updates and transitive dependencies
 * Terminology Warning - Spring dependency vs Maven dependency
 *
 *
 *
 *
 */

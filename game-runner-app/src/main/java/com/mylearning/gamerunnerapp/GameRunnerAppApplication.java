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
 * Spring dependency injection types
 * Constructor based - Dependencies are set by creating bean using constructors
 * Setter-based - Dependencies are set by calling setter methods on your beans
 * Field based - No setter / constructor. Dependencies are set by reflection
 * Spring team recommends Constructor based injection as dependencies are automatically set
 * when object is created
 *
 * Spring Modules  -
 * Core - IoC container etc
 * Testing - Mock objects, Spring MVC Test etc
 * Data Access - Transactions, JDBC, JPA etc
 * Web Servlet - Spring MVC etc
 * Web Reactive - Spring WebFlux
 * Integration - Spring JMS etc
 *
 * Spring Projects -
 * Spring keeps evolving (REST API -> Microservices -> Cloud)
 * Spring Boot - Most popular framework to build microservices
 * Spring Cloud - Build cloud native applications
 * Spring Data - Integrate with the same way with different databases - NoSQL / Relational
 * Spring Integration - Address challenges with integration with other applications
 * Spring Security - Secure your application or REST API or microservices
 *
 *
 * World before Spring boot
 * 1. Dependency management (pom.xml)
 * 		Manage frameworks and versions
 * 		REST API - Spring framework, Spring MVC framework, JSON binding framework
 * 		Unit test - Spring Test, Mockito, JUnit
 * 2. Define web application configuration (web.xml)
 * 		example - Configure DispatcherServelet for Spring MVC
 * 3. Manage spring beans Spring Configuration (context.xml)
 * 		Define your Spring Configuration
 * 		1. Component Scan
 * 		2. View resolver - in case of web application
 * 		3. Data source - data related application
 * 4. NFRs Non Function Requirement -
 * 		1. Logging
 * 		2. Error handling
 * 		3. Monitoring
 *
 */

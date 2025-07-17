package com.naveen.spring.learnspringframework;

import com.naveen.spring.learnspringframework.game.MarioGame;
import com.naveen.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.naveen.spring.learnspringframework.game.GameRunner;
import com.naveen.spring.learnspringframework.game.GamingConsole;
import com.naveen.spring.learnspringframework.game.PacManGame;
import com.naveen.spring.learnspringframework.game.SuperContraGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController myWebController = context.getBean(MyWebController.class);
		System.out.println(myWebController.returnValueFromBussinessService());
		// GamingConsole marioGame = new MarioGame();
		// GameRunner runner = new GameRunner(marioGame);
		// runner.run();

		// GamingConsole superContraGame = new SuperContraGame();
		// GameRunner runner2 = new GameRunner(superContraGame);
		// runner2.run();
		

	// 	GamingConsole pacManGame = new PacManGame();
	// 	GameRunner runner3 = new GameRunner(pacManGame);
	// 	runner3.run();
	}

}

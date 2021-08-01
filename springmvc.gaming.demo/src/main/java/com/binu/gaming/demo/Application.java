package com.binu.gaming.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.binu.gaming.demo.game.GameRunner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		// MarioGame, GameRunner
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.runGame();
	}

	

	
}

package com.binu.gaming.demo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		System.out.println("Using GamingConsole constructor");
		this.game = game;
	}

	public GamingConsole getGame() {
		return game;
	}

	public void setGame(GamingConsole game) {
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}

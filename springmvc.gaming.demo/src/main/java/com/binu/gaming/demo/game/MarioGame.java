package com.binu.gaming.demo.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Mario Jump");
		
	}
	
	@Override
	public void down() {
		System.out.println("Mario Climb down");
		
	}
	
	@Override
	public void left() {
		System.out.println("Mario Go faster");
		
	}
	
	@Override
	public void right() {
		System.out.println("Mario Slow down");
		
	}
	
}

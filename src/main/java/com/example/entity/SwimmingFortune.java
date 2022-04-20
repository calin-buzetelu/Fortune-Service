package com.example.entity;

import java.util.List;
import java.util.Random;

public class SwimmingFortune implements Fortune {

	private final List<String> fortunesList = List.of(
			"May your freestyle be like lightning!",
			"Water shall never go in your nose when you do the back stroke",
			"Better train the dive!"
	);
	private Random random = new Random();
	private String fortune;

	@Override
	public String getFortune() {
		int randomPosition = getRandomPosition();
		setFortune(fortunesList.get(randomPosition));
		return fortune;
	}

	public void setFortune(String fortune) {
		this.fortune = fortune;
	}

	private int getRandomPosition() {
		return random.nextInt(fortunesList.size());
	}
}

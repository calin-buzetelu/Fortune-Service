package com.example.entity;

import java.util.List;
import java.util.Random;

public class FootballFortune implements Fortune {

	private final List<String> fortunesList = List.of(
			"May your free kicks see the back of the net!",
			"Your leftie is the bestie!",
			"Your defenders shall tumble!"
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

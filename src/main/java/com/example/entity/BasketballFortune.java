package com.example.entity;

import java.util.List;
import java.util.Random;

public class BasketballFortune implements Fortune {

	private final List<String> fortunesList = List.of(
			"You will get all the ankles!",
			"May your floaters reach sky high!",
			"Your 3 pointers shall always go in!"
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

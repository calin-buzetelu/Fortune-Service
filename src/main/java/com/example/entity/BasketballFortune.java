package com.example.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasketballFortune implements Fortune {

	private final List<String> fortunesList = new ArrayList<>();
	private Random random = new Random();
	private String fortune;

	public BasketballFortune() {
		fortunesList.add("You will get all the ankles!");
		fortunesList.add("May your floaters reach sky high!");
		fortunesList.add("Your 3 pointers shall always go in!");
	}

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
